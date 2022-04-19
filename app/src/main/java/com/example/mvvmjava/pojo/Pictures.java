package com.example.mvvmjava.pojo;

import com.google.gson.annotations.SerializedName;

public class Pictures {

    @SerializedName("front")
    Front front;

    @SerializedName("back")
    Back back;

    public Front getFront() {
        return front;
    }

    public void setFront(Front front) {
        this.front = front;
    }

    public Back getBack() {
        return back;
    }

    public void setBack(Back back) {
        this.back = back;
    }
}
