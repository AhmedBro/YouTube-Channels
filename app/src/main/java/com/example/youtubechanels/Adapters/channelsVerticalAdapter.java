package com.example.youtubechanels.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.youtubechanels.Models.ChanelsModel;
import com.example.youtubechanels.R;

import java.util.ArrayList;

public class channelsVerticalAdapter extends RecyclerView.Adapter<channelsVerticalAdapter.MoAdapter> {
    ArrayList<ChanelsModel> mChannels;
    onclick mOnclick;
Context mContext;

    public channelsVerticalAdapter(ArrayList<ChanelsModel> mChannels, onclick mOnclick, Context mContext) {
        this.mChannels = mChannels;
        this.mOnclick = mOnclick;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public MoAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chanel_shape, parent, false);
        MoAdapter MoAdapter = new MoAdapter(view);
        return MoAdapter;
    }

    @Override
    public void onBindViewHolder(@NonNull MoAdapter holder, final int position) {
        holder.mName.setText(mChannels.get(position).getmName());
        Glide.with(mContext).load(mChannels.get(position).getmImage()).into(holder.mImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mChannels.get(position).getmName().equalsIgnoreCase("Android Learning")) {
                    mOnclick.on_click("Android Learning");
                } else if (mChannels.get(position).getmName().equalsIgnoreCase("Python Learning")) {
                    mOnclick.on_click("Python Learning");
                } else if (mChannels.get(position).getmName().equalsIgnoreCase("Data Structure")) {
                    mOnclick.on_click("Data Structure");
                } else if (mChannels.get(position).getmName().equalsIgnoreCase("Logic Design")) {
                    mOnclick.on_click("Logic Design");
                } else if (mChannels.get(position).getmName().equalsIgnoreCase("Problem Solving")) {
                    mOnclick.on_click("Problem Solving");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mChannels.size();
    }

    class MoAdapter extends RecyclerView.ViewHolder {

        TextView mName;
        ImageView mImage;

        public MoAdapter(@NonNull View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.chanelImage);
            mName = itemView.findViewById(R.id.chanelName);
        }
    }

    public interface onclick {
        void on_click(String Name);
    }
}
