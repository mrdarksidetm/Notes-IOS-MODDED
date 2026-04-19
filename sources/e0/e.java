package e0;

import e0.g;
import java.util.concurrent.CancellationException;
import md.i0;
import md.t;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10312b = v0.d.f21872d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<g.a> f10313a = new v0.d<>(new g.a[16], 0);

    static final class a extends ae.s implements zd.l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.a f10315b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g.a aVar) {
            super(1);
            this.f10315b = aVar;
        }

        public final void a(Throwable th) {
            e.this.f10313a.v(this.f10315b);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f15558a;
        }
    }

    public final void b(Throwable th) {
        v0.d<g.a> dVar = this.f10313a;
        int iO = dVar.o();
        le.o[] oVarArr = new le.o[iO];
        for (int i10 = 0; i10 < iO; i10++) {
            oVarArr[i10] = dVar.n()[i10].a();
        }
        for (int i11 = 0; i11 < iO; i11++) {
            oVarArr[i11].cancel(th);
        }
        if (!this.f10313a.r()) {
            throw new IllegalStateException("uncancelled requests present".toString());
        }
    }

    public final boolean c(g.a aVar) {
        k1.h hVarInvoke = aVar.b().invoke();
        if (hVarInvoke == null) {
            le.o<i0> oVarA = aVar.a();
            t.a aVar2 = md.t.f15576b;
            oVarA.resumeWith(md.t.b(i0.f15558a));
            return false;
        }
        aVar.a().p(new a(aVar));
        ge.i iVar = new ge.i(0, this.f10313a.o() - 1);
        int iL = iVar.l();
        int iN = iVar.n();
        if (iL <= iN) {
            while (true) {
                k1.h hVarInvoke2 = this.f10313a.n()[iN].b().invoke();
                if (hVarInvoke2 != null) {
                    k1.h hVarM = hVarInvoke.m(hVarInvoke2);
                    if (ae.r.b(hVarM, hVarInvoke)) {
                        this.f10313a.a(iN + 1, aVar);
                        return true;
                    }
                    if (!ae.r.b(hVarM, hVarInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int iO = this.f10313a.o() - 1;
                        if (iO <= iN) {
                            while (true) {
                                this.f10313a.n()[iN].a().cancel(cancellationException);
                                if (iO == iN) {
                                    break;
                                }
                                iO++;
                            }
                        }
                    }
                }
                if (iN == iL) {
                    break;
                }
                iN--;
            }
        }
        this.f10313a.a(0, aVar);
        return true;
    }

    public final void d() {
        ge.i iVar = new ge.i(0, this.f10313a.o() - 1);
        int iL = iVar.l();
        int iN = iVar.n();
        if (iL <= iN) {
            while (true) {
                this.f10313a.n()[iL].a().resumeWith(md.t.b(i0.f15558a));
                if (iL == iN) {
                    break;
                } else {
                    iL++;
                }
            }
        }
        this.f10313a.i();
    }
}
