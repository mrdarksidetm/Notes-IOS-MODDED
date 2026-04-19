package t0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class n3 implements e1.b, Iterable<e1.b>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2 f20876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0 f20877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Iterable<Object> f20879d = nd.u.m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Iterable<e1.b> f20880e = this;

    public n3(s2 s2Var, q0 q0Var) {
        this.f20876a = s2Var;
        this.f20877b = q0Var;
        this.f20878c = Integer.valueOf(q0Var.d());
    }

    @Override // java.lang.Iterable
    public Iterator<e1.b> iterator() {
        return new m3(this.f20876a, this.f20877b);
    }
}
