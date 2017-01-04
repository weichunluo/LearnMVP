package com.fonxconn.android.learnmvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fonxconn.android.learnmvp.R;
import com.fonxconn.android.learnmvp.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, IUserView {
    private EditText mFistNameEditText, mLastNameEditText, mIdEditText;
    private Button mSaveButton, mLoadButton;
    private UserPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findWidgets();
        mPresenter = new UserPresenter(this);
        mSaveButton.setOnClickListener(this);
        mLoadButton.setOnClickListener(this);
    }

    /**
     * 初始化界面
     */
    private void findWidgets() {
        mFistNameEditText = (EditText) findViewById(R.id.first_name_edt);
        mLastNameEditText = (EditText) findViewById(R.id.last_name_edt);
        mIdEditText = (EditText) findViewById(R.id.id_edt);

        mSaveButton = (Button) findViewById(R.id.saveButton);
        mLoadButton = (Button) findViewById(R.id.loadButton);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.saveButton:
                mPresenter.saveUser(getID(),getFirstName(),getLastName());
                break;
            case R.id.loadButton:
                mPresenter.loadUser(getID());
                break;
        }
    }

    @Override
    public int getID() {
        return Integer.parseInt(mIdEditText.getText().toString());
    }

    @Override
    public String getFirstName() {
        return mFistNameEditText.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLastNameEditText.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFistNameEditText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLastNameEditText.setText(lastName);
    }
}
