package com.example.shoppingmall.TypeFragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.shoppingmall.R;
import com.example.shoppingmall.base.BaseFragment;
//分类的Fragment
public class TypeFragment extends BaseFragment {


    private TextView mTextView;
    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.fragment_home,
                null);
        mTextView=new TextView(mContext);
        mTextView.setTextSize(25);
        mTextView.setGravity(Gravity.CENTER);

        return mTextView;
    }

    @Override
    public void initData() {
        super.initData();
        mTextView.setText("分类页面内容");

    }
}




