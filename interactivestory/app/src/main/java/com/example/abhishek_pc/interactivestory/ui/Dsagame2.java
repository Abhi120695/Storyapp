package com.example.abhishek_pc.interactivestory.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.abhishek_pc.interactivestory.R;
import com.example.abhishek_pc.interactivestory.model.game1;
import com.example.abhishek_pc.interactivestory.model.game2;
import com.example.abhishek_pc.interactivestory.model.story2;
import com.example.abhishek_pc.interactivestory.model.ststory1page;

public class Dsagame2 extends AppCompatActivity {


    private game2 mstory1 = new game2();
    private ImageView mImageView1;
    private TextView mTextView1;
    private Button mchoice11;
    private Button mchoice21;
    private String mName1;
    private   ststory1page mcurrentpage1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsagame2);
        Intent intent = getIntent();
        mName1 = intent.getStringExtra(getString(R.string.key_name));
        mImageView1 =(ImageView)findViewById(R.id.story1imageView);
        mTextView1 =(TextView)findViewById(R.id.story1textview);
        mchoice11 =(Button)findViewById(R.id.story1choicebutton1);
        mchoice21 =(Button)findViewById(R.id.story1choicebutton2);
        loadpage(0);
    }

    private void loadpage(int choice) {
        mcurrentpage1 = mstory1.getPage(choice);
        Drawable drawable = getResources().getDrawable(mcurrentpage1.getImageId());
        mImageView1.setImageDrawable(drawable);
        String pageText = mcurrentpage1.getText();
        pageText = String.format(pageText, mName1);

        mTextView1.setText(pageText);
        if (mcurrentpage1.isfinal()) {
            mchoice11.setVisibility(View.INVISIBLE);
            mchoice21.setText("Play Again");
            mchoice21.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();

                }
            });



        } else {
            mchoice11.setText(mcurrentpage1.getMchoice1().getText());
            mchoice21.setText(mcurrentpage1.getMchoice2().getText());
            mchoice11.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextpage = mcurrentpage1.getMchoice1().getNextPage();
                    loadpage(nextpage);
                }
            });
            mchoice21.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextpage = mcurrentpage1.getMchoice2().getNextPage();
                    loadpage(nextpage);
                }
            });
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_story1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
