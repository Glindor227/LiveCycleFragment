package com.geekbrains.livecyclefragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    static final String TAG = "mylivecycle";
    public MainActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity onCreate");

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MyFragment())
                    .commit();
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG,"Activity onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG,"Activity onPostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Activity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Activity onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"Activity onSaveInstanceState");
    }

}
