package com.example.hjx.androiddagger2;

import dagger.Component;

/**
 * Created by Administrator on 2016/5/23.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
