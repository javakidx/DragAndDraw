package com.bignerdranch.android.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 安軻 on 2015/8/25.
 */
public class BoxDrawingView extends View
{
    public static final String TAG = "BoxDrawingView";

    public BoxDrawingView(Context context)
    {
        super(context, null);
    }

    public BoxDrawingView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        PointF current = new PointF(event.getX(), event.getY());

        Log.i(TAG, "Received event at x=" + current.x + ", y=" + current.y + ":");
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, " ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, " ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.i(TAG, " ACTION_UP");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.i(TAG, " ACTION_CANCEL");
                break;
        }

        return true;
    }
}
