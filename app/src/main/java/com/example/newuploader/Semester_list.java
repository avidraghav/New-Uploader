package com.example.newuploader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Semester_list extends AppCompatActivity {
    String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_list);
        ListView list=(ListView)findViewById(R.id.list);
        final ArrayList<String> sem=new ArrayList<String >();
        sem.add("First");
        sem.add("Second");
        sem.add("Third");
        sem.add("Fourth");
        sem.add("Fifth");
        sem.add("Sixth");
        sem.add("Seventh");
        sem.add("Eight");

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sem);
        list.setAdapter(adapter);

        final Intent intent=getIntent();
        key=intent.getStringExtra("Branch");
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(key.equals("Cse") && sem.get(position).equals("First")) {
                    Intent intent1 = new Intent(getBaseContext(), Uploading_screen.class);
                    startActivity(intent1);
                    Toast.makeText(Semester_list.this, "WOrking", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
