package com.learn2crack.loadimage;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final String android_version_names[] = {
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow"
    };

    private final String android_image_urls[] = {
            "http://res.cloudinary.com/vish25v/image/upload/v1507825220/sunglasses_yey8e9.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825163/still-life-594579_960_720_tpnz4z.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825575/beautiful-sunset-hd1080p_jve2ha.jpg" ,
            "http://res.cloudinary.com/vish25v/image/upload/v1507825539/images_19_vx4mok.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825220/sunglasses_yey8e9.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825220/sunglasses_yey8e9.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825577/S3KH1h_wexrfe.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825539/images_19_vx4mok.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825163/still-life-594579_960_720_tpnz4z.jpg",
            "http://res.cloudinary.com/vish25v/image/upload/v1507825577/S3KH1h_wexrfe.jpg",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        initViews();


    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    private void initViews(){
         RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapter);

        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);



    }
    private ArrayList<AndroidVersion> prepareData(){

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }


}
