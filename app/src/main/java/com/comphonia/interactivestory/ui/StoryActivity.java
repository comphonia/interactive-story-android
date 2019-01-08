package com.comphonia.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.comphonia.interactivestory.R;
import com.comphonia.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {

    private static final String TAG = StoryActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        Log.d(TAG,name);
    }
}
