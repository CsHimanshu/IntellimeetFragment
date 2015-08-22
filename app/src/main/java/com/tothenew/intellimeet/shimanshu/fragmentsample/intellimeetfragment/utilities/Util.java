package com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by himanshu on 9/8/15.
 */
public class Util {

    private static String TAG = "SHLOGGER";
    private static String TAG_TEXT = "SHLOGGER_TEXT";

    public enum LifecycleState {
        CALL_TO_SUPER,
        RETURN_FROM_SUPER
    }

    public static void printMethodName(Class<?> callingClass, LifecycleState state) {
        final String note;
        switch (state) {

            case CALL_TO_SUPER:
                note = ">>> ";
                break;
            case RETURN_FROM_SUPER:
                note = "<<< ";
                break;
            default:
                note = null;
        }
        printMethodName(callingClass, note);
    }

    public static void printTextMessage(Class<?> callingClass, String message) {
        String className = callingClass.getSimpleName() + "  ";
        Log.i(TAG_TEXT,className + (TextUtils.isEmpty(message) ? "" : " / " + message));
    }

    private static void printMethodName(Class<?> callingClass, String note) {
        String className = callingClass.getSimpleName();
        StackTraceElement[] s = Thread.currentThread().getStackTrace();
        String methodName = s[4].getMethodName();

        Log.i(TAG,className + "." + methodName + (TextUtils.isEmpty(note) ? "" : " / " + note));
    }
}
