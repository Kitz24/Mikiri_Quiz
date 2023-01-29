package com.example.kapzquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onClickNormalQuiz(View view){
        Intent intent = new Intent(MainActivity.this,TopicSelectActivity.class);
        startActivity(intent);
    }
    public void onClickRapidQuiz(View view){
        finish();
        System.exit(0);
    }

}
// TODO: add button to view questions and one to display notes