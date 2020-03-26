package com.example.youtubechanels.Adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubechanels.Models.YouTubeVideos;
import com.example.youtubechanels.R;

import java.util.ArrayList;


public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    ArrayList<YouTubeVideos> mYoutubeVideoList;

    public VideoAdapter() {
    }

    public VideoAdapter(ArrayList<YouTubeVideos> youtubeVideoList) {
        this.mYoutubeVideoList = youtubeVideoList;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view, parent, false);

        return new VideoViewHolder(view);

    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {

        holder.videoWeb.loadData(mYoutubeVideoList.get(position).getVideoUrl(), "text/html", "utf-8");

    }


    @Override
    public int getItemCount() {
        return mYoutubeVideoList.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {

        WebView videoWeb;

        @SuppressLint("SetJavaScriptEnabled")
        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = itemView.findViewById(R.id.videoWebView);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {


            });
        }
    }
}
