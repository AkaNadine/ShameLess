package com.techys.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;
import com.techys.dialogflowbot.ChatBotActivity;


public class Homepage extends AppCompatActivity {

    private Button btnCommunication;
    private Button btnDecisionMaking;
    private Button btnMyBody;
    private Button btnPregnancy;
    private Button btnPuberty;
    private Button btnGenderEquality;
    private Button btnMythBusters;
    private Button btnDiseases;
    private ImageButton btnChatBot;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        btnCommunication = (Button) findViewById(R.id.btnCommunication);
        btnCommunication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openCommunicationScreen();
            }
        });

        btnDecisionMaking = (Button) findViewById(R.id.btnDecisionMaking);
        btnDecisionMaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openDecisionMakingScreen();
            }
        });
        btnMyBody= (Button) findViewById(R.id.btnMyBody);
        btnMyBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openMyBodyScreen();
            }
        });
        btnPregnancy = (Button) findViewById(R.id.btnPregnancy);
        btnPregnancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openPregnancyScreen();
            }
        });
        btnPuberty = (Button) findViewById(R.id.btnPuberty);
        btnPuberty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openPubertyScreen();
            }
        });
        btnGenderEquality = (Button) findViewById(R.id.btnGenderEquality);
        btnGenderEquality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openGenderEqualityScreen();
            }
        });


        btnMythBusters = (Button) findViewById(R.id.btnMythBusters);
        btnMythBusters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openMythBusters();
            }
        });
        btnDiseases = (Button) findViewById(R.id.btnDiseases);
        btnDiseases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openDiseasesScreen();
            }
        });
        btnChatBot = (ImageButton) findViewById(R.id.btnChatBot);
        btnChatBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openChatBotActivity();
            }
        });
    }
    public void openCommunicationScreen(){
        Intent intent= new Intent(this, CommunicationScreen.class);
        startActivity(intent);
    }
    public void openDecisionMakingScreen(){
        Intent intent= new Intent(this, DecisionMakingScreen.class);
        startActivity(intent);
    }
    public void openMyBodyScreen(){
        Intent intent= new Intent(this, MyBodyScreen.class);
        startActivity(intent);
    }
    public void openPregnancyScreen(){
        Intent intent= new Intent(this, PregnancyScreen.class);
        startActivity(intent);
    }
    public void openPubertyScreen(){
        Intent intent= new Intent(this, PubertyScreen.class);
        startActivity(intent);
    }
    public void openGenderEqualityScreen(){
        Intent intent= new Intent(this, GenderEqualityScreen.class);
        startActivity(intent);
    }
    public void openMythBusters(){
        Intent intent= new Intent(this, MythBusters.class);
        startActivity(intent);
    }
    public void openDiseasesScreen(){
        Intent intent= new Intent(this, DiseasesScreen.class);
        startActivity(intent);
    }
    public void openChatBotActivity(){
        Intent intent= new Intent(this, ChatBotActivity.class);
        startActivity(intent);
    }


}