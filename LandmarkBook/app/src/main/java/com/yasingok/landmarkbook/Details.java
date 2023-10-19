package com.yasingok.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.yasingok.landmarkbook.databinding.ActivityDetailsBinding;

public class Details extends AppCompatActivity {
    private ActivityDetailsBinding binding;     // View binding tanımı yapılıyor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // View binding tanımladığımız için bunu yorum satırı yapıyoruz
        //setContentView(R.layout.activity_details);

        // inflate xml ile kodumuzu bağlıyor
        // Artık her şeye binding. diyerek ulaşabiliriz, findviewbyId gerek yok artık
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        // Casting sayesinde bu verinin bir türe dönüştüğünü bildiriyoruz
        Landmark gelenVeri = (Landmark) intent.getSerializableExtra("GidenVeri");

        // Alttaki singleton taktiği ile de veri alışverişi yapılabiliyor
        //Singleton singleton = Singleton.getInstance();
        //Landmark selectedLandmark = singleton.getSentLandmark();

        binding.nameText.setText(gelenVeri.name);
        binding.countryText.setText(gelenVeri.country);
        binding.descriptionText.setText(gelenVeri.description);
        binding.imageView.setImageResource(gelenVeri.image);
    }

    public void backtoMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}