package com.example.myapplication.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.modeis.HomeHorModel;
import com.example.myapplication.modeis.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder>{

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza 1", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "7:00 - 1:00", "5.0", "Min - 45 Rs"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1,"Pizza 1","7:00 - 1:00","5.0","Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2,"Pizza 2","7:00 - 1:00","5.0","Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3,"Pizza 3","7:00 - 1:00","5.0","Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza 4","7:00 - 1:00","5.0","Min - 45 Rs"));

                        updateVerticalRec.callBack(position, homeVerModels);

                    } else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.burger1, "Burger 1", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2, "Burger 2", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4, "Burger 3", "7:00 - 1:00", "5.0", "Min - 45 Rs"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    } else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1, "Fries 1", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2, "Fries 2", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3, "Fries 3", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4, "Fries 4", "7:00 - 1:00", "5.0", "Min - 45 Rs"));


                        updateVerticalRec.callBack(position, homeVerModels);

                    }
                    else if (position == 3) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream1, "Ice Cream 1", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream2, "Ice Cream 2", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                    homeVerModels.add(new HomeVerModel(R.drawable.icecream3, "Ice Cream 3", "7:00 - 1:00", "5.0", "Min - 45 Rs"));




                        updateVerticalRec.callBack(position, homeVerModels);
                    } else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1, "Sandwich 1", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2, "Sandwich 2", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3, "Sandwich 3", "7:00 - 1:00", "5.0", "Min - 45 Rs"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4, "Sandwich 4", "7:00 - 1:00", "5.0", "Min - 45 Rs"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }
                }
            });
            if(select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);

                }
            }
        }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.hor_img);
            name=itemView.findViewById(R.id.hor_text);
            cardView=itemView.findViewById(R.id.cardView);

        }
    }
}
