package com.itheima.showdialog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) this.findViewById(R.id.text);
        //把文字控件添加监听，点击弹出自定义窗口
        tv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                         startActivity(new Intent(MainActivity.this, SelectPicPopupWindow.class));
//                ToastDialog dialog = new ToastDialog(MainActivity.this);
//                dialog.show();
            }
        });
    }
}
