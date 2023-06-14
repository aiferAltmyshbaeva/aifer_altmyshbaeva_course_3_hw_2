package com.example.c3lesson2hw2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainFragment extends Fragment {
   private Button btnIncrease, btnDecrease;
   private TextView tvValue;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
        initListener();


    }

    private void initView() {
        btnIncrease = requireActivity().findViewById(R.id.btn_increase);
        btnDecrease = requireActivity().findViewById(R.id.btn_decrease);
        tvValue = requireActivity().findViewById(R.id.tv_value);
    }

    private void initListener() {
        btnIncrease.setOnClickListener(v -> {
            process(1);
        });

        btnDecrease.setOnClickListener(v -> {
            process(-1);
        });
    }

    private void process(Integer value) {
        Integer i = Integer.parseInt(tvValue.getText().toString()) + value;
        tvValue.setText(String.valueOf(i));
    }


}