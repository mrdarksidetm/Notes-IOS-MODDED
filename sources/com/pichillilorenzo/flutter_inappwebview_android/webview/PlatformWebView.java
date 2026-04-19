package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.HashMap;
import wc.g;

/* JADX INFO: loaded from: classes2.dex */
public interface PlatformWebView extends g {
    @Override // wc.g
    /* synthetic */ void dispose();

    @Override // wc.g
    /* synthetic */ View getView();

    void makeInitialLoad(HashMap<String, Object> map);

    @Override // wc.g
    @SuppressLint({"NewApi"})
    /* bridge */ /* synthetic */ default void onFlutterViewAttached(View view) {
        super.onFlutterViewAttached(view);
    }

    @Override // wc.g
    @SuppressLint({"NewApi"})
    /* bridge */ /* synthetic */ default void onFlutterViewDetached() {
        super.onFlutterViewDetached();
    }

    @Override // wc.g
    @SuppressLint({"NewApi"})
    /* bridge */ /* synthetic */ default void onInputConnectionLocked() {
        super.onInputConnectionLocked();
    }

    @Override // wc.g
    @SuppressLint({"NewApi"})
    /* bridge */ /* synthetic */ default void onInputConnectionUnlocked() {
        super.onInputConnectionUnlocked();
    }
}
