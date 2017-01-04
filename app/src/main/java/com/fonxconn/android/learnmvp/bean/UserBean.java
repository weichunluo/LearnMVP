package com.fonxconn.android.learnmvp.bean;

/**
 * Created by Administrator on 2017/1/3.
 */

public class UserBean {
    private String mFirtName;
    private String mLastName;

    public UserBean(String firtName, String lastName) {
        mLastName = lastName;
        mFirtName = firtName;
    }

    public String getFirtName() {
        return mFirtName;
    }

    public String getLastName() {
        return mLastName;
    }
}
