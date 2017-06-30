package com.katedoughertywriter.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * @author Kate Dougherty
 * @version 1.0.0
 */

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    // Declare our View variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    // Display layout when the app is opened
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.ShowFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relLayout);

        /* Create an onClickListener that will listen for when the "Next Fun Fact" button is tapped
        * On tap, button will bring up a new fact and change background color
         */
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();
                // Update the screen with our dynamic fact
                mFactTextView.setText(fact);
                // Update background color
                mRelativeLayout.setBackgroundColor(color);
                // Update text color on button
                mShowFactButton.setTextColor(color);
            }
        };
        // Attach the listener to the button
        mShowFactButton.setOnClickListener(listener);

        // Toast.makeText(FunFactsActivity.this, "Yay! Our activity was created!", Toast.LENGTH_SHORT).show();
        // Create log data for debugging
        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}
