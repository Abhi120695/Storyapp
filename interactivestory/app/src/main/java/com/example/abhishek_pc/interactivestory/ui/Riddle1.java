package com.example.abhishek_pc.interactivestory.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.abhishek_pc.interactivestory.R;
import com.example.abhishek_pc.interactivestory.model.riddle1;
import com.example.abhishek_pc.interactivestory.model.riddle1page;

public class Riddle1 extends AppCompatActivity {

    private riddle1page mriddle1page = new riddle1page();
    public EditText manswer;
    private Button mstartbutton1;
    private riddle1 mcurrentpage1;
    private ImageView mImageView;
    protected TextView mTextView;
    private int Choice;
    private String mName1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_riddle1);
        Intent intent = getIntent();
        mName1 = intent.getStringExtra(getString(R.string.key_name));
        mImageView = (ImageView) findViewById(R.id.story1imageView);
        mTextView = (TextView) findViewById(R.id.story1textview);
        mTextView.setMovementMethod(new ScrollingMovementMethod());
        manswer = (EditText) findViewById(R.id.editTextanswer);
        mstartbutton1 = (Button) findViewById(R.id.EnterButton);
        loadpage(0);
    }
    private void loadpage(int choice) {
        Choice=choice;
        mcurrentpage1=mriddle1page.getPage(choice);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Drawable drawable = getResources().getDrawable(mcurrentpage1.getImageId());
        mImageView.setImageDrawable(drawable);
        String pageText = mcurrentpage1.getText();
        pageText = String.format(pageText, mName1);
        mTextView.setText(pageText);
        mstartbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer = manswer.getText().toString();
                if (!answer.equals("") ) {
                    int nextpage = mcurrentpage1.getnextpage();
                    loadpage(answer, Choice, nextpage);
                }
                else {
                   showToast();
                }
            }
        });
    }
    public  void loadpage( String answer,int currentpage, int nextpagefl) {

        Choice=nextpagefl;
        mcurrentpage1=mriddle1page.getPage(answer,currentpage,nextpagefl);
        manswer.setText("");
        InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

        mgr.hideSoftInputFromWindow(manswer.getWindowToken(), 0);
        Drawable drawable = getResources().getDrawable(mcurrentpage1.getImageId());
        mImageView.setImageDrawable(drawable);
        String pageText = mcurrentpage1.getText();
        mTextView.setText(pageText);
        pageText = String.format(pageText, mName1);
        if (mcurrentpage1.isfinal()) {
            manswer.setVisibility(View.INVISIBLE);
            mstartbutton1.setText("Play Again");
            mstartbutton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();

                }
            });
        }
        else {
            mstartbutton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String answer = manswer.getText().toString();
                    if (!answer.equals("") ){
                        int nextpage = mcurrentpage1.getnextpage();
                        loadpage(answer, Choice, nextpage);
                    } else {
                         showToast();
                    }
                }
            });

        }


    }
    private void showToast(){
        Toast.makeText(this, "Enter your answer ", Toast.LENGTH_LONG).show();
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_riddle1, menu);
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

