package com.example.hello_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2, sum;
        Button pls, mia, mul, div;
        double a, b, c = 0;
        View.OnClickListener cl;

        protected void OnCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            num1 = (EditText) findViewById(R.id.num1);
            num2 = (EditText) findViewById(R.id.num2);
            sum = (EditText) findViewById(R.id.sum);

            pls = (Button) findViewById(R.id.pls);
            mia = (Button) findViewById(R.id.mia);
            mul = (Button) findViewById(R.id.mul);
            div = (Button) findViewById(R.id.div);

            cl = new View.OnClickListener(){
                public void onClick(View v){
                    a = Double.parseDouble(num1.getText().toString());
                    b = Double.parseDouble(num2.getText().toString());

                    switch(v.getId()){
                        case R.id.pls:
                            c = a + b;
                            break;
                        case R.id.mia:
                            c = a - b;
                            break;
                        case R.id.mul:
                            c = a * b;
                            break;
                        case R.id.div:
                            c = a / b;
                            break;
                    }
                    sum.setText(String.valueOf(c));
                }
            };
            pls.setOnClickListener(cl);
            mia.setOnClickListener(cl);
        mul.setOnClickListener(cl);
        div.setOnClickListener(cl);
    }
}
