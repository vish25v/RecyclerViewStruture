package com.learn2crack.loadimage;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> android_versions;
    private Context context;

    public DataAdapter(Context context,ArrayList<AndroidVersion> android_versions) {
        this.context = context;
        this.android_versions = android_versions;

    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        //viewHolder.tv_android.setText(android_versions.get(i).getAndroid_version_name());
        Picasso.with(context).load(android_versions.get(i).getAndroid_image_url()).resize(120, 60).into(viewHolder.img_android);
        //setting onClickfor heart button:
        viewHolder.hearts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //on click event
                Intent i_hearts = new Intent(context, hearts2.class);
                context.startActivity(i_hearts);
                Toast.makeText(v.getContext(),"Element heart" + " clicked", Toast.LENGTH_SHORT).show();


            }
        });
        //setting onClickfor comment button:

        viewHolder.comments.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //on click event

                Toast.makeText(v.getContext(),"Element comment " + " clicked", Toast.LENGTH_SHORT).show();
                //Log.d("hello", "Element " + getAdapterPosition() + " clicked.");
                context.startActivity(new Intent(context, comment2.class));

            }
        });
        //setting onClickfor share button:
        viewHolder.share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //on click event
                Toast.makeText(v.getContext(),"Element share" + " clicked", Toast.LENGTH_SHORT).show();

               context.startActivity(new Intent(context, share2.class));

            }
        });


    }

    @Override
    public int getItemCount() {
        return android_versions.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_android;
        ImageView img_android;
        ImageView hearts;
        ImageView comments;
        ImageView share;
        public ViewHolder(View view) {
            super(view);

            //tv_android = (TextView)view.findViewById(R.id.tv_android);
            this.img_android = (ImageView)view.findViewById(R.id.img_android);
            this.hearts = (ImageView)view.findViewById(R.id.heart_btn);
            this.comments = (ImageView)view.findViewById(R.id.comment_btn);
            this.share = (ImageView)view.findViewById(R.id.share_btn);


        }
    }



    /////////////////////////////////////////////





    }





 /*  ////////////////////////////////////////////////////

            @Override
            public void onClick(View v) {

                final Intent intent;
                switch (getAdapterPostion()){
                    case 0:
                        intent =  new Intent(context, FirstActivity.class);
                        break;

                    case 1:
                        intent =  new Intent(context, SecondActivity.class);
                        break;
               ...
                    default:
                        intent =  new Intent(context, DefaultActivity.class);
                        break;
                }
                context.startActivity(intent);
            }

           //////////////////////////////////////////////////////////// */