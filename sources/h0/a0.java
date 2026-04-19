package h0;

import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.q<List<? extends y1.m>, Integer, Integer, Integer> a(v vVar) {
        return vVar == v.Horizontal ? t.f11753a.a() : t.f11753a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.q<List<? extends y1.m>, Integer, Integer, Integer> b(v vVar) {
        return vVar == v.Horizontal ? t.f11753a.b() : t.f11753a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.q<List<? extends y1.m>, Integer, Integer, Integer> c(v vVar) {
        return vVar == v.Horizontal ? t.f11753a.c() : t.f11753a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zd.q<List<? extends y1.m>, Integer, Integer, Integer> d(v vVar) {
        return vVar == v.Horizontal ? t.f11753a.d() : t.f11753a.h();
    }

    public static final k j(e0 e0Var) {
        if (e0Var != null) {
            return e0Var.a();
        }
        return null;
    }

    public static final boolean k(e0 e0Var) {
        if (e0Var != null) {
            return e0Var.b();
        }
        return true;
    }

    public static final e0 l(y1.m mVar) {
        Object objF = mVar.f();
        if (objF instanceof e0) {
            return (e0) objF;
        }
        return null;
    }

    public static final float m(e0 e0Var) {
        if (e0Var != null) {
            return e0Var.c();
        }
        return 0.0f;
    }

    private static final int n(List<? extends y1.m> list, zd.p<? super y1.m, ? super Integer, Integer> pVar, zd.p<? super y1.m, ? super Integer, Integer> pVar2, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            y1.m mVar = list.get(i12);
            float fM = m(l(mVar));
            if (fM == 0.0f) {
                int iMin2 = Math.min(pVar.invoke(mVar, Integer.valueOf(a.e.API_PRIORITY_OTHER)).intValue(), i10 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, pVar2.invoke(mVar, Integer.valueOf(iMin2)).intValue());
            } else if (fM > 0.0f) {
                f10 += fM;
            }
        }
        int iD = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : ce.c.d(Math.max(i10 - iMin, 0) / f10);
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            y1.m mVar2 = list.get(i13);
            float fM2 = m(l(mVar2));
            if (fM2 > 0.0f) {
                iMax = Math.max(iMax, pVar2.invoke(mVar2, Integer.valueOf(iD != Integer.MAX_VALUE ? ce.c.d(iD * fM2) : Integer.MAX_VALUE)).intValue());
            }
        }
        return iMax;
    }

    private static final int o(List<? extends y1.m> list, zd.p<? super y1.m, ? super Integer, Integer> pVar, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        float f10 = 0.0f;
        while (true) {
            if (i12 >= size) {
                return ce.c.d(iMax * f10) + i13 + ((list.size() - 1) * i11);
            }
            y1.m mVar = list.get(i12);
            float fM = m(l(mVar));
            int iIntValue = pVar.invoke(mVar, Integer.valueOf(i10)).intValue();
            if (fM == 0.0f) {
                i13 += iIntValue;
            } else if (fM > 0.0f) {
                f10 += fM;
                iMax = Math.max(iMax, ce.c.d(iIntValue / fM));
            }
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(List<? extends y1.m> list, zd.p<? super y1.m, ? super Integer, Integer> pVar, zd.p<? super y1.m, ? super Integer, Integer> pVar2, int i10, int i11, v vVar, v vVar2) {
        return vVar == vVar2 ? o(list, pVar, i10, i11) : n(list, pVar2, pVar, i10, i11);
    }

    public static final boolean q(e0 e0Var) {
        k kVarJ = j(e0Var);
        if (kVarJ != null) {
            return kVarJ.c();
        }
        return false;
    }
}
