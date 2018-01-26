package com.pramudana.sam.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivitySpinner extends AppCompatActivity {

    Spinner spinData;
    String[] dataKategori = new String[]{

            "Automobile", "Bussiness Service", "Computer", "Education", "Personal", "Travel"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinData = (Spinner)findViewById(R.id.spinData);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataKategori);
        spinData.setAdapter(adapter);

        //aksi ketika Spinner dipencet
        spinData.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //mengambil nilai dari posisi dan dijadikan String
                String item = parent.getItemAtPosition(position).toString();
                //memunculkan Toast
                Toast.makeText(getApplicationContext(), "Anda Pilih : " + item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
