package i0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x[] f12265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f12266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b> f12267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f12269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12271h;

    public z(int i10, x[] xVarArr, d0 d0Var, List<b> list, boolean z10, int i11) {
        this.f12264a = i10;
        this.f12265b = xVarArr;
        this.f12266c = d0Var;
        this.f12267d = list;
        this.f12268e = z10;
        this.f12269f = i11;
        int iMax = 0;
        for (x xVar : xVarArr) {
            iMax = Math.max(iMax, xVar.i());
        }
        this.f12270g = iMax;
        this.f12271h = ge.o.d(iMax + this.f12269f, 0);
    }

    public final int a() {
        return this.f12264a;
    }

    public final x[] b() {
        return this.f12265b;
    }

    public final int c() {
        return this.f12270g;
    }

    public final int d() {
        return this.f12271h;
    }

    public final boolean e() {
        return this.f12265b.length == 0;
    }

    public final x[] f(int i10, int i11, int i12) {
        x[] xVarArr = this.f12265b;
        int length = xVarArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            x xVar = xVarArr[i13];
            int i16 = i14 + 1;
            int iD = b.d(this.f12267d.get(i14).g());
            int i17 = this.f12266c.a()[i15];
            boolean z10 = this.f12268e;
            xVar.q(i10, i17, i11, i12, z10 ? this.f12264a : i15, z10 ? i15 : this.f12264a);
            md.i0 i0Var = md.i0.f15558a;
            i15 += iD;
            i13++;
            i14 = i16;
        }
        return this.f12265b;
    }
}
