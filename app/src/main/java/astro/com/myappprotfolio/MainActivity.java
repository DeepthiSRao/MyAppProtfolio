package astro.com.myappprotfolio;

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

    public void myOwnApp(View v) {

        Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_LONG).show();

    }
}
