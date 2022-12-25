package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class osnova extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osnova);
        ImageView logout = findViewById(R.id.logout);
        ImageView history = findViewById(R.id.history);
        Button perehod = findViewById(R.id.button);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(osnova.this, MainActivity.class);
                osnova.this.startActivity(switcher);
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(osnova.this, settings.class);
                osnova.this.startActivity(switcher);
            }
        });

        perehod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse("https://natk.ru/stud-grad/schedule/187?group=%D0%9F%D0%A0-21.106"));
                osnova.this.startActivity(browse);
            }
        });


    }
}