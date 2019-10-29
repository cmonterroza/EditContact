package com.example.editcontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String firstName = " ";
    public static final String lastName = " ";
    public static final String phoneNum = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveContact(View view)
    {
        Intent intent = new Intent(this, DisplayContactActivity.class);
        EditText first_name = findViewById(R.id.FirstName);
        EditText last_name = findViewById(R.id.LastName);
        EditText phone = findViewById(R.id.Phone);

        String f_name = first_name.getText().toString();
        String l_name = last_name.getText().toString();
        String number = phone.getText().toString();

        intent.putExtra(firstName, f_name);
        intent.putExtra(lastName, l_name);
        intent.putExtra(phoneNum, number);

        startActivity(intent);
    }
}
