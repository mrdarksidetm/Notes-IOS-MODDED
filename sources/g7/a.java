package g7;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final <T> T a(zd.a<? extends T> aVar, T t10) {
        r.f(aVar, "code");
        try {
            return aVar.invoke();
        } catch (Exception unused) {
            return t10;
        }
    }
}
