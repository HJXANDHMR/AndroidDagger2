package com.example.hjx.androiddagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    public UserModel provideUserModel() {
        return new UserModel("1", "hjx", "man");
    }
}
