package com.example.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radio;
    RadioButton r1,r2,r3,r4;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio = (RadioGroup) findViewById(R.id.radio);
        b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radio.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                r1= (RadioButton) findViewById(R.id.radioButton);
                r2=  (RadioButton) findViewById(R.id.radioButton2);
                r3= (RadioButton) findViewById(R.id.radioButton3);
                r4= (RadioButton) findViewById(R.id.radioButton4);

                if(r1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Teacher : Vipin Sir", Toast.LENGTH_SHORT).show();
                }
                if(r2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Teacher : Arun Sir", Toast.LENGTH_SHORT).show();
                }
                if(r3.isChecked()){
                    Toast.makeText(getApplicationContext(),"Teacher : Sheetal Ma'am", Toast.LENGTH_SHORT).show();
                }
                if(r4.isChecked()){
                    Toast.makeText(getApplicationContext(),"Teacher : Nikhil Sir", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

