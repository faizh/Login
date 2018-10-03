package com.example.root.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FormView extends AppCompatActivity {
    private TextView nama, nis, kelas, jk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_view);

        nama = findViewById(R.id.txtnama);
        nis = findViewById(R.id.txtnis);
        kelas = findViewById(R.id.txtkelas);
        jk = findViewById(R.id.txtjk);

        Bundle extras = getIntent().getExtras();
        if (extras!=null){
            String Nama = extras.getString("Nama");
            String NIS = extras.getString("Nis");
            String Kelas = extras.getString("Kelas");
            String JK = extras.getString("JK");


            nama.setText(Nama);
            nis.setText(NIS);
            kelas.setText(Kelas);
            jk.setText(JK);

        }


    }
}
