package com.example.recyclerview_khoirunnisa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ModelClass> userList;
    public Adapter (List<ModelClass>userList){
        this .userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource = userList.get(position).getImageview1();
        String name = userList.get(position).getTextview1();
        String msg = userList.get(position).getTextview3();
        String time = userList.get(position).getTextview2();
        String line = userList.get(position).getDivider();

        holder.setData(resource, name, msg, time, line);



    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        //inisialisasikan imageView, textView, textView2, textView3, divider
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView1);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            divider = itemView.findViewById(R.id.divider);
        }

        public void setData(int resource, String name, String msg, String time, String line) {
            imageView.setImageResource(resource); // set image berasal dari resource
            textView.setText(name); //set textView dari masukan name
            textView2.setText(msg); //set textView2 dari masukan msg
            textView3.setText(time); //set textView3 dari masukan time
            divider.setText(line); //set divider dari masukan line
        }
    }
}
