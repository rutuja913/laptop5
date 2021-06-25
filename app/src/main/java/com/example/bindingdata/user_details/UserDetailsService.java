package com.example.bindingdata.user_details;

import com.example.bindingdata.AppConstants;
import com.example.bindingdata.pojo.AgentExtraInfoModel;
import com.example.bindingdata.pojo.AgentExtraInfoModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserDetailsService {
    @GET(AppConstants.GET_USER_LIST)
    Call<AgentExtraInfoModel> getCustomerData(


            @Query("shopDetailsId")
                    long shopDetailsId
    );
    //ArrayList<CustomerExtraInfoModel> getCustomerData(long page);
    ////D/OkHttp: --> GET http://139.59.70.179:8080/wiselap-0.0.1-Testing/agentWiseQuantityRequiredMobile?page=1
    ////public static final String BASE_URL="https://reqres.in/";
    ////    p
    //http://139.59.70.179:8080/wiselap-0.0.1-Testing/getDeliveryTimeSlotList?shopDetailsId=322
}
