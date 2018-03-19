package com.twilio.video.quickstart.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.twilio.video.I420Frame;
import com.twilio.video.VideoView;

public class MyVideoView extends VideoView {
    public MyVideoView(Context context) {
        super(context);
    }

    public MyVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void renderFrame(I420Frame frame) {
        Log.i("SEAN", "Frame: " + frame.width + "x" + frame.height);
        super.renderFrame(frame);
    }
}
