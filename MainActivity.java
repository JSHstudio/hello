package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    String[] oper = {"+", "-"};
    Random random = new Random();
    int num1 = random.nextInt(99) + 1;
    int num2 = random.nextInt(99) + 1;
    int op = random.nextInt(2);
    String numStr1 = String.valueOf(num1);
    String numStr2 = String.valueOf(num2);
    String cal = numStr1 + oper[op] + numStr2;
    int result;
    int count= 0, correct = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.text);
        switch(op){
            case 0:
                result = num1 + num2;
            case 1:
                result = num1 - num2;
        }
        textView1.setText(cal + "=");
        Button button = (Button) findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createCal(view);
            }
        });
        Button button2 = (Button) findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText)findViewById(R.id.Edit1);
                String str = editText.getText().toString();
                if(Integer.parseInt(str) == result) {
                    Toast.makeText(getApplicationContext(), "맞습니다.", Toast.LENGTH_LONG).show();
                    count++;
                    correct++;
                }else {
                    Toast.makeText(getApplicationContext(), "틀렸습니다. 정답은 " + result, Toast.LENGTH_LONG).show();
                    count++;
                }
            }
        });
        Button button3 = (Button) findViewById(R.id.button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2 = findViewById(R.id.text2);
                textView2.setText(String.valueOf(count) + "번 중에 " + String.valueOf(correct) + "번 성공, 정답률:" + String.valueOf((double)correct /(double)count * 100) + "%");
            }
        });
    }
    public void createCal(View view){
        String[] oper = {"+", "-"};
        Random random = new Random();
        int num1 = random.nextInt(99) + 1;
        int num2 = random.nextInt(99) + 1;
        int op = random.nextInt(2);
        String numStr1 = String.valueOf(num1);
        String numStr2 = String.valueOf(num2);
        String cal = numStr1 + oper[op] + numStr2;
        switch (op) {
            case 0:
                result = num1 + num2;
                break;
            case 1:
                result = num1 - num2;
                break;
        }
        textView1.setText(cal + "=");
    }


}
