package com.example.bindingdata.user_details;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.bindingdata.R;
import com.example.bindingdata.databinding.RecyclerViewExampleActivityBinding;
import com.example.bindingdata.pojo.AgentInfoModel;
import com.example.bindingdata.recycler_view_example.UserProfileAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;

public class UserDetailsActivity extends AppCompatActivity implements UserDetailsContract.UserDetailsView {
    private RecyclerViewExampleActivityBinding binding;
    private UserDetailsPresenter userDetailsPresenter;
    private UserProfileAdapter userProfileAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= DataBindingUtil.setContentView(this, R.layout.recycler_view_example_activity);
        binding.setCallBack(this);
        binding.listRV.setLayoutManager(new LinearLayoutManager(this));
        binding.appBar.activityNameTV.setText("user data");
        userDetailsPresenter=new UserDetailsPresenter(this);
        userDetailsPresenter.getUserList(322);
    }

    @Override
    public void showUserList(ArrayList<AgentInfoModel> userList) {
        userProfileAdapter=new UserProfileAdapter(userList,this);
        binding.listRV.setAdapter(userProfileAdapter);
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this,"something went wrong",Toast.LENGTH_LONG).show();
    }
    public void onGetListBtnClicked()
    {
        //GSON – Serialize and Deserialize JSON. Learn to use Google GSON library to serialize
        // Java Objects into their JSON representation and to deserialize a JSON string to an
        // equivalent Java object. GSON provides
        // simple toJson() and fromJson() methods to convert Java objects to JSON and vice-versa.

        // Inner inner=new Inner(this);
        // ArrayList<CustomerInfoModel> customerInfoModels=userProfileAdapter.getUpdatedUserList();
        Log.e("updateList",new Gson().toJson(userProfileAdapter.getUpdatedUserList()));
    }
   /* public class Inner{
        public UserDetailsActivity userDetailsActivity;

        public Inner(UserDetailsActivity userDetailsActivity) {
            this.userDetailsActivity = userDetailsActivity;
        }

        public void someMethod()
        {
            userDetailsActivity.onGetListBtnClicked();
        }

    }*/
}
