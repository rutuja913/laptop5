package com.example.bindingdata.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class AgentExtraInfoModel implements Serializable {

    @SerializedName("meta")
    @Expose
    private AgentMetaInfoModel meta;
    @SerializedName("data")
    @Expose
    private ArrayList<AgentInfoModel> data;

    public AgentExtraInfoModel(AgentMetaInfoModel meta, ArrayList<AgentInfoModel> data) {
        this.meta = meta;
        this.data = data;
    }

    public AgentMetaInfoModel getMeta() {
        return meta;
    }

    public void setMeta(AgentMetaInfoModel meta) {
        this.meta = meta;
    }

    public ArrayList<AgentInfoModel> getData() {
        return data;
    }

    public void setData(ArrayList<AgentInfoModel> data) {
        this.data = data;
    }
}
