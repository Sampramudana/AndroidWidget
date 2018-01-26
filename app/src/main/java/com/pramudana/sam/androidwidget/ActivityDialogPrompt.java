package com.pramudana.sam.androidwidget;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDialogPrompt extends AppCompatActivity {

    //memanggil Activity ini
    Context context = this;
    TextView txtResult;
    Button btnShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_prompt);

        txtResult = (TextView)findViewById(R.id.txtResult);
        btnShowDialog = (Button)findViewById(R.id.btnShowPromptDialod);

        //aksi ketika Buttton shownya dipencet
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //memanggil layout prompt
                LayoutInflater layInf = LayoutInflater.from(context);
                View promptsView = layInf.inflate(R.layout.prompts, null);

                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                //mengatur viewnya promptView
                alertBuilder.setView(promptsView);

                final EditText userInput = (EditText)promptsView.findViewById(R.id.etInputUsername);
                alertBuilder.setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                //mengambil nilai dari etInputUsername dan menampilkan ke txtResult
                                txtResult.setText(userInput.getText());
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = alertBuilder.create();
                //menampilkan alertDialog
                alertDialog.show();
            }
        });
    }
}
