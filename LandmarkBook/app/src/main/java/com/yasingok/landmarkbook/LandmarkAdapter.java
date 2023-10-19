package com.yasingok.landmarkbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yasingok.landmarkbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

// Recycler view kullanabilmek için
public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {
    ArrayList<Landmark> landmarkArrayList;

    // Bunun sebebi ilgili listeye ulaşabilmemiz için
    public LandmarkAdapter(ArrayList<Landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        // 2. kısımda hangi yere bağlayalım oluyor, sonuncu da parent'a bağlayalım mı diye soruluyor
        return new LandmarkHolder(recyclerRowBinding);
    }

    // Ne olacağını gösteren fonksiyon
    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {
        holder.recyclerRowBinding.recyclerTextView.setText(landmarkArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), Details.class);
                intent.putExtra("GidenVeri", landmarkArrayList.get(position));

                //Singleton singleton = Singleton.getInstance();
                //singleton.setSentLandmark(landmarkArrayList.get(position));

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {     // Liste elemanını belirtiyor
        return landmarkArrayList.size();
    }

    // Burası görseli tuttuğumuz sınıf oluyor
    public class LandmarkHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding recyclerRowBinding;

        public LandmarkHolder(RecyclerRowBinding binding) {     // Constructor atamamız gerekiyor böyle
            super(binding.getRoot());
            this.recyclerRowBinding = binding;
        }
    }
}