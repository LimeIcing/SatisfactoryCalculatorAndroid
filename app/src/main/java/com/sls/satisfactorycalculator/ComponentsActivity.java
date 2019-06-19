package com.sls.satisfactorycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ComponentsActivity extends AppCompatActivity {

    private final String TAG = "ComponentsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        Log.d(TAG, "onCreate: called");

        init();
    }

    private void init() {
        Log.d(TAG, "initializing...");
    }
}
