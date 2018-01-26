package com.pramudana.sam.androidwidget;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCustomAlertDialog extends AppCompatActivity {

    Button btnShowCustomAlertDialog;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_custom_alertdialog);

        btnShowCustomAlertDialog = (Button)findViewById(R.id.btnShowCustomAlertDialog);
        btnShowCustomAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //custom alert dialog
                final Dialog dialog = new Dialog(context);

                //memanggil layout custom
                dialog.setContentView(R.layout.layout_custom);

                //mengatur Title
                dialog.setTitle("Warning !!");

                //memanggil Button OK
                //dialog.findviewbyid ini maksudnya adalah memanggil id yang ada di layout custom
                Button btnOK = (Button)dialog.findViewById(R.id.btnOk);
                btnOK.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //ketika dipencet OK maka alert dialognya hilang
                        dialog.dismiss();
                    }
                });

                //menampilkan dialognya
                dialog.show();
            }
        });
    }
}
