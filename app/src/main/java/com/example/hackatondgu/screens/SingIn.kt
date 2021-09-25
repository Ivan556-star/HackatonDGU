package com.example.hackatondgu.screens

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.net.http.SslError
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.hackatondgu.R
import com.example.hackatondgu.databinding.FragmentRegistrationBinding
import com.example.hackatondgu.databinding.FragmentSingInBinding

class SingIn : Fragment() {
    private lateinit var binding: FragmentSingInBinding
    private var url = "http://u113361.test-handyhost.ru/login/"


    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        // Inflate the layout for this fragment
        binding = FragmentSingInBinding.inflate(inflater)

        binding.webViewSingIn.webViewClient = WebViewClient()
        // http://u113361.test-handyhost.ru  старый сайт
        // http://cx55232-wordpress-oobeb.tw1.ru/elementor-258/ новый сайт
        // https://www.virustotal.com/gui/home/upload
        binding.webViewSingIn.loadUrl(url)
        val webSettings = binding.webViewSingIn.settings
        webSettings.javaScriptEnabled = true


        return binding.root

    }


    class mywebClient : WebViewClient() {
        override fun onPageStarted(view: WebView, url: String, favicon: Bitmap) {
            super.onPageStarted(view, url, favicon)
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return true
        }

        override fun onReceivedSslError(
            view: WebView?,
            handler: SslErrorHandler?,
            error: SslError?
        ) {
            super.onReceivedSslError(view, handler, error)

        }

    }


}