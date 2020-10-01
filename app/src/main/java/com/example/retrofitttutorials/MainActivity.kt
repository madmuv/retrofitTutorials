package com.example.retrofitttutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitttutorials.repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)

        button.setOnClickListener {
            val myNumber : String = number_editeText.text.toString()
            viewModel.getCustomPosts(Integer.parseInt(myNumber))
            viewModel.myCustomPosts.observe(this, Observer { response ->
                if (response.isSuccessful) {
                    textView.text = response.body().toString()
                    response.body()?.forEach {
                        Log.d("Response ",it.toString())
                        Log.d("Response ","--------------------------")
                    }
                } else {
                    textView.text = response.code().toString()
                }
            })
        }
    }
}