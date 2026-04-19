package i2;

import i2.d;
import java.util.ArrayList;
import java.util.List;
import n2.t;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d.b<u>> f12385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final md.l f12386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final md.l f12387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<o> f12388e;

    static final class a extends ae.s implements zd.a<Float> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            o oVar;
            p pVarB;
            List<o> listF = i.this.f();
            if (listF.isEmpty()) {
                oVar = null;
            } else {
                o oVar2 = listF.get(0);
                float fA = oVar2.b().a();
                int iO = nd.u.o(listF);
                int i10 = 1;
                if (1 <= iO) {
                    while (true) {
                        o oVar3 = listF.get(i10);
                        float fA2 = oVar3.b().a();
                        if (Float.compare(fA, fA2) < 0) {
                            oVar2 = oVar3;
                            fA = fA2;
                        }
                        if (i10 == iO) {
                            break;
                        }
                        i10++;
                    }
                }
                oVar = oVar2;
            }
            o oVar4 = oVar;
            return Float.valueOf((oVar4 == null || (pVarB = oVar4.b()) == null) ? 0.0f : pVarB.a());
        }
    }

    static final class b extends ae.s implements zd.a<Float> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            o oVar;
            p pVarB;
            List<o> listF = i.this.f();
            if (listF.isEmpty()) {
                oVar = null;
            } else {
                o oVar2 = listF.get(0);
                float fC = oVar2.b().c();
                int iO = nd.u.o(listF);
                int i10 = 1;
                if (1 <= iO) {
                    while (true) {
                        o oVar3 = listF.get(i10);
                        float fC2 = oVar3.b().c();
                        if (Float.compare(fC, fC2) < 0) {
                            oVar2 = oVar3;
                            fC = fC2;
                        }
                        if (i10 == iO) {
                            break;
                        }
                        i10++;
                    }
                }
                oVar = oVar2;
            }
            o oVar4 = oVar;
            return Float.valueOf((oVar4 == null || (pVarB = oVar4.b()) == null) ? 0.0f : pVarB.c());
        }
    }

    public i(d dVar, g0 g0Var, List<d.b<u>> list, w2.d dVar2, t.b bVar) {
        this.f12384a = dVar;
        this.f12385b = list;
        md.p pVar = md.p.f15571c;
        this.f12386c = md.n.a(pVar, new b());
        this.f12387d = md.n.a(pVar, new a());
        s sVarN = g0Var.N();
        List<d.b<s>> listL = e.l(dVar, sVarN);
        ArrayList arrayList = new ArrayList(listL.size());
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<s> bVar2 = listL.get(i10);
            d dVarM = e.m(dVar, bVar2.f(), bVar2.d());
            arrayList.add(new o(q.a(dVarM.j(), g0Var.J(h(bVar2.e(), sVarN)), dVarM.f(), j.b(g(), bVar2.f(), bVar2.d()), dVar2, bVar), bVar2.f(), bVar2.d()));
        }
        this.f12388e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s h(s sVar, s sVar2) {
        return !u2.k.j(sVar.i(), u2.k.f21574b.f()) ? sVar : sVar.a((509 & 1) != 0 ? sVar.f12403a : 0, (509 & 2) != 0 ? sVar.f12404b : sVar2.i(), (509 & 4) != 0 ? sVar.f12405c : 0L, (509 & 8) != 0 ? sVar.f12406d : null, (509 & 16) != 0 ? sVar.f12407e : null, (509 & 32) != 0 ? sVar.f12408f : null, (509 & 64) != 0 ? sVar.f12409g : 0, (509 & 128) != 0 ? sVar.f12410h : 0, (509 & 256) != 0 ? sVar.f12411i : null);
    }

    @Override // i2.p
    public float a() {
        return ((Number) this.f12387d.getValue()).floatValue();
    }

    @Override // i2.p
    public boolean b() {
        List<o> list = this.f12388e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).b().b()) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.p
    public float c() {
        return ((Number) this.f12386c.getValue()).floatValue();
    }

    public final d e() {
        return this.f12384a;
    }

    public final List<o> f() {
        return this.f12388e;
    }

    public final List<d.b<u>> g() {
        return this.f12385b;
    }
}
