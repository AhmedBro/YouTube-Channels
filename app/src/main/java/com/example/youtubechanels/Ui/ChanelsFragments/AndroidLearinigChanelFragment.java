package com.example.youtubechanels.Ui.ChanelsFragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubechanels.Adapters.VideoAdapter;
import com.example.youtubechanels.Pojo.YouTubeVideos;
import com.example.youtubechanels.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidLearinigChanelFragment extends Fragment implements View.OnClickListener {
    ViewGroup view;

    Unbinder unbinder;
    static int mSubNum = 0;
    DataViewModel mDataViewModel;
    @BindView(R.id.subscribeNumber)
    TextView mSubscribeNumber;
    @BindView(R.id.unsubscribe)
    Button mUnsubscribe;
    @BindView(R.id.subscribe)
    Button mSubscribe;
    @BindView(R.id.recyclerViewLearn)
    RecyclerView mRecyclerView;


    public AndroidLearinigChanelFragment() {
        // Required empty public constructor
    }

    //End

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = (ViewGroup) inflater.inflate(R.layout.fragment_android_learinig_chanel, container, false);


        unbinder = ButterKnife.bind(this, view);


        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setHasFixedSize(true);

        mSubscribeNumber.setText(String.valueOf(mSubNum));
        mSubscribe.setOnClickListener(this);
        mUnsubscribe.setOnClickListener(this);

        SetData();


        return view;
    }

    //End

    private void SetData() {
        mDataViewModel = ViewModelProviders.of(getActivity()).get(DataViewModel.class);
        mDataViewModel.GetAndroidChannels();
        mDataViewModel.mVideos.observe(getActivity(), new Observer<ArrayList<YouTubeVideos>>() {
            @Override
            public void onChanged(ArrayList<YouTubeVideos> chanelsModels) {


                SetAdapter(chanelsModels);

            }
        });

    }

    //End

    private void SetAdapter(ArrayList<YouTubeVideos> mYoutubeVideos) {
        VideoAdapter videoAdapter = new VideoAdapter(mYoutubeVideos);

        mRecyclerView.setAdapter(videoAdapter);
    }

    //End

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
    //End

}
