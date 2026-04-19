package androidx.compose.ui.draw;

import a2.d0;
import a2.r0;
import ae.r;
import k1.l;
import l1.k0;
import y1.f;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends r0<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1.c f2643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1.b f2645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f2646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f2647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k0 f2648g;

    public PainterElement(o1.c cVar, boolean z10, f1.b bVar, f fVar, float f10, k0 k0Var) {
        this.f2643b = cVar;
        this.f2644c = z10;
        this.f2645d = bVar;
        this.f2646e = fVar;
        this.f2647f = f10;
        this.f2648g = k0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return r.b(this.f2643b, painterElement.f2643b) && this.f2644c == painterElement.f2644c && r.b(this.f2645d, painterElement.f2645d) && r.b(this.f2646e, painterElement.f2646e) && Float.compare(this.f2647f, painterElement.f2647f) == 0 && r.b(this.f2648g, painterElement.f2648g);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e a() {
        return new e(this.f2643b, this.f2644c, this.f2645d, this.f2646e, this.f2647f, this.f2648g);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = ((((((((this.f2643b.hashCode() * 31) + Boolean.hashCode(this.f2644c)) * 31) + this.f2645d.hashCode()) * 31) + this.f2646e.hashCode()) * 31) + Float.hashCode(this.f2647f)) * 31;
        k0 k0Var = this.f2648g;
        return iHashCode + (k0Var == null ? 0 : k0Var.hashCode());
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(e eVar) {
        boolean zC2 = eVar.c2();
        boolean z10 = this.f2644c;
        boolean z11 = zC2 != z10 || (z10 && !l.f(eVar.b2().k(), this.f2643b.k()));
        eVar.k2(this.f2643b);
        eVar.l2(this.f2644c);
        eVar.h2(this.f2645d);
        eVar.j2(this.f2646e);
        eVar.b(this.f2647f);
        eVar.i2(this.f2648g);
        if (z11) {
            d0.b(eVar);
        }
        a2.r.a(eVar);
    }

    public String toString() {
        return "PainterElement(painter=" + this.f2643b + ", sizeToIntrinsics=" + this.f2644c + ", alignment=" + this.f2645d + ", contentScale=" + this.f2646e + ", alpha=" + this.f2647f + ", colorFilter=" + this.f2648g + ')';
    }
}
