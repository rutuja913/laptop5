package com.example.bindingdata.recycler_view_example;

import com.example.bindingdata.AppConstants;
import com.example.bindingdata.pojo.AgentExtraInfoModel;
import com.example.bindingdata.pojo.AgentInfoModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecyclerDataInterface {

    @GET(AppConstants.GET_USER_LIST)
    Call<AgentExtraInfoModel> getCustomerData(

           @Query("shopDetailsId")
            long shopDetailsId



    );

}
/*
public interface RecyclerDataInterface {
shopDetailsId=1260&shopAgentId=0&currentDate=2021-05-06&timeSlotId=0&productId=32507
    @GET(AppConstants.GET_USER_LIST)
    Call<CustomerExtraInfoModel> getCustomerData(
            @Query("page") long page
    );

}
 */
