package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mAnsOne;
    Button mAnsTwo;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mAnsOne = (Button) findViewById(R.id.buttonTop);
        mAnsTwo = (Button) findViewById(R.id.buttonBottom);

        mStoryText.setText(R.string.T1_Story);
        mAnsOne.setText(R.string.T1_Ans1);
        mAnsTwo.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mAnsOne.setText(R.string.T3_Ans1);
                    mAnsTwo.setText(R.string.T3_Ans2);

                    mStoryIndex++;
                } else if (mStoryIndex == 2 || mStoryIndex == 3) {
                    mStoryText.setText(R.string.T6_End);
                    mAnsOne.setVisibility(View.GONE);
                    mAnsTwo.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mAnsOne.setText(R.string.T2_Ans1);
                    mAnsTwo.setText(R.string.T2_Ans2);
                    mStoryIndex++;
                } else if (mStoryIndex == 2 || mStoryIndex == 3) {
                    mStoryText.setText(R.string.T5_End);
                    mAnsOne.setVisibility(View.GONE);
                    mAnsTwo.setVisibility(View.GONE);
                } else if (mStoryIndex == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mAnsOne.setVisibility(View.GONE);
                    mAnsTwo.setVisibility(View.GONE);
                }
            }
        });

    }
}
