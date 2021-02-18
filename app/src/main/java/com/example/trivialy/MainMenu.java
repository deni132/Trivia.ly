package com.example.trivialy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button singleplayerButton = findViewById(R.id.goToSingleplayerButton);
        singleplayerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent newIntent = new Intent(view.getContext(), SingleplayerMenu.class);
                view.getContext().startActivity(newIntent);
            }
        });

        Button multiplayerButton = findViewById(R.id.goToMultiplayerButton);
        multiplayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newIntent = new Intent(view.getContext(), Multiplayer_menu.class);
                view.getContext().startActivity(newIntent);
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}