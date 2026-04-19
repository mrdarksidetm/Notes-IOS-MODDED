package oe;

import java.util.Arrays;
import le.f1;
import md.t;

/* JADX INFO: loaded from: classes2.dex */
public class w<T> extends pe.b<y> implements r<T>, e, pe.m<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f16582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ne.a f16583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f16584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f16585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f16586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16588l;

    private static final class a implements f1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w<?> f16589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f16590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f16591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final qd.d<md.i0> f16592d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(w<?> wVar, long j10, Object obj, qd.d<? super md.i0> dVar) {
            this.f16589a = wVar;
            this.f16590b = j10;
            this.f16591c = obj;
            this.f16592d = dVar;
        }

        @Override // le.f1
        public void dispose() {
            this.f16589a.A(this);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16593a;

        static {
            int[] iArr = new int[ne.a.values().length];
            try {
                iArr[ne.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ne.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ne.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16593a = iArr;
        }
    }

    @sd.d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {372, 379, 382}, m = "collect$suspendImpl")
    static final class c<T> extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f16594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f16595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f16596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f16597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f16598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w<T> f16599f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16600g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w<T> wVar, qd.d<? super c> dVar) {
            super(dVar);
            this.f16599f = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16598e = obj;
            this.f16600g |= Integer.MIN_VALUE;
            return w.C(this.f16599f, null, this);
        }
    }

    public w(int i10, int i11, ne.a aVar) {
        this.f16581e = i10;
        this.f16582f = i11;
        this.f16583g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(a aVar) {
        synchronized (this) {
            if (aVar.f16590b < M()) {
                return;
            }
            Object[] objArr = this.f16584h;
            ae.r.c(objArr);
            if (x.f(objArr, aVar.f16590b) != aVar) {
                return;
            }
            x.g(objArr, aVar.f16590b, x.f16601a);
            B();
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    private final void B() {
        if (this.f16582f != 0 || this.f16588l > 1) {
            Object[] objArr = this.f16584h;
            ae.r.c(objArr);
            while (this.f16588l > 0 && x.f(objArr, (M() + ((long) R())) - 1) == x.f16601a) {
                this.f16588l--;
                x.g(objArr, M() + ((long) R()), null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <T> java.lang.Object C(oe.w<T> r8, oe.f<? super T> r9, qd.d<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.w.C(oe.w, oe.f, qd.d):java.lang.Object");
    }

    private final void D(long j10) {
        pe.d[] dVarArr;
        if (((pe.b) this).f18314b != 0 && (dVarArr = ((pe.b) this).f18313a) != null) {
            for (pe.d dVar : dVarArr) {
                if (dVar != null) {
                    y yVar = (y) dVar;
                    long j11 = yVar.f16602a;
                    if (j11 >= 0 && j11 < j10) {
                        yVar.f16602a = j10;
                    }
                }
            }
        }
        this.f16586j = j10;
    }

    private final void G() {
        Object[] objArr = this.f16584h;
        ae.r.c(objArr);
        x.g(objArr, M(), null);
        this.f16587k--;
        long jM = M() + 1;
        if (this.f16585i < jM) {
            this.f16585i = jM;
        }
        if (this.f16586j < jM) {
            D(jM);
        }
    }

    static /* synthetic */ <T> Object H(w<T> wVar, T t10, qd.d<? super md.i0> dVar) {
        Object objI;
        return (!wVar.i(t10) && (objI = wVar.I(t10, dVar)) == rd.d.e()) ? objI : md.i0.f15558a;
    }

    private final Object I(T t10, qd.d<? super md.i0> dVar) {
        qd.d<md.i0>[] dVarArrK;
        a aVar;
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        qd.d<md.i0>[] dVarArrK2 = pe.c.f18317a;
        synchronized (this) {
            if (T(t10)) {
                t.a aVar2 = md.t.f15576b;
                pVar.resumeWith(md.t.b(md.i0.f15558a));
                dVarArrK = K(dVarArrK2);
                aVar = null;
            } else {
                a aVar3 = new a(this, ((long) R()) + M(), t10, pVar);
                J(aVar3);
                this.f16588l++;
                if (this.f16582f == 0) {
                    dVarArrK2 = K(dVarArrK2);
                }
                dVarArrK = dVarArrK2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            le.r.a(pVar, aVar);
        }
        for (qd.d<md.i0> dVar2 : dVarArrK) {
            if (dVar2 != null) {
                t.a aVar4 = md.t.f15576b;
                dVar2.resumeWith(md.t.b(md.i0.f15558a));
            }
        }
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : md.i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Object obj) {
        int iR = R();
        Object[] objArrS = this.f16584h;
        if (objArrS == null) {
            objArrS = S(null, 0, 2);
        } else if (iR >= objArrS.length) {
            objArrS = S(objArrS, iR, objArrS.length * 2);
        }
        x.g(objArrS, M() + ((long) iR), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [qd.d<md.i0>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final qd.d<md.i0>[] K(qd.d<md.i0>[] dVarArr) {
        pe.d[] dVarArr2;
        y yVar;
        qd.d<? super md.i0> dVar;
        int length = dVarArr.length;
        if (((pe.b) this).f18314b != 0 && (dVarArr2 = ((pe.b) this).f18313a) != null) {
            int i10 = 0;
            int length2 = dVarArr2.length;
            dVarArr = dVarArr;
            while (i10 < length2) {
                pe.d dVar2 = dVarArr2[i10];
                if (dVar2 != null && (dVar = (yVar = (y) dVar2).f16603b) != null && V(yVar) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                        ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
                        dVarArr = objArrCopyOf;
                    }
                    ((qd.d[]) dVarArr)[length] = dVar;
                    yVar.f16603b = null;
                    length++;
                }
                i10++;
                dVarArr = dVarArr;
            }
        }
        return (qd.d[]) dVarArr;
    }

    private final long L() {
        return M() + ((long) this.f16587k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long M() {
        return Math.min(this.f16586j, this.f16585i);
    }

    private final Object O(long j10) {
        Object[] objArr = this.f16584h;
        ae.r.c(objArr);
        Object objF = x.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f16591c : objF;
    }

    private final long P() {
        return M() + ((long) this.f16587k) + ((long) this.f16588l);
    }

    private final int Q() {
        return (int) ((M() + ((long) this.f16587k)) - this.f16585i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R() {
        return this.f16587k + this.f16588l;
    }

    private final Object[] S(Object[] objArr, int i10, int i11) {
        if (!(i11 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i11];
        this.f16584h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM = M();
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = ((long) i12) + jM;
            x.g(objArr2, j10, x.f(objArr, j10));
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T(T t10) {
        if (n() == 0) {
            return U(t10);
        }
        if (this.f16587k >= this.f16582f && this.f16586j <= this.f16585i) {
            int i10 = b.f16593a[this.f16583g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        J(t10);
        int i11 = this.f16587k + 1;
        this.f16587k = i11;
        if (i11 > this.f16582f) {
            G();
        }
        if (Q() > this.f16581e) {
            X(this.f16585i + 1, this.f16586j, L(), P());
        }
        return true;
    }

    private final boolean U(T t10) {
        if (this.f16581e == 0) {
            return true;
        }
        J(t10);
        int i10 = this.f16587k + 1;
        this.f16587k = i10;
        if (i10 > this.f16581e) {
            G();
        }
        this.f16586j = M() + ((long) this.f16587k);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long V(y yVar) {
        long j10 = yVar.f16602a;
        if (j10 < L()) {
            return j10;
        }
        if (this.f16582f <= 0 && j10 <= M() && this.f16588l != 0) {
            return j10;
        }
        return -1L;
    }

    private final Object W(y yVar) {
        Object obj;
        qd.d<md.i0>[] dVarArrY = pe.c.f18317a;
        synchronized (this) {
            long jV = V(yVar);
            if (jV < 0) {
                obj = x.f16601a;
            } else {
                long j10 = yVar.f16602a;
                Object objO = O(jV);
                yVar.f16602a = jV + 1;
                dVarArrY = Y(j10);
                obj = objO;
            }
        }
        for (qd.d<md.i0> dVar : dVarArrY) {
            if (dVar != null) {
                t.a aVar = md.t.f15576b;
                dVar.resumeWith(md.t.b(md.i0.f15558a));
            }
        }
        return obj;
    }

    private final void X(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jM = M(); jM < jMin; jM++) {
            Object[] objArr = this.f16584h;
            ae.r.c(objArr);
            x.g(objArr, jM, null);
        }
        this.f16585i = j10;
        this.f16586j = j11;
        this.f16587k = (int) (j12 - jMin);
        this.f16588l = (int) (j13 - j12);
    }

    private final Object z(y yVar, qd.d<? super md.i0> dVar) {
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        synchronized (this) {
            if (V(yVar) < 0) {
                yVar.f16603b = pVar;
            } else {
                t.a aVar = md.t.f15576b;
                pVar.resumeWith(md.t.b(md.i0.f15558a));
            }
            md.i0 i0Var = md.i0.f15558a;
        }
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : md.i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pe.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public y j() {
        return new y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pe.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public y[] l(int i10) {
        return new y[i10];
    }

    protected final T N() {
        Object[] objArr = this.f16584h;
        ae.r.c(objArr);
        return (T) x.f(objArr, (this.f16585i + ((long) Q())) - 1);
    }

    public final qd.d<md.i0>[] Y(long j10) {
        long j11;
        long j12;
        long j13;
        pe.d[] dVarArr;
        if (j10 > this.f16586j) {
            return pe.c.f18317a;
        }
        long jM = M();
        long j14 = ((long) this.f16587k) + jM;
        if (this.f16582f == 0 && this.f16588l > 0) {
            j14++;
        }
        if (((pe.b) this).f18314b != 0 && (dVarArr = ((pe.b) this).f18313a) != null) {
            for (pe.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((y) dVar).f16602a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f16586j) {
            return pe.c.f18317a;
        }
        long jL = L();
        int iMin = n() > 0 ? Math.min(this.f16588l, this.f16582f - ((int) (jL - j14))) : this.f16588l;
        qd.d<md.i0>[] dVarArr2 = pe.c.f18317a;
        long j16 = ((long) this.f16588l) + jL;
        if (iMin > 0) {
            dVarArr2 = new qd.d[iMin];
            Object[] objArr = this.f16584h;
            ae.r.c(objArr);
            long j17 = jL;
            int i10 = 0;
            while (true) {
                if (jL >= j16) {
                    j11 = j14;
                    j12 = j16;
                    break;
                }
                Object objF = x.f(objArr, jL);
                j11 = j14;
                qe.h0 h0Var = x.f16601a;
                if (objF != h0Var) {
                    ae.r.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j16;
                    dVarArr2[i10] = aVar.f16592d;
                    x.g(objArr, jL, h0Var);
                    x.g(objArr, j17, aVar.f16591c);
                    j13 = 1;
                    j17++;
                    if (i11 >= iMin) {
                        break;
                    }
                    i10 = i11;
                } else {
                    j12 = j16;
                    j13 = 1;
                }
                jL += j13;
                j14 = j11;
                j16 = j12;
            }
            jL = j17;
        } else {
            j11 = j14;
            j12 = j16;
        }
        int i12 = (int) (jL - jM);
        long j18 = n() == 0 ? jL : j11;
        long jMax = Math.max(this.f16585i, jL - ((long) Math.min(this.f16581e, i12)));
        if (this.f16582f == 0 && jMax < j12) {
            Object[] objArr2 = this.f16584h;
            ae.r.c(objArr2);
            if (ae.r.b(x.f(objArr2, jMax), x.f16601a)) {
                jL++;
                jMax++;
            }
        }
        X(jMax, j18, jL, j12);
        B();
        return (dVarArr2.length == 0) ^ true ? K(dVarArr2) : dVarArr2;
    }

    public final long Z() {
        long j10 = this.f16585i;
        if (j10 < this.f16586j) {
            this.f16586j = j10;
        }
        return j10;
    }

    @Override // oe.v, oe.e
    public Object a(f<? super T> fVar, qd.d<?> dVar) {
        return C(this, fVar, dVar);
    }

    @Override // oe.r, oe.f
    public Object b(T t10, qd.d<? super md.i0> dVar) {
        return H(this, t10, dVar);
    }

    @Override // pe.m
    public e<T> c(qd.g gVar, int i10, ne.a aVar) {
        return x.e(this, gVar, i10, aVar);
    }

    @Override // oe.r
    public void h() {
        synchronized (this) {
            X(L(), this.f16586j, L(), P());
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    @Override // oe.r
    public boolean i(T t10) {
        int i10;
        boolean z10;
        qd.d<md.i0>[] dVarArrK = pe.c.f18317a;
        synchronized (this) {
            if (T(t10)) {
                dVarArrK = K(dVarArrK);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (qd.d<md.i0> dVar : dVarArrK) {
            if (dVar != null) {
                t.a aVar = md.t.f15576b;
                dVar.resumeWith(md.t.b(md.i0.f15558a));
            }
        }
        return z10;
    }
}
