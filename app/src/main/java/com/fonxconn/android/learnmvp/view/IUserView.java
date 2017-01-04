package com.fonxconn.android.learnmvp.view;

/**
 * Created by Administrator on 2017/1/3.
 */

public interface IUserView {
    int getID();

    String getFirstName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
