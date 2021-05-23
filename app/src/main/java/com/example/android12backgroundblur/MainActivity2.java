package com.example.android12backgroundblur;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import static android.view.WindowManager.LayoutParams.FLAG_BLUR_BEHIND;

public class MainActivity2 extends AppCompatActivity {

    @RequiresApi(api = 31)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        Window window = this.getWindow();
//        if(window != null){
//            WindowManager.LayoutParams wMLP = window.getAttributes();
//            window.setFlags(FLAG_BLUR_BEHIND);
//            wMLP.dimAmount = 0.8f;
//            wMLP.blurBehindRadius = 100;
//            window.setAttributes(wMLP);
//        }
    }
}