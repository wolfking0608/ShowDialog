package com.itheima.showdialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * CLASSNAME:ToastDialog
 * AUTHOR:邓望保 lenovo
 * 邮箱:411085214@qq.com
 * 电话:18665996821
 * DATE:2018/3/12 22:27
 * 描述1:
 * 描述2:
 */

public class ToastDialog extends Dialog {
    private TextView        overdue_clear;
    private TextView        txt_cancle;
    private TextView        all_clear;
    private Activity        mActivity;

    public ToastDialog(Activity context) {
        super(context, R.style.dialog_with_alpha);
        this.mActivity = context;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alertdialog);
        DisplayMetrics metric = new DisplayMetrics();
        mActivity.getWindowManager().getDefaultDisplay().getMetrics(metric);
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = (int) (metric.widthPixels);
        Window window = getWindow();
        window.setAttributes(p);
        window.setGravity(Gravity.BOTTOM);
        window.setWindowAnimations(R.style.Umengstyle);
        setCancelable(true);
        this.setCanceledOnTouchOutside(true);

    }



    }
