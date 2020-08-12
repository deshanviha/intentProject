package com.example.intentsproj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Secondactivity extends AppCompatActivity {

    private EditText number1,number2;
    private Button plus,minus,multi,devide;
    private TextView result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        // declare variable
        number1 = findViewById(R.id.number1_1);
        number2 = findViewById(R.id.number2_2);
        plus =findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        devide = findViewById(R.id.devide);
        result = findViewById(R.id.result);

        // assign import number to declared variable
        final String number_1 = getIntent().getStringExtra("number1");
        String number_2 = getIntent().getStringExtra("number2");

        //set import value to variable
        number1.setText(number_1);
        number2.setText(number_2);

        //adding function
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number_1 = Integer.parseInt(number1.getText().toString());
                int number_2 = Integer.parseInt(number2.getText().toString());

                int sum = number_1 + number_2;
                result.setText("Answer: " +String.valueOf(sum));
            }
        });
        //subtract function
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number_1 = Integer.parseInt(number1.getText().toString());
                int number_2 = Integer.parseInt(number2.getText().toString());

                int sum = number_1 - number_2;
                result.setText("Answer: " +String.valueOf(sum));
            }
        });
        //multiply function
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number_1 = Integer.parseInt(number1.getText().toString());
                int number_2 = Integer.parseInt(number2.getText().toString());

                int sum = number_1 * number_2;
                result.setText("Answer: " +String.valueOf(sum));
            }
        });
        //devide function
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number_1 = Integer.parseInt(number1.getText().toString());
                int number_2 = Integer.parseInt(number2.getText().toString());

                int sum = number_1 / number_2;
                result.setText("Answer: " +String.valueOf(sum));
            }
        });

    }
}
