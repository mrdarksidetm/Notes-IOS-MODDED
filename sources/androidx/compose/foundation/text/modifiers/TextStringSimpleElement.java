package androidx.compose.foundation.text.modifiers;

import a2.r0;
import ae.j;
import ae.r;
import i2.g0;
import l1.m0;
import n0.l;
import n2.t;
import u2.q;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends r0<l> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f2624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.b f2625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f2628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m0 f2630i;

    private TextStringSimpleElement(String str, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, m0 m0Var) {
        this.f2623b = str;
        this.f2624c = g0Var;
        this.f2625d = bVar;
        this.f2626e = i10;
        this.f2627f = z10;
        this.f2628g = i11;
        this.f2629h = i12;
        this.f2630i = m0Var;
    }

    public /* synthetic */ TextStringSimpleElement(String str, g0 g0Var, t.b bVar, int i10, boolean z10, int i11, int i12, m0 m0Var, j jVar) {
        this(str, g0Var, bVar, i10, z10, i11, i12, m0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return r.b(this.f2630i, textStringSimpleElement.f2630i) && r.b(this.f2623b, textStringSimpleElement.f2623b) && r.b(this.f2624c, textStringSimpleElement.f2624c) && r.b(this.f2625d, textStringSimpleElement.f2625d) && q.e(this.f2626e, textStringSimpleElement.f2626e) && this.f2627f == textStringSimpleElement.f2627f && this.f2628g == textStringSimpleElement.f2628g && this.f2629h == textStringSimpleElement.f2629h;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public l a() {
        return new l(this.f2623b, this.f2624c, this.f2625d, this.f2626e, this.f2627f, this.f2628g, this.f2629h, this.f2630i, null);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = ((((((((((((this.f2623b.hashCode() * 31) + this.f2624c.hashCode()) * 31) + this.f2625d.hashCode()) * 31) + q.f(this.f2626e)) * 31) + Boolean.hashCode(this.f2627f)) * 31) + this.f2628g) * 31) + this.f2629h) * 31;
        m0 m0Var = this.f2630i;
        return iHashCode + (m0Var != null ? m0Var.hashCode() : 0);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(l lVar) {
        lVar.h2(lVar.n2(this.f2630i, this.f2624c), lVar.p2(this.f2623b), lVar.o2(this.f2624c, this.f2629h, this.f2628g, this.f2627f, this.f2625d, this.f2626e));
    }
}
