package ness.edu.fragmentsgallery;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener
            mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new GalleryFragment())
                            .commit();
                    return true;
                case R.id.navigation_dashboard:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new ColorFragment())
                            .commit();
                    return true;
                case R.id.navigation_notifications:
                    //1) newInstance of the new fragment:
                    TextFragment textFrag = TextFragment.newInstance("Hello, Parameters");

                    //2) begin a transaction:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, textFrag)
                            .commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);


        BottomNavigationView v = (BottomNavigationView) findViewById(R.id.navigation);
        v.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
 }

}
