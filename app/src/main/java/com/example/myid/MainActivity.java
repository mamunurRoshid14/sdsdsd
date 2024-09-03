package com.example.myid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView emailTextView = findViewById(R.id.email);
        TextView phoneTextView = findViewById(R.id.phone);
        TextView linkedinTextView = findViewById(R.id.linkedin);
        TextView facebookTextView = findViewById(R.id.facebook);
        TextView githubTextView = findViewById(R.id.github);

        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:mamunur.stu2019@juniv.edu"));
                startActivity(emailIntent);
            }
        });

        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:01793232510"));
                startActivity(phoneIntent);
            }
        });

        linkedinTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://www.linkedin.com/in/mamunurroshid517/"));
                startActivity(linkedinIntent);
            }
        });

        facebookTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/MamunurRoshid517"));
                startActivity(facebookIntent);
            }
        });

        githubTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent githubIntent = new Intent(Intent.ACTION_VIEW);
                githubIntent.setData(Uri.parse("https://github.com/mamunurRoshid14"));
                startActivity(githubIntent);
            }
        });
    }
}
