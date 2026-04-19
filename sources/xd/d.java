package xd;

import ae.r;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class d extends ByteArrayOutputStream {
    public d(int i10) {
        super(i10);
    }

    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        r.e(bArr, "buf");
        return bArr;
    }
}
