package com.pramudana.sam.androidwidget;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerActivity extends AppCompatActivity {

    private TextView tvTimeResult;
    private Button btTimePicker;
    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        tvTimeResult = (TextView) findViewById(R.id.txt);
        btTimePicker = (Button) findViewById(R.id.btn);

        btTimePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showTimeDialog();
            }
        });
    }
    private void showTimeDialog() {

        final Calendar calendar = Calendar.getInstance();

        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfday, int minute) {

                tvTimeResult.setText("Waktu dipilih = " + hourOfday + ":" + minute);

            }
        },
                calendar.get(Calendar.HOUR_OF_DAY), calendar.get(calendar.MINUTE), DateFormat.is24HourFormat(TimePickerActivity.this));

                    timePickerDialog.show();
            }
        }


