package ee;

import ae.j;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10965a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f10966b = ud.b.f21763a.b();

    public static final class a extends c implements Serializable {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        @Override // ee.c
        public int b(int i10) {
            return c.f10966b.b(i10);
        }

        @Override // ee.c
        public int c() {
            return c.f10966b.c();
        }

        @Override // ee.c
        public int d(int i10) {
            return c.f10966b.d(i10);
        }

        @Override // ee.c
        public long e() {
            return c.f10966b.e();
        }

        @Override // ee.c
        public long f(long j10, long j11) {
            return c.f10966b.f(j10, j11);
        }
    }

    public abstract int b(int i10);

    public abstract int c();

    public abstract int d(int i10);

    public abstract long e();

    public long f(long j10, long j11) {
        long jE;
        boolean z10;
        long jE2;
        long j12;
        long jB;
        int iC;
        d.b(j10, j11);
        long j13 = j11 - j10;
        if (j13 <= 0) {
            do {
                jE = e();
                z10 = false;
                if (j10 <= jE && jE < j11) {
                    z10 = true;
                }
            } while (!z10);
            return jE;
        }
        if (((-j13) & j13) == j13) {
            int i10 = (int) j13;
            int i11 = (int) (j13 >>> 32);
            if (i10 != 0) {
                iC = b(d.c(i10));
            } else if (i11 == 1) {
                iC = c();
            } else {
                jB = (((long) b(d.c(i11))) << 32) + (((long) c()) & 4294967295L);
            }
            jB = ((long) iC) & 4294967295L;
        } else {
            do {
                jE2 = e() >>> 1;
                j12 = jE2 % j13;
            } while ((jE2 - j12) + (j13 - 1) < 0);
            jB = j12;
        }
        return j10 + jB;
    }
}
