package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private EditText number1,number2;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);
        //declare variable
        number1 =findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        button1 = findViewById(R.id.button1);

        LayoutInflater li  = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();
//assign function to button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number1 = number1.getText().toString();
                String Number2 = number2.getText().toString();
                Intent intent = new Intent(FirstActivity.this,Secondactivity.class);
                intent.putExtra("number1",Number1);
                intent.putExtra("number2",Number2);
                Toast.makeText(FirstActivity.this,"Sending Data",Toast.LENGTH_SHORT).show();
                startActivity(intent);
               //send toast message

            }
        });


        }


    }
