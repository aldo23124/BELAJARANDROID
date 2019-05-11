package com.dicoding.www.belajarandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    private final String TAG = HomeFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: is called");
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: is called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: is called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: is called ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: is called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: is called");
    }

}
