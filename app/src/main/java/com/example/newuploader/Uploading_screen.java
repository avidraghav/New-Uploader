package com.example.newuploader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Uploading_screen extends AppCompatActivity {
      Button daa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploading_screen);
        daa=findViewById(R.id.Daa);
        Intent intent=new Intent(this,Uploadingscreen.class);
        intent.putExtra("Subject","DAA");
        startActivity(intent);
    }
}
