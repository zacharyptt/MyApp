package com.zachary.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class C_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void onClickA(View view) {
        Intent intent = new Intent();
        intent.setClass(C_Activity.this , CA_Activity.class);
        startActivity(intent);
    }

    public void onClickB(View view) {
        Intent intent = new Intent();
        intent.setClass(C_Activity.this , CB_Activity.class);
        startActivity(intent);
    }

    public void onClickC(View view) {
        Intent intent = new Intent();
        intent.setClass(C_Activity.this , CC_Activity.class);
        startActivity(intent);
    }


}
