package com.gl.android_butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.yi)
    Button gYi;
    @Bind(R.id.er)
    Button gEr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.yi, R.id.er})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.yi:
                Toast.makeText(this,"豪车美女", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,yi.class);
                startActivity(intent);
                break;
            case R.id.er:
                Toast.makeText(this,"美女豪车", Toast.LENGTH_SHORT).show();
                Intent inten=new Intent(this,er.class);
                startActivity(inten);
                break;

        }
    }
}
