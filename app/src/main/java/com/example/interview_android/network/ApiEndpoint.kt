package com.example.interview_android.network



import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.*


/*
 * Copyright 2019 (C) xplo
 *
 * Created  : 2019-11-10
 * Updated  :
 * Author   : xplo
 * Desc     :
 * Comment  :
 */
interface ApiEndpoint {

//    @Headers("Content-Type: application/x-www-form-urlencoded")
//    @FormUrlEncoded
//    @POST("/token")
//    fun doLogin(
//        @Field("grant_type") type: String?,
//        @Field("username") userName: String?,
//        @Field("password") password: String?
//    ): Call<LoginResponse>
//
//    @POST("/api/authenticate")
//    fun authenticate(@Body authRequestBody: LogInRequestBody): Call<String>


//    @POST("/api/authenticate")
//    fun authenticate(@Body authRequestBody: AuthRequestBody): Call<String>
//
//    @POST("/api/login/")
//    fun login(@Body authenticationRequest: AuthRequestBody) : Call<LoginSuccessBody>

//    @POST("/api/Account/Register")
//    fun signUp(@Body signInRequest: RegistrationRequestBody): Call<Void>
//
//    @POST("/api/Review/PostReviewPost")
//    fun postToServer(@Body postRequestBody: PostRequestBody): Call<Void>
//
//    @GET("/api/Review/GetReviewPosts")
//    fun getAllPosts():Call<List<Post>>
//
//    @GET("/api/Item")
//    fun getAllItems(): Call<List<Item>>
//
//    @GET("/api/restaurantOrPlace")
//    fun getAllRestaurant(): Call<List<RestaurantOrPlace>>
//
//    @GET("/api/Tag")
//    fun getAllTags(): Call<List<Tag>>
//
//    @GET("/api/Account/GetAUser/{id}")
//    fun getUserById(@Path("id") id:String):Call<User>
//
//    @POST("/api/Review/CreateReaction/")
//    fun createReaction(@Body reactionRequestBody: ReactionRequestBody):Call<Reaction>
//
//    @PUT("/api/Review/UpdateReaction/{id}")
//    fun updateReaction(@Path("id") id: Long,@Body reactionRequestBody: ReactionRequestBody):Call<Reaction>
//
//    @DELETE("/api/Review/DeleteReaction/{id}")
//    fun deleteReaction(@Path("id") id:Long):Call<Void>
//
//    @POST("/api/Review/PostACommentReaction")
//    fun createCommentReaction(@Body reactionRequestBody: CommentReactionRequestBody):Call<Reaction>
//
//    @PUT("/api/Review/UpdateACommentReaction/{id}")
//    fun updateCommentReaction(@Path("id") id: Long,@Body reactionRequestBody: CommentReactionRequestBody):Call<Void>
//
//    @DELETE("/api/Review/DeleteACommentReaction/{id}")
//    fun deleteCommentReaction(@Path("id") id:Long):Call<Void>
//
//    @POST("/api/Review/PostAReplyReaction")
//    fun createReplyReaction(@Body reactionRequestBody: ReplyReactionRequestBody):Call<Reaction>
//
//    @PUT("/api/Review/UpdateAReplyReaction/{id}")
//    fun updateReplyReaction(@Path("id") id: Long,@Body reactionRequestBody: ReplyReactionRequestBody):Call<Void>
//
//    @DELETE("/api/Review/DeleteAReplyReaction/{id}")
//    fun deleteReplyReaction(@Path("id") id:Long):Call<Void>
//
//    @POST("/api/Review/PostAComment")
//    fun postAComment(@Body commentRequestBody: CommentRequestBody):Call<PostComment>
//
//
//    @DELETE("/api/Review/DeleteAComment/{id}")
//    fun deleteAComment(@Path("id") id:Long):Call<Void>
//
//    @POST("/api/Review/PostAReplayAComment/")
//    fun postAReply(@Body replyRequestBody: ReplyRequestBody):Call<SubComment>
//
//
//    @DELETE("/api/Review/DeleteAReplyInAComment/{id}")
//    fun deleteAReply(@Path("id") id:Long):Call<Void>
//
//    @DELETE("/api/Review/DeletePost/{id}")
//    fun deleteAPostById(@Path("id") id:Long):Call<Void>
//
//
//    @PUT("/api/Review/UpdatePost/{id}")
//    fun updatePostById(@Path("id") id: Long,@Body postRequestBody: PostRequestBody):Call<Void>
//
//
//    @GET("/api/Review/ReviewPostByUserId/{id}")
//    fun getPostsByUserId(@Path("id") id:String):Call<List<Post>>
//
//    @GET("/api/Review/GetReviewPost/{id}")
//    fun getPostById(@Path("id") id:Long): Call<Post>
//
//
//    @Multipart
//    @POST("/1/upload/")
//    fun postAImage(@Query("key") key: String,@Part image : MultipartBody.Part):Call<ImageErrorResponse>
//
//    @Multipart
//    @POST("/api/Review/PostImages")
//    fun imageUpload(@Part image: ArrayList<MultipartBody.Part>): Call<List<String>>
//
//    @DELETE("/api/Review/DeleteImage/{id}")
//    fun deleteImageById(@Path("id") id:Long):Call<Void>

}