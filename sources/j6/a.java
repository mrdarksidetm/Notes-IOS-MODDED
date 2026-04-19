package j6;

import le.a2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.lifecycle.g f13932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a2 f13933b;

    public a(androidx.lifecycle.g gVar, a2 a2Var) {
        this.f13932a = gVar;
        this.f13933b = a2Var;
    }

    public void a() {
        a2.a.b(this.f13933b, null, 1, null);
    }

    @Override // j6.o
    public void o() {
        this.f13932a.c(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(o4.e eVar) {
        a();
    }

    @Override // j6.o
    public void start() {
        this.f13932a.a(this);
    }
}
