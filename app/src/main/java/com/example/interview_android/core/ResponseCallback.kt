package com.example.interview_android.core

/**
 * Copyright 2019 (C) xplo
 *
 * Created  : 2019-11-10
 * Updated  :
 * Author   : xplo
 * Desc     :
 * Comment  :
 */
interface ResponseCallback<T> {

    fun onSuccess(data: T?)

    fun onFailure(th: Throwable)

}