package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewVariable = findViewById<WebView>(R.id.webView)
        webViewSetup(webViewVariable)

    }

    private fun webViewSetup(webView: WebView){

        webView.webViewClient = WebViewClient()

        webView.apply{
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled =true
            loadUrl("https://www.youtube.com/")
        }
    }
}