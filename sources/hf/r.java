package hf;

import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f12020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        ae.r.f(randomAccessFile, "randomAccessFile");
        this.f12020e = randomAccessFile;
    }

    @Override // hf.h
    protected synchronized int A(long j10, byte[] bArr, int i10, int i11) {
        ae.r.f(bArr, "array");
        this.f12020e.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f12020e.read(bArr, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // hf.h
    protected synchronized long C() {
        return this.f12020e.length();
    }

    @Override // hf.h
    protected synchronized void y() {
        this.f12020e.close();
    }
}
