package com.fonxconn.android.learnmvp.presenter;

import com.fonxconn.android.learnmvp.bean.UserBean;
import com.fonxconn.android.learnmvp.model.UserModel;
import com.fonxconn.android.learnmvp.view.IUserView;

/**
 * Created by Administrator on 2017/1/3.
 */

public class UserPresenter {
    private IUserView mUserView;
    private UserModel mUserModel;

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirtName());
        mUserView.setLastName(user.getLastName());
    }
}
