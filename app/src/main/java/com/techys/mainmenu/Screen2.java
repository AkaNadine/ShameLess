package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        TextView mTitleWindow =(TextView)  findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        mTitleWindow.setText("Decision Making\n");
        mMessageWindow.setText("Each human being has the right to decide when, where and with who they have sex with. Forcing or manipulating someone into yielding is something that we will debate now.\n\n" +
                "-The decision to engage into a sexual act is personal, and none can ever take that from you, but it can usually be influenced by the ones around you, maybe standards, culture, or bullying. Is important to never break down.\n\n" +
                "-Even if you love someone, or maybe just like, and they decide they don’t want to have sexual activities with you, being mad or angry at them can confuse their feelings about you, and maybe interact with some issues thinking they will only make u happy if they do what you want, basically manipulating them (directly or indirectly) is wrong.\n\n" +
                "-Why do people have sex?\n\n" +
                "Many people have asked themselves this question, whose the answer is confirmed that most of the people choose to have sex for pleasure, stress relief, curiosity, for a baby or love. Of course there are irrational reasons as well, for example revenge or social status. It’s good to not ignore them, so you will be aware of them as well, but that doesn’t mean they are good for your health or for your partner's health.\n\n" +
                "-Is it okay to say NO to sex?\n\n" +
                "Always,  at any time and for any reasons. You are never required to have sex  with someone even if it is your crush, boyfriend or husband, whether you are in a relationship or not.  Both partners should benefit from the sexual encounter.\n\n");
    }
}