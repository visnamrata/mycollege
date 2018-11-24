package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NewActivity extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.new_activity);
        // Locate the button in activity_main.xml
        // 1. get passed intent
        Intent intent = getIntent();

        // 2. get message value from intent
        String name = intent.getStringExtra("name");
        String message = intent.getStringExtra("message");

        // 3. show message on textView
        ((TextView)findViewById(R.id.tvMessage)).setText(name + message);

        // 4. get bundle from intent
        Bundle bundle = intent.getExtras();

        // 5. get status value from bundle
        String status1 = intent.getStringExtra("status1");
        String status2 = intent.getStringExtra("status2");
        String status3 = intent.getStringExtra("status3");
        String status4 = intent.getStringExtra("status4");

        // 6. show status on Toast
        Toast toast = Toast.makeText(this, status1+status2+status3+status4, Toast.LENGTH_SHORT);
        toast.show();

        button = (Button) findViewById(R.id.NewButton);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(NewActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
