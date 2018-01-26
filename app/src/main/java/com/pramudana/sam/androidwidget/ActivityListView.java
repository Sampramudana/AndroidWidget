package com.pramudana.sam.androidwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityListView extends AppCompatActivity {

    ListView lsData;
    String[] dataArray = new String[]{

            "Android", "iPhone", "iPad", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows 7", "macOSX", "Linux"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //memanggil widget listView
        lsData = (ListView)findViewById(R.id.listData);

        //memasukkan data Array kedalam array adapter agar muncul di istView
        ArrayAdapter<String> adapterListData = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArray);

        //mengatur adapterListData kedalam widget lsData
        lsData.setAdapter(adapterListData);
    }
}
