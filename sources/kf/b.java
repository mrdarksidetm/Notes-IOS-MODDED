package kf;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14477b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f14477b = bArr;
    }

    public b(byte[] bArr) {
        this(null, bArr);
    }

    @Override // kf.a
    public InputStream b() {
        return new ByteArrayInputStream(this.f14477b);
    }
}
