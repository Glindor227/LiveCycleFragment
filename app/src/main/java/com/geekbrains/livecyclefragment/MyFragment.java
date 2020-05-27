package com.geekbrains.livecyclefragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MyFragment extends Fragment {

    public MyFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(MainActivity.TAG,"Fragment onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(MainActivity.TAG,"Fragment onCreateView");
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(MainActivity.TAG,"Fragment onAttach");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(MainActivity.TAG,"Fragment onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(MainActivity.TAG,"Fragment onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(MainActivity.TAG,"Fragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(MainActivity.TAG,"Fragment onResume");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(MainActivity.TAG,"Fragment onSaveInstanceState");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(MainActivity.TAG,"Fragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(MainActivity.TAG,"Fragment onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(MainActivity.TAG,"Fragment onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(MainActivity.TAG,"Fragment onDetach");
    }
}
