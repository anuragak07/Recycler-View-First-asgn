package com.masai.recyclerviewfirstassgn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.masai.recyclerviewfirstassgn.Adapters.Adapter;
import com.masai.recyclerviewfirstassgn.Models.Model1;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrvRecyclerView;
    ArrayList<Model1> articleList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrvRecyclerView = findViewById(R.id.rvRecyclerView);
        BuildRecyclerViewData();
        setRecyclerViewAdapter();
    }
    public void BuildRecyclerViewData(){
        articleList =new ArrayList<>();
        articleList.add(new Model1(R.drawable.way,getString(R.string.beautiful_lake_with_mountains),getString(R.string.Author)));
        articleList.add(new Model1(R.drawable.green,getString(R.string.Title1),getString(R.string.Author1)));
        articleList.add(new Model1(R.drawable.savetree,getString(R.string.Title2),getString(R.string.Author2)));
        articleList.add(new Model1(R.drawable.statue,getString(R.string.Title3),getString(R.string.Author3)));
        articleList.add(new Model1(R.drawable.nature,getString(R.string.Title4),getString(R.string.Author4)));

    }

    public void setRecyclerViewAdapter(){
        Adapter adapter= new Adapter(articleList,this);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        mrvRecyclerView.setLayoutManager(linearLayoutManager);
        mrvRecyclerView.setAdapter(adapter);

    }
}