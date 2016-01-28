package com.dtu.engifest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dtu.engifest.models.Sponsors;

import java.util.List;

/**
 * Created by chhavi on 28/1/16.
 */
public class TextWithImageAdapter extends RecyclerView.Adapter<TextWithImageAdapter.Holder> {

    public List<Sponsors> list;
    public int Resid;
    Context context;

    public TextWithImageAdapter(List<Sponsors> list, int resid, Context context) {
            this.list = list;
            this.Resid = resid;
            this.context = context;
    }

    @Override
    public TextWithImageAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(Resid, null, false);

        return new Holder(itemView);
    }

    @Override
    public void onBindViewHolder(TextWithImageAdapter.Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class Holder extends RecyclerView.ViewHolder {

        public Holder(View itemView) {
            super(itemView);
        }
    }
}
