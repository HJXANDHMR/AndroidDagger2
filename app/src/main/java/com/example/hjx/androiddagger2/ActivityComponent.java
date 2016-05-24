package com.example.hjx.androiddagger2;

import dagger.Component;


@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
