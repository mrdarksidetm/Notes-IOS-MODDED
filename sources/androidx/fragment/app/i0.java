package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class i0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f4106b = new StringBuilder(128);

    i0(String str) {
        this.f4105a = str;
    }

    private void a() {
        if (this.f4106b.length() > 0) {
            Log.d(this.f4105a, this.f4106b.toString());
            StringBuilder sb2 = this.f4106b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f4106b.append(c10);
            }
        }
    }
}
