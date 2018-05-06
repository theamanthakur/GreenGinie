package com.example.amanthakur.evsapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by AMAN THAKUR on 27-03-2018.
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolder> {

    public OnItemClickListener onItemClickListener;

    private String[] titles = {"Air Quality",
            "Water Quality",
            "Yamuna Action Plan",
            "Biodiversity",
            "Energy Consumption","Environmental calendar","EP index",
            "Biological Waste Water Treatment",
    };

    private String[] details = {"It will show you the Real time air quality of cities. ",
            "It will show some Reports of  water quality by Delhi government.","Know about action for cleaning yamuna.",
            "it will show Biodiversity of India.","Energy consumption in powerful countries.",
            "All International and National Days Based on Environment.",
            "The Environmental Performance Index (EPI) is a method of quantifying and numerically marking the environmental performance of a state's policies.",
            "It is a book written by Marcos von sperling",
            };

    private int[] images = { R.drawable.air,
            R.drawable.water,
            R.drawable.yamuna,
            R.drawable.biodiversity,
            R.drawable.energy,
            R.drawable.calender,
            R.drawable.epi,
            R.drawable.book,
    };
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);


    }

    @Override
    public int getItemCount() {
        return titles.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;
        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_image);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDetail = itemView.findViewById(R.id.item_detail);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

//                    Snackbar.make(v, "Click detected on item " + position,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();


                    //Toast.makeText(v.getContext(), "" + position, Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(v.getContext(),RealTimeAQI.class);
                    in.putExtra("Postion",""+position);
                    v.getContext().startActivity(in);


                }
            });

        }

    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}

