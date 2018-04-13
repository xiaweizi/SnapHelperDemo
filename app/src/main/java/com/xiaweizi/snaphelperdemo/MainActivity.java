package com.xiaweizi.snaphelperdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linearSnap(View view) {
        startActivity(new Intent(this, LinearSnapHelperActivity.class));
    }

    public void pageSnap(View view) {
        startActivity(new Intent(this, PageSnapHelperActivity.class));
    }

    public void gravitySnap(View view) {
        startActivity(new Intent(this, GravitySnapHelperActivity.class));
    }
}
