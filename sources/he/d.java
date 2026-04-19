package he;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(c<T> cVar, Object obj) {
        r.f(cVar, "<this>");
        if (cVar.c(obj)) {
            r.d(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + cVar.a());
    }
}
