package com.example.myportfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This function is called whenever any button is called
    public void onClick(View v) {
        StringBuilder messageToShow = new StringBuilder(getString(R.string.button_launch));
        String app = getString(R.string.app);
        switch (v.getId()) {
            case R.id.button_spotify_streamer:
                messageToShow.append(getString(R.string.spotify_streamer) + app);
                break;

            case R.id.button_scores_app:
                messageToShow.append(getString(R.string.scores_app));
                break;

            case R.id.button_library_app:
                messageToShow.append(getString(R.string.library_app));
                break;

            case R.id.button_build_it_bigger:
                messageToShow.append(getString(R.string.build_it_bigger) + app);
                break;

            case R.id.button_xyz_reader:
                messageToShow.append(getString(R.string.xyz_reader) + app);
                break;

            case R.id.button_capstone_my_own_app:
                messageToShow.append(getString(R.string.capstone_my_own_app));
                break;
        }

        Toast.makeText(MainActivity.this, messageToShow, Toast.LENGTH_SHORT).show();
    }
}
