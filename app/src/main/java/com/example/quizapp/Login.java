package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText username;
    private android.widget.EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById((R.id.password));


    }

    public void toastShow(View view) {
        Toast toast = Toast.makeText(this, "Username=admin\nPassword=1234", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void new_activity(View view) {
        String user = username.getText().toString();
        String pass = password.getText().toString();
        if (user.equals("admin") && pass.equals("1234")) {
            Intent intent = new Intent(this,choice.class);
            intent.putExtra("username", user);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(this, "Incorrect Username or password", Toast.LENGTH_SHORT);
            toast.show();
            username.setText("");
            password.setText("");
        }
    }

}