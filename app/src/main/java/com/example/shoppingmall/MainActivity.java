package com.example.shoppingmall;

import android.os.Bundle;


import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.shoppingmall.TypeFragment.TypeFragment;
import com.example.shoppingmall.UserFragment.UserFragment;
import com.example.shoppingmall.community.CommunityFragment;
import com.example.shoppingmall.home.homeFragment.HomeFragment;
import com.example.shoppingmall.shoppingcart.ShoppingFragment;


public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;//单选组
    private FragmentTransaction mFragmentTransaction;//fragment事务
    private FragmentManager mFragmentManager;//fragment管理者
    private HomeFragment mHomeFragment;
    private TypeFragment mTypeFragment;
    private CommunityFragment mCommunityFragment;
    private ShoppingFragment mShoppingFragment;
    private UserFragment mUserFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setClick(0);//默认进去显示王超fragment
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_main);
        mFragmentManager = getSupportFragmentManager();//获取到fragment的管理对象
        //RadioGroup的选中监听
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_home://主页
                        setClick(0);
                        break;
                    case R.id.rb_type://分类
                        setClick(1);
                        break;
                    case R.id.rb_community://发现
                        setClick(2);
                        break;
                    case R.id.rb_cart://购物车
                        setClick(3);
                        break;
                    case R.id.rb_user://个人
                        setClick(4);
                        break;
                }
            }
        });
    }

    private void setClick(int type) {
        //开启事务
        mFragmentTransaction = mFragmentManager.beginTransaction();
        //显示之前将所有的fragment都隐藏起来,在去显示我们想要显示的fragment
        hideFragment(mFragmentTransaction);
        switch (type) {
            case 0://主页
                //如果主页的fragment是null的话,就创建一个
                if (mHomeFragment == null) {
                    mHomeFragment = new HomeFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mHomeFragment);
                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mHomeFragment);
                }
                break;
            case 1:
                if (mTypeFragment == null) {
                    mTypeFragment = new TypeFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mTypeFragment);
                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mTypeFragment);
                }
                break;
            case 2:
                if (mCommunityFragment == null) {
                    mCommunityFragment = new CommunityFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mCommunityFragment);
                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mCommunityFragment);
                }
                break;
            case 3:
                if (mShoppingFragment == null) {
                    mShoppingFragment = new ShoppingFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mShoppingFragment);

                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mShoppingFragment);
                }
                break;
            case 4:
                if (mUserFragment == null) {
                    mUserFragment = new UserFragment();
                    //加入事务
                    mFragmentTransaction.add(R.id.frameLayout, mUserFragment);

                } else {
                    //如果主页fragment不为空就显示出来
                    mFragmentTransaction.show(mUserFragment);
                }
                break;


        }
        //提交事务
        mFragmentTransaction.commit();
    }

    /**
     * 用来隐藏fragment的方法
     *
     * @param fragmentTransaction
     */
    private void hideFragment(FragmentTransaction fragmentTransaction) {
        //如果此fragment不为空的话就隐藏起来
        if (mHomeFragment != null) {
            fragmentTransaction.hide(mHomeFragment);
        }
        if (mTypeFragment != null) {
            fragmentTransaction.hide(mTypeFragment);
        }
        if (mCommunityFragment != null) {
            fragmentTransaction.hide(mCommunityFragment);
        }
        if (mShoppingFragment != null) {
            fragmentTransaction.hide(mShoppingFragment);
        }
        if (mUserFragment != null) {
            fragmentTransaction.hide(mUserFragment);
        }
    }

}
