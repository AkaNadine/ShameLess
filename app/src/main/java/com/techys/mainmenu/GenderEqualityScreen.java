package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;


public class GenderEqualityScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_equality);
        TextView mtitleGenderEquality = (TextView) findViewById(R.id.titleGenderEquality);
        TextView marticleGenderEquality = (TextView) findViewById(R.id.articleGenderEquality);

        mtitleGenderEquality.setText("Gender Equality\n");
        StringBuilder stringBuilder = new StringBuilder();
        marticleGenderEquality.setText("Starting with a little bit of history, there were always two genders on the earth, a woman and a man. During the years, men have been seen as being better than women.\n" +
                "In order to keep the peace and prosperously going on we have to accept that everyone is human and we all want the same thing. That’s why the gender difference isn’t necessary.\n\n" +
                "In order for every human being to be able to contribute into making “the difference”, parents should start everything from home before kids start going to school. For example, distributing chores around the house equally to a boy and a girl, not only to one of them or not only specific chores (eg. Washing the dishes, cooking, cleaning rooms, vacuuming, walking to dog , etc.).\n\n" +
                "In the last years, the society was making progress and accepting that there are no differences between a girl and a boy, in the most part of the world.\n\n");




    }

}