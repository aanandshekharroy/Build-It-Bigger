package com.example.jokeactivitylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent=getIntent();
        String joke=intent.getStringExtra("joke");
        TextView joke_text=(TextView)findViewById(R.id.joke_text);
        joke_text.setText(joke);
//        Toast.makeText(this,joke,Toast.LENGTH_SHORT).show();
    }
}
