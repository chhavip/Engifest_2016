package com.dtu.engifest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dtu.engifest.models.Sponsors;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by chhavi on 28/1/16.
 */
public class TextWithImageAdapter extends RecyclerView.Adapter<TextWithImageAdapter.MyViewHolder> {

    public List<Sponsors> list;
    public int resId;
    Context context;
    boolean isSponsors;
    public TextWithImageAdapter(List<Sponsors> list, int resId, Context context) {
            this.list = list;
            this.resId = resId;
        if(resId == R.layout.card_with_text_and_image)  {
            isSponsors = true;
        }
            this.context = context;
    }

    @Override
    public TextWithImageAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(resId, null, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TextWithImageAdapter.MyViewHolder holder, int position) {

        holder.name.setText(list.get(position).getName());
        if(!isSponsors) {
            Picasso.with(context).load(list.get(position).getImageResource()).into(holder.imageView);
        }
        else {
            Picasso.with(context).load(list.get(position).getImageUrl()).into(holder.imageView);
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.background_image_view);
            name = (TextView) itemView.findViewById(R.id.event_name);
        }


    }
}
