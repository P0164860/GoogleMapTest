package com.pactera.googlemaptest.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class BitmapUtil {
    /**
     * 选择变换
     *
     * @param origin 原图
     * @param rotate  旋转角度，可正可负
     * @return 旋转后的图片
     */
    public  static Bitmap rotateBitmap(Bitmap origin, float rotate) {
        if (origin == null) {
            return null;
        }
        int width = origin.getWidth();
        int height = origin.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(rotate);
        // 围绕原地进行旋转
        Bitmap newBM = Bitmap.createBitmap(origin, 0, 0, width, height, matrix, false);
        if (newBM.equals(origin)) {
            return newBM;
        }
        origin.recycle();
        return newBM;
    }
}
