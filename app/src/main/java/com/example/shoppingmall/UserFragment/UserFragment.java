package com.example.shoppingmall.UserFragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.shoppingmall.R;
import com.example.shoppingmall.base.BaseFragment;
//个人中心
public class UserFragment extends BaseFragment {


    private TextView mTextView;
    @Override
    public View initView() {
        View view = View.inflate(mContext,
                R.layout.fragment_home,
                null);
        mTextView=new TextView(mContext);
        mTextView.setTextSize(25);
        mTextView.setGravity(Gravity.CENTER);

        return mTextView;
    }

    @Override
    public void initData() {
        super.initData();
        mTextView.setText("个人中心页面内容");

    }
}

