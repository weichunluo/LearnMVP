package com.fonxconn.android.learnmvp.model;

import android.util.SparseArray;

import com.fonxconn.android.learnmvp.bean.UserBean;

/**
 * Created by Administrator on 2017/1/3.
 */

public class UserModel implements IUserModel {
    private String mFirstName;
    private String mLastName;
    private int mID;
    private SparseArray<UserBean> mUserBeanArray = new SparseArray<UserBean>();

    @Override
    public void setID(int id) {
        mID = id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
        UserBean userBean = new UserBean(mFirstName, mLastName);
        mUserBeanArray.append(mID, userBean);
    }

    @Override
    public UserBean load(int id) {
        return mUserBeanArray.get(id,new UserBean("not found","not found"));
    }
}
