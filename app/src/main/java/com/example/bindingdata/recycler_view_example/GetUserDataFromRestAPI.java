package com.example.bindingdata.recycler_view_example;

import android.util.Log;

import com.example.bindingdata.pojo.AgentExtraInfoModel;
import com.example.bindingdata.pojo.AgentInfoModel;
import com.example.bindingdata.pojo.AgentExtraInfoModel;
import com.example.bindingdata.pojo.AgentInfoModel;
import com.example.bindingdata.retrofit.APIClient;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetUserDataFromRestAPI {
    RecyclerDataInterface recyclerDataInterface;
    private AgentExtraInfoModel customerExtraInfoModel;
    public GetUserDataFromRestAPI()
    {
        recyclerDataInterface= APIClient.getClient().create(RecyclerDataInterface.class);
    }

    public ArrayList<AgentInfoModel> getUserData() {
        //call rest api and get data


        //customerExtraInfoModel=new AgentExtraInfoModel();
        //shopDetailsId=1260&shopAgentId=0&currentDate=2021-05-06&timeSlotId=0&productId=32507
        Call<AgentExtraInfoModel> call =recyclerDataInterface.getCustomerData(322);
        call.enqueue(new Callback<AgentExtraInfoModel>() {
            @Override
            public void onResponse(Call<AgentExtraInfoModel> call, Response<AgentExtraInfoModel> response) {
                customerExtraInfoModel=response.body();
                Log.e("data",new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<AgentExtraInfoModel> call, Throwable t) {

            }
        });
       // customerExtraInfoModel=new Gson().fromJson(jsonData,AgentExtraInfoModel.class);
        Log.e("customerData",new Gson().toJson(customerExtraInfoModel)+" ");
        return customerExtraInfoModel.getData();
    }
}