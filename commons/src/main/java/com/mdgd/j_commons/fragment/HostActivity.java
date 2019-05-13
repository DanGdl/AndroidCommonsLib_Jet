package com.mdgd.j_commons.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;

import com.mdgd.commons.contract.fragment.FragmentContract;
import com.mdgd.commons.contract.mvp.ViewContract;
import com.mdgd.j_commons.R;
import com.mdgd.j_commons.mvp.CommonActivity;

import java.util.List;

/**
 * Created by Max
 * on 25/07/2017.
 */

public abstract class HostActivity<T extends ViewContract.IPresenter> extends CommonActivity<T> implements FragmentContract.IHost {

    protected View container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        container = findViewById(getFragmentContainerId());
        if (savedInstanceState == null) addFirstFragment();
        else {
            final List<Fragment> fragments = getSupportFragmentManager().getFragments();
            if (fragments.isEmpty()) addFirstFragment();
            else restoreFragments(fragments);
        }
    }

    protected void addFirstFragment() {
        final Fragment f = getFirstFragment();
        if (f == null) return;
        addFragment(f, false, "firstFragment");
    }

    protected void restoreFragments(List<Fragment> fragments) {
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    protected abstract Fragment getFirstFragment();
}
