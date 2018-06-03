package com.example.hp.youtubevideorecyclerview;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    ImageButton leftNav;
   // ImageView playButton;
    ImageButton rightNav;
    CustomSwipeAdapter.OnItemClicked listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewpager);
        leftNav = findViewById(R.id.left_nav);
        rightNav =findViewById(R.id.right_nav);

      //  playButton=findViewById(R.id.play_button);

        adapter=new CustomSwipeAdapter(this, new CustomSwipeAdapter.OnItemClicked() {
            @Override
            public void OnClick(int position) {
                Toast.makeText(MainActivity.this,"play video",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,VideoActivity.class);
                startActivity(intent);

            }
        });
        viewPager.setAdapter(adapter);



// playButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Toast.makeText(MainActivity.this,"Video play",Toast.LENGTH_SHORT).show();
//
//            }
//        });


        leftNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewPager.getCurrentItem();
                if (tab > 0) {
                    tab--;
                    viewPager.setCurrentItem(tab);
                } else if (tab == 0) {
                    viewPager.setCurrentItem(tab);
                }
            }
        });

        // Images right navigatin
        rightNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tab = viewPager.getCurrentItem();
                tab++;
                viewPager.setCurrentItem(tab);
            }
        });





    }


}
