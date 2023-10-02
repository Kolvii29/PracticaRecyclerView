package com.kelvin.recyclerview.view.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.kelvin.recyclerview.databinding.ItemListCarBinding;
import com.kelvin.recyclerview.domain.Car;

public class ItemCarViewHolder extends RecyclerView.ViewHolder {
    private final ItemListCarBinding binding;

    public ItemCarViewHolder(@NonNull ItemListCarBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Car itemCar) {
        binding.itemlayoutListcarName.setText(itemCar.getNameCar());
        binding.itemlayoutListcarBackground.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), itemCar.getFeatureCar().getColorRes()));
        binding.itemlayoutListcarImg.setImageDrawable(ContextCompat.getDrawable(itemView.getContext(), itemCar.getFeatureCar().getImgCar()));
        binding.itemlayoutListcarPrice.setText(String.valueOf(itemCar.getPriceCar()));
    }
}
