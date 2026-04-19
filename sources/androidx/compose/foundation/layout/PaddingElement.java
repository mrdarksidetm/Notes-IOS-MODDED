package androidx.compose.foundation.layout;

import a2.r0;
import b2.w0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends r0<n> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f2447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zd.l<w0, i0> f2452g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private PaddingElement(float r1, float r2, float r3, float r4, boolean r5, zd.l<? super b2.w0, md.i0> r6) {
        /*
            r0 = this;
            r0.<init>()
            r0.f2447b = r1
            r0.f2448c = r2
            r0.f2449d = r3
            r0.f2450e = r4
            r0.f2451f = r5
            r0.f2452g = r6
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L20
            w2.h$a r3 = w2.h.f22405b
            float r3 = r3.c()
            boolean r1 = w2.h.o(r1, r3)
            if (r1 == 0) goto L57
        L20:
            float r1 = r0.f2448c
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L32
            w2.h$a r3 = w2.h.f22405b
            float r3 = r3.c()
            boolean r1 = w2.h.o(r1, r3)
            if (r1 == 0) goto L57
        L32:
            float r1 = r0.f2449d
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L44
            w2.h$a r3 = w2.h.f22405b
            float r3 = r3.c()
            boolean r1 = w2.h.o(r1, r3)
            if (r1 == 0) goto L57
        L44:
            float r1 = r0.f2450e
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L59
            w2.h$a r2 = w2.h.f22405b
            float r2 = r2.c()
            boolean r1 = w2.h.o(r1, r2)
            if (r1 == 0) goto L57
            goto L59
        L57:
            r1 = 0
            goto L5a
        L59:
            r1 = 1
        L5a:
            if (r1 == 0) goto L5d
            return
        L5d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Padding must be non-negative"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.PaddingElement.<init>(float, float, float, float, boolean, zd.l):void");
    }

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, zd.l lVar, ae.j jVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && w2.h.o(this.f2447b, paddingElement.f2447b) && w2.h.o(this.f2448c, paddingElement.f2448c) && w2.h.o(this.f2449d, paddingElement.f2449d) && w2.h.o(this.f2450e, paddingElement.f2450e) && this.f2451f == paddingElement.f2451f;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n a() {
        return new n(this.f2447b, this.f2448c, this.f2449d, this.f2450e, this.f2451f, null);
    }

    @Override // a2.r0
    public int hashCode() {
        return (((((((w2.h.p(this.f2447b) * 31) + w2.h.p(this.f2448c)) * 31) + w2.h.p(this.f2449d)) * 31) + w2.h.p(this.f2450e)) * 31) + Boolean.hashCode(this.f2451f);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(n nVar) {
        nVar.g2(this.f2447b);
        nVar.h2(this.f2448c);
        nVar.e2(this.f2449d);
        nVar.d2(this.f2450e);
        nVar.f2(this.f2451f);
    }
}
