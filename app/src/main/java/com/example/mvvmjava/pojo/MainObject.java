
package com.example.mvvmjava.pojo;
import com.google.gson.annotations.SerializedName;

public class MainObject {
    @SerializedName("data")
    private Data mData;
    @SerializedName("msg")
    private String mMsg;
    @SerializedName("result")
    private Long mResult;

    public Data getData() {
        return mData;
    }

    public String getMsg() {
        return mMsg;
    }

    public Long getResult() {
        return mResult;
    }

    public static class Builder {

        private Data mData;
        private String mMsg;
        private Long mResult;

        public MainObject.Builder withData(Data data) {
            mData = data;
            return this;
        }

        public MainObject.Builder withMsg(String msg) {
            mMsg = msg;
            return this;
        }

        public MainObject.Builder withResult(Long result) {
            mResult = result;
            return this;
        }

        public MainObject build() {
            MainObject mainObject = new MainObject();
            mainObject.mData = mData;
            mainObject.mMsg = mMsg;
            mainObject.mResult = mResult;
            return mainObject;
        }

    }

}
