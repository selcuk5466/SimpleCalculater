package com.selcukaydin.simplecalculater;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        number1Text=findViewById(R.id.enterNumber1);
        number2Text=findViewById(R.id.enterNumber2);
        resultText=findViewById(R.id.resultText);

    }

    public void sum(View view){

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("") && number2Text.getText().toString().matches("0")){
            resultText.setText("Enter number!");
        }else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 + number2;
            resultText.setText("Result : " + result);
        }
    }

    public void deduct(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("") && number2Text.getText().toString().matches("0")){
            resultText.setText("Enter number!");
        }else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 - number2;
            resultText.setText("Result : " + result);
        }
    }

    public void multiply(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("") && number2Text.getText().toString().matches("0")){
            resultText.setText("Enter number!");
        }else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 * number2;
            resultText.setText("Result : " + result);
        }
    }

    public void divide(View view){
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("") && number2Text.getText().toString().matches("0")){
            resultText.setText("Enter number!");
        }else {

            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());
            int result = number1 / number2;
            resultText.setText("Result : " + result);
        }
    }
}