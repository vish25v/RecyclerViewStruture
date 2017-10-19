package com.learn2crack.loadimage;

/**
 * Created by VISH on 10/18/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by VISH on 10/11/2017.
 */
// We need Adapter and a View Holder
public class adapter2 extends RecyclerView.Adapter<adapter2.ViewHolder> {

    private List<list_item> listItems;
    private Context context;

    public adapter2(List<list_item> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.heart_cardview, parent, false);
        return new ViewHolder((v));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        list_item listItem = listItems.get(position);
        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHead;
        public TextView textViewDesc;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead = (TextView) itemView.findViewById(R.id.heading);
            textViewDesc = (TextView) itemView.findViewById(R.id.desc);


        }
    }
}

