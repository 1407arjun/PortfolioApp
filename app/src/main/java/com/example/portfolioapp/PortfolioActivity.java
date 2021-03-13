package com.example.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        ImageView gitHub = findViewById(R.id.githubImageView);
        ImageView linkedIn = findViewById(R.id.linkedinImageView);
        SeekBar seekBar = findViewById(R.id.seekBar);
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);

        gitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/1407arjun"));
                startActivity(intent);
            }
        });

        linkedIn.setOnClickListener(view -> {
            goToLinkedIn("https://www.linkedin.com/arjun-sivaraman-1407");
        });

        seekBar.setMax(3);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0){
                    mainLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }else if (progress == 1){
                    mainLayout.setBackgroundColor(Color.parseColor("#ADD8E6"));
                }else if (progress == 2){
                    mainLayout.setBackgroundColor(Color.parseColor("#FFB6C1"));
                }else{
                    mainLayout.setBackgroundColor(Color.parseColor("#98FB98"));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void goToLinkedIn(String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }

    public void goToInsta(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/1407arjun"));
        startActivity(intent);
    }
}