package com.belajarkoding.hepikode.workshopku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Panjang = (EditText) findViewById(R.id.edt_panjang);
        final EditText Lebar = (EditText) findViewById(R.id.edt_lebar);
        Button Hitung = (Button) findViewById(R.id.btn_hitung);
        final TextView Hasil = (TextView) findViewById(R.id.txt_hasil);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int panjang = Integer.valueOf(Panjang.getText().toString());
                    int lebar = Integer.valueOf(Lebar.getText().toString());

                    int luas = panjang * lebar;

                    Hasil.setText(String.valueOf(luas));
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Input Panjang dan lebar", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
