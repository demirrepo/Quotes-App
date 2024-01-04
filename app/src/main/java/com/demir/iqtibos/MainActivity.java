package com.demir.iqtibos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.demir.iqtibos.categories.CategoriesAdapter;
import com.demir.iqtibos.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList> categoriesLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        //add categories to categoriesLists

        //motivation category
        CategoriesList motivationCategory = new CategoriesList("Motivatsiya", R.drawable.motivation);
        categoriesLists.add(motivationCategory);

        //english category
        CategoriesList englishCategory = new CategoriesList("English", R.drawable.english);
        categoriesLists.add(englishCategory);

        //success category
        CategoriesList successCategory = new CategoriesList("Muvaffaqiyat", R.drawable.success);
        categoriesLists.add(successCategory);

        //life category
        CategoriesList lifeCategory = new CategoriesList("Hayot", R.drawable.life);
        categoriesLists.add(lifeCategory);

        //set adapter to recyclerview

        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists, MainActivity.this));







    }
}