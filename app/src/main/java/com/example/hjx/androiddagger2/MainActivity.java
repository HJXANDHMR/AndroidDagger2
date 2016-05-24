package com.example.hjx.androiddagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;

    @Inject
    UserModel mUserModel;   //不能为private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivityComponent = DaggerActivityComponent.builder().
                activityModule(new ActivityModule()).build();
        mActivityComponent.inject(this);
        ((TextView) findViewById(R.id.textView)).
                setText("ID:" + mUserModel.getId() + " Name: " + mUserModel.getName() + "  Gender: " + mUserModel.getGender());
    }
}
