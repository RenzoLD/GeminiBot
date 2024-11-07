package com.example.geminibot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.geminibot.ui.theme.GeminibotTheme
import com.example.geminibot.viewModel.GeminiViewModel
import com.example.geminibot.views.HomeView
import com.example.geminibot.views.ModalView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: GeminiViewModel by viewModels()
        setContent {
            GeminibotTheme {
                HomeView(viewModel)
                //ModalView()
            }
        }
    }
}

