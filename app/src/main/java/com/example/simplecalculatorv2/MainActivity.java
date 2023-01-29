package com.example.simplecalculatorv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtFirstNumber, txtSecondNumber;
    TextView operand, answer;
    Button btnAdd, btnSub, btnMul, btnDiv, btnEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFirstNumber = findViewById(R.id.txtFirstNumber);
        txtSecondNumber = findViewById(R.id.txtSecondNumber);
        operand = findViewById(R.id.operand);
        answer = findViewById(R.id.answer);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);

    }
    public void add(android.view.View parameter)
    {
        float a = Float.valueOf((txtFirstNumber.getText().toString()));
        float  b = Float.valueOf((txtSecondNumber.getText().toString()));
        double result = a + b;
        answer.setText("= " +String.valueOf(result));
    }
    public void sub(android.view.View parameter)
    {
        float a = Float.valueOf((txtFirstNumber.getText().toString()));
        float  b = Float.valueOf((txtSecondNumber.getText().toString()));
        double result = a - b;
        answer.setText("= " +String.valueOf(result));
    }
    public void mul(android.view.View parameter)
    {
        float a = Float.valueOf((txtFirstNumber.getText().toString()));
        float  b = Float.valueOf((txtSecondNumber.getText().toString()));
        double result = a * b;
        answer.setText("= " +String.valueOf(result));
    }
    public void div(android.view.View parameter)
    {
        float a = Float.valueOf((txtFirstNumber.getText().toString()));
        float  b = Float.valueOf((txtSecondNumber.getText().toString()));
        double result = a / b;
        answer.setText("= " +String.valueOf(result));
    }
    public void equals(android.view.View parameter)
    {
        String x = operand.getText().toString();
        switch (x)
        {
            case "+":
                add(parameter);
                break;
            case "-":
                sub(parameter);
                break;
            case "*":
                mul(parameter);
                break;
            case  "/":
                div(parameter);
        }
    }
    public void addsign(android.view.View parameter)
    {
        operand.setText(btnAdd.getText().toString());
    }
    public void subsign(android.view.View parameter)
    {
        operand.setText(btnSub.getText().toString());
    }
    public void mulsign(android.view.View parameter)
    {
        operand.setText(btnMul.getText().toString());
    }
    public void divsign(android.view.View parameter)
    {
        operand.setText(btnDiv.getText().toString());
    }

}