package l1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j0> f14550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Float> f14551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f14552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f14553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14554e;

    private k1(List<j0> list, List<Float> list2, long j10, float f10, int i10) {
        this.f14550a = list;
        this.f14551b = list2;
        this.f14552c = j10;
        this.f14553d = f10;
        this.f14554e = i10;
    }

    public /* synthetic */ k1(List list, List list2, long j10, float f10, int i10, ae.j jVar) {
        this(list, list2, j10, f10, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // l1.q1
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Shader mo129createShaderuvyYCjk(long r12) {
        /*
            r11 = this;
            long r0 = r11.f14552c
            boolean r0 = k1.g.d(r0)
            r1 = 1
            r2 = 0
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r0 == 0) goto L19
            long r4 = k1.m.b(r12)
            float r0 = k1.f.o(r4)
        L14:
            float r4 = k1.f.p(r4)
            goto L4a
        L19:
            long r4 = r11.f14552c
            float r0 = k1.f.o(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L2d
            float r0 = k1.l.i(r12)
            goto L33
        L2d:
            long r4 = r11.f14552c
            float r0 = k1.f.o(r4)
        L33:
            long r4 = r11.f14552c
            float r4 = k1.f.p(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L3f
            r4 = r1
            goto L40
        L3f:
            r4 = r2
        L40:
            if (r4 == 0) goto L47
            float r4 = k1.l.g(r12)
            goto L4a
        L47:
            long r4 = r11.f14552c
            goto L14
        L4a:
            java.util.List<l1.j0> r8 = r11.f14550a
            java.util.List<java.lang.Float> r9 = r11.f14551b
            long r5 = k1.g.a(r0, r4)
            float r0 = r11.f14553d
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            if (r1 == 0) goto L65
            float r12 = k1.l.h(r12)
            r13 = 2
            float r13 = (float) r13
            float r12 = r12 / r13
            r7 = r12
            goto L66
        L65:
            r7 = r0
        L66:
            int r10 = r11.f14554e
            android.graphics.Shader r12 = l1.r1.b(r5, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.k1.mo129createShaderuvyYCjk(long):android.graphics.Shader");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (ae.r.b(this.f14550a, k1Var.f14550a) && ae.r.b(this.f14551b, k1Var.f14551b) && k1.f.l(this.f14552c, k1Var.f14552c)) {
            return ((this.f14553d > k1Var.f14553d ? 1 : (this.f14553d == k1Var.f14553d ? 0 : -1)) == 0) && x1.f(this.f14554e, k1Var.f14554e);
        }
        return false;
    }

    @Override // l1.z
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo291getIntrinsicSizeNHjbRc() {
        float f10 = this.f14553d;
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            return k1.l.f14359b.a();
        }
        float f11 = this.f14553d;
        float f12 = 2;
        return k1.m.a(f11 * f12, f11 * f12);
    }

    public int hashCode() {
        int iHashCode = this.f14550a.hashCode() * 31;
        List<Float> list = this.f14551b;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + k1.f.q(this.f14552c)) * 31) + Float.hashCode(this.f14553d)) * 31) + x1.g(this.f14554e);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (k1.g.c(this.f14552c)) {
            str = "center=" + ((Object) k1.f.v(this.f14552c)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f14553d;
        if ((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true) {
            str2 = "radius=" + this.f14553d + ", ";
        }
        return "RadialGradient(colors=" + this.f14550a + ", stops=" + this.f14551b + ", " + str + str2 + "tileMode=" + ((Object) x1.h(this.f14554e)) + ')';
    }
}
