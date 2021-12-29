package com.example.aprendaingles.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.aprendaingles.R;
import com.example.aprendaingles.utils.Audio;

public class NumerosFragment extends Fragment implements View.OnClickListener
{
    private ImageView btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;

    public NumerosFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);
        configButtons(view);
        return view;
    }

    private void configButtons(View view)
    {
        btnOne = view.findViewById(R.id.idImageOne);
        btnTwo = view.findViewById(R.id.idImageTwo);
        btnThree = view.findViewById(R.id.idImageThree);
        btnFour = view.findViewById(R.id.idImageFour);
        btnFive = view.findViewById(R.id.idImageFive);
        btnSix = view.findViewById(R.id.idImageSix);

        // clicks
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.idImageOne:
                Audio.playAudioCue(getActivity(), R.raw.one);
                break;
            case R.id.idImageTwo:
                Audio.playAudioCue(getActivity(), R.raw.two);
                break;
            case R.id.idImageThree:
                Audio.playAudioCue(getActivity(), R.raw.three);
                break;
            case R.id.idImageFour:
                Audio.playAudioCue(getActivity(), R.raw.four);
                break;
            case R.id.idImageFive:
                Audio.playAudioCue(getActivity(), R.raw.five);
                break;
            case R.id.idImageSix:
                Audio.playAudioCue(getActivity(), R.raw.six);
                break;
        }

    }
}