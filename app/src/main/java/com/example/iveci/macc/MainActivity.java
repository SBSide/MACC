package com.example.iveci.macc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(a);
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(a);
            }

        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(a);
            }
        });
    }
        void init(){

            b1 = (Button)findViewById(R.id.b1);
            b2 = (Button)findViewById(R.id.button4);
            b3 = (Button)findViewById(R.id.button5);
            b4 = (Button)findViewById(R.id.button6);
        }


}
