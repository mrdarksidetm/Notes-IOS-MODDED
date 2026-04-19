package f1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h<T> {

    /* JADX INFO: Access modifiers changed from: private */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f11079a;

        public final T a() {
            return this.f11079a;
        }
    }

    public static <T> AtomicReference<a<T>> a() {
        return b(new AtomicReference(null));
    }

    private static <T> AtomicReference<a<T>> b(AtomicReference<a<T>> atomicReference) {
        return atomicReference;
    }

    public static final T c(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }
}
