package com.example.iveci.macc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("사과값 계산기");
        setContentView(R.layout.activity_main2);
        init();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = e1.getText().toString();
                String t2 = e2.getText().toString();
                int r1 = Integer.parseInt(t1) * Integer.parseInt(t2);
                Toast.makeText(getApplicationContext(),"총" + r1 + "원 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        b2 = (Button)findViewById(R.id.b2);
    }

}
