package pe;

import java.util.Arrays;
import md.i0;
import md.t;
import oe.f0;
import pe.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<S extends d<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private S[] f18313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f18316d;

    protected final S g() {
        S s10;
        v vVar;
        synchronized (this) {
            S[] sArr = this.f18313a;
            if (sArr == null) {
                sArr = (S[]) l(2);
                this.f18313a = sArr;
            } else if (this.f18314b >= sArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
                this.f18313a = (S[]) ((d[]) objArrCopyOf);
                sArr = (S[]) ((d[]) objArrCopyOf);
            }
            int i10 = this.f18315c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = (S) j();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                ae.r.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f18315c = i10;
            this.f18314b++;
            vVar = this.f18316d;
        }
        if (vVar != null) {
            vVar.b0(1);
        }
        return s10;
    }

    protected abstract S j();

    public final f0<Integer> k() {
        v vVar;
        synchronized (this) {
            vVar = this.f18316d;
            if (vVar == null) {
                vVar = new v(this.f18314b);
                this.f18316d = vVar;
            }
        }
        return vVar;
    }

    protected abstract S[] l(int i10);

    protected final void m(S s10) {
        v vVar;
        int i10;
        qd.d<i0>[] dVarArrB;
        synchronized (this) {
            int i11 = this.f18314b - 1;
            this.f18314b = i11;
            vVar = this.f18316d;
            if (i11 == 0) {
                this.f18315c = 0;
            }
            ae.r.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            dVarArrB = s10.b(this);
        }
        for (qd.d<i0> dVar : dVarArrB) {
            if (dVar != null) {
                t.a aVar = md.t.f15576b;
                dVar.resumeWith(md.t.b(i0.f15558a));
            }
        }
        if (vVar != null) {
            vVar.b0(-1);
        }
    }

    protected final int n() {
        return this.f18314b;
    }

    protected final S[] o() {
        return this.f18313a;
    }
}
