package com.example.rajusah.move;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import retrofit2.Retrofit;


public class TwoFragment extends Fragment {
    private static final String TAG=TwoFragment.class.getSimpleName();
    public static final String BASE_URL= "http://api.themoviedb.org/3/";
    private RecyclerView recyclerView;
    private Retrofit retrofit;
    private final static String API_KEY="a4eec5bc0c325e38b7c2a297a6f3f5e4";



    public TwoFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_two, container, false);
    }

}