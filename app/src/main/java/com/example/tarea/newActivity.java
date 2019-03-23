package com.example.tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.tarea.utils.AppConstant;

public class newActivity extends AppCompatActivity {
    private TextView mTextView, mTextView2, mTextView3, mTextView4;
    private Button  mButtonShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        mTextView = findViewById(R.id.tv_message1);
        mTextView2 = findViewById(R.id.tv_message2);
        mTextView3 = findViewById(R.id.tv_message3);
        mTextView4 = findViewById(R.id.tv_message4);

        Intent mIntent = getIntent();
        if (mIntent != null) {
            mTextView.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY));
            mTextView2.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY2));
            mTextView3.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY3));
            mTextView4.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY4));
        }

        mButtonShare = findViewById(R.id.btn_share);



        mButtonShare.setOnClickListener(v-> {
            String text = "Usuario: "+mTextView.getText().toString()+"\n"+
                    "Password: "+mTextView2.getText().toString()+"\n"+
            "email: "+mTextView3.getText().toString()+"\n"+
            "genero: "+mTextView4.getText().toString()+"\n";
            Intent mIntent2 = new Intent();
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.putExtra(Intent.EXTRA_TEXT,text);
            startActivity(mIntent2);
        });
    }
}