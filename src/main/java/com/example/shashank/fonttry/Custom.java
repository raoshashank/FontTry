package com.example.shashank.fonttry;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Shashank Rao M on 15-07-2016.
 */
public class Custom extends TextView {

    public Custom(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/Roboto-Light.ttf"));
    }
}
