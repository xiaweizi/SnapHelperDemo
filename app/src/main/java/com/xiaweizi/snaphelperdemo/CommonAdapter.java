package com.xiaweizi.snaphelperdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.snaphelperdemo.CommonAdapter
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/12
 *     desc   :
 * </pre>
 */

public class CommonAdapter extends RecyclerView.Adapter<CommonAdapter.ViewHolder>{

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView content;
        public ImageView icon;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
