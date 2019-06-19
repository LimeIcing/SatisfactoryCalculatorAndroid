package com.sls.satisfactorycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BuildingsActivity extends AppCompatActivity {

    private final String TAG = "BuildingsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildings);
        Log.d(TAG, "onCreate: called");

        init();
    }

    private void init() {
        Log.d(TAG, "initializing..");
    }
}
