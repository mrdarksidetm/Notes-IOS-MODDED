package androidx.compose.foundation.text.modifiers;

import a2.r0;
import ae.j;
import ae.r;
import i2.d;
import i2.d0;
import i2.g0;
import i2.u;
import java.util.List;
import k1.h;
import l1.m0;
import md.i0;
import n0.k;
import n2.t;
import u2.q;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends r0<k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f2611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f2612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.b f2613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l<d0, i0> f2614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f2618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<d.b<u>> f2619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l<List<h>, i0> f2620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n0.h f2621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m0 f2622m;

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(d dVar, g0 g0Var, t.b bVar, l<? super d0, i0> lVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list, l<? super List<h>, i0> lVar2, n0.h hVar, m0 m0Var) {
        this.f2611b = dVar;
        this.f2612c = g0Var;
        this.f2613d = bVar;
        this.f2614e = lVar;
        this.f2615f = i10;
        this.f2616g = z10;
        this.f2617h = i11;
        this.f2618i = i12;
        this.f2619j = list;
        this.f2620k = lVar2;
        this.f2621l = hVar;
        this.f2622m = m0Var;
    }

    public /* synthetic */ TextAnnotatedStringElement(d dVar, g0 g0Var, t.b bVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, n0.h hVar, m0 m0Var, j jVar) {
        this(dVar, g0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, m0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return r.b(this.f2622m, textAnnotatedStringElement.f2622m) && r.b(this.f2611b, textAnnotatedStringElement.f2611b) && r.b(this.f2612c, textAnnotatedStringElement.f2612c) && r.b(this.f2619j, textAnnotatedStringElement.f2619j) && r.b(this.f2613d, textAnnotatedStringElement.f2613d) && r.b(this.f2614e, textAnnotatedStringElement.f2614e) && q.e(this.f2615f, textAnnotatedStringElement.f2615f) && this.f2616g == textAnnotatedStringElement.f2616g && this.f2617h == textAnnotatedStringElement.f2617h && this.f2618i == textAnnotatedStringElement.f2618i && r.b(this.f2620k, textAnnotatedStringElement.f2620k) && r.b(this.f2621l, textAnnotatedStringElement.f2621l);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k a() {
        return new k(this.f2611b, this.f2612c, this.f2613d, this.f2614e, this.f2615f, this.f2616g, this.f2617h, this.f2618i, this.f2619j, this.f2620k, this.f2621l, this.f2622m, null);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = ((((this.f2611b.hashCode() * 31) + this.f2612c.hashCode()) * 31) + this.f2613d.hashCode()) * 31;
        l<d0, i0> lVar = this.f2614e;
        int iHashCode2 = (((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + q.f(this.f2615f)) * 31) + Boolean.hashCode(this.f2616g)) * 31) + this.f2617h) * 31) + this.f2618i) * 31;
        List<d.b<u>> list = this.f2619j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<List<h>, i0> lVar2 = this.f2620k;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        n0.h hVar = this.f2621l;
        int iHashCode5 = (iHashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        m0 m0Var = this.f2622m;
        return iHashCode5 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) {
        kVar.h2(kVar.u2(this.f2622m, this.f2612c), kVar.w2(this.f2611b), kVar.v2(this.f2612c, this.f2619j, this.f2618i, this.f2617h, this.f2616g, this.f2613d, this.f2615f), kVar.t2(this.f2614e, this.f2620k, this.f2621l));
    }
}
