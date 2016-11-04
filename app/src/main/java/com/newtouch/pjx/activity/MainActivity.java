package com.newtouch.pjx.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.newtouch.pjx.R;
import com.newtouch.pjx.fragment.MainFragment;
import com.newtouch.pjx.fragment.MyFragment;
import com.newtouch.pjx.fragment.OrderFragment;
import com.newtouch.pjx.utils.ToastUtils;
import com.newtouch.pjx.view.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private MyFragAdapter mAdapter;
    private FragmentManager mFragmentManager;
    public CustomViewPager mViewPager;
    private long mExitTime;
    // 底部标签的文本
    public Button mainTv, orderTv,myTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (PreferencesHelper.getPhone(this)==null || PreferencesHelper.getPhone(this).equals("")){
//            startActivity(new Intent(this,LoginActivity.class));
//            finish();
//        }

        mainTv = (RadioButton) findViewById(R.id.foot_bar_1);
        orderTv = (RadioButton) findViewById(R.id.foot_bar_2);
        myTv = (RadioButton) findViewById(R.id.foot_bar_3);

        initTabViewPager();
    }

    private void initTabViewPager() {
        mViewPager = (CustomViewPager) findViewById(R.id.fragment_container);
        mFragmentManager = getSupportFragmentManager();
        mAdapter = new MyFragAdapter(mFragmentManager, this);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(mAdapter);
        makeFragments();
    }

    private void makeFragments() {
        mAdapter.addFragment(new MainFragment());  //首页
        mAdapter.addFragment(new OrderFragment()); //Order
        mAdapter.addFragment(new MyFragment()); //我的

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        int clickedId = v.getId();
        switch (clickedId) {
            case R.id.foot_bar_1: {
                mViewPager.setCurrentItem(0, false);
                break;
            }

            case R.id.foot_bar_2: {
                mViewPager.setCurrentItem(1, false);
                break;
            }

            case R.id.foot_bar_3:{
                mViewPager.setCurrentItem(2,false);
                break;

            }

        }
    }


    public static class MyFragAdapter extends FragmentPagerAdapter {
        private Context mContext;
        public final List<Fragment> mFragments = new ArrayList<Fragment>();
        public MyFragAdapter(FragmentManager fm, Context context) {
            super(fm);
            mContext = context;
        }
        public void addFragment(Fragment fragment) {
            mFragments.add(fragment);
            notifyDataSetChanged();
        }
        @Override
        public Fragment getItem(final int position) {
            return mFragments.get(position);
        }
        @Override
        public int getCount() {
            return mFragments.size();
        }
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK
                && event.getAction() == KeyEvent.ACTION_DOWN) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                ToastUtils.show(this, "再按一次返回键退出");
        //        UIHelper.ToastMessage(this, "再按一次返回键退出");
                mExitTime = System.currentTimeMillis();
            } else {
                finish();
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        try {
        } catch (Exception e) {
            // TODO: handle exception
        }
        super.onAttachFragment(fragment);
    }



}
