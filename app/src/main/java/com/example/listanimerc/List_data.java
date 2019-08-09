package com.example.listanimerc;

import java.util.ArrayList;

public class List_data {

    public static String[][] data = new String[][]{
            {"Naruto Shippuden","February 15, 2007","8.20","https://cdn.myanimelist.net/images/anime/5/17407.jpg"},
            {"Uchi no Ko no Tame naraba, Ore wa Moshikashitara Maou mo Taoseru kamo Shirenai.","July 4, 2019","7.40","https://cdn.myanimelist.net/images/anime/1568/101203.jpg"},
            {"One Piece","October 20, 1999","8.53","https://cdn.myanimelist.net/images/anime/6/73245.jpg"},
            {"Isekai Quartet","April 10, 2019","7.66","https://cdn.myanimelist.net/images/anime/1965/99667.jpg"},
            {"Youjo Senki","January 6, 2017","8.20","https://cdn.myanimelist.net/images/anime/5/82890.jpg"},
            {"One Punch Man","October 5, 2015","8.70","https://cdn.myanimelist.net/images/anime/12/76049.jpg"},
            {"Chuunibyou demo Koi ga Shitai!","October 4, 2012","7.86","https://cdn.myanimelist.net/images/anime/12/46931.jpg"},
            {"Tate no Yuusha no Nariagari","January 9, 2019","8.17","https://cdn.myanimelist.net/images/anime/1490/101365.jpg"},
            {"Dragon Ball","February 26, 1986","8.13","https://cdn.myanimelist.net/images/anime/1887/92364.jpg"},
            {"Gate: Jieitai Kanochi nite, Kaku Tatakaeri","July 4, 2015","7.86","https://cdn.myanimelist.net/images/anime/8/76222.jpg"},



    };

    public static ArrayList<Anime> getListData(){
        ArrayList<Anime> list = new ArrayList<>();
        for (String[] aData : data){
            Anime anime = new Anime();
            anime.setJudul(aData[0]);
            anime.setRelease(aData[1]);
            anime.setRating(aData[2]);
            anime.setPoster(aData[3]);
            list.add(anime);
        }
        return list;
    }

}
