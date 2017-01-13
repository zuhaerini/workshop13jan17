package com.belajarkoding.hepikode.workshopku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Panjang = (EditText) findViewById(R.id.edt_panjang);
        EditText Lebar = (EditText) findViewById(R.id.edt_lebar);
        Button Hitung = (Button) findViewById(R.id.btn_hitung);
        TextView Hasil = (TextView) findViewById(R.id.txt_hasil);

    }
}
