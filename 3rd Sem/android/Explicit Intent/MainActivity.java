package com.example.explicitintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.MyButton);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                // 2. put key/value data
                intent.putExtra("name", "Admin");
                intent.putExtra("message", "Hello From MainActivity");

                intent.putExtra("status1", "Data");
                intent.putExtra("status2", " Recieved");
                intent.putExtra("status3", " Successfully");
                intent.putExtra("status4", "!");

                // 4. add bundle to intent
                //intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
}
