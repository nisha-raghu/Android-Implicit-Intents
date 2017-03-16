package com.example.nisha.assignment2_implicit_intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.closeButton;

public class MainActivity extends AppCompatActivity {

    Button button,closeButton,phoneButton;
    EditText textView;
    EditText phoneView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(textView.getText().toString()));
                startActivity(intent);
            }
        });

        phoneView = (EditText) findViewById(R.id.editText1);
        phoneButton = (Button) findViewById(R.id.button5);
        phoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneView.getText().toString()));
                startActivity(intent);
            }
        });

        closeButton = (Button) findViewById(R.id.button3);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });
    }
}
