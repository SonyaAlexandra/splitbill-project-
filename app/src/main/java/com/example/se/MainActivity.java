package com.example.se;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button groupListButton;
    private ImageButton newGroupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupListButton = findViewById(R.id.groupListBtn);
        newGroupButton = findViewById(R.id.newGroupBtn);

        groupListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the GroupListActivity to display the list of groups
                Intent intent = new Intent(MainActivity.this, ViewGroupList.class);
                startActivity(intent);
            }
        });

        newGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the NewGroupActivity to create a new group
                Intent intent = new Intent(MainActivity.this, NewGroupActivity.class);
                startActivity(intent);
            }
        });
    }
}