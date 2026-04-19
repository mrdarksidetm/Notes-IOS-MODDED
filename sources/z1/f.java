package z1;

import a2.e1;
import a2.f0;
import ae.s;
import java.util.HashSet;
import java.util.Iterator;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e1 f24133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0.d<a2.c> f24134b = new v0.d<>(new a2.c[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0.d<c<?>> f24135c = new v0.d<>(new c[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v0.d<f0> f24136d = new v0.d<>(new f0[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v0.d<c<?>> f24137e = new v0.d<>(new c[16], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24138f;

    static final class a extends s implements zd.a<i0> {
        a() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f.this.e();
        }
    }

    public f(e1 e1Var) {
        this.f24133a = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(androidx.compose.ui.e.c r13, z1.c<?> r14, java.util.Set<a2.c> r15) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.f.c(androidx.compose.ui.e$c, z1.c, java.util.Set):void");
    }

    public final void a(a2.c cVar, c<?> cVar2) {
        this.f24134b.b(cVar);
        this.f24135c.b(cVar2);
        b();
    }

    public final void b() {
        if (this.f24138f) {
            return;
        }
        this.f24138f = true;
        this.f24133a.b(new a());
    }

    public final void d(a2.c cVar, c<?> cVar2) {
        this.f24136d.b(a2.k.k(cVar));
        this.f24137e.b(cVar2);
        b();
    }

    public final void e() {
        int i10 = 0;
        this.f24138f = false;
        HashSet hashSet = new HashSet();
        v0.d<f0> dVar = this.f24136d;
        int iO = dVar.o();
        if (iO > 0) {
            f0[] f0VarArrN = dVar.n();
            int i11 = 0;
            do {
                f0 f0Var = f0VarArrN[i11];
                c<?> cVar = this.f24137e.n()[i11];
                if (f0Var.h0().k().H1()) {
                    c(f0Var.h0().k(), cVar, hashSet);
                }
                i11++;
            } while (i11 < iO);
        }
        this.f24136d.i();
        this.f24137e.i();
        v0.d<a2.c> dVar2 = this.f24134b;
        int iO2 = dVar2.o();
        if (iO2 > 0) {
            a2.c[] cVarArrN = dVar2.n();
            do {
                a2.c cVar2 = cVarArrN[i10];
                c<?> cVar3 = this.f24135c.n()[i10];
                if (cVar2.H1()) {
                    c(cVar2, cVar3, hashSet);
                }
                i10++;
            } while (i10 < iO2);
        }
        this.f24134b.i();
        this.f24135c.i();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a2.c) it.next()).i2();
        }
    }

    public final void f(a2.c cVar, c<?> cVar2) {
        this.f24134b.b(cVar);
        this.f24135c.b(cVar2);
        b();
    }
}
