package com.pramudana.sam.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityGridView extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = (GridView)findViewById(R.id.gridData);

        final  String[] numbers = new String[]{

                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"
        };
        ArrayAdapter<String> adapterNumbers = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers);
        gridView.setAdapter(adapterNumbers);

        //agar gridView bisa diKlik
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //muncul Toast
                Toast.makeText(getApplicationContext(), "Anda Klik : " + ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
