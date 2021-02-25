package com.example.interview_android.network

import android.util.Log
import com.example.interview_android.network.NetworkCall
import com.google.gson.Gson
import com.rookie.memes.network.api.ApiClient
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Copyright 2019 (C) xplo
 *
 * Created  : 2019-11-10
 * Updated  :
 * Author   : xplo
 * Desc     :
 * Comment  :
 */
class NetworkCallImpl : NetworkCall {

//    private var mRetrofitCommonService = RetrofitClient.getInstance();
//
//    companion object {
//        private const val TAG = "NetworkCall"
//    }
//
//    private var apiClient = ApiClient().getApiService()
//    private var imageClient = ClientForImage().getApiService()
//
//    override fun auth(logInRequestBody: LogInRequestBody, callback: NRCallback<LoginResponse>) {
//        val gson = Gson()
//        val json: String = gson.toJson(logInRequestBody)
//        Log.d("auth", "login")
//        Log.d("auth", json)
//
//        val call = mRetrofitCommonService.doLogin(
//            "password",
//            logInRequestBody.email,
//            logInRequestBody.password
//        )
//        call?.enqueue(object : retrofit2.Callback<LoginResponse> {
//            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//                Log.d("auth", "onFailure")
//                Log.d("auth", "onFailure call : " + call)
//                Log.d("auth", "onFailure throw msg : " + t.message)
//                Log.d("auth", "onFailure throw cause : " + t.cause)
//
//                var callInfo = CallInfo(404, call.toString())
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
//                Log.d("auth", "onSuccess")
//                Log.d("auth", "onSuccess " + response.isSuccessful)
//                Log.d("auth", "onSuccess body : " + response.body())
//                Log.d("auth", "onSuccess code : " + response.code())
//                Log.d("auth", "onSuccess header : " + response.headers())
//                Log.d("auth", "onSuccess msg : " + response.message())
//                Log.d("auth", "onSuccess msg : $call")
//
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//
////        val call = apiClient.authenticate(SignInRequest("asdsad","asdsad"))
////        call.enqueue(object : retrofit2.Callback<String>{})
//
//
//    }
//
//    override fun login(logInRequestBody: LogInRequestBody, callback: NRCallback<String>) {
//        TODO("Not yet implemented")
//    }
//
//    override fun registration(signUpRequest: RegistrationRequestBody, callback: NRCallback<Void>) {
//        val gson = Gson()
//        val json: String = gson.toJson(signUpRequest)
//        Log.d("auth", json)
//        val call = apiClient.signUp(signUpRequest)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                Log.d("auth", "onFailure")
//                Log.d("auth", "onFailure call : " + call)
//                Log.d("auth", "onFailure call : " + t.localizedMessage)
//                Log.d("auth", "onFailure throw msg : " + t.message)
//                Log.d("auth", "onFailure throw cause : " + t.cause)
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                Log.d("auth", "onSuccess")
//                Log.d("auth", "onSuccess " + response.isSuccessful)
//                Log.d("auth", "onSuccess body : " + response.body().toString())
//                Log.d("auth", "onSuccess error body : " + response.errorBody())
//                Log.d("auth", "onSuccess code : " + response.code())
//                Log.d("auth", "onSuccess header : " + response.headers())
//                Log.d("auth", "onSuccess msg : " + response.message())
//
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getPostById(postId: Long, callback: NRCallback<Post>) {
//        TODO("Not yet implemented")
//    }
//
//    override fun getMainComment(postId: Long, callback: NRCallback<ArrayList<PostComment>>) {
//        TODO("Not yet implemented")
//    }
//
//    override fun postToServer(post: PostRequestBody, callback: NRCallback<Void>) {
//        val call = apiClient.postToServer(post)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getAllPosts(callback: NRCallback<List<Post>>) {
//        val call = apiClient.getAllPosts()
//        call.enqueue(object : Callback<List<Post>> {
//            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getAllItems(callback: NRCallback<List<Item>>) {
//        val call = apiClient.getAllItems()
//        call.enqueue(object : Callback<List<Item>> {
//            override fun onFailure(call: Call<List<Item>>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                Log.d("item123", "onFailed " + t.cause)
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<List<Item>>, response: Response<List<Item>>) {
//                Log.d("item123", "onResponse")
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getAllRestaurants(callback: NRCallback<List<RestaurantOrPlace>>) {
//        val call = apiClient.getAllRestaurant()
//        call.enqueue(object : Callback<List<RestaurantOrPlace>> {
//            override fun onFailure(call: Call<List<RestaurantOrPlace>>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(
//                call: Call<List<RestaurantOrPlace>>,
//                response: Response<List<RestaurantOrPlace>>
//            ) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getAllTags(callback: NRCallback<List<Tag>>) {
//        val call = apiClient.getAllTags()
//        call.enqueue(object : Callback<List<Tag>> {
//            override fun onFailure(call: Call<List<Tag>>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<List<Tag>>, response: Response<List<Tag>>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getUSerById(id: String, callback: NRCallback<User>) {
//        val call = apiClient.getUserById(id)
//        call.enqueue(object : Callback<User> {
//            override fun onFailure(call: Call<User>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<User>, response: Response<User>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//
//        })
//    }
//
//    override fun createReaction(
//        reactionRequestBody: ReactionRequestBody,
//        callback: NRCallback<Reaction>
//    ) {
//        val call = apiClient.createReaction(reactionRequestBody)
//        call.enqueue(object : Callback<Reaction> {
//            override fun onFailure(call: Call<Reaction>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Reaction>, response: Response<Reaction>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun updateReaction(
//        id: Long,
//        reactionRequestBody: ReactionRequestBody,
//        callback: NRCallback<Reaction>
//    ) {
//        val call = apiClient.updateReaction(id, reactionRequestBody)
//        call.enqueue(object : Callback<Reaction> {
//            override fun onFailure(call: Call<Reaction>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Reaction>, response: Response<Reaction>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun deleteReaction(id: Long, callback: NRCallback<Void>) {
//        val call = apiClient.deleteReaction(id)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun createCommentReaction(
//        commentReactionRequestBody: CommentReactionRequestBody,
//        callback: NRCallback<Reaction>
//    ) {
//        val call = apiClient.createCommentReaction(commentReactionRequestBody)
//        call.enqueue(object : Callback<Reaction> {
//            override fun onFailure(call: Call<Reaction>, t: Throwable) {
//                Log.d("commentReaction", "create reaction failed : ")
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Reaction>, response: Response<Reaction>) {
//                Log.d("commentReaction", "create reaction : on response")
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun updateCommentReaction(
//        id: Long,
//        commentReactionRequestBody: CommentReactionRequestBody,
//        callback: NRCallback<Void>
//    ) {
//        val call = apiClient.updateCommentReaction(id, commentReactionRequestBody)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                Log.d("commentReaction", "Updated successfully")
////                var callInfo = CallInfo(response.code(), response.message())
////                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun deleteCommentReaction(id: Long, callback: NRCallback<Void>) {
//        val call = apiClient.deleteCommentReaction(id)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun createReplyReaction(
//        replyReactionRequestBody: ReplyReactionRequestBody,
//        callback: NRCallback<Reaction>
//    ) {
//        val call = apiClient.createReplyReaction(replyReactionRequestBody)
//        call.enqueue(object : Callback<Reaction> {
//            override fun onFailure(call: Call<Reaction>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Reaction>, response: Response<Reaction>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun updateReplyReaction(
//        id: Long,
//        reactionRequestBody: ReplyReactionRequestBody,
//        callback: NRCallback<Void>
//    ) {
//        val call = apiClient.updateReplyReaction(id, reactionRequestBody)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                Log.d("commentReaction", "update Failed " + t.message)
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                Log.d("commentReaction", "update onResponse ")
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun deleteReplyReaction(id: Long, callback: NRCallback<Void>) {
//        val call = apiClient.deleteReplyReaction(id)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun postAComment(
//        commentRequestBody: CommentRequestBody,
//        callback: NRCallback<PostComment>
//    ) {
//        val call = apiClient.postAComment(commentRequestBody)
//        call.enqueue(object : Callback<PostComment> {
//            override fun onFailure(call: Call<PostComment>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<PostComment>, response: Response<PostComment>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun deleteAComment(id: Long, callback: NRCallback<Void>) {
//        val call = apiClient.deleteAComment(id)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun postAReplay(replyRequestBody: ReplyRequestBody, callback: NRCallback<SubComment>) {
//        val call = apiClient.postAReply(replyRequestBody)
//        call.enqueue(object : Callback<SubComment> {
//            override fun onFailure(call: Call<SubComment>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<SubComment>, response: Response<SubComment>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun deleteAReply(id: Long, callback: NRCallback<Void>) {
//        val call = apiClient.deleteAReply(id)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun deletePostById(id: Long, callback: NRCallback<Void>) {
//        val call = apiClient.deleteAPostById(id)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun updatePostById(
//        id: Long,
//        postRequestBody: PostRequestBody,
//        callback: NRCallback<Void>
//    ) {
//        val call = apiClient.updatePostById(id, postRequestBody)
//        call.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getPostsByUserId(id: String, callback: NRCallback<List<Post>>) {
//        val call = apiClient.getPostsByUserId(id)
//        call.enqueue(object : Callback<List<Post>> {
//            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun getPostsById(id: Long, callback: NRCallback<Post>) {
//        val call = apiClient.getPostById(id)
//        call.enqueue(object : Callback<Post> {
//            override fun onFailure(call: Call<Post>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Post>, response: Response<Post>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun postAImage(
//        key: String,
//        image: MultipartBody.Part,
//        requestBody: RequestBody?,
//        callback: NRCallback<ImageErrorResponse>
//    ) {
//        val call = imageClient.postAImage(key, image)
//        call.enqueue(object : Callback<ImageErrorResponse> {
//            override fun onFailure(call: Call<ImageErrorResponse>, t: Throwable) {
//                Log.d("image", t.message!!)
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(
//                call: Call<ImageErrorResponse>,
//                response: Response<ImageErrorResponse>
//            ) {
//
//                var callInfo = CallInfo(response.code(), response.message())
//                Log.d("image", "data isSuccessful:" + response.isSuccessful)
//                Log.d("image", "data :" + response.body())
//                Log.d("image", "data error body:" + response.errorBody().toString())
//                Log.d("image", "data code:" + response.code())
//                Log.d("image", "data msg:" + response.message())
//                Log.d("image", "data raw:" + response.raw())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun uploadImage(
//        image: ArrayList<MultipartBody.Part>,
//        callback: NRCallback<List<String>>
//    ) {
//        val call = apiClient.imageUpload(image)
//        call?.enqueue(object : Callback<List<String>> {
//            override fun onFailure(call: Call<List<String>>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<List<String>>, response: Response<List<String>>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                Log.d("image", "data isSuccessful:" + response.isSuccessful)
//                Log.d("image", "data :" + response.body())
//                Log.d("image", "data error body:" + response.errorBody().toString())
//                Log.d("image", "data code:" + response.code())
//                Log.d("image", "data msg:" + response.message())
//                Log.d("image", "data raw:" + response.raw())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }
//
//    override fun deleteImageById(id: Long, callback: NRCallback<Void>) {
//        val api = apiClient.deleteImageById(id)
//        api.enqueue(object : Callback<Void> {
//            override fun onFailure(call: Call<Void>, t: Throwable) {
//                var callInfo = CallInfo(404, "connection failed")
//                callback.onFailure(t, callInfo)
//            }
//
//            override fun onResponse(call: Call<Void>, response: Response<Void>) {
//                var callInfo = CallInfo(response.code(), response.message())
//                callback.onSuccess(response.body(), callInfo)
//            }
//        })
//    }


}

