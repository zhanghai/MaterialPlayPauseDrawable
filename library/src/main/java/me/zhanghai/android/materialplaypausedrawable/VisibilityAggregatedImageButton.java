/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.materialplaypausedrawable;

import android.content.Context;
import android.os.Build;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;

public class VisibilityAggregatedImageButton extends AppCompatImageButton {

    public VisibilityAggregatedImageButton(Context context) {
        super(context);
    }

    public VisibilityAggregatedImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VisibilityAggregatedImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            onVisibilityAggregated(visibility == VISIBLE);
        }
    }
}
