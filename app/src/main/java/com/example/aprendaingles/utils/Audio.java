package com.example.aprendaingles.utils;

import android.content.Context;
import android.media.MediaPlayer;

public class Audio
{
    public static void playAudioCue(Context context, int audio)
    {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(context, audio);
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }
}
