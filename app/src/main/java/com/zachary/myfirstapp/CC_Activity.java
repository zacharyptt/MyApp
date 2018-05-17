package com.zachary.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CC_Activity extends AppCompatActivity {
    private final static String CALL = "android.intent.action.CALL";
    private Button callBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc);
    }

    public void call01(View view) {
        Intent call = new Intent(CALL, Uri.parse("tel:" + ""));
        startActivity(call);
    }

    public void call02(View view) {
        Intent call = new Intent(CALL, Uri.parse("tel:" + ""));
        startActivity(call);
    }

    public void call03(View view) {
        Intent call = new Intent(CALL, Uri.parse("tel:" + ""));
        startActivity(call);
    }
}
