package com.leo.android.wheelview;

import android.util.Log;

import java.util.Locale;

/**
 * Created on 2018/2/22 下午3:54.
 * leo linxiaotao1993@vip.qq.com
 */

final class Logger {

    private static final String TAG = "WheelView";

    static void d(String message, Object... args) {
        Log.d(TAG, String.format(Locale.getDefault(), message, args));
    }

    static void e(String message, Object... args) {
        Log.e(TAG, String.format(Locale.getDefault(), message, args));

    }

}
