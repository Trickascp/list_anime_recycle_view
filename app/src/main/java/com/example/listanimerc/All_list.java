package com.example.listanimerc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class All_list extends RecyclerView.Adapter<All_list.ListAnimeView> {

    private ArrayList<Anime> listAnime;

    public All_list(ArrayList<Anime> list){ this.listAnime = list;}

    @NonNull
    @Override
    public ListAnimeView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_animes, viewGroup, false);
        return new ListAnimeView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListAnimeView listAnimeView, int i) {
        Anime anime = listAnime.get(i);

        Glide.with(listAnimeView.itemView.getContext()).load(anime.getPoster()).apply(new RequestOptions().override(100, 120))
                .into(listAnimeView.aposter);
        listAnimeView.ajudul.setText(anime.getJudul());
        listAnimeView.arelease.setText(anime.getRelease());
        listAnimeView.arating.setText(anime.getRating());

        listAnimeView.btnFav.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(listAnimeView.itemView.getContext(), "Favorite " + listAnime.get(listAnimeView.getAdapterPosition()).getJudul()
                        , Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public class ListAnimeView extends RecyclerView.ViewHolder {

        private ImageView aposter;
        private TextView ajudul, arating, arelease;
        private Button btnFav;

        public ListAnimeView(@NonNull View itemView) {
            super(itemView);

            aposter  = itemView.findViewById(R.id.poster);
            ajudul   = itemView.findViewById(R.id.judul);
            arating  = itemView.findViewById(R.id.rating);
            arelease = itemView.findViewById(R.id.release);

            btnFav   = itemView.findViewById(R.id.btn_add_fav);
        }
    }
}
