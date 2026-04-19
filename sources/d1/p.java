package d1;

import com.google.android.gms.common.api.a;
import d1.k;
import d1.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import t0.l3;
import t0.v3;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zd.l<n, md.i0> f9402a = b.f9415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l3<k> f9403b = new l3<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f9404c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static n f9405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final m f9407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a0<g0> f9408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static List<? extends zd.p<? super Set<? extends Object>, ? super k, md.i0>> f9409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static List<? extends zd.l<Object, md.i0>> f9410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicReference<d1.a> f9411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final k f9412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static t0.f f9413l;

    static final class a extends ae.s implements zd.l<n, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9414a = new a();

        a() {
            super(1);
        }

        public final void a(n nVar) {
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n nVar) {
            a(nVar);
            return md.i0.f15558a;
        }
    }

    static final class b extends ae.s implements zd.l<n, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9415a = new b();

        b() {
            super(1);
        }

        public final void a(n nVar) {
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(n nVar) {
            a(nVar);
            return md.i0.f15558a;
        }
    }

    static final class c extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
            super(1);
            this.f9416a = lVar;
            this.f9417b = lVar2;
        }

        public final void a(Object obj) {
            this.f9416a.invoke(obj);
            this.f9417b.invoke(obj);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    static final class d extends ae.s implements zd.l<Object, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Object, md.i0> f9419b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
            super(1);
            this.f9418a = lVar;
            this.f9419b = lVar2;
        }

        public final void a(Object obj) {
            this.f9418a.invoke(obj);
            this.f9419b.invoke(obj);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Object obj) {
            a(obj);
            return md.i0.f15558a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class e<T> extends ae.s implements zd.l<n, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.l<n, T> f9420a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(zd.l<? super n, ? extends T> lVar) {
            super(1);
            this.f9420a = lVar;
        }

        /* JADX WARN: Incorrect return type in method signature: (Ld1/n;)TT; */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k invoke(n nVar) {
            k kVar = (k) this.f9420a.invoke(nVar);
            synchronized (p.I()) {
                p.f9405d = p.f9405d.v(kVar.f());
                md.i0 i0Var = md.i0.f15558a;
            }
            return kVar;
        }
    }

    static {
        n.a aVar = n.f9390e;
        f9405d = aVar.a();
        f9406e = 1;
        f9407f = new m();
        f9408g = new a0<>();
        f9409h = nd.u.m();
        f9410i = nd.u.m();
        int i10 = f9406e;
        f9406e = i10 + 1;
        d1.a aVar2 = new d1.a(i10, aVar.a());
        f9405d = f9405d.v(aVar2.f());
        AtomicReference<d1.a> atomicReference = new AtomicReference<>(aVar2);
        f9411j = atomicReference;
        f9412k = atomicReference.get();
        f9413l = new t0.f(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T A(zd.l<? super n, ? extends T> lVar) {
        d1.a aVar;
        v0.b<g0> bVarE;
        T t10;
        k kVar = f9412k;
        ae.r.d(kVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (I()) {
            aVar = f9411j.get();
            bVarE = aVar.E();
            if (bVarE != null) {
                f9413l.a(1);
            }
            t10 = (T) a0(aVar, lVar);
        }
        if (bVarE != null) {
            try {
                List<? extends zd.p<? super Set<? extends Object>, ? super k, md.i0>> list = f9409h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invoke(bVarE, aVar);
                }
            } finally {
                f9413l.a(-1);
            }
        }
        synchronized (I()) {
            C();
            if (bVarE != null) {
                Object[] objArrN = bVarE.n();
                int size2 = bVarE.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj = objArrN[i11];
                    ae.r.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    U((g0) obj);
                }
                md.i0 i0Var = md.i0.f15558a;
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        A(a.f9414a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        a0<g0> a0Var = f9408g;
        int iE = a0Var.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iE) {
                break;
            }
            v3<g0> v3Var = a0Var.f()[i10];
            if ((v3Var != null ? v3Var.get() : null) != null && !(!T(r5))) {
                if (i11 != i10) {
                    a0Var.f()[i11] = v3Var;
                    a0Var.d()[i11] = a0Var.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < iE; i12++) {
            a0Var.f()[i12] = null;
            a0Var.d()[i12] = 0;
        }
        if (i11 != iE) {
            a0Var.g(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k D(k kVar, zd.l<Object, md.i0> lVar, boolean z10) {
        boolean z11 = kVar instanceof d1.c;
        if (z11 || kVar == null) {
            return new k0(z11 ? (d1.c) kVar : null, lVar, null, false, z10);
        }
        return new l0(kVar, lVar, false, z10);
    }

    static /* synthetic */ k E(k kVar, zd.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D(kVar, lVar, z10);
    }

    public static final <T extends i0> T F(T t10) {
        T t11;
        k.a aVar = k.f9368e;
        k kVarD = aVar.d();
        T t12 = (T) W(t10, kVarD.f(), kVarD.g());
        if (t12 != null) {
            return t12;
        }
        synchronized (I()) {
            k kVarD2 = aVar.d();
            t11 = (T) W(t10, kVarD2.f(), kVarD2.g());
        }
        if (t11 != null) {
            return t11;
        }
        V();
        throw new md.i();
    }

    public static final <T extends i0> T G(T t10, k kVar) {
        T t11 = (T) W(t10, kVar.f(), kVar.g());
        if (t11 != null) {
            return t11;
        }
        V();
        throw new md.i();
    }

    public static final k H() {
        k kVarA = f9403b.a();
        return kVarA == null ? f9411j.get() : kVarA;
    }

    public static final Object I() {
        return f9404c;
    }

    public static final k J() {
        return f9412k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.l<Object, md.i0> K(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || ae.r.b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new c(lVar, lVar2);
    }

    static /* synthetic */ zd.l L(zd.l lVar, zd.l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return K(lVar, lVar2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.l<Object, md.i0> M(zd.l<Object, md.i0> lVar, zd.l<Object, md.i0> lVar2) {
        return (lVar == null || lVar2 == null || ae.r.b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new d(lVar, lVar2);
    }

    public static final <T extends i0> T N(T t10, g0 g0Var) {
        T t11 = (T) d0(g0Var);
        if (t11 != null) {
            t11.h(a.e.API_PRIORITY_OTHER);
            return t11;
        }
        T t12 = (T) t10.d();
        t12.h(a.e.API_PRIORITY_OTHER);
        t12.g(g0Var.f());
        ae.r.d(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        g0Var.n(t12);
        ae.r.d(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    public static final <T extends i0> T O(T t10, g0 g0Var, k kVar) {
        T t11;
        synchronized (I()) {
            t11 = (T) P(t10, g0Var, kVar);
        }
        return t11;
    }

    private static final <T extends i0> T P(T t10, g0 g0Var, k kVar) {
        T t11 = (T) N(t10, g0Var);
        t11.c(t10);
        t11.h(kVar.f());
        return t11;
    }

    public static final void Q(k kVar, g0 g0Var) {
        kVar.w(kVar.j() + 1);
        zd.l<Object, md.i0> lVarK = kVar.k();
        if (lVarK != null) {
            lVarK.invoke(g0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<i0, i0> R(d1.c cVar, d1.c cVar2, n nVar) {
        i0 i0VarW;
        v0.b<g0> bVarE = cVar2.E();
        int iF = cVar.f();
        if (bVarE == null) {
            return null;
        }
        n nVarU = cVar2.g().v(cVar2.f()).u(cVar2.F());
        Object[] objArrN = bVarE.n();
        int size = bVarE.size();
        HashMap map = null;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = objArrN[i10];
            ae.r.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            g0 g0Var = (g0) obj;
            i0 i0VarF = g0Var.f();
            i0 i0VarW2 = W(i0VarF, iF, nVar);
            if (i0VarW2 != null && (i0VarW = W(i0VarF, iF, nVarU)) != null && !ae.r.b(i0VarW2, i0VarW)) {
                i0 i0VarW3 = W(i0VarF, cVar2.f(), cVar2.g());
                if (i0VarW3 == null) {
                    V();
                    throw new md.i();
                }
                i0 i0VarL = g0Var.l(i0VarW, i0VarW2, i0VarW3);
                if (i0VarL == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(i0VarW2, i0VarL);
                map = map;
            }
        }
        return map;
    }

    public static final <T extends i0> T S(T t10, g0 g0Var, k kVar, T t11) {
        T t12;
        if (kVar.i()) {
            kVar.p(g0Var);
        }
        int iF = kVar.f();
        if (t11.f() == iF) {
            return t11;
        }
        synchronized (I()) {
            t12 = (T) N(t10, g0Var);
        }
        t12.h(iF);
        kVar.p(g0Var);
        return t12;
    }

    private static final boolean T(g0 g0Var) {
        i0 i0Var;
        int iE = f9407f.e(f9406e);
        i0 i0Var2 = null;
        i0 i0VarF = null;
        int i10 = 0;
        for (i0 i0VarF2 = g0Var.f(); i0VarF2 != null; i0VarF2 = i0VarF2.e()) {
            int iF = i0VarF2.f();
            if (iF != 0) {
                if (iF >= iE) {
                    i10++;
                } else if (i0Var2 == null) {
                    i10++;
                    i0Var2 = i0VarF2;
                } else {
                    if (i0VarF2.f() < i0Var2.f()) {
                        i0Var = i0Var2;
                        i0Var2 = i0VarF2;
                    } else {
                        i0Var = i0VarF2;
                    }
                    if (i0VarF == null) {
                        i0VarF = g0Var.f();
                        i0 i0Var3 = i0VarF;
                        while (true) {
                            if (i0VarF == null) {
                                i0VarF = i0Var3;
                                break;
                            }
                            if (i0VarF.f() >= iE) {
                                break;
                            }
                            if (i0Var3.f() < i0VarF.f()) {
                                i0Var3 = i0VarF;
                            }
                            i0VarF = i0VarF.e();
                        }
                    }
                    i0Var2.h(0);
                    i0Var2.c(i0VarF);
                    i0Var2 = i0Var;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(g0 g0Var) {
        if (T(g0Var)) {
            f9408g.a(g0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends i0> T W(T t10, int i10, n nVar) {
        T t11 = null;
        while (t10 != null) {
            if (f0(t10, i10, nVar) && (t11 == null || t11.f() < t10.f())) {
                t11 = t10;
            }
            t10 = (T) t10.e();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final <T extends i0> T X(T t10, g0 g0Var) {
        T t11;
        k.a aVar = k.f9368e;
        k kVarD = aVar.d();
        zd.l<Object, md.i0> lVarH = kVarD.h();
        if (lVarH != null) {
            lVarH.invoke(g0Var);
        }
        T t12 = (T) W(t10, kVarD.f(), kVarD.g());
        if (t12 != null) {
            return t12;
        }
        synchronized (I()) {
            k kVarD2 = aVar.d();
            i0 i0VarF = g0Var.f();
            ae.r.d(i0VarF, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t11 = (T) W(i0VarF, kVarD2.f(), kVarD2.g());
            if (t11 == null) {
                V();
                throw new md.i();
            }
        }
        return t11;
    }

    public static final void Y(int i10) {
        f9407f.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T a0(k kVar, zd.l<? super n, ? extends T> lVar) {
        T tInvoke = lVar.invoke(f9405d.r(kVar.f()));
        synchronized (I()) {
            int i10 = f9406e;
            f9406e = i10 + 1;
            f9405d = f9405d.r(kVar.f());
            f9411j.set(new d1.a(i10, f9405d));
            kVar.d();
            f9405d = f9405d.v(i10);
            md.i0 i0Var = md.i0.f15558a;
        }
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends k> T b0(zd.l<? super n, ? extends T> lVar) {
        return (T) A(new e(lVar));
    }

    public static final int c0(int i10, n nVar) {
        int iA;
        int iT = nVar.t(i10);
        synchronized (I()) {
            iA = f9407f.a(iT);
        }
        return iA;
    }

    private static final i0 d0(g0 g0Var) {
        int iE = f9407f.e(f9406e) - 1;
        n nVarA = n.f9390e.a();
        i0 i0Var = null;
        for (i0 i0VarF = g0Var.f(); i0VarF != null; i0VarF = i0VarF.e()) {
            if (i0VarF.f() == 0) {
                return i0VarF;
            }
            if (f0(i0VarF, iE, nVarA)) {
                if (i0Var != null) {
                    return i0VarF.f() < i0Var.f() ? i0VarF : i0Var;
                }
                i0Var = i0VarF;
            }
        }
        return null;
    }

    private static final boolean e0(int i10, int i11, n nVar) {
        return (i11 == 0 || i11 > i10 || nVar.s(i11)) ? false : true;
    }

    private static final boolean f0(i0 i0Var, int i10, n nVar) {
        return e0(i10, i0Var.f(), nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(k kVar) {
        int iE;
        if (f9405d.s(kVar.f())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: id=");
        sb2.append(kVar.f());
        sb2.append(", disposed=");
        sb2.append(kVar.e());
        sb2.append(", applied=");
        d1.c cVar = kVar instanceof d1.c ? (d1.c) kVar : null;
        sb2.append(cVar != null ? Boolean.valueOf(cVar.D()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (I()) {
            iE = f9407f.e(-1);
        }
        sb2.append(iE);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final <T extends i0> T h0(T t10, g0 g0Var, k kVar) {
        if (kVar.i()) {
            kVar.p(g0Var);
        }
        T t11 = (T) W(t10, kVar.f(), kVar.g());
        if (t11 == null) {
            V();
            throw new md.i();
        }
        if (t11.f() == kVar.f()) {
            return t11;
        }
        T t12 = (T) O(t11, g0Var, kVar);
        kVar.p(g0Var);
        return t12;
    }

    public static final n z(n nVar, int i10, int i11) {
        while (i10 < i11) {
            nVar = nVar.v(i10);
            i10++;
        }
        return nVar;
    }
}
