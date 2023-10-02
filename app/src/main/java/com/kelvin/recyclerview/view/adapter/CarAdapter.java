package com.kelvin.recyclerview.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kelvin.recyclerview.databinding.ItemListCarBinding;
import com.kelvin.recyclerview.domain.Car;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<ItemCarViewHolder> {

    private final List<Car> items;

    public CarAdapter(List<Car> carList) {
        this.items = carList;
    }

    @NonNull
    @Override
    public ItemCarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemCarViewHolder(ItemListCarBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCarViewHolder holder, int position) {
        holder.bind(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
