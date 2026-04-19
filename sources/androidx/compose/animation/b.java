package androidx.compose.animation;

import ae.s;
import androidx.compose.animation.e;
import java.util.List;
import md.i0;
import nd.l0;
import nd.p;
import nd.u;
import w2.n;
import w2.q;
import w2.r;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.g0;
import y1.m;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<?> f2097a;

    static final class a extends s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0[] f2098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f2099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0[] t0VarArr, b bVar, int i10, int i11) {
            super(1);
            this.f2098a = t0VarArr;
            this.f2099b = bVar;
            this.f2100c = i10;
            this.f2101d = i11;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0[] t0VarArr = this.f2098a;
            b bVar = this.f2099b;
            int i10 = this.f2100c;
            int i11 = this.f2101d;
            for (t0 t0Var : t0VarArr) {
                if (t0Var != null) {
                    long jA = bVar.f().g().a(q.a(t0Var.q0(), t0Var.d0()), q.a(i10, i11), r.Ltr);
                    t0.a.f(aVar, t0Var, n.j(jA), n.k(jA), 0.0f, 4, null);
                }
            }
        }
    }

    public b(e<?> eVar) {
        this.f2097a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y1.e0
    public f0 a(g0 g0Var, List<? extends d0> list, long j10) {
        t0 t0Var;
        t0 t0Var2;
        int size = list.size();
        t0[] t0VarArr = new t0[size];
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            t0Var = null;
            if (i10 >= size2) {
                break;
            }
            d0 d0Var = list.get(i10);
            Object objF = d0Var.f();
            e.a aVar = objF instanceof e.a ? (e.a) objF : null;
            if (aVar != null && aVar.a()) {
                t0VarArr[i10] = d0Var.I(j10);
            }
            i10++;
        }
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            d0 d0Var2 = list.get(i11);
            if (t0VarArr[i11] == null) {
                t0VarArr[i11] = d0Var2.I(j10);
            }
        }
        if ((size == 0) == true) {
            t0Var2 = null;
        } else {
            t0Var2 = t0VarArr[0];
            int iQ = p.Q(t0VarArr);
            if (iQ != 0) {
                int iQ0 = t0Var2 != null ? t0Var2.q0() : 0;
                l0 it = new ge.i(1, iQ).iterator();
                while (it.hasNext()) {
                    t0 t0Var3 = t0VarArr[it.nextInt()];
                    int iQ02 = t0Var3 != null ? t0Var3.q0() : 0;
                    if (iQ0 < iQ02) {
                        t0Var2 = t0Var3;
                        iQ0 = iQ02;
                    }
                }
            }
        }
        int iQ03 = t0Var2 != null ? t0Var2.q0() : 0;
        if ((size == 0) == false) {
            t0Var = t0VarArr[0];
            int iQ2 = p.Q(t0VarArr);
            if (iQ2 != 0) {
                int iD0 = t0Var != null ? t0Var.d0() : 0;
                l0 it2 = new ge.i(1, iQ2).iterator();
                while (it2.hasNext()) {
                    t0 t0Var4 = t0VarArr[it2.nextInt()];
                    int iD02 = t0Var4 != null ? t0Var4.d0() : 0;
                    if (iD0 < iD02) {
                        t0Var = t0Var4;
                        iD0 = iD02;
                    }
                }
            }
        }
        int iD03 = t0Var != null ? t0Var.d0() : 0;
        this.f2097a.l(q.a(iQ03, iD03));
        return g0.z0(g0Var, iQ03, iD03, null, new a(t0VarArr, this, iQ03, iD03), 4, null);
    }

    @Override // y1.e0
    public int b(y1.n nVar, List<? extends m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).k(i10));
            int iO = u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).k(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // y1.e0
    public int c(y1.n nVar, List<? extends m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).E(i10));
            int iO = u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).E(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // y1.e0
    public int d(y1.n nVar, List<? extends m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).W(i10));
            int iO = u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).W(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // y1.e0
    public int e(y1.n nVar, List<? extends m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).B(i10));
            int iO = u.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).B(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Integer num = numValueOf;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final e<?> f() {
        return this.f2097a;
    }
}
