package com.licenta.mihai.givemebook_android.CustomViews.CustomText;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by mihai on 29.04.2016.
 */
public class TextViewOpenSansExtraBold extends AppCompatTextView {
    public TextViewOpenSansExtraBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-ExtraBold.ttf"));
        this.setTextScaleX(1f);
    }
}
