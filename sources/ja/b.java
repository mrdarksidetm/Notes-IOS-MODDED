package ja;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f14155a = 0;

    b() {
    }

    long a() {
        return this.f14155a;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f14155a++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f14155a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f14155a += (long) i11;
    }
}
