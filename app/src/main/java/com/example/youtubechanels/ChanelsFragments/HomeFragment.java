package com.example.youtubechanels.ChanelsFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.youtubechanels.Adapters.channelsVerticalAdapter;
import com.example.youtubechanels.Models.ChanelsModel;
import com.example.youtubechanels.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements channelsVerticalAdapter.onclick {
    View view;
    RecyclerView mRecyclerView;
    ArrayList<ChanelsModel> mYoutubeVideos = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        SetData();

        channelsVerticalAdapter mChannelsVerticalAdapter = new channelsVerticalAdapter(mYoutubeVideos, this, getContext());

        mRecyclerView.setAdapter(mChannelsVerticalAdapter);

        return view;
    }

    private void Replace(Fragment mFragment) {
        FragmentManager mFragmentManager = getActivity().getSupportFragmentManager();
        mFragmentManager.beginTransaction().replace(R.id.replace, mFragment).commit();
    }

    private void SetData() {
        ChanelsModel mChanelsModel = new ChanelsModel("Android Learning", R.drawable.android);
        ChanelsModel mChanelsModel2 = new ChanelsModel("Python Learning", R.drawable.python);
        ChanelsModel mChanelsModel3 = new ChanelsModel("Logic Design", R.drawable.logic);
        ChanelsModel mChanelsModel4 = new ChanelsModel("Data Structure", R.drawable.data_structure);
        ChanelsModel mChanelsModel5 = new ChanelsModel("Problem Solving", R.drawable.problem);

        mYoutubeVideos.add(mChanelsModel);
        mYoutubeVideos.add(mChanelsModel2);
        mYoutubeVideos.add(mChanelsModel3);
        mYoutubeVideos.add(mChanelsModel4);
        mYoutubeVideos.add(mChanelsModel5);
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
