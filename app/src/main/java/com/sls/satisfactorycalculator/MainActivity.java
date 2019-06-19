package com.sls.satisfactorycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "MainActivity";

    private Button buttonComponents, buttonResources, buttonBuildings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Called");

        init();
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "onClick: " + view.getId() + " clicked");
        Intent intent;
        
        switch (view.getId()) {
            case R.id.button_components:
                intent = new Intent(this, ComponentsActivity.class);
                startActivity(intent);
                break;

            case R.id.button_resources:
                intent = new Intent(this, ResourcesActivity.class);
                startActivity(intent);
                break;

            case R.id.button_buildings:
                intent = new Intent(this, BuildingsActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void init(){
        Log.d(TAG, "initializing...");

        buttonComponents = findViewById(R.id.button_components);
        buttonResources = findViewById(R.id.button_resources);
        buttonBuildings = findViewById(R.id.button_buildings);
        buttonComponents.setOnClickListener(this);
        buttonBuildings.setOnClickListener(this);
        buttonResources.setOnClickListener(this);
    }
}
