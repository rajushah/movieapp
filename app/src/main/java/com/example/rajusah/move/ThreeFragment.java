package com.example.rajusah.move;

import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;



public class ThreeFragment extends Fragment {



    public ThreeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_three, container, false);
    }

}