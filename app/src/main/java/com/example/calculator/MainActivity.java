package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1, n2 ;
    private Button sum  ;
    private TextView res;
    private Button multiply ;
    private Button divise;
    private Button substract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1= (EditText) findViewById(R.id.n1);
        n2= (EditText) findViewById(R.id.n2);
        sum= (Button) findViewById(R.id.sum);
        multiply= (Button) findViewById(R.id.multiply);
        res= (TextView) findViewById(R.id.res);
        divise=(Button) findViewById(R.id.divide);
        substract=(Button)findViewById(R.id.substract);
        sum.setOnClickListener(new View.OnClickListener() {

                @Override
            public void onClick(View view) {
                calcSomme();
            }
        });

    }

    private void calcSomme() {
        String ch1 = n1.getText().toString();
        String ch2 = n2.getText().toString();

        int a = Integer.parseInt(ch1);
        int b = Integer.parseInt(ch2);

        int s = a + b;
        res.setText(String.valueOf(s));
        multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                calcmultip();
            }
        });

            }

    private void calcmultip() {
        String ch1 = n1.getText().toString();
        String ch2 = n2.getText().toString();

        int a = Integer.parseInt(ch1);
        int b = Integer.parseInt(ch2);

        int s = a * b;
        res.setText(String.valueOf(s));
        divise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcdivision();
            }
        });
    }

    private void calcdivision() {
        String ch1 = n1.getText().toString();
        String ch2 = n2.getText().toString();

        int a = Integer.parseInt(ch1);
        int b = Integer.parseInt(ch2);

        int s = a / b;
        res.setText(String.valueOf(s));
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcsoustraction();
            }
        });
    }

    private void calcsoustraction() {
        String ch1 = n1.getText().toString();
        String ch2 = n2.getText().toString();

        int a = Integer.parseInt(ch1);
        int b = Integer.parseInt(ch2);

        int s = a - b;
        res.setText(String.valueOf(s));
    }
};




