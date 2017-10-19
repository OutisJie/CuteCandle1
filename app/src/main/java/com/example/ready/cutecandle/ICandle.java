package com.example.ready.cutecandle;


import android.graphics.Canvas;
import android.graphics.Point;

/**
 * Created by ready on 2017/10/12.
 */

public abstract class ICandle {
    //蜡烛底部左下坐标
    protected int mCurX;
    protected int mCurY;
    //蜡烛宽高
    protected int mCandleWidth;
    protected int mCandleHeight;
    //蜡烛左眼坐标
    protected Point mEyeLPoint;
    //蜡烛右眼坐标
    protected Point mEyeRPoint;
    //蜡烛眼睛半径
    protected int mEyeRadius;
    //眼睛间隔距离
    protected int mEyeDevide;
    //身体颜色
    protected int mCandleColor;
    //是否停止动画中
    protected boolean mIsAnimStoping = false;
    //蜡烛芯远坐标
    protected Point mCandlewickPoint;
    public ICandle(int x, int y){
        mCurX = x;
        mCurY = y;
    }

    public void initCandle(int width, int height){
        mCandleWidth = width;
        mCandleHeight = height;
    };

    public void initAnim(){

    }

    public void stopAnim(){

    }

    public void drawSelf(Canvas canvas){

    }

    public int getX() {
        return mCurX;
    }

    public int getY() {
        return mCurY;
    }

    public int getCandleWidth() {
        return mCandleWidth;
    }

    public void setCandleWidth(int mCandleWidth) {
        this.mCandleWidth = mCandleWidth;
    }

    public int getCandleHeight() {
        return mCandleHeight;
    }

    public void setCandleHeight(int mCandleHeight) {
        this.mCandleHeight = mCandleHeight;
    }

    public void setCandleColor(int mCandleColor) {
        this.mCandleColor = mCandleColor;
    }
}