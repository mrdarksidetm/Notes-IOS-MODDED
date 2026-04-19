package ae;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final <T> Iterator<T> a(T[] tArr) {
        r.f(tArr, "array");
        return new b(tArr);
    }
}
