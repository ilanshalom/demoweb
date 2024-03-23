package com.example.mfpledon.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val myWebView1: WebView = findViewById(R.id.webView1)
        myWebView1.settings.javaScriptEnabled = true
        myWebView1.loadUrl("http://www.mfpledon.com.br/pizza2.html")

        val myWebView2: WebView = findViewById(R.id.webView2)
        myWebView2.settings.javaScriptEnabled = true
        myWebView2.loadUrl("http://www.mfpledon.com.br/covid.php")
        */
        try {
            val myWebView1: WebView = findViewById(R.id.webView1)
            myWebView1.settings.javaScriptEnabled = true
            myWebView1.webViewClient = WebViewClient()
            myWebView1.loadUrl("http://www.mfpledon.com.br/pizza2.html")

            val myWebView2: WebView = findViewById(R.id.webView2)
            myWebView2.settings.javaScriptEnabled = true
            myWebView2.webViewClient = WebViewClient()
            myWebView2.loadUrl("http://www.mfpledon.com.br/covid.php")
        }
        catch (erro: Exception) {
            val textView2 = findViewById<TextView>(R.id.textView2)
            val textView3 = findViewById<TextView>(R.id.textView3)
            textView2.text = erro.message
            textView3.text = erro.message
        }
    }
}

