package n2;

import java.util.List;
import md.t;
import n2.c0;
import n2.m;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final md.s<List<s>, Object> b(List<? extends s> list, a1 a1Var, m mVar, n0 n0Var, zd.l<? super a1, ? extends Object> lVar) {
        Object objInvoke;
        Object objB;
        int iE;
        int size = list.size();
        List listS = null;
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = list.get(i10);
            int iA = sVar.a();
            c0.a aVar = c0.f15768a;
            if (c0.e(iA, aVar.b())) {
                synchronized (mVar.f15862d) {
                    m.b bVar = new m.b(sVar, n0Var.a());
                    m.a aVar2 = (m.a) mVar.f15860b.d(bVar);
                    if (aVar2 == null) {
                        aVar2 = (m.a) mVar.f15861c.b(bVar);
                    }
                    if (aVar2 != null) {
                        objB = aVar2.g();
                    } else {
                        md.i0 i0Var = md.i0.f15558a;
                        try {
                            objB = n0Var.b(sVar);
                            m.f(mVar, sVar, n0Var, objB, false, 8, null);
                        } catch (Exception e10) {
                            throw new IllegalStateException("Unable to load font " + sVar, e10);
                        }
                    }
                }
                if (objB == null) {
                    throw new IllegalStateException("Unable to load font " + sVar);
                }
            } else {
                if (!c0.e(iA, aVar.c())) {
                    if (!c0.e(iA, aVar.a())) {
                        throw new IllegalStateException("Unknown font type " + sVar);
                    }
                    m.a aVarD = mVar.d(sVar, n0Var);
                    if (aVarD != null) {
                        if (!m.a.e(aVarD.g()) && aVarD.g() != null) {
                            iE = a1Var.e();
                            objB = aVarD.g();
                            objInvoke = g0.a(iE, objB, sVar, a1Var.f(), a1Var.d());
                            break;
                        }
                    } else if (listS == null) {
                        listS = nd.u.s(sVar);
                    } else {
                        listS.add(sVar);
                    }
                } else {
                    synchronized (mVar.f15862d) {
                        m.b bVar2 = new m.b(sVar, n0Var.a());
                        m.a aVar3 = (m.a) mVar.f15860b.d(bVar2);
                        if (aVar3 == null) {
                            aVar3 = (m.a) mVar.f15861c.b(bVar2);
                        }
                        if (aVar3 != null) {
                            objB = aVar3.g();
                        } else {
                            md.i0 i0Var2 = md.i0.f15558a;
                            try {
                                t.a aVar4 = md.t.f15576b;
                                objB = md.t.b(n0Var.b(sVar));
                            } catch (Throwable th) {
                                t.a aVar5 = md.t.f15576b;
                                objB = md.t.b(md.u.a(th));
                            }
                            if (md.t.g(objB)) {
                                objB = null;
                            }
                            m.f(mVar, sVar, n0Var, objB, false, 8, null);
                        }
                    }
                    if (objB != null) {
                    }
                }
            }
            iE = a1Var.e();
            objInvoke = g0.a(iE, objB, sVar, a1Var.f(), a1Var.d());
            break;
        }
        objInvoke = lVar.invoke(a1Var);
        return md.x.a(listS, objInvoke);
    }
}
