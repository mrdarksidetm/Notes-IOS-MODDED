package o6;

import android.content.Context;
import b6.a;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f16404a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b6.a f16405b;

    private s() {
    }

    public final synchronized b6.a a(Context context) {
        b6.a aVarA;
        aVarA = f16405b;
        if (aVarA == null) {
            aVarA = new a.C0129a().c(xd.k.k(j.n(context), "image_cache")).a();
            f16405b = aVarA;
        }
        return aVarA;
    }
}
