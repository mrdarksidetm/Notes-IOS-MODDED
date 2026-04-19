package j6;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.lifecycle.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f13974b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f13975c = new a();

    public static final class a implements o4.e {
        a() {
        }

        @Override // o4.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g getLifecycle() {
            return g.f13974b;
        }
    }

    private g() {
    }

    @Override // androidx.lifecycle.g
    public void a(o4.d dVar) {
        if (!(dVar instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((dVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) dVar;
        a aVar = f13975c;
        defaultLifecycleObserver.onCreate(aVar);
        defaultLifecycleObserver.onStart(aVar);
        defaultLifecycleObserver.onResume(aVar);
    }

    @Override // androidx.lifecycle.g
    public g.b b() {
        return g.b.RESUMED;
    }

    @Override // androidx.lifecycle.g
    public void c(o4.d dVar) {
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
