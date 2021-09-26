package com.example.hackatondgu.wellcomeScreens

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.hackatondgu.R
import com.example.hackatondgu.databinding.FragmentRegisterScreenBinding

class singInScreen : Fragment() {
    private lateinit var binding: FragmentRegisterScreenBinding
    private var url = "http://cx55232-wordpress-oobeb.tw1.ru/mobile_login/"


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentRegisterScreenBinding.inflate(inflater)

        binding.webViewReg.webViewClient = WebViewClient()
        binding.webViewReg.loadUrl(url)
        val webSettings = binding.webViewReg.settings
        webSettings.javaScriptEnabled = true



        return binding.root
    }

    class mywebClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return true
        }
    }


    companion object {
        @JvmStatic
        fun newInstance() = singInScreen()
    }
}