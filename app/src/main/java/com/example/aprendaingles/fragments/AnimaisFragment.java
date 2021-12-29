package com.example.aprendaingles.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.aprendaingles.R;
import com.example.aprendaingles.utils.Audio;

public class AnimaisFragment extends Fragment implements View.OnClickListener
{
    private ImageView btnLion, btnDog, btnCow, btnCat, btnMonkey, btnSheep;

    public AnimaisFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_animais, container, false);
        configButtons(view);
        return view;
    }

    private void configButtons(View view)
    {
        btnDog = view.findViewById(R.id.idImageDog);
        btnLion = view.findViewById(R.id.idImageLion);
        btnCow = view.findViewById(R.id.idImageCow);
        btnCat = view.findViewById(R.id.idImageCat);
        btnMonkey = view.findViewById(R.id.idImageMonkey);
        btnSheep = view.findViewById(R.id.idImageSheep);

        // clicks
        btnDog.setOnClickListener(this);
        btnLion.setOnClickListener(this);
        btnCow.setOnClickListener(this);
        btnCat.setOnClickListener(this);
        btnMonkey.setOnClickListener(this);
        btnSheep.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.idImageDog:
                Audio.playAudioCue(getActivity(), R.raw.dog);
                break;
            case R.id.idImageLion:
                Audio.playAudioCue(getActivity(), R.raw.lion);
                break;
            case R.id.idImageCow:
                Audio.playAudioCue(getActivity(), R.raw.cow);
                break;
            case R.id.idImageCat:
                Audio.playAudioCue(getActivity(), R.raw.cat);
                break;
            case R.id.idImageMonkey:
                Audio.playAudioCue(getActivity(), R.raw.monkey);
                break;
            case R.id.idImageSheep:
                Audio.playAudioCue(getActivity(), R.raw.sheep);
                break;
        }

    }
}