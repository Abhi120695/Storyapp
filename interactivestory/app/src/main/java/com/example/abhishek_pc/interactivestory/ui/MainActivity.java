package com.example.abhishek_pc.interactivestory.ui;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.abhishek_pc.interactivestory.R;

public class MainActivity extends AppCompatActivity {
    private EditText mNameField1;
    private EditText mAgeField1;
    private Button mstartbutton1;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playsound();
        mImageView = (ImageView)findViewById(R.id.titlepage);
        mNameField1 =(EditText)findViewById(R.id.nameEditText);
        mAgeField1 = (EditText)findViewById(R.id.AgeEditText);
        mstartbutton1 =(Button)findViewById(R.id.startButton);
        animatemainpage();
        mstartbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField1.getText().toString();
                String age1 = mAgeField1.getText().toString();
                if (name.equals("")||age1.equals(""))
                    showToast1();


                else {
                    int age = Integer.parseInt(age1);
                    if (age < 15) {
                        startStory1(name);
                    }
                    else
                    if (age > 15 && age < 18) {
                        startStory2(name);
                    }
                    else
                    if (age > 17 && age < 20) {
                        startgame2(name);
                    }
                    else
                    if (age > 17 && age == 20)
                        startgame1(name);
                    else
                    if (age > 20 && age < 50)
                        startRiddle1(name);
                    else
                        showToast();
                }

            }
        });
    }
    private void startStory1(String name) {
        Intent intent = new Intent(this,Story1Activity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }

    private void startStory2(String name) {
        Intent intent = new Intent(this,Story2.class);
        intent.putExtra(getString(R.string.key_name),name);
        startActivity(intent);
    }
    private void startgame1(String name) {
        Intent intent = new Intent(this,Dsagame1.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }
    private void startgame2(String name) {
        Intent intent = new Intent(this,Dsagame2.class);
        intent.putExtra(getString(R.string.key_name),name);
        startActivity(intent);
    }
    private void startRiddle1(String name) {
        Intent intent = new Intent(this,Riddle1.class);
        intent.putExtra(getString(R.string.key_name),name);
        startActivity(intent);
    }
    private void showToast(){
        Toast.makeText(this, "I think you know everything by now ", Toast.LENGTH_LONG).show();
    }
    private void showToast1(){
        Toast.makeText(this, "Please Enter your name and age to continue", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.storymain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mNameField1.setText("");
        mAgeField1.setText("");
    }
    private void animatemainpage(){
        mImageView.setImageResource(R.drawable.animationlist);
        AnimationDrawable mainanimation = (AnimationDrawable) mImageView.getDrawable();
        if (mainanimation.isRunning()){
            mainanimation.stop();

        }
        mainanimation.start();
    }
    private void playsound() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sword_slash_attack_sound_effect);
        mp.start();
          }
    }
