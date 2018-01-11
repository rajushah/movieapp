package com.example.rajusah.move;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


public class MovieDetailActivity extends AppCompatActivity {


    public static void start(Context context, Movie movie) {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail_activity);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new BlankFragment()).commit();
    }
}
