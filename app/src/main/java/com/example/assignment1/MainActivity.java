package com.example.assignment1;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonClick;

    TextView textButtonCount;
    TextView textBackgroundCount;

    int count = 0;
    int backgroundcount=0;

    int orientation=0;

    @Override
    protected void onPause() {
        super.onPause();

        backgroundcount++;
        textBackgroundCount.setText(""+backgroundcount);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        orientation=getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_LANDSCAPE)
        {
            setContentView(R.layout.activity_land);
        }
        else
        {
            setContentView(R.layout.activity_main);
        }



        buttonClick=findViewById(R.id.buttonClick);

        textButtonCount=findViewById(R.id.textButtonCount);

        textBackgroundCount=findViewById(R.id.textBackgroundCount);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textButtonCount.setText("" +count );
            }
        });

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
