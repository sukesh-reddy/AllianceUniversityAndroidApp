package in.edu.alliance.alliance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PastEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_events);
    }

    public void quizzards1 (View view)
    {
        Intent quiz = new Intent(this,Quizzards.class);
        startActivity(quiz);
    }

    public void quidditchf (View view)
    {
        Intent quidd = new Intent(this,Quidditch1.class);
        startActivity(quidd);
    }

    public void carnival2017 (View view)
    {
        Intent carnival = new Intent(this,Carnival2017.class);
        startActivity(carnival);
    }

    public void click (View view)
    {
        Toast.makeText(this, "Coming soon", Toast.LENGTH_SHORT).show();
    }
}