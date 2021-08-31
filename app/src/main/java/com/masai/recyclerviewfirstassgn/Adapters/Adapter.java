package com.masai.recyclerviewfirstassgn.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai.recyclerviewfirstassgn.Models.Model1;
import com.masai.recyclerviewfirstassgn.R;
import com.masai.recyclerviewfirstassgn.itemClickListener;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @NonNull
    private itemClickListener itemClickListener;
    ArrayList<Model1> list ;
    Context context;

    public Adapter(@NonNull itemClickListener itemClickListener, ArrayList<Model1> list, Context context) {
        this.list = list;
        this.context = context;
        this.itemClickListener =itemClickListener;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view,itemClickListener);
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
       private LinearLayout linearLayout;
       private itemClickListener itemClickListener;
        public ViewHolder( View itemView,itemClickListener itemClickListener) {
            super(itemView);
            mIvImage = itemView.findViewById(R.id.ivArticleImage);
            mtvTitle=itemView.findViewById(R.id.tvTitle);
            mtvArticleDetails=itemView.findViewById(R.id.tvArticle);
            linearLayout=itemView.findViewById(R.id.LinearLayout);
            this.itemClickListener =itemClickListener;




        }
        public void setData(Model1 model1){
            mIvImage.setImageResource(model1.getImage());
            mtvTitle.setText(model1.getTitle());
            mtvArticleDetails.setText(model1.getArticleDetails());
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickListener.onItemClicked(getAdapterPosition(), model1);
                }
            });

        }
    }
}
