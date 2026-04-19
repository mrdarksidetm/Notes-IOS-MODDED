package wc;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface g {
    void dispose();

    View getView();

    @SuppressLint({"NewApi"})
    default void onFlutterViewAttached(View view) {
    }

    @SuppressLint({"NewApi"})
    default void onFlutterViewDetached() {
    }

    @SuppressLint({"NewApi"})
    default void onInputConnectionLocked() {
    }

    @SuppressLint({"NewApi"})
    default void onInputConnectionUnlocked() {
    }
}
