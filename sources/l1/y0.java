package l1;

import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j0> f14647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Float> f14648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f14649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14651e;

    private y0(List<j0> list, List<Float> list2, long j10, long j11, int i10) {
        this.f14647a = list;
        this.f14648b = list2;
        this.f14649c = j10;
        this.f14650d = j11;
        this.f14651e = i10;
    }

    public /* synthetic */ y0(List list, List list2, long j10, long j11, int i10, ae.j jVar) {
        this(list, list2, j10, j11, i10);
    }

    @Override // l1.q1
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo129createShaderuvyYCjk(long j10) {
        return r1.a(k1.g.a((k1.f.o(this.f14649c) > Float.POSITIVE_INFINITY ? 1 : (k1.f.o(this.f14649c) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? k1.l.i(j10) : k1.f.o(this.f14649c), (k1.f.p(this.f14649c) > Float.POSITIVE_INFINITY ? 1 : (k1.f.p(this.f14649c) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? k1.l.g(j10) : k1.f.p(this.f14649c)), k1.g.a((k1.f.o(this.f14650d) > Float.POSITIVE_INFINITY ? 1 : (k1.f.o(this.f14650d) == Float.POSITIVE_INFINITY ? 0 : -1)) == 0 ? k1.l.i(j10) : k1.f.o(this.f14650d), k1.f.p(this.f14650d) == Float.POSITIVE_INFINITY ? k1.l.g(j10) : k1.f.p(this.f14650d)), this.f14647a, this.f14648b, this.f14651e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return ae.r.b(this.f14647a, y0Var.f14647a) && ae.r.b(this.f14648b, y0Var.f14648b) && k1.f.l(this.f14649c, y0Var.f14649c) && k1.f.l(this.f14650d, y0Var.f14650d) && x1.f(this.f14651e, y0Var.f14651e);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // l1.z
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo291getIntrinsicSizeNHjbRc() {
        /*
            r6 = this;
            long r0 = r6.f14649c
            float r0 = k1.f.o(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L44
            long r4 = r6.f14650d
            float r0 = k1.f.o(r4)
            boolean r4 = java.lang.Float.isInfinite(r0)
            if (r4 != 0) goto L2f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2f
            r0 = r2
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L44
            long r4 = r6.f14649c
            float r0 = k1.f.o(r4)
            long r4 = r6.f14650d
            float r4 = k1.f.o(r4)
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            goto L45
        L44:
            r0 = r1
        L45:
            long r4 = r6.f14649c
            float r4 = k1.f.p(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L59
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L59
            r4 = r2
            goto L5a
        L59:
            r4 = r3
        L5a:
            if (r4 == 0) goto L83
            long r4 = r6.f14650d
            float r4 = k1.f.p(r4)
            boolean r5 = java.lang.Float.isInfinite(r4)
            if (r5 != 0) goto L6f
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L6f
            goto L70
        L6f:
            r2 = r3
        L70:
            if (r2 == 0) goto L83
            long r1 = r6.f14649c
            float r1 = k1.f.p(r1)
            long r2 = r6.f14650d
            float r2 = k1.f.p(r2)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
        L83:
            long r0 = k1.m.a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.y0.mo291getIntrinsicSizeNHjbRc():long");
    }

    public int hashCode() {
        int iHashCode = this.f14647a.hashCode() * 31;
        List<Float> list = this.f14648b;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + k1.f.q(this.f14649c)) * 31) + k1.f.q(this.f14650d)) * 31) + x1.g(this.f14651e);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (k1.g.b(this.f14649c)) {
            str = "start=" + ((Object) k1.f.v(this.f14649c)) + ", ";
        } else {
            str = "";
        }
        if (k1.g.b(this.f14650d)) {
            str2 = "end=" + ((Object) k1.f.v(this.f14650d)) + ", ";
        }
        return "LinearGradient(colors=" + this.f14647a + ", stops=" + this.f14648b + ", " + str + str2 + "tileMode=" + ((Object) x1.h(this.f14651e)) + ')';
    }
}
