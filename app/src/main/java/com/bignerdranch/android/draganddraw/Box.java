package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by 安軻 on 2015/8/25.
 */
public class Box
{
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin)
    {
        mOrigin = origin;
    }

    public PointF getCurrent()
    {
        return mCurrent;
    }

    public void setCurrent(PointF current)
    {
        mCurrent = current;
    }

    public PointF getOrigin()
    {
        return mOrigin;
    }
}
