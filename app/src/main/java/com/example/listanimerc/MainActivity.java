package com.example.listanimerc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyle;
    private ArrayList<Anime> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyle = findViewById(R.id.rv_anime);
        recyle.setHasFixedSize(true);

        list.addAll(List_data.getListData());
        showAnimes();




    }

    private void showAnimes() {
        recyle.setLayoutManager(new LinearLayoutManager(this));
        All_list all_list = new All_list(list);
        recyle.setAdapter(all_list);
    }
}
