package com.example.skill6.networking;

import com.google.gson.annotations.SerializedName;

public class ProductResult {
    /*{
	"id": 1,
	"title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
	"price": 109.95,
	"description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
	"category": "men's clothing",
	"image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
	"rating": {
		"rate": 3.9,
		"count": 120
	}
}*/
    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String productImage;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getProductImage() {
        return productImage;
    }
}
