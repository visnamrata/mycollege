package com.example.plzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = (Button) findViewById(R.id.button);
        final EditText nam = (EditText) findViewById(R.id.editText);
        final EditText pass = (EditText) findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener()   {
            @Override
            public void onClick(View v) {
                if(nam.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Welcome admin", Toast.LENGTH_SHORT);
                    toast1.show();
                } else {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "Incorrect login details", Toast.LENGTH_SHORT);
                    toast2.show();
                }
            }
        });
    }
}

