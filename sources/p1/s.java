package p1;

import java.util.List;
import l1.h1;
import l1.v1;
import l1.w1;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
public final class s extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<h> f18062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f18064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f18065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z f18066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f18067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f18068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f18069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f18070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f18071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f18072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f18073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f18074n;

    /* JADX WARN: Multi-variable type inference failed */
    private s(String str, List<? extends h> list, int i10, z zVar, float f10, z zVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.f18061a = str;
        this.f18062b = list;
        this.f18063c = i10;
        this.f18064d = zVar;
        this.f18065e = f10;
        this.f18066f = zVar2;
        this.f18067g = f11;
        this.f18068h = f12;
        this.f18069i = i11;
        this.f18070j = i12;
        this.f18071k = f13;
        this.f18072l = f14;
        this.f18073m = f15;
        this.f18074n = f16;
    }

    public /* synthetic */ s(String str, List list, int i10, z zVar, float f10, z zVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, ae.j jVar) {
        this(str, list, i10, zVar, f10, zVar2, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final z a() {
        return this.f18064d;
    }

    public final float d() {
        return this.f18065e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (!ae.r.b(this.f18061a, sVar.f18061a) || !ae.r.b(this.f18064d, sVar.f18064d)) {
            return false;
        }
        if (!(this.f18065e == sVar.f18065e) || !ae.r.b(this.f18066f, sVar.f18066f)) {
            return false;
        }
        if (!(this.f18067g == sVar.f18067g)) {
            return false;
        }
        if (!(this.f18068h == sVar.f18068h) || !v1.e(this.f18069i, sVar.f18069i) || !w1.e(this.f18070j, sVar.f18070j)) {
            return false;
        }
        if (!(this.f18071k == sVar.f18071k)) {
            return false;
        }
        if (!(this.f18072l == sVar.f18072l)) {
            return false;
        }
        if (this.f18073m == sVar.f18073m) {
            return ((this.f18074n > sVar.f18074n ? 1 : (this.f18074n == sVar.f18074n ? 0 : -1)) == 0) && h1.d(this.f18063c, sVar.f18063c) && ae.r.b(this.f18062b, sVar.f18062b);
        }
        return false;
    }

    public final String f() {
        return this.f18061a;
    }

    public int hashCode() {
        int iHashCode = ((this.f18061a.hashCode() * 31) + this.f18062b.hashCode()) * 31;
        z zVar = this.f18064d;
        int iHashCode2 = (((iHashCode + (zVar != null ? zVar.hashCode() : 0)) * 31) + Float.hashCode(this.f18065e)) * 31;
        z zVar2 = this.f18066f;
        return ((((((((((((((((((iHashCode2 + (zVar2 != null ? zVar2.hashCode() : 0)) * 31) + Float.hashCode(this.f18067g)) * 31) + Float.hashCode(this.f18068h)) * 31) + v1.f(this.f18069i)) * 31) + w1.f(this.f18070j)) * 31) + Float.hashCode(this.f18071k)) * 31) + Float.hashCode(this.f18072l)) * 31) + Float.hashCode(this.f18073m)) * 31) + Float.hashCode(this.f18074n)) * 31) + h1.e(this.f18063c);
    }

    public final List<h> l() {
        return this.f18062b;
    }

    public final int n() {
        return this.f18063c;
    }

    public final z o() {
        return this.f18066f;
    }

    public final float r() {
        return this.f18067g;
    }

    public final int s() {
        return this.f18069i;
    }

    public final int t() {
        return this.f18070j;
    }

    public final float u() {
        return this.f18071k;
    }

    public final float v() {
        return this.f18068h;
    }

    public final float w() {
        return this.f18073m;
    }

    public final float x() {
        return this.f18074n;
    }

    public final float y() {
        return this.f18072l;
    }
}
