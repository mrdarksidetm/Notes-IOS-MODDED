package h0;

import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k1 f11694c;

    public m0(s sVar, String str) {
        this.f11693b = str;
        this.f11694c = k3.e(sVar, null, 2, null);
    }

    @Override // h0.o0
    public int a(w2.d dVar, w2.r rVar) {
        return e().b();
    }

    @Override // h0.o0
    public int b(w2.d dVar) {
        return e().a();
    }

    @Override // h0.o0
    public int c(w2.d dVar, w2.r rVar) {
        return e().c();
    }

    @Override // h0.o0
    public int d(w2.d dVar) {
        return e().d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s e() {
        return (s) this.f11694c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            return ae.r.b(e(), ((m0) obj).e());
        }
        return false;
    }

    public final void f(s sVar) {
        this.f11694c.setValue(sVar);
    }

    public int hashCode() {
        return this.f11693b.hashCode();
    }

    public String toString() {
        return this.f11693b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
