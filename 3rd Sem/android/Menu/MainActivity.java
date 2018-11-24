package com.example.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.lv);
        final TextView tv = (TextView) findViewById(R.id.textView2);

        // Initializing a new String Array
        final String[] dishes = new String[]{
                "Dal Rice",
                "Chapati",
                "Paneer",
                "Dum aloo",
                "Fried Chicken",
                "Roll",
                "Momo"
        };

        // Create a List from String Array elements
        List<String> fruits_list = new ArrayList<>(Arrays.asList(dishes));

        // Create a ArrayAdapter from List
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, fruits_list);

        // Populate ListView with items from ArrayAdapter
        lv.setAdapter(arrayAdapter);

        // Set an item click listener for ListView
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Display the selected item text on TextView
                String selectedItem = (String) adapterView.getItemAtPosition(i);

                // Display the selected item text on TextView
                tv.setText("You selected : " + selectedItem);
            }
        });
    }
}

