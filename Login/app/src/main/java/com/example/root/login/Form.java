package com.example.root.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Form extends AppCompatActivity {
    private EditText nama, kelas, nis;
    private RadioButton radiojkbutton;
    private RadioGroup radiojkgroup;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        nama = findViewById(R.id.edtnama);
        kelas = findViewById(R.id.edtkelas);
        nis = findViewById(R.id.edtnis);
        radiojkgroup = findViewById(R.id.radiojk);
        submit = findViewById(R.id.btnsubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radiojkgroup.getCheckedRadioButtonId();
                radiojkbutton = findViewById(selectedId);
                Intent intent = new Intent(Form.this, FormView.class );
                intent.putExtra("Nama", nama.getText().toString());
                intent.putExtra("Kelas", kelas.getText().toString());
                intent.putExtra("Nis", nis.getText().toString());
                intent.putExtra("JK", radiojkbutton.getText().toString());
                Form.this.startActivity(intent);
            }
        });



    }
}
