package t6;

import java.util.Date;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Random f21268a = new Random(new Date().getTime());

    public static void a(byte[] bArr) {
        if (bArr != null) {
            f21268a.nextBytes(bArr);
        }
    }
}
