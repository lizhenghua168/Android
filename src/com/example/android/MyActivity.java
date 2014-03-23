package com.example.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {

    public static final String TAG = "MyActivity";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i(TAG, "onCreate method is excuted.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart method is excuted.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart method is excuted.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume method is excuted.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause method is excuted.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop method is excuted.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy method is excuted.");
    }
}
