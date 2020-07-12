package com.example.youtubechanels.Ui.ChanelsFragments;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.youtubechanels.Pojo.ChanelsModel;
import com.example.youtubechanels.Pojo.YouTubeVideos;
import com.example.youtubechanels.R;

import java.util.ArrayList;

public class DataViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ChanelsModel>> mData = new MutableLiveData<ArrayList<ChanelsModel>>();
    public MutableLiveData<ArrayList<YouTubeVideos>> mVideos = new MutableLiveData<ArrayList<YouTubeVideos>>();


    public void GetHomeChannels() {
        mData.setValue(SetHomeData());
    }

    public void GetAndroidChannels() {
        mVideos.setValue(SetAndroidData());
    }
    public void GetLogicChannels() {
        mVideos.setValue(SetLogicData());
    }

    public void GetPythonChannels() {
        mVideos.setValue(SetPythonData());
    }
    public void GetProblemSolvingChannels() {
        mVideos.setValue(SetProblemSolvingData());
    }
    public void GetDataStructureChannels() {
        mVideos.setValue(SetDataStructureData());
    }
    private ArrayList<ChanelsModel> SetHomeData() {
        ArrayList<ChanelsModel> mYoutubeVideos = new ArrayList<>();
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
        return mYoutubeVideos;
    }

    private ArrayList<YouTubeVideos> SetAndroidData() {
        ArrayList<YouTubeVideos> mYoutubeVideos = new ArrayList<>();
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/g9YblXBQ5uU\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s3mG3ypNO0s\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9lsJK0WuNFU\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n6oc6mWVtes\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ie6LX0A19xY\" frameborder=\"0\" allowfullscreen></iframe>"));
        return mYoutubeVideos;
    }

    private ArrayList<YouTubeVideos> SetLogicData() {
        ArrayList<YouTubeVideos> mYoutubeVideos = new ArrayList<>();
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qHnZbHzNthw\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/dgEOfxbbS_4\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yjOQ4TnFbmA\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WWBMHMOrt38\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/RJF6l_LBbMg\" frameborder=\"0\" allowfullscreen></iframe>"));
        return mYoutubeVideos;
    }

    private ArrayList<YouTubeVideos> SetDataStructureData() {
        ArrayList<YouTubeVideos> mYoutubeVideos = new ArrayList<>();
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lVFnq4zbs-g\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TC7apM-xGaU\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/X41iojWqQZY\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/U8Ni1yJ8ZS4\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FSsriWQ0qYE\" frameborder=\"0\" allowfullscreen></iframe>"));
        return mYoutubeVideos;
    }

    private ArrayList<YouTubeVideos > SetPythonData() {
        ArrayList<YouTubeVideos> mYoutubeVideos = new ArrayList<>();
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/QXeEoD0pB3E\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hEgO047GxaQ\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/mbryl4MZJms\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DWgzHbglNIo\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/TqPzwenhMj0\" frameborder=\"0\" allowfullscreen></iframe>"));

        return mYoutubeVideos;
    }

    private ArrayList<YouTubeVideos> SetProblemSolvingData() {
        ArrayList<YouTubeVideos> mYoutubeVideos = new ArrayList<>();
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/N8l8-UeVpAM\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/hYalOGs1_Og\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kQGTjql8WjI\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fQwD4-FxQBU\" frameborder=\"0\" allowfullscreen></iframe>"));
        mYoutubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/dZiZ0zsMBNQ\" frameborder=\"0\" allowfullscreen></iframe>"));

        return mYoutubeVideos;
    }


}
