package h0;

import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k1 f11592d = k3.e(androidx.core.graphics.a.f3307e, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k1 f11593e = k3.e(Boolean.TRUE, null, 2, null);

    public a(int i10, String str) {
        this.f11590b = i10;
        this.f11591c = str;
    }

    private final void g(boolean z10) {
        this.f11593e.setValue(Boolean.valueOf(z10));
    }

    @Override // h0.o0
    public int a(w2.d dVar, w2.r rVar) {
        return e().f3308a;
    }

    @Override // h0.o0
    public int b(w2.d dVar) {
        return e().f3311d;
    }

    @Override // h0.o0
    public int c(w2.d dVar, w2.r rVar) {
        return e().f3310c;
    }

    @Override // h0.o0
    public int d(w2.d dVar) {
        return e().f3309b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.core.graphics.a e() {
        return (androidx.core.graphics.a) this.f11592d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f11590b == ((a) obj).f11590b;
    }

    public final void f(androidx.core.graphics.a aVar) {
        this.f11592d.setValue(aVar);
    }

    public final void h(androidx.core.view.o oVar, int i10) {
        if (i10 == 0 || (i10 & this.f11590b) != 0) {
            f(oVar.f(this.f11590b));
            g(oVar.p(this.f11590b));
        }
    }

    public int hashCode() {
        return this.f11590b;
    }

    public String toString() {
        return this.f11591c + '(' + e().f3308a + ", " + e().f3309b + ", " + e().f3310c + ", " + e().f3311d + ')';
    }
}
