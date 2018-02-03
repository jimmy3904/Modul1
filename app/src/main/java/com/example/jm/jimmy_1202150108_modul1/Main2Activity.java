package com.example.jm.jimmy_1202150108_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView restoran2,menu2,jumlah2,harga2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        restoran2=findViewById(R.id.Tempat);
        menu2=findViewById(R.id.PMenu);
        jumlah2=findViewById(R.id.Pporsi);
        harga2=findViewById(R.id.PHarga);

        Intent a = getIntent();

        String tempt=a.getStringExtra("restoran");
        String menuu=a.getStringExtra("makanan");
        String jmlhh=a.getStringExtra("jumlah");
        String harga22=a.getStringExtra("total");

        restoran2.setText(tempt);
        menu2.setText(menuu);
        jumlah2.setText(jmlhh);
        harga2.setText(harga22);


    }
}
