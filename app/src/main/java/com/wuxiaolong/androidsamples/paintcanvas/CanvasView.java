package com.wuxiaolong.androidsamples.paintcanvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.wuxiaolong.androidsamples.R;

/**
 * Created by Administrator
 * on 2016/8/22.
 */
public class CanvasView extends View {
    private Paint mPaint;
    private Bitmap mBitmap;

    public CanvasView(Context context) {
        super(context);
        init();
    }

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.logo);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //canvas.drawARGB(255,5,7,11);

        //RectF rectF = new RectF(100f, 100f, 500f, 500f);
        //canvas.drawArc(rectF, 0, 150, false, mPaint);

        //canvas.drawBitmap(mBitmap, 0, 0, mPaint);
        //
        ////绘制Bitmap的一部分，并对其拉伸
        ////srcRect绘制Bitmap的哪一部分
        //Rect src = new Rect(0, 0, mBitmap.getWidth(), mBitmap.getHeight() / 3);
        ////dstRecF绘制的Bitmap拉伸到哪里
        //RectF dst = new RectF(0, mBitmap.getHeight(), canvas.getWidth(), mBitmap.getHeight() + 200);
        //canvas.drawBitmap(mBitmap, src, dst, mPaint);
        //
        //Matrix matrix = new Matrix();
        //matrix.postTranslate(0, mBitmap.getHeight() + 200);
        //canvas.drawBitmap(mBitmap, matrix, mPaint);

        //canvas.drawCircle(500f, 500f, 200, mPaint);

        //canvas.drawColor(Color.BLUE);

        //canvas.drawLine(100f, 100f, 500f, 500f, mPaint);
        //float[] pts = {100f, 100f, 400f, 400f,
        //        400f, 400f, 250f, 560f,
        //        250f, 560f, 400f, 800f,
        //        400f, 800f, 280f, 880f};
        //canvas.drawLines(pts, mPaint);
        //有选择地绘制直线
        //canvas.drawLines(pts, 4, 10, mPaint);

        //RectF rectF = new RectF(100f, 100f, 600f, 500f);
        //等同于圆的效果
        //RectF rectF = new RectF(100f, 100f, 500f, 500f);
        //canvas.drawOval(rectF, mPaint);

        //Path path = new Path();
        //向Path中加入Arc
        //RectF arcRecF = new RectF(0, 0, 500, 500);
        //path.addArc(arcRecF, 0, 135);
        //canvas.drawPath(path, mPaint);

        //canvas.drawPoint(500f,500f,mPaint);

        //canvas.drawRect(100f,100f,500f,500f,mPaint);

        //RectF rectF = new RectF(100f, 100f, 500f, 500f);
        //canvas.drawRect(rectF, mPaint);
        //canvas.drawRoundRect(rectF, 150, 50, mPaint);

        //mPaint.setTextSize(50);
        //String text = "我的微信公众号：吴小龙同学";
        //canvas.drawText(text, 2, text.length(), 100, 100, mPaint);
        //canvas.drawText("我的微信公众号：吴小龙同学", 100, 400, mPaint);

        Path path = new Path();
        path.addCircle(500, 500, 200, Path.Direction.CW);
        mPaint.setTextSize(50);
        // 绘制路径
        canvas.drawPath(path, mPaint);

        String text = "我的微信公众号：吴小龙同学";
        canvas.drawTextOnPath(text, path, -10f, 0f, mPaint);


    }
}
