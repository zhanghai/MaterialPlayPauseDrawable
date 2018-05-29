/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.materialplaypausedrawable.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.zhanghai.android.materialplaypausedrawable.MaterialPlayPauseButton;
import me.zhanghai.android.materialplaypausedrawable.MaterialPlayPauseDrawable;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.play_pause)
    MaterialPlayPauseButton mPlayPauseButton;
    @BindView(R.id.version)
    TextView mVersionText;
    @BindView(R.id.github)
    TextView mGithubText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);

        mPlayPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialPlayPauseDrawable.State newState =
                        mPlayPauseButton.getState() == MaterialPlayPauseDrawable.State.Play ?
                                MaterialPlayPauseDrawable.State.Pause
                                : MaterialPlayPauseDrawable.State.Play;
                mPlayPauseButton.setState(newState);
            }
        });
        String version = getString(R.string.library_version_format, BuildConfig.VERSION_NAME);
        mVersionText.setText(version);
        mGithubText.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
