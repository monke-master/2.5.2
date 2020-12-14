package com.example.vk;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final String rLogin = "admin";
    final String rPassword = "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enter(View v) {
        EditText lgn = findViewById(R.id.lgn);
        EditText pswrd = findViewById(R.id.pswrd);
        String login = lgn.getText().toString();
        String password = pswrd.getText().toString();
        TextView answer = findViewById(R.id.answer);
        if ((login.equals(rLogin)) && (password.equals(rPassword))) {
            answer.setText("Успешный вход");
            answer.setTextColor(Color.parseColor("#FF008000"));
        }
        else {
            answer.setText("Неверный логин или пароль");
            answer.setTextColor(Color.parseColor("#FB0000"));
        }

    }

}

