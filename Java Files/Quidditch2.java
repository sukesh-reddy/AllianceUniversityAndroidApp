package in.edu.alliance.alliance;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Quidditch2 extends AppCompatActivity {
    Button registration;
    EditText name;
    EditText reg;

    //private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    //private DatabaseReference mRootReference = firebaseDatabase.getReference();
    //private DatabaseReference mNameReference = mRootReference.child("name");
    //private DatabaseReference mRegistrationReference = mRootReference.child("reg");

    DatabaseReference quidditchReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quidditch2);
        quidditchReg = FirebaseDatabase.getInstance().getReference("Registraitons");
        registration = (Button) findViewById(R.id.registration);
        reg = (EditText) findViewById(R.id.reg);
        name = (EditText) findViewById(R.id.name);
    }

    public void registered(View view) {
        String nam = name.getText().toString();
        String r = reg.getText().toString();
        //mNameReference.setValue(nam);


        //mRegistrationReference.setValue(r);
        String id = quidditchReg.push().getKey();
        Registrations registrations = new Registrations(nam, r);
        quidditchReg.child(id).setValue(registrations);
        name.setText("");
        reg.setText("");


        Toast.makeText(this, "Registered", Toast.LENGTH_SHORT).show();
    }

}
