package u0;

import ae.j;
import ae.r;
import ge.o;
import java.util.Arrays;
import java.util.NoSuchElementException;
import t0.j2;
import t0.v2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f21465i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21466j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21468b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21470d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21474h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d[] f21467a = new d[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f21469c = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f21471e = new Object[16];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21477c;

        public b() {
        }

        @Override // u0.e
        public <T> T a(int i10) {
            return (T) g.this.f21471e[this.f21477c + i10];
        }

        @Override // u0.e
        public int b(int i10) {
            return g.this.f21469c[this.f21476b + i10];
        }

        public final d c() {
            d dVar = g.this.f21467a[this.f21475a];
            r.c(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.f21475a >= g.this.f21468b) {
                return false;
            }
            d dVarC = c();
            this.f21476b += dVarC.b();
            this.f21477c += dVarC.d();
            int i10 = this.f21475a + 1;
            this.f21475a = i10;
            return i10 < g.this.f21468b;
        }
    }

    public static final class c {
        public static g a(g gVar) {
            return gVar;
        }

        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i10, int i11) {
            int i12 = 1 << i10;
            if ((gVar.f21473g & i12) == 0) {
                gVar.f21473g |= i12;
                gVar.f21469c[gVar.z(i10)] = i11;
            } else {
                throw new IllegalStateException(("Already pushed argument " + b(gVar).e(i10)).toString());
            }
        }

        public static final <T> void d(g gVar, int i10, T t10) {
            int i11 = 1 << i10;
            if ((gVar.f21474h & i11) == 0) {
                gVar.f21474h |= i11;
                gVar.f21471e[gVar.A(i10)] = t10;
            } else {
                throw new IllegalStateException(("Already pushed argument " + b(gVar).f(i10)).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int i10) {
        return (this.f21472f - v().d()) + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    private final int o(int i10, int i11) {
        return o.d(i10 + o.h(i10, 1024), i11);
    }

    private final void p(int i10) {
        int[] iArr = this.f21469c;
        int length = iArr.length;
        if (i10 > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, o(length, i10));
            r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f21469c = iArrCopyOf;
        }
    }

    private final void q(int i10) {
        Object[] objArr = this.f21471e;
        int length = objArr.length;
        if (i10 > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, o(length, i10));
            r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f21471e = objArrCopyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d v() {
        d dVar = this.f21467a[this.f21468b - 1];
        r.c(dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int i10) {
        return (this.f21470d - v().b()) + i10;
    }

    public final void m() {
        this.f21468b = 0;
        this.f21470d = 0;
        nd.o.q(this.f21471e, null, 0, this.f21472f);
        this.f21472f = 0;
    }

    public final void r(t0.e<?> eVar, v2 v2Var, j2 j2Var) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, eVar, v2Var, j2Var);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.f21468b;
    }

    public final boolean t() {
        return s() == 0;
    }

    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return s() != 0;
    }

    public final void w(g gVar) {
        if (t()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        d[] dVarArr = this.f21467a;
        int i10 = this.f21468b - 1;
        this.f21468b = i10;
        d dVar = dVarArr[i10];
        r.c(dVar);
        this.f21467a[this.f21468b] = null;
        gVar.y(dVar);
        int i11 = this.f21472f;
        int i12 = gVar.f21472f;
        int iD = dVar.d();
        for (int i13 = 0; i13 < iD; i13++) {
            i12--;
            i11--;
            Object[] objArr = gVar.f21471e;
            Object[] objArr2 = this.f21471e;
            objArr[i12] = objArr2[i11];
            objArr2[i11] = null;
        }
        int i14 = this.f21470d;
        int i15 = gVar.f21470d;
        int iB = dVar.b();
        for (int i16 = 0; i16 < iB; i16++) {
            i15--;
            i14--;
            int[] iArr = gVar.f21469c;
            int[] iArr2 = this.f21469c;
            iArr[i15] = iArr2[i14];
            iArr2[i14] = 0;
        }
        this.f21472f -= dVar.d();
        this.f21470d -= dVar.b();
    }

    public final void x(d dVar) {
        if (dVar.b() == 0 && dVar.d() == 0) {
            y(dVar);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.d() + " objects.").toString());
    }

    public final void y(d dVar) {
        this.f21473g = 0;
        this.f21474h = 0;
        int i10 = this.f21468b;
        if (i10 == this.f21467a.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f21467a, this.f21468b + o.h(i10, 1024));
            r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f21467a = (d[]) objArrCopyOf;
        }
        p(this.f21470d + dVar.b());
        q(this.f21472f + dVar.d());
        d[] dVarArr = this.f21467a;
        int i11 = this.f21468b;
        this.f21468b = i11 + 1;
        dVarArr[i11] = dVar;
        this.f21470d += dVar.b();
        this.f21472f += dVar.d();
    }
}
