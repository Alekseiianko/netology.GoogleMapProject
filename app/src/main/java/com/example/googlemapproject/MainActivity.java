package com.example.googlemapproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Intent intent;
    private String text;
    private char[] arrayOfChars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edLat);
    }

    public void searchMethod(View view) {
        text = editText.getText().toString();
        arrayOfChars = text.toCharArray();
        if(Character.isLetter(arrayOfChars[0])){
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:?q=Moscow"));
            startActivity(intent);
        } else {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:55.704968, 37.625206"));
            startActivity(intent);
        }
    }
}
