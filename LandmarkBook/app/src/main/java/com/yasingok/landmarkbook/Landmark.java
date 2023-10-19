package com.yasingok.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {     // Bu şekilde veriyi serileştirip yollayıp sonra içinden seçebiliyoruz

    String name, country, description;
    int image;      // Sebebi R.drawable kısmında her görselin bir id'si bulunmakta int olarak

    public Landmark(String name, String country, String description, int image) {
        this.name = name;
        this.country = country;
        this.description = description;
        this.image = image;
    }
}