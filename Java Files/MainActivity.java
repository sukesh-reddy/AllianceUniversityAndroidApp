package in.edu.alliance.alliance;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.sql.Time;

public class MainActivity extends AppCompatActivity implements Home.OnFragmentInteractionListener, Events.OnFragmentInteractionListener, TimeTable.OnFragmentInteractionListener, ContactUs.OnFragmentInteractionListener, ValueEventListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Events"));
        tabLayout.addTab(tabLayout.newTab().setText("TimeTable"));
        tabLayout.addTab(tabLayout.newTab().setText("Contact Us"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    public void clicked(View view) {
        Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
    }

    public void news(View view) {
        Intent intent = new Intent(this, News1.class);
        startActivity(intent);
    }

    public void quidditch1(View view) {
        Intent i = new Intent(this, Quidditch2.class);
        startActivity(i);
    }

    public void past_events(View view)
    {
        Intent past = new Intent(this, PastEvents.class);
        startActivity(past);
    }

    public void apl(View view) {
        Intent a = new Intent(this, Apl.class);
        startActivity(a);
    }

    public void business(View view)
    {
        Intent b = new Intent(this, Business.class);
        startActivity(b);
    }


    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }
}