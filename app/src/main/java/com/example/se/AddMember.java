package com.example.se;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Spinner in the layout
        Spinner spinnerPersonCount = findViewById(R.id.person_count);

        // Populate Spinner with numbers (e.g., 1 to 10)
        List<String> personCounts = new ArrayList<>();
        for (int i = 1; i <= 10; i++) { // Maximum 10 members
            personCounts.add(String.valueOf(i));
        }

        // Set up the adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                personCounts
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPersonCount.setAdapter(adapter);

        // Set up the onItemSelected listener
        spinnerPersonCount.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedNumber = parent.getItemAtPosition(position).toString();
                int count = Integer.parseInt(selectedNumber);
                Toast.makeText(MainActivity.this, "Selected: " + count, Toast.LENGTH_SHORT).show();
                // Here, you can dynamically create EditText fields based on 'count'
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });
    }
}
