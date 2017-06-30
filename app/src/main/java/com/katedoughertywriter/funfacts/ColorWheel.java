package com.katedoughertywriter.funfacts;

import android.graphics.Color;

import java.util.Random;


/**
 * This class creates a random background color generator.
 *
 * @author Kate Dougherty
 * @version 1.0
 */

// Create a String array of hex colors
public class ColorWheel {
    // Fields (Member Variables) - Properties about the object
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    /** This method has no parameters.
    * @return a random color from the String array, as an integer
     */
    public int getColor() {
        String color;
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }

}