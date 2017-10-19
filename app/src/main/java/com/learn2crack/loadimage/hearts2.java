package com.learn2crack.loadimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class hearts2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<list_item> listitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //////
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //////
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_hearts2);
        recyclerView = (RecyclerView) findViewById(R.id.heartrecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems = new ArrayList<>();

        for (int i=0; i<=40; i++){
            list_item listItem = new list_item(
                    "heading" + (i+1),
                    "whatever desc here!!"
            );
            listitems.add(listItem);
        }
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        //set the adapter
        adapter = new adapter2(listitems, this);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollBy(0,1);
        recyclerView.smoothScrollBy(0,-1);


    }

    public void BackToMain(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}
