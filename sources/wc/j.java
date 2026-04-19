package wc;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public interface j {
    void a(int i10, int i11);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    void release();

    default void scheduleFrame() {
    }
}
