package com.example.bindingdata.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AgentInfoModel implements Serializable {
    @SerializedName("deliveryTimeSlotStart")
    @Expose
    private String deliveryTimeSlotStart;
    @SerializedName("deliveryTimeSlotEnd")
    @Expose
    private String deliveryTimeSlotEnd;
    @SerializedName("deliveryTimeSlotId")
    @Expose
    private long deliveryTimeSlotId;
    @SerializedName("deliveryTimeSlotName")
    @Expose
    private String deliveryTimeSlotName;
    @SerializedName("shopDetailsId")
    @Expose
    private long shopDetailsId;

    public String getDeliveryTimeSlotStart() {
        return deliveryTimeSlotStart;
    }

    public void setDeliveryTimeSlotStart(String deliveryTimeSlotStart) {
        this.deliveryTimeSlotStart = deliveryTimeSlotStart;
    }

    public String getDeliveryTimeSlotEnd() {
        return deliveryTimeSlotEnd;
    }

    public void setDeliveryTimeSlotEnd(String deliveryTimeSlotEnd) {
        this.deliveryTimeSlotEnd = deliveryTimeSlotEnd;
    }

    public long getDeliveryTimeSlotId() {
        return deliveryTimeSlotId;
    }

    public void setDeliveryTimeSlotId(long deliveryTimeSlotId) {
        this.deliveryTimeSlotId = deliveryTimeSlotId;
    }

    public String getDeliveryTimeSlotName() {
        return deliveryTimeSlotName;
    }

    public void setDeliveryTimeSlotName(String deliveryTimeSlotName) {
        this.deliveryTimeSlotName = deliveryTimeSlotName;
    }

    public long getShopDetailsId() {
        return shopDetailsId;
    }

    public void setShopDetailsId(long shopDetailsId) {
        this.shopDetailsId = shopDetailsId;
    }

    public AgentInfoModel(String deliveryTimeSlotStart, String deliveryTimeSlotEnd, long deliveryTimeSlotId, String deliveryTimeSlotName, long shopDetailsId) {
        this.deliveryTimeSlotStart = deliveryTimeSlotStart;
        this.deliveryTimeSlotEnd = deliveryTimeSlotEnd;
        this.deliveryTimeSlotId = deliveryTimeSlotId;
        this.deliveryTimeSlotName = deliveryTimeSlotName;
        this.shopDetailsId = shopDetailsId;
    }
}
