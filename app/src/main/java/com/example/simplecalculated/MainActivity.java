package com.example.simplecalculated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1Text;
    EditText Number2Text;
    TextView ResultText;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1Text = findViewById(R.id.Number1Text);
        Number2Text = findViewById(R.id.Number2Text);
        ResultText = findViewById(R.id.ResultText);
    }

    public void sum(View view){
        int number1 = Integer.parseInt(Number1Text.getText().toString());
        int number2 = Integer.parseInt(Number2Text.getText().toString());

        int result = number1 + number2;

        ResultText.setText("Result:" + result);
    }

    public void deduct(View view){
        int number1 = Integer.parseInt(Number1Text.getText().toString());
        int number2 = Integer.parseInt(Number2Text.getText().toString());

        int result = number1 - number2;

        ResultText.setText("Result:" + result);
    }

    public void multiply(View view) {
        int number1 = Integer.parseInt(Number1Text.getText().toString());
        int number2 = Integer.parseInt(Number2Text.getText().toString());

        int result = number1 * number2;

        ResultText.setText("Result:" + result);
    }

    public void divide(View view){
        int number1 = Integer.parseInt(Number1Text.getText().toString());
        int number2 = Integer.parseInt(Number2Text.getText().toString());

        int result = number1 / number2;

        ResultText.setText("Result:" + result);
    }
}