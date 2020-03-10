package com.mou.mvvmmodule.di.module

import com.mou.mvvmmodule.mvvm.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector



@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}