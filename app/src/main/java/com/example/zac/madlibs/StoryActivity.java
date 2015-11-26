package com.example.zac.madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class StoryActivity extends AppCompatActivity {

    public EditText mFirstWord;
    public EditText mSecondWord;
    public EditText mThirdWord;
    public EditText mFourthWord;
    public EditText mFifthWord;
    public EditText mSixthWord;
    public EditText mSeventhWord;
    public EditText mEighthWord;
    public EditText mNinthWord;
    public Button mCreateStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mFirstWord = (EditText)findViewById(R.id.firstWord);
        mSecondWord = (EditText)findViewById(R.id.secondWord);
        mThirdWord = (EditText)findViewById(R.id.thirdWord);
        mFourthWord = (EditText)findViewById(R.id.fourthWord);
        mFifthWord = (EditText)findViewById(R.id.fifthWord);
        mSixthWord = (EditText)findViewById(R.id.sixthWord);
        mSeventhWord = (EditText)findViewById(R.id.seventhWord);
        mEighthWord = (EditText)findViewById(R.id.eighthWord);
        mNinthWord = (EditText)findViewById(R.id.ninthWord);
        mCreateStory = (Button)findViewById(R.id.createStoryButton);
    }

}
