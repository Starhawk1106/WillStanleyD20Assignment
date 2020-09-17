package com.example.willstanleyd20assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer roll1;
    private MediaPlayer roll20;
    private TextView d20Message;
    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d20Message = findViewById(R.id.textMessage);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }
    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        switch(randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.d201);
                d20Message.setText("You Failed!");
                roll1 = MediaPlayer.create(this, R.raw.nono);
                roll1.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d202);
                d20Message.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d203);
                d20Message.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d204);
                d20Message.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d205);
                d20Message.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d206);
                d20Message.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d207);
                d20Message.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d208);
                d20Message.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d209);
                d20Message.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d2010);
                d20Message.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d2011);
                d20Message.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d2012);
                d20Message.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d2013);
                d20Message.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d2014);
                d20Message.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d2015);
                d20Message.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d2016);
                d20Message.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d2017);
                d20Message.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d2018);
                d20Message.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d2019);
                d20Message.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d2020);
                d20Message.setText("You Are Powerful!");
                roll20 = MediaPlayer.create(this, R.raw.yesyes);
                roll20.start();
                break;

        }
    }
}