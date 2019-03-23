package com.example.tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.tarea.utils.AppConstant;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();
    private EditText mEdit,mEdit2,mEdit3,mEdit4;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit = findViewById(R.id.et_text1);
        mEdit2 = findViewById(R.id.et_text2);
        mEdit3 = findViewById(R.id.et_text3);
        mEdit4 = findViewById(R.id.et_text4);
        mButton = findViewById(R.id.btn_send);
        mButton.setOnClickListener(v->{
            String text = mEdit.getText().toString();
            String text2 = mEdit2.getText().toString();
            String text3 = mEdit3.getText().toString();
            String text4 = mEdit4.getText().toString();
            Intent mIntent = new Intent(MainActivity.this,newActivity.class);
            mIntent.putExtra(AppConstant.TEXT_KEY,text);
            mIntent.putExtra(AppConstant.TEXT_KEY2,text2);
            mIntent.putExtra(AppConstant.TEXT_KEY3,text3);
            mIntent.putExtra(AppConstant.TEXT_KEY4,text4);
            startActivity(mIntent);
        });
    }

}
