package com.example.youtubechanels.ChanelsFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.youtubechanels.Adapters.VideoAdapter;
import com.example.youtubechanels.Models.YouTubeVideos;
import com.example.youtubechanels.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidLearinigChanelFragment extends Fragment implements View.OnClickListener {
    View view;
    RecyclerView mRecyclerView;
    ArrayList<YouTubeVideos> mYoutubeVideos = new ArrayList<>();
    Button mSubscribe, mUnsubscribe;
    TextView mSubscribeNumber;
    static int mSubNum = 0;

    public AndroidLearinigChanelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_android_learinig_chanel, container, false);

        instView();


        return view;
    }

    private void instView() {
        mSubscribe = view.findViewById(R.id.subscribe);
        mSubscribe.setOnClickListener(this);

        //------------------------------------------------------------------------------------------
        mUnsubscribe = view.findViewById(R.id.unsubscribe);
        mUnsubscribe.setOnClickListener(this);

        //------------------------------------------------------------------------------------------
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //------------------------------------------------------------------------------------------
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/g9YblXBQ5uU\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s3mG3ypNO0s\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9lsJK0WuNFU\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n6oc6mWVtes\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ie6LX0A19xY\" frameborder=\"0\" allowfullscreen></iframe>"));
        //------------------------------------------------------------------------------------------

        VideoAdapter videoAdapter = new VideoAdapter(mYoutubeVideos);

        mRecyclerView.setAdapter(videoAdapter);
        //------------------------------------------------------------------------------------------
        mSubscribeNumber = view.findViewById(R.id.subscribeNumber);
        mSubscribeNumber.setText(String.valueOf(mSubNum));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.subscribe:
                mSubNum++;
                mSubscribeNumber.setText(String.valueOf(mSubNum));
                mSubscribe.setVisibility(View.GONE);
                mUnsubscribe.setVisibility(View.VISIBLE);
                break;
            case R.id.unsubscribe:
                mSubNum--;
                mSubscribeNumber.setText(String.valueOf(mSubNum));
                mUnsubscribe.setVisibility(View.GONE);
                mSubscribe.setVisibility(View.VISIBLE);
                break;
        }

    }
}
