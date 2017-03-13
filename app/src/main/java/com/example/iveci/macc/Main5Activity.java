package com.example.iveci.macc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText t1,t2,t3;
    Button b1;
    TextView v1,v2;
    CheckBox mem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("레스토랑 메뉴 주문");
        setContentView(R.layout.activity_main5);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = !t1.getText().toString().equals("") ? t1.getText().toString() : "0";
                String p2 = !t2.getText().toString().equals("")  ? t2.getText().toString() : "0";
                String p3 = !t3.getText().toString().equals("")  ? t3.getText().toString() : "0";

                int tcount = Integer.parseInt(p1) + Integer.parseInt(p2) + Integer.parseInt(p3);
                int total = Integer.parseInt(p1)*15000 + Integer.parseInt(p2)*13000 + Integer.parseInt(p3)*9000;

                if (mem.isChecked() && total != 0) total =(int)(((double) total) *0.9);
                v1.setText(tcount + "개");
                v2.setText(total + "원");
            }
        });
    }
    void init(){
        t1 = (EditText) findViewById(R.id.epizza);
        t2 = (EditText) findViewById(R.id.espag);
        t3 = (EditText) findViewById(R.id.esalad);
        b1 = (Button) findViewById(R.id.bcalp);
        v1 = (TextView) findViewById(R.id.totalea);
        v2 = (TextView) findViewById(R.id.totalw);
        mem = (CheckBox) findViewById(R.id.member);
    }
}
