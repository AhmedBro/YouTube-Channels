package com.example.youtubechanels.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.youtubechanels.Adapters.channelsVerticalAdapter;
import com.example.youtubechanels.ChanelsFragments.AndroidLearinigChanelFragment;
import com.example.youtubechanels.ChanelsFragments.DataStructureFragment;
import com.example.youtubechanels.ChanelsFragments.HomeFragment;
import com.example.youtubechanels.ChanelsFragments.LogicDesgineFragment;
import com.example.youtubechanels.ChanelsFragments.PaythonLearningFragment;
import com.example.youtubechanels.ChanelsFragments.ProblemSolvingFragment;
import com.example.youtubechanels.Models.ChanelsModel;
import com.example.youtubechanels.R;
import com.example.youtubechanels.Models.YouTubeVideos;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView mBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        mFragmentManager.beginTransaction().replace(R.id.replace, new HomeFragment()).commit();

        mBack = findViewById(R.id.back);
        mBack.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                FragmentManager mFragmentManager = getSupportFragmentManager();
                mFragmentManager.beginTransaction().replace(R.id.replace, new HomeFragment()).commit();
        }
    }
}
