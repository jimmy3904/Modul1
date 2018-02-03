package com.example.jm.jimmy_1202150108_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Makan,Qty;
    private Button EB,AB;
    private int totalharga,totalharga2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Makan=(EditText) findViewById(R.id.namamenu);
        Qty=(EditText) findViewById(R.id.jumlah);
        EB=(Button) findViewById(R.id.eatbus);
        AB=(Button) findViewById(R.id.abnormal);

        EB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nmenu = Makan.getText().toString();
                String jmlh = Qty.getText().toString();
                totalharga = Integer.parseInt(jmlh.trim());
                totalharga2 = totalharga * 50000;

                Intent eb = new Intent(MainActivity.this,Main2Activity.class);
                eb.putExtra("makanan",nmenu);
                eb.putExtra("jumlah",jmlh);
                eb.putExtra("restoran","EATBUS");
                eb.putExtra("total",String.valueOf(totalharga2));
                startActivity(eb);

                if (65500 < totalharga2){
                    Toast.makeText(MainActivity.this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG).show();
                }

            }
        });

        AB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nmenu = Makan.getText().toString();
                String jmlh = Qty.getText().toString();
                totalharga = Integer.parseInt(jmlh.trim());
                totalharga2 = totalharga * 30000;

                Intent ab = new Intent(MainActivity.this,Main2Activity.class);
                ab.putExtra("makanan",nmenu);
                ab.putExtra("jumlah",jmlh);
                ab.putExtra("restoran","ABNORMAL");
                ab.putExtra("total",String.valueOf(totalharga2));
                startActivity(ab);

                if (65500 > totalharga2){
                    Toast.makeText(MainActivity.this,"Disini aja makan malamnya",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
