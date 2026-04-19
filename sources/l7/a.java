package l7;

import ae.r;
import java.io.ByteArrayInputStream;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14773a = new a();

    private a() {
    }

    private final int a(byte[] bArr) {
        return new androidx.exifinterface.media.a(new ByteArrayInputStream(bArr)).n();
    }

    public final int b(File file) {
        r.f(file, "file");
        try {
            return new androidx.exifinterface.media.a(file.getAbsolutePath()).n();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int c(byte[] bArr) {
        r.f(bArr, "_bytes");
        try {
            return a(bArr);
        } catch (Exception unused) {
            return 0;
        }
    }
}
