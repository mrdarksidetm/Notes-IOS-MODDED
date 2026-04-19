package o2;

import ae.j;
import ae.r;
import java.util.List;
import n2.c0;
import n2.e0;
import n2.h0;
import n2.i0;
import o2.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends n2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c.a f16280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i0 f16281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f16283i;

    private d(String str, c.a aVar, i0 i0Var, int i10, boolean z10) {
        super(c0.f15768a.a(), f.f16284a, new h0.d(new h0.a[0]), null);
        this.f16279e = str;
        this.f16280f = aVar;
        this.f16281g = i0Var;
        this.f16282h = i10;
        this.f16283i = z10;
    }

    public /* synthetic */ d(String str, c.a aVar, i0 i0Var, int i10, boolean z10, j jVar) {
        this(str, aVar, i0Var, i10, z10);
    }

    private final String f() {
        return this.f16283i ? com.amazon.a.a.o.b.f7427af : com.amazon.a.a.o.b.ag;
    }

    private final int h(int i10) {
        return e0.f(i10, e0.f15784b.a()) ? 1 : 0;
    }

    @Override // n2.s
    public i0 b() {
        return this.f16281g;
    }

    @Override // n2.s
    public int c() {
        return this.f16282h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return r.b(this.f16279e, dVar.f16279e) && r.b(this.f16280f, dVar.f16280f) && r.b(b(), dVar.b()) && e0.f(c(), dVar.c()) && this.f16283i == dVar.f16283i;
    }

    public final l3.e g() {
        String str = "name=" + this.f16279e + "&weight=" + b().t() + "&italic=" + h(c()) + "&besteffort=" + f();
        List<List<byte[]>> listA = this.f16280f.a();
        return listA != null ? new l3.e(this.f16280f.c(), this.f16280f.d(), str, listA) : new l3.e(this.f16280f.c(), this.f16280f.d(), str, this.f16280f.b());
    }

    public int hashCode() {
        return (((((((this.f16279e.hashCode() * 31) + this.f16280f.hashCode()) * 31) + b().hashCode()) * 31) + e0.g(c())) * 31) + Boolean.hashCode(this.f16283i);
    }

    public final int i() {
        boolean zF = e0.f(c(), e0.f15784b.a());
        boolean z10 = b().compareTo(i0.f15808b.b()) >= 0;
        if (zF && z10) {
            return 3;
        }
        if (zF) {
            return 2;
        }
        return z10 ? 1 : 0;
    }

    public String toString() {
        return "Font(GoogleFont(\"" + this.f16279e + "\", bestEffort=" + this.f16283i + "), weight=" + b() + ", style=" + ((Object) e0.h(c())) + ')';
    }
}
