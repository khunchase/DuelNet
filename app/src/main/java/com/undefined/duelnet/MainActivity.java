package com.undefined.duelnet;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.duelnet);
        myWebView.loadUrl("https://www.duel.so");
    }
}

FirebaseInstanceId.getInstance().getInstanceId()
        .addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
@Override
public void onComplete(@NonNull Task<InstanceIdResult> task) {
        if (!task.isSuccessful()) {
        Log.w(TAG, "getInstanceId failed", task.getException());
        return;
        }

        // Get new Instance ID token
        String token = task.getResult().getToken();

        // Log and toast
        String msg = getString(R.string.msg_token_fmt, token);
        Log.d(TAG, msg);
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
        }
        });