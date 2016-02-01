package com.dtudelhi.engifest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dtudelhi.engifest.models.Events;
import com.dtudelhi.engifest.models.Sponsors;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by chhavi on 28/1/16.
 */
public class TextWithImageAdapter extends RecyclerView.Adapter<TextWithImageAdapter.MyViewHolder> {

    public List<Sponsors> list;
    public int resId;
    Context context;
    View myView;
    boolean isSponsors;
    boolean isExplore;
    public TextWithImageAdapter(List<Sponsors> list, int resId, Context context) {
            this.list = list;
            this.resId = resId;
        if(resId == R.layout.card_with_text_and_image)  {
            isSponsors = true;
        }
        this.context = context;
    }
    public TextWithImageAdapter(List<Sponsors> list, int resId, Context context, boolean isExplore) {
        this.list = list;
        this.resId = resId;
        if(resId == R.layout.card_with_text_and_image)  {
            isSponsors = true;
        }
        this.context = context;
        this.isExplore = isExplore;
    }
    @Override
    public TextWithImageAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(resId, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TextWithImageAdapter.MyViewHolder holder, final int position) {
        final Sponsors sponsors = list.get(position);

        holder.name.setText(list.get(position).getName());
        if(!isSponsors) {
            if (isExplore) {
                Picasso.with(context).load(list.get(position).getImageUrl()).into(holder.imageView);
                //Log.e("asd", list.get(position).getImageResource())
            } else{
                Picasso.with(context).load(list.get(position).getImageResource()).placeholder(R.drawable.joker_port).into(holder.imageView);

            holder.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (position != list.size() - 1) {
                        List<Events> eventses = Events.find(Events.class, "category = ?", list.get(position).getName());
                        Log.e("sa", eventses.get(0).getName());
                        String[] items = new String[eventses.size()];
                        for (int i = 0; i < eventses.size(); i++) {
                            items[i] = eventses.get(i).getName();
                        }

                        if (eventses.size() != 0) {
                            new MaterialDialog.Builder(context)
                                    .title("Events")
                                    .items(items)
                                    .itemsCallback(new MaterialDialog.ListCallback() {
                                        @Override
                                        public void onSelection(MaterialDialog dialog, View view, int position, CharSequence text) {


                                            context.startActivity(new Intent(context, EventDetail.class).putExtra("name", text));

                                        }
                                    })
                                    .show();

                        }
                    } else {
                        context.startActivity(new Intent(context, EventDetail.class).putExtra("name", "Informal Events"));
                    }
                }

            });

        }

        }
        else {

            Sponsors sponsor = (Sponsors)list.get(position);
            Picasso.with(context).load(sponsor.getImageUrl()).into(holder.imageView);
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
            myView = itemView;
        }


    }
}