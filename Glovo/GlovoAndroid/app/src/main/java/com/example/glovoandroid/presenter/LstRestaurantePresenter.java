package com.example.glovoandroid.presenter;

import com.example.glovoandroid.entities.Index;
import com.example.glovoandroid.model.LstRestauranteModel;
import com.example.glovoandroid.view.LstRestauranteContract;

import java.util.ArrayList;

public class LstRestaurantePresenter implements LstRestauranteContract.Presenter {

    private  LstRestauranteContract.View view;
    private LstRestauranteModel lstRestauranteModel;

    public LstRestaurantePresenter(LstRestauranteContract.View view){
        this.view = view;
        this.lstRestauranteModel = new LstRestauranteModel();
    }

    @Override
    public void lstRestaurantes(Index index) {
        lstRestauranteModel.lstRestaurantesWS(null, new
                LstRestauranteContract.Model.OnLstRestaurantesListener() {
                    @Override
                    public void onSuccess(ArrayList<Index> index) {
                        if (index != null && index.size() > 0){
                            view.successLstRestaurantes(index);
                        }else{
                            view.failureLstRestaurantes("Erro en lista de datos");
                        }
                    }

                    @Override
                    public void onFailure(String error) {
                        view.failureLstRestaurantes(error);
                    }
                });
    }
}
