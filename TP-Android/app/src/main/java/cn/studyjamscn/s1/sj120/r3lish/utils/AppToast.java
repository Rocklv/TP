package cn.studyjamscn.s1.sj120.r3lish.utils;

import android.util.Log;
import android.widget.Toast;

import cn.studyjamscn.s1.sj120.r3lish.App;


/**
 * Toast类
 *
 * @author 王鑫
 *         Created by 鑫 on 2015/10/13.
 */
public class AppToast {
    /**
     * Make a toast and show.
     *
     * @param message If message is null, toast won't show.
     */
    public static void showShort(String message) {
        if (message != null) {
            Log.d("AppToast", (App.CONTEXT == null) + "");
            Toast.makeText(App.CONTEXT, message, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Make a toast and show.
     *
     * @param message If message is null, toast won't show.
     */
    public static void showLong(String message) {
        if (message != null)
            Toast.makeText(App.CONTEXT, message, Toast.LENGTH_LONG).show();
    }
}
