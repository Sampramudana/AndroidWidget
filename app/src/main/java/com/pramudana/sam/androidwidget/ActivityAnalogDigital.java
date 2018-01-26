package com.pramudana.sam.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.DigitalClock;

public class ActivityAnalogDigital extends AppCompatActivity {

    AnalogClock ac;
    DigitalClock dc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog_digital);

        ac = (AnalogClock) findViewById(R.id.analogClock1);
        dc = (DigitalClock) findViewById(R.id.digitalClock1);
    }
}
