package com.example.interview_android.ui.mvp

import android.util.Log
import com.example.interview_android.ui.mvp.PostContract


class PostPresenter(var view :PostContract.View) :  PostContract.Presenter {
    override fun nothing() {
        view.nothing()
    }


}