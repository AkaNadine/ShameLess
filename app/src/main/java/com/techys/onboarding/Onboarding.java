package com.techys.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.techys.authentication.Login;
import com.techys.R;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class Onboarding extends AppCompatActivity {

    private OnboardingAdapter onboardingAdapter;

    private LinearLayout layoutOnboardingIndicators;
     private MaterialButton buttonOnboardingAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        layoutOnboardingIndicators = findViewById(R.id.layoutOnboardingIndicators);
        buttonOnboardingAction = findViewById(R.id.buttonOnboardingAction);

        setupOnboardItems();
        ViewPager2 onboardingViewPager = findViewById(R.id.onboardingViewPager);
       onboardingViewPager.setAdapter(onboardingAdapter);
       setupOnboardingIndicators();
       setCurrentOnboardingIndicator(0);

          onboardingViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
              @Override
              public void onPageSelected(int position) {
                  super.onPageSelected(position);
                  setCurrentOnboardingIndicator(position);
              }
          });

          buttonOnboardingAction.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if (onboardingViewPager.getCurrentItem() +1 < onboardingAdapter.getItemCount()) {
                      onboardingViewPager.setCurrentItem(onboardingViewPager.getCurrentItem() + 1);
                  }
                  else {
                      openLogin();
                  }
              }
          });
          }

    public void openLogin(){
        Intent intent= new Intent(this, Login.class);
        startActivity(intent);
    }
    private void setupOnboardItems() {
        List<OnboardingItem> OnboardingItem = new ArrayList<>();
        OnboardingItem itemChatBox = new OnboardingItem();
        itemChatBox.setTitle("ChatBot");
        itemChatBox.setDescription("For any questions you have, feel free to talk to our assistant, Jimmy!");
        itemChatBox.setImage(R.drawable.chat_box);

        OnboardingItem itemArticles = new OnboardingItem();
        itemArticles.setTitle("Articles");
        itemArticles.setDescription("Full information about any topics from which you can learn by yourself.");
        itemArticles.setImage(R.drawable.articles);

        OnboardingItem itemOurApp  = new OnboardingItem();
        itemOurApp.setTitle(" The App");
        itemOurApp.setDescription("A safe place where you can learn about sexual education.");
        itemOurApp.setImage(R.drawable.our_appx);

          OnboardingItem.add(itemOurApp);
        OnboardingItem.add(itemChatBox);
        OnboardingItem.add(itemArticles);

        onboardingAdapter = new OnboardingAdapter(OnboardingItem);

    }

    private void setupOnboardingIndicators() {
        ImageView[] indicators = new ImageView[onboardingAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT

        );
        layoutParams.setMargins(8,0, 8, 0 );
        for(int i=0; i < indicators.length; i++){
            indicators[i] = new ImageView(getApplicationContext());
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.onboarding_indicator_inactive

            ));
               indicators[i].setLayoutParams(layoutParams);
               layoutOnboardingIndicators.addView(indicators[i]);
        }

    }
    private void setCurrentOnboardingIndicator(int index) {
        int childCount = layoutOnboardingIndicators.getChildCount();
        for (int i = 0; i < childCount; i++){
            ImageView ImageView = (ImageView)layoutOnboardingIndicators.getChildAt(i);
        if ( i == index) {
            ImageView.setImageDrawable(
                    ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_active)
            );
        } else {
           ImageView.setImageDrawable(
                   ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_inactive)
           );
        }

        }
           if(index==onboardingAdapter.getItemCount()-1){
               buttonOnboardingAction.setText("Start");


           }else {
               buttonOnboardingAction.setText("Next");
           }
    }


}