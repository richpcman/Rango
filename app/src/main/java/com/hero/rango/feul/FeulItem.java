package com.hero.rango.feul;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.hero.rango.R;

import java.util.List;

public class FeulItem extends RecyclerView.Adapter<ViewContent> {

    private List<Feul> feul;

    public FeulItem(List<Feul> feul) {
        this.feul = feul;
    }

    @NonNull
    @Override
    public ViewContent onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.feul_list_item, parent, false);

        // 建立這個 view 的 ViewHolder。
        ViewContent viewHolder = new ViewContent(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewContent holder, int position) {
        holder.mTxt.setText(feul.get(position).getLiter());
        holder.mTxtMark.setText(feul.get(position).getMark());
    }

    @Override
    public int getItemCount() {
        return feul.size();
    }


}
