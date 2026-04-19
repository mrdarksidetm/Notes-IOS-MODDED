package a3;

import ae.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f402e;

    public e() {
        this(false, false, null, false, false, 31, null);
    }

    public e(boolean z10, boolean z11, g gVar) {
        this(z10, z11, gVar, true, true);
    }

    public /* synthetic */ e(boolean z10, boolean z11, g gVar, int i10, j jVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? g.Inherit : gVar);
    }

    public e(boolean z10, boolean z11, g gVar, boolean z12, boolean z13) {
        this.f398a = z10;
        this.f399b = z11;
        this.f400c = gVar;
        this.f401d = z12;
        this.f402e = z13;
    }

    public /* synthetic */ e(boolean z10, boolean z11, g gVar, boolean z12, boolean z13, int i10, j jVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? g.Inherit : gVar, (i10 & 8) != 0 ? true : z12, (i10 & 16) != 0 ? true : z13);
    }

    public final boolean a() {
        return this.f402e;
    }

    public final boolean b() {
        return this.f398a;
    }

    public final boolean c() {
        return this.f399b;
    }

    public final g d() {
        return this.f400c;
    }

    public final boolean e() {
        return this.f401d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f398a == eVar.f398a && this.f399b == eVar.f399b && this.f400c == eVar.f400c && this.f401d == eVar.f401d && this.f402e == eVar.f402e;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f398a) * 31) + Boolean.hashCode(this.f399b)) * 31) + this.f400c.hashCode()) * 31) + Boolean.hashCode(this.f401d)) * 31) + Boolean.hashCode(this.f402e);
    }
}
