package com.example.interview_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.MutableBoolean
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.interview_android.R
import com.example.interview_android.ui.mvp.PostContract
import com.example.interview_android.ui.mvp.PostPresenter
import com.example.interview_android.ui.mvvm.HomeViewModel

class MainActivity : AppCompatActivity(),PostContract.View {
    lateinit var presenter: PostPresenter
    private lateinit var viewModel: HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter= PostPresenter(this)

        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        viewModel.isDeletedSuccessfully.observe(this,Observer<Boolean>{

        })

        viewModel.nothing().observe(this, Observer {

        })

        presenter.nothing()

    }

//    fun setNoteListListener() {
//        viewModel.noteList.observe(this,
//            Observer<MutableList<NoteModel>> { noteList ->
//                this.noteList.clear()
//                this.noteList.addAll(noteList)
//                noteAdapter.notifyDataSetChanged()
//            })
//    }

    fun initStoreRecyclerView(root: View){
        //Featured Product
//        root.rv_store.layoutManager =
//            LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
//        root.rv_store.addItemDecoration(LinearHorizontalItemDecoration(15))
//
//        val list=ArrayList<StoreModel>()
//        list.add(StoreModel(1,"Ek Shop",1))
//        list.add(StoreModel(1,"Ek Shop",1))
//        list.add(StoreModel(1,"Ek Shop",1))

//        root.rv_store.adapter = StoreAdapter(root.context,list )
    }

    override fun nothing() {
        TODO("Not yet implemented")
    }

}