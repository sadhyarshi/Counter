package com.sadhyarshii.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counter;
    private Button reset;
    private Button increase;
    private int mCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset =(Button) findViewById(R.id.button);
        increase= (Button) findViewById(R.id.button);
        counter =(TextView) findViewById(R.id.textView);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter=0;
                counter.setText(Integer.toString(mCounter));
            }
        });
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter++;
                counter.setText(Integer.toString(mCounter));


            }
        });

    }
}