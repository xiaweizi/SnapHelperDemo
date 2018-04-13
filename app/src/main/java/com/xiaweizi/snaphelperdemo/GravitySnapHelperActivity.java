package com.xiaweizi.snaphelperdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;

import com.xiaweizi.snaphelperdemo.gravity.GravitySnapHelper;

public class GravitySnapHelperActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_snap);
        mRecyclerView = findViewById(R.id.recyclerView);
        CommonAdapter adapter = new CommonAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mRecyclerView.setAdapter(adapter);
        SnapHelper snapHelper = new GravitySnapHelper(Gravity.START);
        snapHelper.attachToRecyclerView(mRecyclerView);
    }
}
