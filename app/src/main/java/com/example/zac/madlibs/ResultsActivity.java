package com.example.zac.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultsActivity extends AppCompatActivity {

    public TextView mStoryResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mStoryResults = (TextView)findViewById(R.id.storyResults);
        Intent intent = getIntent();

        String storyText = intent.getStringExtra("key");

        mStoryResults.setText(storyText);
    }
}
