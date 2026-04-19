package j6;

import android.graphics.Bitmap;
import le.j0;
import n6.c;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.lifecycle.g f13956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k6.j f13957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k6.h f13958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f13959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0 f13960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j0 f13961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j0 f13962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c.a f13963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k6.e f13964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Bitmap.Config f13965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Boolean f13966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Boolean f13967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f13968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f13969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f13970o;

    public d(androidx.lifecycle.g gVar, k6.j jVar, k6.h hVar, j0 j0Var, j0 j0Var2, j0 j0Var3, j0 j0Var4, c.a aVar, k6.e eVar, Bitmap.Config config, Boolean bool, Boolean bool2, b bVar, b bVar2, b bVar3) {
        this.f13956a = gVar;
        this.f13957b = jVar;
        this.f13958c = hVar;
        this.f13959d = j0Var;
        this.f13960e = j0Var2;
        this.f13961f = j0Var3;
        this.f13962g = j0Var4;
        this.f13963h = aVar;
        this.f13964i = eVar;
        this.f13965j = config;
        this.f13966k = bool;
        this.f13967l = bool2;
        this.f13968m = bVar;
        this.f13969n = bVar2;
        this.f13970o = bVar3;
    }

    public final Boolean a() {
        return this.f13966k;
    }

    public final Boolean b() {
        return this.f13967l;
    }

    public final Bitmap.Config c() {
        return this.f13965j;
    }

    public final j0 d() {
        return this.f13961f;
    }

    public final b e() {
        return this.f13969n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (ae.r.b(this.f13956a, dVar.f13956a) && ae.r.b(this.f13957b, dVar.f13957b) && this.f13958c == dVar.f13958c && ae.r.b(this.f13959d, dVar.f13959d) && ae.r.b(this.f13960e, dVar.f13960e) && ae.r.b(this.f13961f, dVar.f13961f) && ae.r.b(this.f13962g, dVar.f13962g) && ae.r.b(this.f13963h, dVar.f13963h) && this.f13964i == dVar.f13964i && this.f13965j == dVar.f13965j && ae.r.b(this.f13966k, dVar.f13966k) && ae.r.b(this.f13967l, dVar.f13967l) && this.f13968m == dVar.f13968m && this.f13969n == dVar.f13969n && this.f13970o == dVar.f13970o) {
                return true;
            }
        }
        return false;
    }

    public final j0 f() {
        return this.f13960e;
    }

    public final j0 g() {
        return this.f13959d;
    }

    public final androidx.lifecycle.g h() {
        return this.f13956a;
    }

    public int hashCode() {
        androidx.lifecycle.g gVar = this.f13956a;
        int iHashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        k6.j jVar = this.f13957b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        k6.h hVar = this.f13958c;
        int iHashCode3 = (iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        j0 j0Var = this.f13959d;
        int iHashCode4 = (iHashCode3 + (j0Var != null ? j0Var.hashCode() : 0)) * 31;
        j0 j0Var2 = this.f13960e;
        int iHashCode5 = (iHashCode4 + (j0Var2 != null ? j0Var2.hashCode() : 0)) * 31;
        j0 j0Var3 = this.f13961f;
        int iHashCode6 = (iHashCode5 + (j0Var3 != null ? j0Var3.hashCode() : 0)) * 31;
        j0 j0Var4 = this.f13962g;
        int iHashCode7 = (iHashCode6 + (j0Var4 != null ? j0Var4.hashCode() : 0)) * 31;
        c.a aVar = this.f13963h;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        k6.e eVar = this.f13964i;
        int iHashCode9 = (iHashCode8 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f13965j;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f13966k;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f13967l;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        b bVar = this.f13968m;
        int iHashCode13 = (iHashCode12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f13969n;
        int iHashCode14 = (iHashCode13 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b bVar3 = this.f13970o;
        return iHashCode14 + (bVar3 != null ? bVar3.hashCode() : 0);
    }

    public final b i() {
        return this.f13968m;
    }

    public final b j() {
        return this.f13970o;
    }

    public final k6.e k() {
        return this.f13964i;
    }

    public final k6.h l() {
        return this.f13958c;
    }

    public final k6.j m() {
        return this.f13957b;
    }

    public final j0 n() {
        return this.f13962g;
    }

    public final c.a o() {
        return this.f13963h;
    }
}
