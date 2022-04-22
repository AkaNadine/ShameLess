package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        TextView mTitleWindow =(TextView)  findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        TextView mMessage2Window = (TextView) findViewById(R.id.message2Window);
        mTitleWindow.setText("Safety/Pregnancy\n");
        mMessageWindow.setText("Condoms offer the best available protection against STIs by acting as a physical barrier to prevent the exchange of semen, vaginal fluids or blood between partners.\n\n Safe sex is also called ‘safer sex’ to highlight the fact that condoms and other barrier methods are not 100 per cent effective in preventing STIs.\n\n However, condoms do offer the best available protection when used correctly.\n\nSafe sex is also about having sex when you and your partner are ready, and having sex that’s enjoyable, respectful and protected.\n");
    mMessage2Window.setText("Facts about pregnancy\n\n" +
            "*The longest pregnancy recorded 375 days\n\n" +
            "*Pregnancy gives you a super sense of smell\n\n" +
            "*Nigeria has the highest number of twins in the world\n\n" +
            "*Babies could dream in the womb\n\n" +
            "*A baby has more bones than the mother\n\n" +
            "*The world’s heaviest baby weighed 221lb at birth\n\n" +
            "*Difficulty concentrating\n\n" +
            "*Different mood swings\n\n" +
            "*Nesting instincts\n\n" +
            "*Skin changes\n\n" +
            "*Increase in breast size\n\n" +
            "*Changes in nails and hair\n\n");
    }
}