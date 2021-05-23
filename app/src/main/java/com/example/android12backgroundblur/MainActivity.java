package com.example.android12backgroundblur;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = 31)
            @Override
            public void onClick(View view) {
//                showDialog();
                Intent intent = new Intent(getApplication(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @RequiresApi(api = 31)
    void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Hello Blur World!");
        builder.setNegativeButton("NG",null);

        AlertDialog dialog = builder.create();

        Window window = dialog.getWindow();
        if(window != null){
            WindowManager.LayoutParams wMLP = window.getAttributes();
            wMLP.dimAmount = 0.8f;
            wMLP.blurBehindRadius = 100;
            window.setAttributes(wMLP);
        }

        dialog.show();

//        Window window = dialog.getWindow();
//        if(window != null){
//            WindowManager.LayoutParams wMLP = window.getAttributes();
//            wMLP.dimAmount = 0.3f;
//            wMLP.blurBehindRadius = 100;
//            window.setAttributes(wMLP);
//        }
    }
}