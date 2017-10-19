package com.learn2crack.loadimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class comment2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment2);
    }

    public void BackToMain(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}
