package n6;

import ae.j;
import android.graphics.drawable.Drawable;
import j6.f;
import j6.i;
import j6.q;
import k6.h;
import n6.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f15923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f15924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15926d;

    /* JADX INFO: renamed from: n6.a$a, reason: collision with other inner class name */
    public static final class C0360a implements c.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f15927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f15928d;

        public C0360a() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public C0360a(int i10, boolean z10) {
            this.f15927c = i10;
            this.f15928d = z10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public /* synthetic */ C0360a(int i10, boolean z10, int i11, j jVar) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }

        @Override // n6.c.a
        public c a(d dVar, i iVar) {
            return ((iVar instanceof q) && ((q) iVar).c() != a6.d.MEMORY_CACHE) ? new a(dVar, iVar, this.f15927c, this.f15928d) : c.a.f15932b.a(dVar, iVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0360a) {
                C0360a c0360a = (C0360a) obj;
                if (this.f15927c == c0360a.f15927c && this.f15928d == c0360a.f15928d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f15927c * 31) + Boolean.hashCode(this.f15928d);
        }
    }

    public a(d dVar, i iVar, int i10, boolean z10) {
        this.f15923a = dVar;
        this.f15924b = iVar;
        this.f15925c = i10;
        this.f15926d = z10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    @Override // n6.c
    public void a() {
        Drawable drawableD = this.f15923a.d();
        Drawable drawableA = this.f15924b.a();
        h hVarJ = this.f15924b.b().J();
        int i10 = this.f15925c;
        i iVar = this.f15924b;
        c6.b bVar = new c6.b(drawableD, drawableA, hVarJ, i10, ((iVar instanceof q) && ((q) iVar).d()) ? false : true, this.f15926d);
        i iVar2 = this.f15924b;
        if (iVar2 instanceof q) {
            this.f15923a.a(bVar);
        } else if (iVar2 instanceof f) {
            this.f15923a.b(bVar);
        }
    }

    public final int b() {
        return this.f15925c;
    }

    public final boolean c() {
        return this.f15926d;
    }
}
