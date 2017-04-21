package ness.edu.fragmentsgallery;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void frag1(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().
                replace(R.id.container, new GalleryFragment()).
                commit();

    }

    public void frag2(View view) {
        getSupportFragmentManager().beginTransaction().
                replace(R.id.container, new ColorFragment()).
                commit();
    }

    public void frag3(View view) {
        getSupportFragmentManager().beginTransaction().
                replace(R.id.container, new ColorFragment()).
                commit();
    }
}
