package j6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import le.d1;
import le.j0;
import n6.c;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f13941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f13942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0 f13943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f13944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c.a f13945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k6.e f13946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bitmap.Config f13947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f13948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f13949i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Drawable f13950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f13951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Drawable f13952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f13953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f13954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f13955o;

    public c() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public c(j0 j0Var, j0 j0Var2, j0 j0Var3, j0 j0Var4, c.a aVar, k6.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3) {
        this.f13941a = j0Var;
        this.f13942b = j0Var2;
        this.f13943c = j0Var3;
        this.f13944d = j0Var4;
        this.f13945e = aVar;
        this.f13946f = eVar;
        this.f13947g = config;
        this.f13948h = z10;
        this.f13949i = z11;
        this.f13950j = drawable;
        this.f13951k = drawable2;
        this.f13952l = drawable3;
        this.f13953m = bVar;
        this.f13954n = bVar2;
        this.f13955o = bVar3;
    }

    public /* synthetic */ c(j0 j0Var, j0 j0Var2, j0 j0Var3, j0 j0Var4, c.a aVar, k6.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? d1.c().m0() : j0Var, (i10 & 2) != 0 ? d1.b() : j0Var2, (i10 & 4) != 0 ? d1.b() : j0Var3, (i10 & 8) != 0 ? d1.b() : j0Var4, (i10 & 16) != 0 ? c.a.f15932b : aVar, (i10 & 32) != 0 ? k6.e.AUTOMATIC : eVar, (i10 & 64) != 0 ? o6.j.f() : config, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & 1024) != 0 ? null : drawable2, (i10 & 2048) == 0 ? drawable3 : null, (i10 & 4096) != 0 ? b.ENABLED : bVar, (i10 & 8192) != 0 ? b.ENABLED : bVar2, (i10 & 16384) != 0 ? b.ENABLED : bVar3);
    }

    public final c a(j0 j0Var, j0 j0Var2, j0 j0Var3, j0 j0Var4, c.a aVar, k6.e eVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3) {
        return new c(j0Var, j0Var2, j0Var3, j0Var4, aVar, eVar, config, z10, z11, drawable, drawable2, drawable3, bVar, bVar2, bVar3);
    }

    public final boolean c() {
        return this.f13948h;
    }

    public final boolean d() {
        return this.f13949i;
    }

    public final Bitmap.Config e() {
        return this.f13947g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (ae.r.b(this.f13941a, cVar.f13941a) && ae.r.b(this.f13942b, cVar.f13942b) && ae.r.b(this.f13943c, cVar.f13943c) && ae.r.b(this.f13944d, cVar.f13944d) && ae.r.b(this.f13945e, cVar.f13945e) && this.f13946f == cVar.f13946f && this.f13947g == cVar.f13947g && this.f13948h == cVar.f13948h && this.f13949i == cVar.f13949i && ae.r.b(this.f13950j, cVar.f13950j) && ae.r.b(this.f13951k, cVar.f13951k) && ae.r.b(this.f13952l, cVar.f13952l) && this.f13953m == cVar.f13953m && this.f13954n == cVar.f13954n && this.f13955o == cVar.f13955o) {
                return true;
            }
        }
        return false;
    }

    public final j0 f() {
        return this.f13943c;
    }

    public final b g() {
        return this.f13954n;
    }

    public final Drawable h() {
        return this.f13951k;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f13941a.hashCode() * 31) + this.f13942b.hashCode()) * 31) + this.f13943c.hashCode()) * 31) + this.f13944d.hashCode()) * 31) + this.f13945e.hashCode()) * 31) + this.f13946f.hashCode()) * 31) + this.f13947g.hashCode()) * 31) + Boolean.hashCode(this.f13948h)) * 31) + Boolean.hashCode(this.f13949i)) * 31;
        Drawable drawable = this.f13950j;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f13951k;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f13952l;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f13953m.hashCode()) * 31) + this.f13954n.hashCode()) * 31) + this.f13955o.hashCode();
    }

    public final Drawable i() {
        return this.f13952l;
    }

    public final j0 j() {
        return this.f13942b;
    }

    public final j0 k() {
        return this.f13941a;
    }

    public final b l() {
        return this.f13953m;
    }

    public final b m() {
        return this.f13955o;
    }

    public final Drawable n() {
        return this.f13950j;
    }

    public final k6.e o() {
        return this.f13946f;
    }

    public final j0 p() {
        return this.f13944d;
    }

    public final c.a q() {
        return this.f13945e;
    }
}
