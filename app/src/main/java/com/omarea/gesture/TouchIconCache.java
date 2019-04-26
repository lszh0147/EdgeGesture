package com.omarea.gesture;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class TouchIconCache {
    private static Context mContext;
    public static void setContext(Context context) {
        mContext = context;
    }

    private static Bitmap touch_arrow_left, touch_arrow_right, touch_tasks, touch_home, touch_lock, touch_notice, touch_power, touch_settings, touch_split, touch_info, touch_screenshot; // 图标资源

    public static Bitmap getIcon(int action) {
        switch (action) {
            case AccessibilityService.GLOBAL_ACTION_BACK: {
                if (touch_arrow_left == null && mContext != null) {
                    touch_arrow_left = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_arrow_left);
                }
                return touch_arrow_left;
            }
            case AccessibilityService.GLOBAL_ACTION_HOME: {
                if (touch_home == null && mContext != null) {
                    touch_home = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_home);
                }
                return touch_home;
            }
            case AccessibilityService.GLOBAL_ACTION_RECENTS: {
                if (touch_tasks == null && mContext != null) {
                    touch_tasks = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_tasks);
                }
                return touch_tasks;
            }
            case AccessibilityService.GLOBAL_ACTION_LOCK_SCREEN: {
                if (touch_lock == null && mContext != null) {
                    touch_lock = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_lock);
                }
                return touch_lock;
            }
            case AccessibilityService.GLOBAL_ACTION_NOTIFICATIONS: {
                if (touch_notice == null && mContext != null) {
                    touch_notice = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_notice);
                }
                return touch_notice;
            }
            case AccessibilityService.GLOBAL_ACTION_POWER_DIALOG: {
                if (touch_power == null && mContext != null) {
                    touch_power = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_power);
                }
                return touch_power;
            }
            case AccessibilityService.GLOBAL_ACTION_QUICK_SETTINGS: {
                if (touch_settings == null && mContext != null) {
                    touch_settings = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_settings);
                }
                return touch_settings;
            }
            case AccessibilityService.GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN: {
                if (touch_split == null && mContext != null) {
                    touch_split = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_split);
                }
                return touch_split;
            }
            case AccessibilityService.GLOBAL_ACTION_TAKE_SCREENSHOT: {
                if (touch_screenshot == null && mContext != null) {
                    touch_screenshot = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_screenshot);
                }
                return touch_screenshot;
            }
        }
        if (touch_info == null && mContext != null) {
            touch_info = BitmapFactory.decodeResource(mContext.getResources(), R.drawable.touch_info);
        }
        return touch_info;
    }
}