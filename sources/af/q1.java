package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 extends d1<md.z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f813b;

    private q1(byte[] bArr) {
        ae.r.f(bArr, "bufferWithData");
        this.f812a = bArr;
        this.f813b = md.z.u(bArr);
        b(10);
    }

    public /* synthetic */ q1(byte[] bArr, ae.j jVar) {
        this(bArr);
    }

    @Override // af.d1
    public /* bridge */ /* synthetic */ md.z a() {
        return md.z.a(f());
    }

    @Override // af.d1
    public void b(int i10) {
        if (md.z.u(this.f812a) < i10) {
            byte[] bArr = this.f812a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, ge.o.d(i10, md.z.u(bArr) * 2));
            ae.r.e(bArrCopyOf, "copyOf(this, newSize)");
            this.f812a = md.z.f(bArrCopyOf);
        }
    }

    @Override // af.d1
    public int d() {
        return this.f813b;
    }

    public final void e(byte b10) {
        d1.c(this, 0, 1, null);
        byte[] bArr = this.f812a;
        int iD = d();
        this.f813b = iD + 1;
        md.z.y(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f812a, d());
        ae.r.e(bArrCopyOf, "copyOf(this, newSize)");
        return md.z.f(bArrCopyOf);
    }
}
