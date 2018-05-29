/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.materialplaypausedrawable;

import android.content.Context;
import android.util.AttributeSet;

public class MaterialPlayPauseButton extends VisibilityAggregatedImageButton {

    private MaterialPlayPauseDrawable mDrawable;

    public MaterialPlayPauseButton(Context context) {
        super(context);

        init();
    }

    public MaterialPlayPauseButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    public MaterialPlayPauseButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        mDrawable = new MaterialPlayPauseDrawable(getContext());
        setImageDrawable(mDrawable);
        // Otherwise ImageView tries to scale the drawable and it gets blurred.
        setScaleType(ScaleType.FIT_XY);
    }

    public void setAnimationDuration(long duration) {
        mDrawable.setAnimationDuration(duration);
    }

    public MaterialPlayPauseDrawable.State getState() {
        return mDrawable.getPlayPauseState();
    }

    public void jumpToState(MaterialPlayPauseDrawable.State state) {
        mDrawable.jumpToState(state);
    }

    public void setState(MaterialPlayPauseDrawable.State state) {
        mDrawable.setState(state);
    }
}
