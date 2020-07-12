package com.example.youtubechanels.Ui.ChanelsFragments;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubechanels.Adapters.channelsVerticalAdapter;
import com.example.youtubechanels.Pojo.ChanelsModel;
import com.example.youtubechanels.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements channelsVerticalAdapter.onclick {
    View view;

    Unbinder unbinder;
    DataViewModel chanelViewModel;
    static ArrayList<ChanelsModel> mYoutubeVideos = new ArrayList<>();
    @BindView(R.id.recyclerView)
    public RecyclerView mRecyclerView;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_home, container, false);

        unbinder =  ButterKnife.bind(this,view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        //  mRecyclerView.setHasFixedSize(true);

        SetData();

        return view;
    }


    private void SetData() {
        chanelViewModel = ViewModelProviders.of(getActivity()).get(DataViewModel.class);
        chanelViewModel.GetHomeChannels();
        chanelViewModel.mData.observe(getActivity(), new Observer<ArrayList<ChanelsModel>>() {
            @Override
            public void onChanged(ArrayList<ChanelsModel> chanelsModels) {

                mYoutubeVideos = chanelsModels;
                Log.e("eeeeeeeeee", mYoutubeVideos + "");
                SetAdapter(mYoutubeVideos);

            }
        });

    }

    private void SetAdapter(ArrayList<ChanelsModel> mYoutubeVideos) {
        channelsVerticalAdapter mChannelsVerticalAdapter = new channelsVerticalAdapter(mYoutubeVideos, this, getContext());
        mRecyclerView.setAdapter(mChannelsVerticalAdapter);
    }

    private void Replace(Fragment mFragment) {
        FragmentManager mFragmentManager = getActivity().getSupportFragmentManager();
        mFragmentManager.beginTransaction().replace(R.id.replace, mFragment).commit();
    }


    @Override
    public void on_click(String Name) {

        switch (Name) {
            case "Android Learning":

                Replace(new AndroidLearinigChanelFragment());

                break;
            case "Python Learning":
                Replace(new PaythonLearningFragment());

                break;
            case "Data Structure":
                Replace(new DataStructureFragment());

                break;
            case "Logic Design":
                Replace(new LogicDesgineFragment());

                break;

            case "Problem Solving":
                Replace(new ProblemSolvingFragment());

                break;
        }
    }
}