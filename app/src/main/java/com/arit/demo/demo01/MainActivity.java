package com.arit.demo.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvMessage) TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

/*        final TextView tvMessage = findViewById(R.id.tvMessage);

        Button btnHello = (Button) findViewById(R.id.btnHello);
        btnHello.setText("Hello John!");
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMessage.setText("Hello John Doe, This is a custom message");
            }
        });*/
    }

    @OnClick(R.id.btnHello)
    public void doClickHello() {
        doSome();
    }
    public void doSome(){
        this.tvMessage.setText(R.string.HelloMessage);
    }
}
