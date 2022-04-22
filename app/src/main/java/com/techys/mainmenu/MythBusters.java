package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;


public class MythBusters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myth_busters);
        TextView mtitleMythBusters = (TextView) findViewById(R.id.titleMythBusters);
        TextView mtitleMyth1 = (TextView) findViewById(R.id.titleMyth1);
        TextView marticleMyth1 = (TextView) findViewById(R.id.articleMyth1);
        TextView mtitleMyth2 = (TextView) findViewById(R.id.titleMyth2);
        TextView marticleMyth2= (TextView) findViewById(R.id.articleMyth2);
        TextView mtitleMyth3 = (TextView) findViewById(R.id.titleMyth3);
        TextView marticleMyth3 = (TextView) findViewById(R.id.articleMyth3);
        TextView mtitleMyth4 = (TextView) findViewById(R.id.titleMyth4);
        TextView marticleMyth4 = (TextView) findViewById(R.id.articleMyth4);
        TextView mtitleMyth5 = (TextView) findViewById(R.id.titleMyth5);
        TextView marticleMyth5 = (TextView) findViewById(R.id.articleMyth5);
        TextView mtitleMyth6 = (TextView) findViewById(R.id.titleMyth6);
        TextView marticleMyth6 = (TextView) findViewById(R.id.articleMyth6);
        TextView mtitleMyth7 = (TextView) findViewById(R.id.titleMyth7);
        TextView marticleMyth7 = (TextView) findViewById(R.id.articleMyth7);
        TextView mtitleMyth8 = (TextView) findViewById(R.id.titleMyth8);
        TextView marticleMyth8 = (TextView) findViewById(R.id.articleMyth8);
        TextView mtitleMyth9 = (TextView) findViewById(R.id.titleMyth9);
        TextView marticleMyth9 = (TextView) findViewById(R.id.articleMyth9);
        TextView mtitleMyth10 = (TextView) findViewById(R.id.titleMyth10);
        TextView marticleMyth10 = (TextView) findViewById(R.id.articleMyth10);

        StringBuilder stringBuilder = new StringBuilder();

        mtitleMythBusters.setText("Myth Busters\n\n\n");
        mtitleMyth1.setText("1.Real life sex is like pornography\n\n");
        marticleMyth1.setText("NOT TRUE\n" +
                        "People taking part in most pornography are paid actors and they’re doing things to entertain the people watching it. Often, the things that happen all the time in porn aren’t really common in every day sex, but watching lots of porn can make people believe they are. The way porn stars look is often very different to real life too.\n\n\n");
        mtitleMyth2.setText("2. Everyone is having sex\n\n");
        marticleMyth2.setText("NOT TRUE\n" +
                "The decision to have sex is not about what other people are doing. Having sex is a personal choice and just because you have done it before, doesn’t mean you have to do it again.\n " +
                "If you don’t feel ready, you’re not ready. You may not feel ready until you meet someone you trust and are comfortable with, and it’s the next step in your relationship at a time that’s right for both of you.\n\n\n");
        mtitleMyth3.setText("3. Boys don’t need to worry about contraception, that is the girl's responsibility\n\n");
        marticleMyth3.setText("NOT TRUE\n"+
                "The decision to have sex is a joint one. You might believe your girlfriend is on the pill or taking other contraception, but this is only effective if taken correctly.\n" +
                "Also, the only way to protect against a sexually transmitted infection (STI) is by using a condom.\n\n\n");
        mtitleMyth4.setText("4. STI tests are only for those who sleep around\n\n");
        marticleMyth4.setText("NOT TRUE\n"+
                "Anyone who has unprotected oral, vaginal and anal sex can catch an STI, so it’s always best to practice safe sex. It’s not always possible to tell if someone has an STI, and they might not even realize themselves if they don’t have any symptoms.\n" +
                "Yearly tests are recommended, or each time you want to sleep with a different partner.\n\n\n");
        mtitleMyth5.setText("5. You can’t get pregnant if you have sex in a bath, standing up and on your first time\n\n");
        marticleMyth5.setText("NOT TRUE\n"+
                "There are lots of myths around having sex, buts that’s exactly what they are – myths! If you have any unprotected sex at any time, you are at risk of getting pregnant.\n\n\n");
        mtitleMyth6.setText("6. I would be able to tell if my partner had a STI\n\n\n");
        marticleMyth6.setText("NOT TRUE\n"+
                "There is no way of being certain that your partner doesn’t have an STI unless you both have been tested.\n" +
                "Before you consider having sex, it’s important to talk to your partner about a full STI screen to make sure you both know for certain. Condoms are the best protection for you both against STIs.\n\n\n");
        mtitleMyth7.setText("7. You can’t use condoms if you’re allergic to latex\n\n");
        marticleMyth7.setText("NOT TRUE\n"+
                "Condoms come in all different sizes and latex- free condoms are also available if you have a latex allergy.\n" +
                "If you struggle to use condoms, take time to practice putting them on so you feel more comfortable with using them.\n\n\n");
        mtitleMyth8.setText("8. If he 'pulls out' when he cums (ejaculates), she can't get pregnant\n\n");
        marticleMyth8.setText("NOT TRUE\n"+
                "Before a boy ejaculates, there’s sperm in the pre-ejaculatory fluid (sometimes called pre-cum), which leaks out when he gets an erection. It only takes one sperm to get a girl pregnant. If you have unprotected sex, you’re at risk of pregnancy and of catching an STI.\n\n\n");
        mtitleMyth9.setText("9. Drinking alcohol or using drugs aren't good when it comes to sex\n\n");
        marticleMyth9.setText("TRUE\n"+
                "When you’re drunk or under the influence of drugs, it’s hard to make smart decisions. Alcohol and drugs can make you take risks, such as having sex before you’re ready, or having sex with someone you don’t trust. You’re more likely to regret having sex if you do it when you’re drunk.\n " +
                "You may also be at risk of a sexual assault and rape. If you’re too drunk, you can’t legally consent to sex.\n\n\n");
        mtitleMyth10.setText("10. You have to use emergency contraception the morning after sex\n\n\n");
        marticleMyth10.setText("NOT TRUE\n"+
                "This is a common misconception due to the nickname for the emergency hormonal contraception pill being the ‘morning after pill’. \n" +
                "The emergency contraception pill can be given up to 5 days after unprotected sex, although the sooner it’s taken the better. If you’re worried you have missed this time frame, there are other options available, so speak to your school nurse.\n\n\n");




    }
}