package com.touchmusic;

import android.app.Activity;
import android.os.Bundle;

import static com.touchmusic.R.layout.activity_music;

/**
 * Created by cardelar on 25/03/15.
 */
public class Music extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_music);
    }
}
