package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.shashank.sony.fancytoastlib.FancyToast;

public class choice extends AppCompatActivity {
    RadioButton py,java,mul;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        py=findViewById(R.id.py);
        java=findViewById(R.id.java);
        mul=findViewById(R.id.mul);

        b=findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(py.isChecked()){
                    Intent i=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                }
                else if(java.isChecked()){
                    Intent i=new Intent(getApplicationContext(), Java.class);
                    startActivity(i);
                }
                else if(mul.isChecked()){
                    Intent i=new Intent(getApplicationContext(), Multimedia.class);
                    startActivity(i);
                }
                else
                    FancyToast.makeText(getApplicationContext(),"No subject chosen!", Toast.LENGTH_LONG);
            }
        });


    }
}