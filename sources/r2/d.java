package r2;

import android.graphics.Typeface;
import i2.a0;
import i2.d;
import i2.g0;
import java.util.ArrayList;
import java.util.List;
import n2.c1;
import n2.e0;
import n2.f0;
import n2.i0;
import n2.t;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f19149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d.b<a0>> f19150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<d.b<i2.u>> f19151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t.b f19152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w2.d f19153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g f19154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CharSequence f19155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j2.i f19156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t f19157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19159l;

    static final class a extends ae.s implements zd.r<n2.t, i0, e0, f0, Typeface> {
        a() {
            super(4);
        }

        public final Typeface a(n2.t tVar, i0 i0Var, int i10, int i11) {
            p3<Object> p3VarA = d.this.g().a(tVar, i0Var, i10, i11);
            if (p3VarA instanceof c1.b) {
                Object value = p3VarA.getValue();
                ae.r.d(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            t tVar2 = new t(p3VarA, d.this.f19157j);
            d.this.f19157j = tVar2;
            return tVar2.a();
        }

        @Override // zd.r
        public /* bridge */ /* synthetic */ Typeface invoke(n2.t tVar, i0 i0Var, e0 e0Var, f0 f0Var) {
            return a(tVar, i0Var, e0Var.i(), f0Var.j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Collection, java.util.List, java.util.List<i2.d$b<i2.a0>>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public d(String str, g0 g0Var, List<d.b<a0>> list, List<d.b<i2.u>> list2, t.b bVar, w2.d dVar) {
        this.f19148a = str;
        this.f19149b = g0Var;
        this.f19150c = list;
        this.f19151d = list2;
        this.f19152e = bVar;
        this.f19153f = dVar;
        g gVar = new g(1, dVar.getDensity());
        this.f19154g = gVar;
        this.f19158k = !e.c(g0Var) ? false : n.f19171a.a().getValue().booleanValue();
        this.f19159l = e.d(g0Var.D(), g0Var.w());
        a aVar = new a();
        s2.e.e(gVar, g0Var.G());
        a0 a0VarA = s2.e.a(gVar, g0Var.O(), aVar, dVar, !list.isEmpty());
        if (a0VarA != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            int i10 = 0;
            while (i10 < size) {
                list.add(i10 == 0 ? new d.b<>(a0VarA, 0, this.f19148a.length()) : this.f19150c.get(i10 - 1));
                i10++;
            }
        }
        CharSequence charSequenceA = c.a(this.f19148a, this.f19154g.getTextSize(), this.f19149b, list, this.f19151d, this.f19153f, aVar, this.f19158k);
        this.f19155h = charSequenceA;
        this.f19156i = new j2.i(charSequenceA, this.f19154g, this.f19159l);
    }

    @Override // i2.p
    public float a() {
        return this.f19156i.b();
    }

    @Override // i2.p
    public boolean b() {
        t tVar = this.f19157j;
        return (tVar != null ? tVar.b() : false) || (!this.f19158k && e.c(this.f19149b) && n.f19171a.a().getValue().booleanValue());
    }

    @Override // i2.p
    public float c() {
        return this.f19156i.c();
    }

    public final CharSequence f() {
        return this.f19155h;
    }

    public final t.b g() {
        return this.f19152e;
    }

    public final j2.i h() {
        return this.f19156i;
    }

    public final g0 i() {
        return this.f19149b;
    }

    public final int j() {
        return this.f19159l;
    }

    public final g k() {
        return this.f19154g;
    }
}
