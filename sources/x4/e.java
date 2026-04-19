package x4;

import ae.j;
import ae.r;
import android.os.Bundle;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22970d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f22971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f22972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22973c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final e a(f fVar) {
            r.f(fVar, "owner");
            return new e(fVar, null);
        }
    }

    private e(f fVar) {
        this.f22971a = fVar;
        this.f22972b = new d();
    }

    public /* synthetic */ e(f fVar, j jVar) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f22970d.a(fVar);
    }

    public final d b() {
        return this.f22972b;
    }

    public final void c() {
        androidx.lifecycle.g lifecycle = this.f22971a.getLifecycle();
        if (!(lifecycle.b() == g.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new b(this.f22971a));
        this.f22972b.e(lifecycle);
        this.f22973c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f22973c) {
            c();
        }
        androidx.lifecycle.g lifecycle = this.f22971a.getLifecycle();
        if (!lifecycle.b().b(g.b.STARTED)) {
            this.f22972b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        r.f(bundle, "outBundle");
        this.f22972b.g(bundle);
    }
}
