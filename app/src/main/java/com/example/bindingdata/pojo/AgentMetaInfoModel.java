package com.example.bindingdata.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AgentMetaInfoModel implements Serializable {
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("message")
    @Expose
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AgentMetaInfoModel(long id, String message) {
        this.id = id;
        this.message = message;
    }
}
