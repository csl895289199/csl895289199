package com.example.shoppingmall.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


//作用基类Fragment
//首页 HomeFragment
//分类 TypeFragment
//发现 CommunityFragment
//购物车 ShoppingFragment
//用户中心 UserFragment

public abstract class  BaseFragment extends Fragment {
    protected Context mContext;

    //该类被系统创建的时候回调
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }

    @Nullable
    //抽象类 由子类实现 实现不同的效果
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return  initView();
    }
    public abstract View initView();



    //当子类需要联网请求数据时，可以重写该方法，在该方法中联网请求
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }
    public void initData(){


    }
}
