package com.example.admin.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int myActivePlayer=0;
    int[] myGameState={2,2,2,2,2,2,2,2,2};

    public void ImageTapped(View view) {
        ImageView imageView = (ImageView) view;

        int tapped = Integer.parseInt(imageView.getTag().toString());

        if (myGameState[tapped] == 2) {
            myGameState[tapped] = myActivePlayer;


            if (myActivePlayer == 0) {
                imageView.setImageResource(R.drawable.cross);
                imageView.animate().rotation(360).setDuration(1000);
                myActivePlayer = 1;
            } else {
                imageView.setImageResource(R.drawable.circle);
                imageView.animate().rotation(360).setDuration(1000);
                myActivePlayer = 0;
            }
        }
    }

    public void playAgain(View view){
        for(int i=0;i<myGameState.length;i++){
            myGameState[i]=2;
        }

        myActivePlayer=0;

        LinearLayout linearLayout=(LinearLayout) findViewById(R.id.layoutone);
        for (int i=0;i<linearLayout.getChildCount();i++){
            ((ImageView) linearLayout.getChildAt(i)).setImageResource(R.mipmap.ic_launcher_round);
        }

        LinearLayout linearLayoutone=(LinearLayout) findViewById(R.id.layout2);
        for (int i=0;i<linearLayoutone.getChildCount();i++){
            ((ImageView) linearLayoutone.getChildAt(i)).setImageResource(R.mipmap.ic_launcher_round);
        }

        LinearLayout linearLayouttwo=(LinearLayout) findViewById(R.id.layout3);
        for (int i=0;i<linearLayouttwo.getChildCount();i++){
            ((ImageView) linearLayouttwo.getChildAt(i)).setImageResource(R.mipmap.ic_launcher_round);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
