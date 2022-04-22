package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;

public class PubertyScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puberty_screen);
        TextView mtitlePuberty1 = (TextView) findViewById(R.id.titlePuberty);
        TextView marticlePuberty1 = (TextView) findViewById(R.id.articlePuberty);
        TextView mtitlePuberty2 = (TextView) findViewById(R.id.titlePuberty2);
        TextView marticlePuberty2 = (TextView) findViewById(R.id.articlePuberty2);
        TextView mtitlePuberty3 = (TextView) findViewById(R.id.titlePuberty3);
        TextView marticlePuberty3 = (TextView) findViewById(R.id.articlePuberty3);

        mtitlePuberty1.setText("Puberty\n");
        StringBuilder stringBuilder = new StringBuilder();
        marticlePuberty1.setText("Puberty is the time when you physically become an adult.\nDuring puberty, your body goes through lots of changes. And your emotions might feel stronger and more intense.\n\nPeople usually start going through puberty between ages 8 and 14. Females often start puberty before males do.Puberty doesn’t happen all at once — it comes in stages and takes many years. You might have some signs of puberty at an early age, while other changes show up years later.\n\nBodies are unique, so puberty is different for each person. Everyone goes through puberty at their own pace.\n\n");
        mtitlePuberty2.setText("What happens to my body during puberty?");
        marticlePuberty2.setText("\n\nThere’s no way around it — your body’s gonna change a lot during puberty. Here’s what to expect.\n\n" +
                "All bodies:\n" +
                "- You may get acne (AKA zits or pimples) on your face and body. If pimples are stressing you out or causing problems in your life, talk to a doctor.\n" +
                "- You start to sweat more, and you may have body odor (when your sweat smells bad). You may want to shower more and start using deodorant.\n" +
                "- Hair grows under your armpits.\n" +
                "- Hair grows around your genitals — this is called pubic hair.\n" +
                "- You may grow more hair on your arms and legs, and the hair may get darker.\n" +
                "- You may feel some pain in your arms and legs as you grow (AKA “growing pains”)\n\n" +
                "Males:\n" +
                "- Your voice gets lower or deeper. It may crack sometimes while it’s changing, but that’s totally normal and eventually goes away. Your Adam’s apple (bump in your throat) might get bigger and more visible as this happens.\n" +
                "- Your penis and testicles get bigger.\n" +
                "- Hair may grow on your face, chest, and back.\n" +
                "- Your chest and shoulders get broader.\n" +
                "- You may have swelling around your nipples during puberty. This can look like the start of breasts,  but it usually goes away. This happens to about half of males, and it can last for a few months or up to a few years.\n\n" +
                "Females:\n" +
                "Your breasts develop and get bigger.\n" +
                "Your hips get wider and your body may become more curvy.\n" +
                "You start getting your period.\n" +
                "Your labia may change color and grow bigger.\n");

        mtitlePuberty3.setText("Puberty and your feelings\n");
        marticlePuberty3.setText("Puberty is controlled by hormones, and these hormones affect your feelings as well as your body. During puberty, your emotions may become stronger and more intense. \n\n" +
                "It’s common to go through mood swings — when your feelings change quickly and randomly.During puberty, you’ll probably start having more sexual thoughts and urges. " +
                "You may feel attracted to males, females, or both — this is sometimes called having a crush. And you might notice that you’re sexually excited (AKA horny or turned on) a lot. As you get older, these feelings probably won't be as strong. " +
                "Some people masturbate to release this sexual tension and explore their sexuality. Others wait for the feelings to pass. Either way is totally normal.\n\n" +
                "Puberty can be a very confusing time in your life. Your emotions may seem like they’re out of control. One minute you feel on top of the world, and the next minute you’re down in the dumps. " +
                "Feeling this way is hard, but you don’t have to go through it alone. Talking with adults you trust may help you sort out your feelings. Finding activities that are fun and healthy can help you deal with stress and your feelings, and release extra energy. " +
                "Physical activity, writing, music, art, or talking with friends are great ways to express your emotions and feel good about yourself.\n\n");







    }

}