package com.example.iveci.macc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("계산기");
        setContentView(R.layout.activity_main6);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!noempty()) {
                    String p1 = t1.getText().toString();
                    String p2 = t2.getText().toString();
                    int p3 = Integer.parseInt(p1) + Integer.parseInt(p2);
                    Toast.makeText(getApplicationContext(),
                            "더하기 계산 결과는 " + p3 + "입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!noempty()) {
                    String p1 = t1.getText().toString();
                    String p2 = t2.getText().toString();
                    int p3 = Integer.parseInt(p1) - Integer.parseInt(p2);
                    Toast.makeText(getApplicationContext(),
                            "빼기 계산 결과는 " + p3 + "입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!noempty()) {
                    String p1 = t1.getText().toString();
                    String p2 = t2.getText().toString();
                    int p3 = Integer.parseInt(p1) * Integer.parseInt(p2);
                    Toast.makeText(getApplicationContext(),
                            "곱하기 계산 결과는 " + p3 + "입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!noempty()) {
                    String p1 = t1.getText().toString();
                    String p2 = t2.getText().toString();
                    int p3 =(int)(((double)Integer.parseInt(p1)) / ((double)Integer.parseInt(p2)));
                    Toast.makeText(getApplicationContext(),
                            "나누기 계산 결과는 " + p3 + "입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    void init(){
        b1 = (Button)findViewById(R.id.badd);
        b2 = (Button)findViewById(R.id.bsub);
        b3 = (Button)findViewById(R.id.bmul);
        b4 = (Button)findViewById(R.id.bdiv);
        t1 = (EditText)findViewById(R.id.eint1);
        t2 = (EditText)findViewById(R.id.eint2);
    }

    boolean noempty(){
        if(t1.getText().toString().equals("") || t2.getText().toString().equals("")) {
            t1.requestFocus();
            Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
            return true;
        }
        else return false;
    }

}
