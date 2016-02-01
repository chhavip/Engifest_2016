package com.dtudelhi.engifest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dtudelhi.engifest.models.Events;

import java.util.List;

/**
 * Created by chhavi on 29/1/16.
 */
public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.MyViewHolder> {
   private Context context;
    public List<Events> list;

    public EventListAdapter(Context context, List<Events> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public EventListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.three_text_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EventListAdapter.MyViewHolder holder, final int position) {

        holder.name.setText(list.get(position).getName());
        holder.date.setText(list.get(position).getTime());
        holder.time.setText(list.get(position).getVenue());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, EventDetail.class).putExtra("name", list.get(position).getName()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView date;
        CardView card;
        TextView time;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name3);
            card = (CardView)itemView.findViewById(R.id.card_view);
            date = (TextView)itemView.findViewById(R.id.date3);
            time = (TextView)itemView.findViewById(R.id.time3);
        }
    }
}
