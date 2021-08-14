package com.masai.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.masai.recyclerview.Adapters.RecipeAdapter;
import com.masai.recyclerview.Model.MenuModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewActivity);
        ArrayList<MenuModel> list = new ArrayList<>();
        list.add(new MenuModel(R.drawable.indian_food0,"1"));
        list.add(new MenuModel(R.drawable.indian_food2,"2"));
        list.add(new MenuModel(R.drawable.indian_food4,"3"));
        list.add(new MenuModel(R.drawable.indian_food5,"4"));
        list.add(new MenuModel(R.drawable.indian_food6,"5"));
        list.add(new MenuModel(R.drawable.indian_food8,"6"));
        list.add(new MenuModel(R.drawable.indian_food7,"7"));
        list.add(new MenuModel(R.drawable.indian_food9,"8"));
        list.add(new MenuModel(R.drawable.indian_food10,"9"));
        list.add(new MenuModel(R.drawable.indian_food11,"10"));
        list.add(new MenuModel(R.drawable.indian_food12,"11"));
        list.add(new MenuModel(R.drawable.indian_food_3,"12"));
        list.add(new MenuModel(R.drawable.indian_food0,"13"));

        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


    }
}