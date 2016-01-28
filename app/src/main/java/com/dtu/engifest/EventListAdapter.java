package com.dtu.engifest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dtu.engifest.models.Events;
import com.dtu.engifest.models.Sponsors;

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
        View itemView = LayoutInflater.from(context).inflate(R.layout.three_text_view, null, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EventListAdapter.MyViewHolder holder, int position) {

        holder.name.setText(list.get(position).getName());
        holder.date.setText(list.get(position).getDate());
        holder.time.setText(list.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView date;
        TextView time;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            date = (TextView)itemView.findViewById(R.id.date);
            time = (TextView)itemView.findViewById(R.id.time);
        }
    }
}
