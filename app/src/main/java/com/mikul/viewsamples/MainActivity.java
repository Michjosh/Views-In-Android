package com.mikul.viewsamples;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editTextTextEmailAddress);
    }

    public void formSubmit(View view) {
        String extractedEmail = email.getText().toString();
        Toast.makeText(view.getContext(), extractedEmail, Toast.LENGTH_SHORT).show();
    }
}
