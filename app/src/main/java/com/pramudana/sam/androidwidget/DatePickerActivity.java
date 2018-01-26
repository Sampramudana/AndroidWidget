package com.pramudana.sam.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DatePickerActivity extends AppCompatActivity {

    DatePicker datePicker;
    Button btnHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        final Button btnHi = (Button)findViewById(R.id.btnHi);
        final DatePicker datePicker = (DatePicker)findViewById(R.id.datePicker);

        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(DatePickerActivity.this, datePicker.getDayOfMonth() + "" + datePicker.getMonth() + "" + datePicker.getYear(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
