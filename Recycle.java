package com.example.myapplication.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

        public class RecyclerViewActivity extends AppCompatActivity {
            private Button mBtnLinear;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_recycler_view);
                mBtnLinear=(Button)findViewById(R.id.btn_linear);
                mBtnLinear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(RecyclerViewActivity.this,LinearRecyclerViewActivity.class);
                        startActivity(intent);
                    }
                });
            }
}
