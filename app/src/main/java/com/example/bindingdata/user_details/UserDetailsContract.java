package com.example.bindingdata.user_details;

import com.example.bindingdata.pojo.AgentInfoModel;

import java.util.ArrayList;

public interface UserDetailsContract {
    interface UserDetailsView
    {
        void showUserList(ArrayList<AgentInfoModel> userList);
        void showToast(String message);
        public void onGetListBtnClicked();
    }
    interface UserDetailsBackend{
        void getUserList(int shopDetailsId);
        //shopDetailsId=1260&shopAgentId=0&currentDate=2021-05-06&timeSlotId=0&productId=32507
       // http://139.59.70.179:8080/wiselap-0.0.1-Testing/getDeliveryTimeSlotList?shopDetailsId=322
    }
}
