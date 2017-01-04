package com.fonxconn.android.learnmvp.model;

import com.fonxconn.android.learnmvp.bean.UserBean;

/**
 * Created by Administrator on 2017/1/3.
 */

public interface IUserModel {
    void setID(int id);
    void setFirstName(String firstName);
    void setLastName(String lastName);
    UserBean load(int id);
}
