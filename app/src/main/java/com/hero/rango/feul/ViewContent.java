package com.hero.rango.feul;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hero.rango.R;

public class ViewContent extends RecyclerView.ViewHolder {

    public TextView mTxt;
    public TextView mTxtMark;

    public ViewContent(@NonNull View itemView) {
        super(itemView);
        mTxt = (TextView) itemView.findViewById(R.id.feul_textview);
        mTxtMark = (TextView) itemView.findViewById(R.id.feul_mark);
    }
}