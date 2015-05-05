package com.touchmusic;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.touchmusic.components.carousel.Carousel;
import com.touchmusic.components.carousel.CarouselAdapter;
import com.touchmusic.components.carousel.CarouselItem;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initCarousel();
    }


    /**
     * method to initialize music carousel
     */
    private void initCarousel() {
        Carousel carousel = (Carousel) findViewById(R.id.carousel);
        carousel.setOnItemClickListener(new CarouselAdapter.OnItemClickListener() {

            public void onItemClick(CarouselAdapter<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(Home.this,
                        String.format("%s has been clicked",
                                ((CarouselItem) parent.getChildAt(position)).getName()),
                        Toast.LENGTH_SHORT).show();
            }

        });

        carousel.setOnItemSelectedListener(new CarouselAdapter.OnItemSelectedListener() {

                                               public void onItemSelected(CarouselAdapter<?> parent, View view,
                                                                          int position, long id) {

                                                   final TextView txt = (TextView) (findViewById(R.id.selected_item));

                                                   switch (position) {
                                                       case 0:
                                                           txt.setText("Imagine dragons, banda revelacion rock alternativo.");
                                                           break;
                                                       case 1:
                                                           txt.setText("Metallica, mejor banda de metal de todos los tiempos.");
                                                           break;
                                                       case 2:
                                                           txt.setText("Pantera, mejor banda de metalcore de todos los tiempos.");
                                                           break;
                                                       case 3:
                                                           txt.setText("Maroon 5, banda revelacion rock alternativo.");
                                                           break;
                                                       case 4:
                                                           txt.setText("American Authors, banda revelacion rock alternativo");
                                                           break;
                                                       case 5:
                                                           txt.setText("One Republic, banda pop revelacion.");
                                                           break;
                                                   }

                                               }

                                               public void onNothingSelected(CarouselAdapter<?> parent) {
                                               }

                                           }
        );
    }

    public void openLocationActivity(View view) {
        startActivityApp(Location.class);
    }

    public void openHomeActivity(View view) {
        startActivityApp(this.getClass());
    }

    public void openMusicActivity(View view) {
        startActivityApp(Music.class);
    }

    public void openProfileActivity(View view) {
        startActivityApp(Profile.class);
    }

    public void openWalletActivity(View view) {
        startActivityApp(Wallet.class);
    }

    private void startActivityApp(Class activityClass){
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
