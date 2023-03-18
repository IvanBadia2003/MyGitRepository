package com.example.glovoandroid.view;

import com.example.glovoandroid.entities.Index;

import java.util.ArrayList;

public interface LstRestauranteContract {
    public  interface  View{
        void successLstRestaurantes(ArrayList<Index> lstIndex);
        void failureLstRestaurantes(String err);
    }
    public interface  Presenter{
        void lstRestaurantes(Index index);
    }
    public interface  Model{
        interface  OnLstRestaurantesListener{
            void  onSuccess(ArrayList<Index> index);
            void  onFailure(String error);
        }
        void lstRestaurantesWS(Index index, OnLstRestaurantesListener onLstRestaurantesListener);

    }
}
