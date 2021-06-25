package com.example.bindingdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.bindingdata.databinding.ActivityMainBinding;
import com.example.bindingdata.pojo.StudentModel;
import com.example.bindingdata.recycler_view_example.RecyclerViewExample;
import com.example.bindingdata.user_details.UserDetailsActivity;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setCallBack(this);

    }
    /*    intiate();
    }
    public void intiate()
    {
        startActivity(new Intent(MainActivity.this, UserDetailsActivity.class));
    }*/
    public void onGoToStudentsClicked() {
        startActivity(new Intent(MainActivity.this, UserDetailsActivity.class));
    }
}
