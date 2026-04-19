package i2;

import i2.d;
import java.util.List;
import n2.s;
import n2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f12319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d.b<u>> f12320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f12323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w2.d f12324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w2.r f12325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t.b f12326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f12327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s.b f12328k;

    private c0(d dVar, g0 g0Var, List<d.b<u>> list, int i10, boolean z10, int i11, w2.d dVar2, w2.r rVar, s.b bVar, t.b bVar2, long j10) {
        this.f12318a = dVar;
        this.f12319b = g0Var;
        this.f12320c = list;
        this.f12321d = i10;
        this.f12322e = z10;
        this.f12323f = i11;
        this.f12324g = dVar2;
        this.f12325h = rVar;
        this.f12326i = bVar2;
        this.f12327j = j10;
        this.f12328k = bVar;
    }

    private c0(d dVar, g0 g0Var, List<d.b<u>> list, int i10, boolean z10, int i11, w2.d dVar2, w2.r rVar, t.b bVar, long j10) {
        this(dVar, g0Var, list, i10, z10, i11, dVar2, rVar, (s.b) null, bVar, j10);
    }

    public /* synthetic */ c0(d dVar, g0 g0Var, List list, int i10, boolean z10, int i11, w2.d dVar2, w2.r rVar, t.b bVar, long j10, ae.j jVar) {
        this(dVar, g0Var, list, i10, z10, i11, dVar2, rVar, bVar, j10);
    }

    public final long a() {
        return this.f12327j;
    }

    public final w2.d b() {
        return this.f12324g;
    }

    public final t.b c() {
        return this.f12326i;
    }

    public final w2.r d() {
        return this.f12325h;
    }

    public final int e() {
        return this.f12321d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return ae.r.b(this.f12318a, c0Var.f12318a) && ae.r.b(this.f12319b, c0Var.f12319b) && ae.r.b(this.f12320c, c0Var.f12320c) && this.f12321d == c0Var.f12321d && this.f12322e == c0Var.f12322e && u2.q.e(this.f12323f, c0Var.f12323f) && ae.r.b(this.f12324g, c0Var.f12324g) && this.f12325h == c0Var.f12325h && ae.r.b(this.f12326i, c0Var.f12326i) && w2.b.g(this.f12327j, c0Var.f12327j);
    }

    public final int f() {
        return this.f12323f;
    }

    public final List<d.b<u>> g() {
        return this.f12320c;
    }

    public final boolean h() {
        return this.f12322e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f12318a.hashCode() * 31) + this.f12319b.hashCode()) * 31) + this.f12320c.hashCode()) * 31) + this.f12321d) * 31) + Boolean.hashCode(this.f12322e)) * 31) + u2.q.f(this.f12323f)) * 31) + this.f12324g.hashCode()) * 31) + this.f12325h.hashCode()) * 31) + this.f12326i.hashCode()) * 31) + w2.b.q(this.f12327j);
    }

    public final g0 i() {
        return this.f12319b;
    }

    public final d j() {
        return this.f12318a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f12318a) + ", style=" + this.f12319b + ", placeholders=" + this.f12320c + ", maxLines=" + this.f12321d + ", softWrap=" + this.f12322e + ", overflow=" + ((Object) u2.q.g(this.f12323f)) + ", density=" + this.f12324g + ", layoutDirection=" + this.f12325h + ", fontFamilyResolver=" + this.f12326i + ", constraints=" + ((Object) w2.b.s(this.f12327j)) + ')';
    }
}
