package com.techys.mainmenu;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;

public class MyBodyScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_body_screen);
<<<<<<< HEAD
        TextView mTitleWindow =(TextView)  findViewById(R.id.titleWindow);
        TextView mTitle2Window =(TextView)  findViewById(R.id.title2Window);
        TextView mMessageWindow =(TextView)  findViewById(R.id.messageWindow);
        TextView mMessage2Window =(TextView)  findViewById(R.id.message2Window);

        mTitleWindow.setText("Do you know what the reproductive system looks like?\n\n" );
        mMessageWindow.setText( "\nThis is a feminine reproductive one:\n\n-where we can see  the uterus, easier to remember “the place where babies grow”- It functions to nourish and house a fertilized egg until the fetus, or offspring, is ready to be delivered \n" +
                "\n- Going down, on the sides there are the 2 ovaries connected to the fallopian tube\n- The ovaries produce the egg cells, called the ova or oocytes; the oocytes are then transported to the fallopian tube where fertilization by a sperm may occur; the fertilized egg then moves to the uterus, where the uterine lining has thickened in response to the normal hormones of the reproductive cycle.\n" +
                "\n- Between the uterus and the vagina there is the cervix-the cervix acts as the door to the uterus which sperm can travel through to fertilize eggs; when your body is not carrying a child, your cervix helps keep unhealthy things out of your body, like tampons and bath water\n" +
                "\n- And last but not least the vagina, and the hymen outside the vagina-the hymen is a stretchy collar of tissue at the entrance to your vagina; it can be compared to a scrunchie (hair tie) – with bunched-up tissue that expands when stretched (eg, during sex or using tampons) then returns to its bunched-up shape afterwards.\n");
mTitle2Window.setText("And here is the masculine one:\n");
mMessage2Window.setText("- The place where we can find testicles is named Scrotum- the bag of skin that holds and helps to protect the testicles\n\n- As well, above the Scrotum we can see the Epididymis - a long, coiled tube that stores sperm and transports it from the testes.\n\n" +
        "- The testicles are responsible for making sperm and are also involved in producing a hormone called testosterone;\n\n- Testosterone is an important hormone during male development and maturation for developing muscles, deepening the voice, and growing body hair.\n");
=======
        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        TextView mTitle2Window = (TextView) findViewById(R.id.title2Window);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        TextView mMessage2Window = (TextView) findViewById(R.id.message2Window);

        mTitleWindow.setText("Do you know what the reproductive system looks like?\n\n");
        mMessageWindow.setText("\nThis is a feminine reproductive one:\n\n-where we can see  the uterus, easier to remember “the place where babies grow”- It functions to nourish and house a fertilized egg until the fetus, or offspring, is ready to be delivered \n" +
                "\n- Going down, on the sides there are the 2 ovaries connected to the fallopian tube\n- The ovaries produce the egg cells, called the ova or oocytes; the oocytes are then transported to the fallopian tube where fertilization by a sperm may occur; the fertilized egg then moves to the uterus, where the uterine lining has thickened in response to the normal hormones of the reproductive cycle.\n" +
                "\n- Between the uterus and the vagina there is the cervix-the cervix acts as the door to the uterus which sperm can travel through to fertilize eggs; when your body is not carrying a child, your cervix helps keep unhealthy things out of your body, like tampons and bath water\n" +
                "\n- And last but not least the vagina, and the hymen outside the vagina-the hymen is a stretchy collar of tissue at the entrance to your vagina; it can be compared to a scrunchie (hair tie) – with bunched-up tissue that expands when stretched (eg, during sex or using tampons) then returns to its bunched-up shape afterwards.\n");
        mTitle2Window.setText("And here is the masculine one:\n");
        mMessage2Window.setText("- The place where we can find testicles is named Scrotum- the bag of skin that holds and helps to protect the testicles\n\n- As well, above the Scrotum we can see the Epididymis - a long, coiled tube that stores sperm and transports it from the testes.\n\n" +
                "- The testicles are responsible for making sperm and are also involved in producing a hormone called testosterone;\n\n- Testosterone is an important hormone during male development and maturation for developing muscles, deepening the voice, and growing body hair.\n");
>>>>>>> main

    }
}