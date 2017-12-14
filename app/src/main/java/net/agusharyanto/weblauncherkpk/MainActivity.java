package net.agusharyanto.weblauncherkpk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webView);

        myWebView.setWebViewClient(new WebViewClient());
        // myWebView.setWebChromeClient(new WebChromeClient());

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String surl="http://www.mandirisekuritas.co.id";


        myWebView.loadUrl(surl);
    }
}
