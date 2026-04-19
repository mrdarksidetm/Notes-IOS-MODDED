package hf;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {
    public static final byte[] a(String str) {
        ae.r.f(str, "<this>");
        byte[] bytes = str.getBytes(je.d.f14191b);
        ae.r.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        ae.r.f(bArr, "<this>");
        return new String(bArr, je.d.f14191b);
    }
}
