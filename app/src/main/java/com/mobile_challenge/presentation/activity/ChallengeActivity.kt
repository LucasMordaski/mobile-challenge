package com.mobile_challenge.presentation.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mobile_challenge.databinding.ChallengeActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChallengeActivity : AppCompatActivity() {

    private lateinit var bindingView: ChallengeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ChallengeActivityBinding.inflate(layoutInflater)
        setContentView(bindingView.root)

    }
}

//lifecycleScope.launch {
//    delay(500)
//    viewModel.getSampleResponse()
//        .collect {
//            when (it) {
//                is State.DataState -> textView.text = "success ${it.data}"
//                is State.ErrorState -> textView.text = "error ${it.exception}"
//                is State.LoadingState -> textView.text = "loading"
//            }
//
//        }
//}