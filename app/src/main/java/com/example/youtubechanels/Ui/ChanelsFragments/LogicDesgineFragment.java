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
public class LogicDesgineFragment extends Fragment implements View.OnClickListener {

    View view;
    Unbinder nuUnbinder;
    DataViewModel viewModel;
    static int mSubNum = 0;
    @BindView(R.id.subscribeNumber)
    TextView mSubscribeNumber;
    @BindView(R.id.unsubscribe)
    Button mUnsubscribe;
    @BindView(R.id.subscribe)
    Button mSubscribe;
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    public LogicDesgineFragment() {
        // Required empty public constructor
    }

    //End

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_logic_desgine, container, false);
        nuUnbinder = ButterKnife.bind(this, view);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mSubscribeNumber.setText(String.valueOf(mSubNum));
        mSubscribe.setOnClickListener(this);
        mUnsubscribe.setOnClickListener(this);
        SetData();
        return view;
    }
    //End

    private void SetData() {
        viewModel = ViewModelProviders.of(getActivity()).get(DataViewModel.class);
        viewModel.GetLogicChannels();
        viewModel.mVideos.observe(getActivity(), new Observer<ArrayList<YouTubeVideos>>() {
            @Override
            public void onChanged(ArrayList<YouTubeVideos> youTubeVideos) {
                SetAdapter(youTubeVideos);
            }
        });
    }
    //End

    private void SetAdapter(ArrayList<YouTubeVideos> youTubeVideos) {
        VideoAdapter videoAdapter = new VideoAdapter(youTubeVideos);

        mRecyclerView.setAdapter(videoAdapter);
    }
    //end


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


