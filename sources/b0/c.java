package b0;

import java.util.ArrayList;
import java.util.List;
import md.i0;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class c implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f5042a;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<t0> f5043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends t0> list) {
            super(1);
            this.f5043a = list;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            List<t0> list = this.f5043a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t0.a.f(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
            }
        }
    }

    public c(f fVar) {
        this.f5042a = fVar;
    }

    @Override // y1.e0
    public f0 a(g0 g0Var, List<? extends d0> list, long j10) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10).I(j10));
        }
        Object obj2 = null;
        int i11 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int iQ0 = ((t0) obj).q0();
            int iO = nd.u.o(arrayList);
            if (1 <= iO) {
                int i12 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    int iQ02 = ((t0) obj3).q0();
                    if (iQ0 < iQ02) {
                        obj = obj3;
                        iQ0 = iQ02;
                    }
                    if (i12 == iO) {
                        break;
                    }
                    i12++;
                }
            }
        }
        t0 t0Var = (t0) obj;
        int iQ03 = t0Var != null ? t0Var.q0() : 0;
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int iD0 = ((t0) obj4).d0();
            int iO2 = nd.u.o(arrayList);
            if (1 <= iO2) {
                while (true) {
                    Object obj5 = arrayList.get(i11);
                    int iD02 = ((t0) obj5).d0();
                    if (iD0 < iD02) {
                        obj4 = obj5;
                        iD0 = iD02;
                    }
                    if (i11 == iO2) {
                        break;
                    }
                    i11++;
                }
            }
            obj2 = obj4;
        }
        t0 t0Var2 = (t0) obj2;
        int iD03 = t0Var2 != null ? t0Var2.d0() : 0;
        this.f5042a.a().setValue(w2.p.b(w2.q.a(iQ03, iD03)));
        return g0.z0(g0Var, iQ03, iD03, null, new a(arrayList), 4, null);
    }

    @Override // y1.e0
    public int b(y1.n nVar, List<? extends y1.m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).k(i10));
            int iO = nd.u.o(list);
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
    public int c(y1.n nVar, List<? extends y1.m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).E(i10));
            int iO = nd.u.o(list);
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
    public int d(y1.n nVar, List<? extends y1.m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).W(i10));
            int iO = nd.u.o(list);
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
    public int e(y1.n nVar, List<? extends y1.m> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).B(i10));
            int iO = nd.u.o(list);
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
}
