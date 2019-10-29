package com.example.editcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);

        Intent intent = getIntent();
        String f_name = intent.getStringExtra(MainActivity.firstName);
        String l_name = intent.getStringExtra(MainActivity.lastName);
        String phone = intent.getStringExtra(MainActivity.phoneNum);

        TextView first = findViewById(R.id.FirstName);
        first.setText(f_name);

        TextView last = findViewById(R.id.LastName);
        last.setText(l_name);

        TextView num = findViewById(R.id.Phone);
        num.setText(phone);
    }
}
