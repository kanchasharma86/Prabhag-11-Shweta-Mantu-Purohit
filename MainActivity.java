
package com.prabhag11.app;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    WebView w = new WebView(this);
    w.getSettings().setJavaScriptEnabled(true);
    w.setWebViewClient(new WebViewClient());
    w.loadUrl("file:///android_asset/index.html");
    setContentView(w);
  }
}
