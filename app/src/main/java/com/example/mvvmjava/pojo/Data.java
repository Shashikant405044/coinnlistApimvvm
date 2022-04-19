
package com.example.mvvmjava.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("itemsPerPage")
    private Long mItemsPerPage;
    @SerializedName("list")
    private List<ListData> mList;
    @SerializedName("startIndex")
    private Long mStartIndex;
    @SerializedName("totalItems")
    private Long mTotalItems;

    public Long getItemsPerPage() {
        return mItemsPerPage;
    }

    public List<ListData> getList() {
        return mList;
    }

    public Long getStartIndex() {
        return mStartIndex;
    }

    public Long getTotalItems() {
        return mTotalItems;
    }

    public static class Builder {

        private Long mItemsPerPage;
        private java.util.List<ListData> mList;
        private Long mStartIndex;
        private Long mTotalItems;

        public Data.Builder withItemsPerPage(Long itemsPerPage) {
            mItemsPerPage = itemsPerPage;
            return this;
        }

        public Data.Builder withList(java.util.List<ListData> list) {
            mList = list;
            return this;
        }

        public Data.Builder withStartIndex(Long startIndex) {
            mStartIndex = startIndex;
            return this;
        }

        public Data.Builder withTotalItems(Long totalItems) {
            mTotalItems = totalItems;
            return this;
        }

        public Data build() {
            Data data = new Data();
            data.mItemsPerPage = mItemsPerPage;
            data.mList = mList;
            data.mStartIndex = mStartIndex;
            data.mTotalItems = mTotalItems;
            return data;
        }

    }

}
