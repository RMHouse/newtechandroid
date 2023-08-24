package ru.vektor.newtech;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    WebView webView;
    String tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        webView = findViewById(R.id.webView);

        Intent intent = getIntent();
        String nameEx = intent.getStringExtra("nameEx");


        tmp = "Имя: " + nameEx + "<br><br>" ;

        webView.loadData(tmp, "text/html; charset=utf-8", null);
    }
}