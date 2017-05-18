package com.epam.androidlab.task6;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Artiom on 18.05.2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles = new String[]{
            "angkor wat",
            "cathedral duomo",
            "church of our savior",
            "great cathedral and mosque",
            "lincoln memorial",
            "machu picchu",
            "sheikh zayed grand mosque",
            "st peters basilica",
            "taj mahal",
            "the alhambra"};


    private int[] images = {
            R.drawable.angkor_wat,
            R.drawable.cathedral_duomo,
            R.drawable.church_of_our_savior,
            R.drawable.great_cathedral_and_mosque,
            R.drawable.lincoln_memorial,
            R.drawable.machu_picchu,
            R.drawable.sheikh_zayed_grand_mosque,
            R.drawable.st_peter_s_basilica,
            R.drawable.taj_mahal,
            R.drawable.the_alhambra};

    class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_image)
        ImageView itemImage;
        @BindView(R.id.item_title)
        TextView itemTitle;


        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}