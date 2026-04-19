package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z1 extends d1<md.g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f869b;

    private z1(short[] sArr) {
        ae.r.f(sArr, "bufferWithData");
        this.f868a = sArr;
        this.f869b = md.g0.u(sArr);
        b(10);
    }

    public /* synthetic */ z1(short[] sArr, ae.j jVar) {
        this(sArr);
    }

    @Override // af.d1
    public /* bridge */ /* synthetic */ md.g0 a() {
        return md.g0.a(f());
    }

    @Override // af.d1
    public void b(int i10) {
        if (md.g0.u(this.f868a) < i10) {
            short[] sArr = this.f868a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, ge.o.d(i10, md.g0.u(sArr) * 2));
            ae.r.e(sArrCopyOf, "copyOf(this, newSize)");
            this.f868a = md.g0.f(sArrCopyOf);
        }
    }

    @Override // af.d1
    public int d() {
        return this.f869b;
    }

    public final void e(short s10) {
        d1.c(this, 0, 1, null);
        short[] sArr = this.f868a;
        int iD = d();
        this.f869b = iD + 1;
        md.g0.y(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f868a, d());
        ae.r.e(sArrCopyOf, "copyOf(this, newSize)");
        return md.g0.f(sArrCopyOf);
    }
}
