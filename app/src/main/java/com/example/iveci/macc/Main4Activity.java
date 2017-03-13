package com.example.iveci.macc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button b1,b2;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("온도변환기");
        setContentView(R.layout.activity_main4);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cels = t1.getText().toString();
                double calc = Double.parseDouble(cels) * 1.8 + 32;
                Toast.makeText(getApplicationContext(),
                        "화씨 온도는 "+ calc + "도 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahr = t2.getText().toString();
                double calc = (Double.parseDouble(fahr) - 32 ) / 1.8;
                Toast.makeText(getApplicationContext(),
                        "섭씨 온도는 "+ calc + "도 입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    void init(){
        t1 = (EditText) findViewById(R.id.tcelsius);
        t2 = (EditText) findViewById(R.id.tfahren);
        b1 = (Button) findViewById(R.id.bfah);
        b2 = (Button) findViewById(R.id.bcel);
    }
}
