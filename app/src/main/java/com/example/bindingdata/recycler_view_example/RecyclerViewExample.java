package com.example.bindingdata.recycler_view_example;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;

import com.example.bindingdata.R;
import com.example.bindingdata.databinding.RecyclerViewExampleActivityBinding;
import com.example.bindingdata.pojo.StudentModel;

import java.util.ArrayList;

public class RecyclerViewExample extends AppCompatActivity {
    private RecyclerViewExampleActivityBinding binding;
    private StudentListAdapter adapter;
    private UserProfileAdapter userProfileAdapter;
    GetUserDataFromRestAPI getUserDataFromRestAPI;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.recycler_view_example_activity);
        binding.listRV.setLayoutManager(new LinearLayoutManager(this));
       /* ArrayList<StudentModel> list=new ArrayList<>();
        list.add(new StudentModel("rutuja","15","22","abc1@gmail.com"));
        list.add(new StudentModel("rutuja1","16","23","abc2@gmail.com"));
        list.add(new StudentModel("rutuja2","17","24","abc3@gmail.com"));
        list.add(new StudentModel("rutuja3","18","25","abc4@gmail.com"));
        list.add(new StudentModel("rutuja4","19","26","ab5c@gmail.com"));
        list.add(new StudentModel("rutuja5","11","27","ab6c@gmail.com"));
        list.add(new StudentModel("rutuja6","12","28","ab7c@gmail.com"));

        adapter=new StudentListAdapter(list);*/

        getUserDataFromRestAPI=new GetUserDataFromRestAPI();
        userProfileAdapter=new UserProfileAdapter(getUserDataFromRestAPI.getUserData(),this);
        binding.listRV.setAdapter(userProfileAdapter);
    }
}
