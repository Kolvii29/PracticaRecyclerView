package com.kelvin.recyclerview.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kelvin.recyclerview.data.RepositoryCars;
import com.kelvin.recyclerview.databinding.ActivityMainBinding;
import com.kelvin.recyclerview.view.adapter.CarAdapter;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CarAdapter adapter = new CarAdapter(RepositoryCars.getListCar());
        binding.mainCarsRv.setHasFixedSize(true);
        binding.mainCarsRv.setAdapter(adapter);

    }
}