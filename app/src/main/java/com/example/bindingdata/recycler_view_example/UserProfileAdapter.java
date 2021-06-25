package com.example.bindingdata.recycler_view_example;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bindingdata.R;
import com.example.bindingdata.databinding.StudentInfoSingleCellBinding;
import com.example.bindingdata.databinding.AgentProfileSingleCellBinding;
import com.example.bindingdata.pojo.AgentInfoModel;

import java.util.ArrayList;

public class UserProfileAdapter extends RecyclerView.Adapter<UserProfileAdapter.UserProfileViewHolder> {
    private ArrayList<AgentInfoModel> userInfoList;
    private Context context;
    public UserProfileAdapter(ArrayList<AgentInfoModel> userInfoList, Context context) {
        this.userInfoList = userInfoList;
        this.context=context;
    }

    @NonNull
    @Override
    public UserProfileAdapter.UserProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        AgentProfileSingleCellBinding binding= DataBindingUtil.inflate(inflater, R.layout.agent_profile_single_cell,parent,false);
        return new UserProfileViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserProfileAdapter.UserProfileViewHolder holder, int position) {
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        if(userInfoList != null)
        {
            return userInfoList.size();
        }
        else {
            return 0;
        }
    }
    public class UserProfileViewHolder extends RecyclerView.ViewHolder{
        public AgentProfileSingleCellBinding binding;

        public UserProfileViewHolder(AgentProfileSingleCellBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
        public void setData(int position)
        {
            binding.setAgentProfile(userInfoList.get(position));
            binding.setPosition(position);
           // Glide.with(context).load(userInfoList.get(position).getAvatar()).into(binding.userProfilePicture);
            binding.deliveryTimeSlotNameinfo.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    Log.e("text","change on"+position+" "+s.toString());
                    userInfoList.get(position).setDeliveryTimeSlotName(s.toString());
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }
    }
    public ArrayList<AgentInfoModel> getUpdatedUserList()
    {
        return userInfoList;
    }
}
