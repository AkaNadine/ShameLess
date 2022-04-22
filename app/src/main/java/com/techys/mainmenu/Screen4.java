package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        TextView mTitleWindow =(TextView)  findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        TextView mHeader1Window = (TextView) findViewById(R.id.header1Window);
        TextView mHeader2Window = (TextView) findViewById(R.id.header2Window);
        TextView mHeader3Window = (TextView) findViewById(R.id.header3Window);
        TextView mHeader4Window = (TextView) findViewById(R.id.header4Window);
        TextView mMessage1Window = (TextView) findViewById(R.id.message1Window);
        TextView mMessage2Window = (TextView) findViewById(R.id.message2Window);
        TextView mMessage3Window = (TextView) findViewById(R.id.message3Window);
        TextView mMessage4Window = (TextView) findViewById(R.id.message4Window);


        mTitleWindow.setText("Communication/Intimacy\n");
        mMessageWindow.setText("When you are in an intimate relationship, you should feel understood and accepted for who you are. You trust the other person and can open up completely to them. \n\nIntimacy is a sense of belonging. Communicating does not mean that you always sit around talking about your relationship. It means that you talk about things that really matter. It means that you are not afraid to say what you really think and feel and that your partner trusts you the same way.\n\n" +
                "Here are some ways to strengthen your communication and your relationship.\n");
        mHeader1Window.setText("Practice active listening skills:\n");
        mMessage1Window.setText("Listening is even more important than talking. Most of us are not good listeners. It is important for couples to learn to listen for more than just the words. Your goal is to understand your partner's thoughts and feelings. When your partner talks about why he or she is upset, restate what you think you have heard to clarify what is really meant. Then express your own thoughts.\n\nLet your partner know that you care about what he or she is thinking and doing. Really try to understand what your partner feels. \n");
        mHeader2Window.setText("Don’t depend on mind-reading:\n");
        mMessage2Window.setText("Trying to read your partner’s mind, or expecting your partner to read yours, can cause more problems. Your partner may not mean anything negative, yet you may feel insulted. \n\nFor example, your partner tells you about someone’s expensive condo and recent promotion. You might think your partner is criticizing you for not making enough money or not getting a better job.\n\nSometimes it seems you can’t talk about anything without offending each other. So you stop talking to each other to avoid arguing and fighting. Then each partner is upset by the silence of the other and sees it as punishment. Ask questions and clarify what your partner really means.\n\nPride and stubbornness get in the way of communication. We often expect our partners to understand without having to say anything. Tell your partner about your feelings, needs, and desires. If you find yourself saying “He should know what I want,” or “I shouldn’t have to tell her,” your communication skills need work.\n");
        mHeader3Window.setText("Learn how to talk about yourself:\n");
        mMessage3Window.setText("You may not be sure how to say what you mean to get your partner to understand how you feel. Learn how to express your feelings. Use “I” language. For example, say “I feel…I need…I want….”\n \nThis will help you to express yourself without being hostile. The goal is to make positive changes, not to make the other person feel guilty.\n");
        mHeader4Window.setText("Respect and support your partner.\n");
        mMessage4Window.setText("When you respect each other, you avoid calling each other names and putting each other down. Respect means being kind and courteous. \n\nLet your partner know what you value about him or her. Use “please,” “excuse me,” and “thank you” as freely with the person you love as you do with strangers.\n");


    }
}