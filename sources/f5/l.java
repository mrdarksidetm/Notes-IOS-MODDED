package f5;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f11141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f11143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11144d;

    public l(String str, m[] mVarArr) {
        this.f11142b = str;
        this.f11143c = null;
        this.f11141a = mVarArr;
        this.f11144d = 0;
    }

    public l(byte[] bArr, m[] mVarArr) {
        Objects.requireNonNull(bArr);
        this.f11143c = bArr;
        this.f11142b = null;
        this.f11141a = mVarArr;
        this.f11144d = 1;
    }

    private void a(int i10) {
        if (i10 == this.f11144d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + f(this.f11144d) + " expected, but got " + f(i10));
    }

    private String f(int i10) {
        return i10 != 0 ? i10 != 1 ? "Unknown" : "ArrayBuffer" : "String";
    }

    public byte[] b() {
        a(1);
        Objects.requireNonNull(this.f11143c);
        return this.f11143c;
    }

    public String c() {
        a(0);
        return this.f11142b;
    }

    public m[] d() {
        return this.f11141a;
    }

    public int e() {
        return this.f11144d;
    }
}
