package y1;

import java.util.Map;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements g0, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2.r f23286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ n f23287b;

    public static final class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<y1.a, Integer> f23290c;

        a(int i10, int i11, Map<y1.a, Integer> map) {
            this.f23288a = i10;
            this.f23289b = i11;
            this.f23290c = map;
        }

        @Override // y1.f0
        public void a() {
        }

        @Override // y1.f0
        public Map<y1.a, Integer> d() {
            return this.f23290c;
        }

        @Override // y1.f0
        public int getHeight() {
            return this.f23289b;
        }

        @Override // y1.f0
        public int getWidth() {
            return this.f23288a;
        }
    }

    public q(n nVar, w2.r rVar) {
        this.f23286a = rVar;
        this.f23287b = nVar;
    }

    @Override // y1.n
    public boolean C0() {
        return this.f23287b.C0();
    }

    @Override // w2.d
    public float G0(float f10) {
        return this.f23287b.G0(f10);
    }

    @Override // y1.g0
    public f0 J0(int i10, int i11, Map<y1.a, Integer> map, zd.l<? super t0.a, md.i0> lVar) {
        boolean z10 = false;
        int iD = ge.o.d(i10, 0);
        int iD2 = ge.o.d(i11, 0);
        if ((iD & (-16777216)) == 0 && ((-16777216) & iD2) == 0) {
            z10 = true;
        }
        if (z10) {
            return new a(iD, iD2, map);
        }
        throw new IllegalStateException(("Size(" + iD + " x " + iD2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // w2.d
    public long N(long j10) {
        return this.f23287b.N(j10);
    }

    @Override // w2.l
    public float Q(long j10) {
        return this.f23287b.Q(j10);
    }

    @Override // w2.d
    public int a1(float f10) {
        return this.f23287b.a1(f10);
    }

    @Override // w2.l
    public long g(float f10) {
        return this.f23287b.g(f10);
    }

    @Override // w2.d
    public float getDensity() {
        return this.f23287b.getDensity();
    }

    @Override // y1.n
    public w2.r getLayoutDirection() {
        return this.f23286a;
    }

    @Override // w2.d
    public float l0(int i10) {
        return this.f23287b.l0(i10);
    }

    @Override // w2.d
    public float n0(float f10) {
        return this.f23287b.n0(f10);
    }

    @Override // w2.d
    public float o1(long j10) {
        return this.f23287b.o1(j10);
    }

    @Override // w2.d
    public long q(float f10) {
        return this.f23287b.q(f10);
    }

    @Override // w2.d
    public long w(long j10) {
        return this.f23287b.w(j10);
    }

    @Override // w2.l
    public float y0() {
        return this.f23287b.y0();
    }
}
