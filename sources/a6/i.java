package a6;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f613b = 1073741824;

    public i(InputStream inputStream) {
        this.f612a = inputStream;
    }

    private final int a(int i10) {
        if (i10 == -1) {
            this.f613b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f613b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f612a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.f612a.read());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return a(this.f612a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return a(this.f612a.read(bArr, i10, i11));
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f612a.skip(j10);
    }
}
