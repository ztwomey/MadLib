package com.example.zac.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    public static final String TAG = MainActivity.class.getSimpleName();

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

        Intent intent = getIntent();

        mCreateStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getFirstWord = mFirstWord.getText().toString();
                String getSecondWord = mSecondWord.getText().toString();
                String getThirdWord = mThirdWord.getText().toString();
                String getFourthWord = mFourthWord.getText().toString();
                String getFifthWord = mFifthWord.getText().toString();
                String getSixthWord = mSixthWord.getText().toString();
                String getSeventhWord = mSeventhWord.getText().toString();
                String getEighthWord = mEighthWord.getText().toString();
                String getNinthWord = mNinthWord.getText().toString();

                String story = String.format("You and your friends are wanting to see a(n) %s " +
                                "movie and decide to head to the theater to see what is playing. You get there " +
                                "and notice there are only %s choices. You all decide to see %s of " +
                                "%s %s. There are plenty of seats available but you all decide to sit " +
                                "in row %s. The movie is %s and everybody let out a %s at the end. " +
                                "Overall, it was a %s trip to the movies.", getFirstWord, getSecondWord, getThirdWord, getFourthWord,
                        getFifthWord, getSixthWord, getSeventhWord, getEighthWord, getNinthWord);

                Intent sendStory = new Intent(StoryActivity.this, ResultsActivity.class);
                sendStory.putExtra("key", story);
                startActivity(sendStory);

                Log.d(TAG, story.toString());
            }
        });


    }

}
