package qe;

import le.f1;
import le.m2;
import le.w0;

/* JADX INFO: loaded from: classes2.dex */
final class y extends m2 implements w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f19112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19113d;

    public y(Throwable th, String str) {
        this.f19112c = th;
        this.f19113d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void n0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f19112c
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f19113d
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f19112c
            r1.<init>(r0, r2)
            throw r1
        L36:
            qe.x.d()
            md.i r0 = new md.i
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.y.n0():java.lang.Void");
    }

    @Override // le.j0
    public boolean i0(qd.g gVar) {
        n0();
        throw new md.i();
    }

    @Override // le.m2, le.j0
    public le.j0 j0(int i10) {
        n0();
        throw new md.i();
    }

    @Override // le.m2
    public m2 k0() {
        return this;
    }

    @Override // le.w0
    public f1 l(long j10, Runnable runnable, qd.g gVar) {
        n0();
        throw new md.i();
    }

    @Override // le.j0
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Void g0(qd.g gVar, Runnable runnable) {
        n0();
        throw new md.i();
    }

    @Override // le.w0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public Void Y(long j10, le.o<? super md.i0> oVar) {
        n0();
        throw new md.i();
    }

    @Override // le.m2, le.j0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dispatchers.Main[missing");
        if (this.f19112c != null) {
            str = ", cause=" + this.f19112c;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }
}
