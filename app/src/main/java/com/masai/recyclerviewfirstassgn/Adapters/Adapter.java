package com.masai.recyclerviewfirstassgn.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai.recyclerviewfirstassgn.Models.Model1;
import com.masai.recyclerviewfirstassgn.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @NonNull
    ArrayList<Model1> list ;
    Context context;

    public Adapter(@NonNull ArrayList<Model1> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Model1 model1 = list.get(position);
        holder.setData(model1);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       private ImageView mIvImage;
       private TextView mtvTitle;
       private TextView mtvArticleDetails;
        public ViewHolder( View itemView) {
            super(itemView);
            mIvImage = itemView.findViewById(R.id.ivArticleImage);
            mtvTitle=itemView.findViewById(R.id.tvTitle);
            mtvArticleDetails=itemView.findViewById(R.id.tvArticle);


        }
        public void setData(Model1 model1){
            mIvImage.setImageResource(model1.getImage());
            mtvTitle.setText(model1.getTitle());
            mtvArticleDetails.setText(model1.getArticleDetails());

        }
    }
}
