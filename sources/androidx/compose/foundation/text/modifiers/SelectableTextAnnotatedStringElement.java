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
import n0.g;
import n2.t;
import u2.q;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class SelectableTextAnnotatedStringElement extends r0<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f2599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f2600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.b f2601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l<d0, i0> f2602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f2604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f2606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<d.b<u>> f2607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l<List<h>, i0> f2608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n0.h f2609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m0 f2610m;

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(d dVar, g0 g0Var, t.b bVar, l<? super d0, i0> lVar, int i10, boolean z10, int i11, int i12, List<d.b<u>> list, l<? super List<h>, i0> lVar2, n0.h hVar, m0 m0Var) {
        this.f2599b = dVar;
        this.f2600c = g0Var;
        this.f2601d = bVar;
        this.f2602e = lVar;
        this.f2603f = i10;
        this.f2604g = z10;
        this.f2605h = i11;
        this.f2606i = i12;
        this.f2607j = list;
        this.f2608k = lVar2;
        this.f2609l = hVar;
        this.f2610m = m0Var;
    }

    public /* synthetic */ SelectableTextAnnotatedStringElement(d dVar, g0 g0Var, t.b bVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, n0.h hVar, m0 m0Var, j jVar) {
        this(dVar, g0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, m0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return r.b(this.f2610m, selectableTextAnnotatedStringElement.f2610m) && r.b(this.f2599b, selectableTextAnnotatedStringElement.f2599b) && r.b(this.f2600c, selectableTextAnnotatedStringElement.f2600c) && r.b(this.f2607j, selectableTextAnnotatedStringElement.f2607j) && r.b(this.f2601d, selectableTextAnnotatedStringElement.f2601d) && r.b(this.f2602e, selectableTextAnnotatedStringElement.f2602e) && q.e(this.f2603f, selectableTextAnnotatedStringElement.f2603f) && this.f2604g == selectableTextAnnotatedStringElement.f2604g && this.f2605h == selectableTextAnnotatedStringElement.f2605h && this.f2606i == selectableTextAnnotatedStringElement.f2606i && r.b(this.f2608k, selectableTextAnnotatedStringElement.f2608k) && r.b(this.f2609l, selectableTextAnnotatedStringElement.f2609l);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public g a() {
        return new g(this.f2599b, this.f2600c, this.f2601d, this.f2602e, this.f2603f, this.f2604g, this.f2605h, this.f2606i, this.f2607j, this.f2608k, this.f2609l, this.f2610m, null);
    }

    @Override // a2.r0
    public int hashCode() {
        int iHashCode = ((((this.f2599b.hashCode() * 31) + this.f2600c.hashCode()) * 31) + this.f2601d.hashCode()) * 31;
        l<d0, i0> lVar = this.f2602e;
        int iHashCode2 = (((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + q.f(this.f2603f)) * 31) + Boolean.hashCode(this.f2604g)) * 31) + this.f2605h) * 31) + this.f2606i) * 31;
        List<d.b<u>> list = this.f2607j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<List<h>, i0> lVar2 = this.f2608k;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        n0.h hVar = this.f2609l;
        int iHashCode5 = (iHashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        m0 m0Var = this.f2610m;
        return iHashCode5 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(g gVar) {
        gVar.f2(this.f2599b, this.f2600c, this.f2607j, this.f2606i, this.f2605h, this.f2604g, this.f2601d, this.f2603f, this.f2602e, this.f2608k, this.f2609l, this.f2610m);
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f2599b) + ", style=" + this.f2600c + ", fontFamilyResolver=" + this.f2601d + ", onTextLayout=" + this.f2602e + ", overflow=" + ((Object) q.g(this.f2603f)) + ", softWrap=" + this.f2604g + ", maxLines=" + this.f2605h + ", minLines=" + this.f2606i + ", placeholders=" + this.f2607j + ", onPlaceholderLayout=" + this.f2608k + ", selectionController=" + this.f2609l + ", color=" + this.f2610m + ')';
    }
}
