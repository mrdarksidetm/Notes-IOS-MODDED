package androidx.compose.foundation;

import a2.r0;
import ae.r;
import l1.t1;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends r0<d0.h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f2191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t1 f2192d;

    private BorderModifierNodeElement(float f10, z zVar, t1 t1Var) {
        this.f2190b = f10;
        this.f2191c = zVar;
        this.f2192d = t1Var;
    }

    public /* synthetic */ BorderModifierNodeElement(float f10, z zVar, t1 t1Var, ae.j jVar) {
        this(f10, zVar, t1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return w2.h.o(this.f2190b, borderModifierNodeElement.f2190b) && r.b(this.f2191c, borderModifierNodeElement.f2191c) && r.b(this.f2192d, borderModifierNodeElement.f2192d);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d0.h a() {
        return new d0.h(this.f2190b, this.f2191c, this.f2192d, null);
    }

    @Override // a2.r0
    public int hashCode() {
        return (((w2.h.p(this.f2190b) * 31) + this.f2191c.hashCode()) * 31) + this.f2192d.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(d0.h hVar) {
        hVar.n2(this.f2190b);
        hVar.m2(this.f2191c);
        hVar.d1(this.f2192d);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) w2.h.q(this.f2190b)) + ", brush=" + this.f2191c + ", shape=" + this.f2192d + ')';
    }
}
