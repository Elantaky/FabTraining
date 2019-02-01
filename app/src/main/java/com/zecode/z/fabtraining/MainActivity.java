package com.zecode.z.fabtraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
FloatingActionButton fabPerson,fabExplore,fabExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fabExit=findViewById(R.id.exit);
        fabPerson=findViewById(R.id.person);
        fabExplore=findViewById(R.id.explore);
        fabPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "person clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fabExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "explore clicked", Toast.LENGTH_SHORT).show();
            }
        });
        fabPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "exit clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
