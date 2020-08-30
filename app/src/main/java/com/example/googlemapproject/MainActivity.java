package com.example.googlemapproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edLat);
    }

    public void searchMethod(View view) {
        String text = editText.getText().toString();
        char[] arrayOfChars = text.toCharArray();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        if(Character.isLetter(arrayOfChars[0])){
            intent.setData(Uri.parse("geo:?q=Moscow"));
        } else {
            intent.setData(Uri.parse("geo:55.704968, 37.625206"));
        }
        startActivity(intent);
    }
}
