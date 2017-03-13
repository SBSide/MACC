package com.example.iveci.macc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("나이 계산기");
        setContentView(R.layout.activity_main3);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = t1.getText().toString();
                int caly = 2017 - Integer.parseInt(year) + 1;
                Toast.makeText(getApplicationContext(),
                        "당신의 나이는 "+ caly + " 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = t2.getText().toString();
                int cala = 2017 - Integer.parseInt(age) + 1;
                Toast.makeText(getApplicationContext(),
                        "당신이 태어난 해는 " + cala + "년 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    void init(){
        t1 = (EditText) findViewById(R.id.tyear);
        t2 = (EditText) findViewById(R.id.tnum);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
    }
}
