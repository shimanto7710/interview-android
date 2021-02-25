package com.example.interview_android.ui.mvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

//    val noteList = MutableLiveData<MutableList<NoteModel>>()

    val isDeletedSuccessfully=MutableLiveData<Boolean>()

//    fun getNoteList(appDatabase: AppDatabase) {
//        val roomDAO: RoomDAO = appDatabase.roomDAO
//
//        noteList.postValue(roomDAO.getAll())
////        Log.d("viewModel",noteList.toString())
//    }

    fun deleteItem(){
        isDeletedSuccessfully.postValue(true)
    }

    fun nothing():LiveData<Boolean>{
        return true
    }
}