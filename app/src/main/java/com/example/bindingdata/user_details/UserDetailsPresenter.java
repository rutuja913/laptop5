package com.example.bindingdata.user_details;

import android.util.Log;

import com.example.bindingdata.pojo.AgentExtraInfoModel;
import com.example.bindingdata.retrofit.APIClient;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDetailsPresenter implements UserDetailsContract.UserDetailsBackend{
    private UserDetailsContract.UserDetailsView view;
    private UserDetailsService userDetailsService;
    public UserDetailsPresenter(UserDetailsContract.UserDetailsView view) {

        this.view = view;
        userDetailsService= APIClient.getClient().create(UserDetailsService.class);
    }

   // @Override
   /* public void getUserList(long shopDetailsId ) {
        userDetailsService.getCustomerData(shopDetailsId).enqueue(new Callback<AgentExtraInfoModel>() {
            @Override
            public void onResponse(Call<AgentExtraInfoModel> call, Response<AgentExtraInfoModel> response) {
                //response.body();
               // Log.e("internetData",new Gson().toJson(response.body()));
                //shopDetailsId
                // //http://139.59.70.179:8080/wiselap-0.0.1-Testing/getDeliveryTimeSlotList?shopDetailsId=322
                view.showUserList(response.body().getdata());
            }

            @Override
            public void onFailure(Call<AgentExtraInfoModel> call, Throwable t) {
                view.showToast("something went wrong");

            }
        });
        // Call<CustomerExtraInfoModel> call =userDetailsService.getCustomerData(1).e;
       /* call.enqueue(new Callback<CustomerExtraInfoModel>() {
            @Override
            public void onResponse(Call<CustomerExtraInfoModel> call, Response<CustomerExtraInfoModel> response) {
                customerExtraInfoModel=response.body();
                Log.e("data",new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<CustomerExtraInfoModel> call, Throwable t) {

            }
        });*/




    @Override
    public void getUserList(int shopDetailsId) {
        userDetailsService.getCustomerData(shopDetailsId).enqueue(new Callback<AgentExtraInfoModel>() {
            @Override
            public void onResponse(Call<AgentExtraInfoModel> call, Response<AgentExtraInfoModel> response) {
                //response.body();
                Log.e("internetData",new Gson().toJson(response.body()));
                //shopDetailsId
                // //http://139.59.70.179:8080/wiselap-0.0.1-Testing/getDeliveryTimeSlotList?shopDetailsId=322
                view.showUserList(response.body().getData());
            }

            @Override
            public void onFailure(Call<AgentExtraInfoModel> call, Throwable t) {
                view.showToast("something went wrong");

            }
        });
        // Call<CustomerExtraInfoModel> call =userDetailsService.getCustomerData(1).e;
       /* call.enqueue(new Callback<CustomerExtraInfoModel>() {
            @Override
            public void onResponse(Call<CustomerExtraInfoModel> call, Response<CustomerExtraInfoModel> response) {
                customerExtraInfoModel=response.body();
                Log.e("data",new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<CustomerExtraInfoModel> call, Throwable t) {

            }
        });*/


    }
}
