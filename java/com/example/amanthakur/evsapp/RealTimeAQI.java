package com.example.amanthakur.evsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class RealTimeAQI extends AppCompatActivity {
WebView webView;
    String vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_time_aqi);
        webView=(WebView) findViewById(R.id.webAQI);
        WebSettings webSettings=webView.getSettings();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setGeolocationEnabled(true);
        webView.getSettings().setDisplayZoomControls(true);
     vv  =getIntent().getExtras().getString("Postion");
       // Toast.makeText(getApplicationContext(),vv,Toast.LENGTH_SHORT).show();

        switch (vv)
        {
            case "0":
                // Makes Progress bar Visible

                getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

               // webview = (WebView) findViewById(R.id.webview);

                webView.setWebChromeClient(new WebChromeClient() {
                    public void onProgressChanged(WebView view, int progress)
                    {
                        //Make the bar disappear after URL is loaded, and changes string to Loading...
                        setTitle("Loading...");
                        setProgress(progress * 100); //Make the bar disappear after URL is loaded

                        // Return the app name after finish loading
                        if(progress == 100)
                            setTitle(R.string.app_name);
                    }
                });
                webView.loadUrl("http://aqicn.org/map/india/");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "1":
                getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

                // webview = (WebView) findViewById(R.id.webview);

                webView.setWebChromeClient(new WebChromeClient() {
                    public void onProgressChanged(WebView view, int progress)
                    {
                        //Make the bar disappear after URL is loaded, and changes string to Loading...
                        setTitle("Loading...");
                        setProgress(progress * 100); //Make the bar disappear after URL is loaded

                        // Return the app name after finish loading
                        if(progress == 100)
                            setTitle(R.string.app_name);
                    }
                });
                webView.loadUrl("http://www.delhi.gov.in/wps/wcm/connect/DOIT_DJB_new/djb/home/");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "2":
            getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

            // webview = (WebView) findViewById(R.id.webview);

            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView view, int progress)
                {
                    //Make the bar disappear after URL is loaded, and changes string to Loading...
                    setTitle("Loading...");
                    setProgress(progress * 100); //Make the bar disappear after URL is loaded

                    // Return the app name after finish loading
                    if(progress == 100)
                        setTitle(R.string.app_name);
                }
            });
            webView.loadUrl("https://link.springer.com/article/10.1007%2Fs13201-011-0011-4");
            webView.setWebViewClient(new WebViewClient());
            break;
            case "3":
                getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

                // webview = (WebView) findViewById(R.id.webview);

                webView.setWebChromeClient(new WebChromeClient() {
                    public void onProgressChanged(WebView view, int progress)
                    {
                        //Make the bar disappear after URL is loaded, and changes string to Loading...
                        setTitle("Loading...");
                        setProgress(progress * 100); //Make the bar disappear after URL is loaded

                        // Return the app name after finish loading
                        if(progress == 100)
                            setTitle(R.string.app_name);
                    }
                });
                webView.loadUrl("http://www.biodiversitya-z.org/");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "4":
                getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

                // webview = (WebView) findViewById(R.id.webview);

                webView.setWebChromeClient(new WebChromeClient() {
                    public void onProgressChanged(WebView view, int progress)
                    {
                        //Make the bar disappear after URL is loaded, and changes string to Loading...
                        setTitle("Loading...");
                        setProgress(progress * 100); //Make the bar disappear after URL is loaded

                        // Return the app name after finish loading
                        if(progress == 100)
                            setTitle(R.string.app_name);
                    }
                });
                webView.loadUrl("https://www.bp.com/en/global/corporate/energy-economics/statistical-review-of-world-energy.html");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "5":
                getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

                // webview = (WebView) findViewById(R.id.webview);

                webView.setWebChromeClient(new WebChromeClient() {
                    public void onProgressChanged(WebView view, int progress)
                    {
                        //Make the bar disappear after URL is loaded, and changes string to Loading...
                        setTitle("Loading...");
                        setProgress(progress * 100); //Make the bar disappear after URL is loaded

                        // Return the app name after finish loading
                        if(progress == 100)
                            setTitle(R.string.app_name);
                    }
                });
                webView.loadUrl("https://en.wikipedia.org/wiki/List_of_environmental_dates");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "6":
                getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

                // webview = (WebView) findViewById(R.id.webview);

                webView.setWebChromeClient(new WebChromeClient() {
                    public void onProgressChanged(WebView view, int progress)
                    {
                        //Make the bar disappear after URL is loaded, and changes string to Loading...
                        setTitle("Loading...");
                        setProgress(progress * 100); //Make the bar disappear after URL is loaded

                        // Return the app name after finish loading
                        if(progress == 100)
                            setTitle(R.string.app_name);
                    }
                });
                webView.loadUrl("https://epi.envirocenter.yale.edu/2018/report/category/hlt");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "7":
                getWindow().setFeatureInt( Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);

                // webview = (WebView) findViewById(R.id.webview);

                webView.setWebChromeClient(new WebChromeClient() {
                    public void onProgressChanged(WebView view, int progress)
                    {
                        //Make the bar disappear after URL is loaded, and changes string to Loading...
                        setTitle("Loading...");
                        setProgress(progress * 100); //Make the bar disappear after URL is loaded

                        // Return the app name after finish loading
                        if(progress == 100)
                            setTitle(R.string.app_name);
                    }
                });
                webView.loadUrl("https://www.fluencecorp.com/");
                webView.setWebViewClient(new WebViewClient());
                break;
        }

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webView.canGoBack()) {
                        webView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }

        return super.onKeyDown(keyCode, event);
    }
}
