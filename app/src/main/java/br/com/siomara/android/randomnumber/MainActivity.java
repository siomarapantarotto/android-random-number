package br.com.siomara.android.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay;
    private TextView txtResult;
    private Random random = new Random();
    private Integer     randomNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); // Hide action bar

        btnPlay     = findViewById(R.id.btnPlayID);
        txtResult   = findViewById(R.id.txtResultID);

        btnPlay.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // Raffle from 0 to 10
                randomNumber = random.nextInt(11);
                txtResult.setText("Raffled number = " + randomNumber);
            }
        });
    }
}
