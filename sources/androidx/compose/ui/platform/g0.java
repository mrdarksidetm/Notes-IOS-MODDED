package androidx.compose.ui.platform;

import a2.v1;
import android.view.View;
import android.view.ViewGroup;
import b2.q0;
import b2.u0;
import java.util.Collections;
import java.util.WeakHashMap;
import md.i0;
import t0.m2;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f2922a = new ViewGroup.LayoutParams(-2, -2);

    public static final m2 a(a2.f0 f0Var, t0.q qVar) {
        return t0.t.b(new v1(f0Var), qVar);
    }

    private static final t0.p b(i iVar, t0.q qVar, zd.p<? super t0.l, ? super Integer, i0> pVar) {
        if (u0.c()) {
            int i10 = f1.e.K;
            if (iVar.getTag(i10) == null) {
                iVar.setTag(i10, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        t0.p pVarA = t0.t.a(new v1(iVar.getRoot()), qVar);
        View view = iVar.getView();
        int i11 = f1.e.L;
        Object tag = view.getTag(i11);
        f0 f0Var = tag instanceof f0 ? (f0) tag : null;
        if (f0Var == null) {
            f0Var = new f0(iVar, pVarA);
            iVar.getView().setTag(i11, f0Var);
        }
        f0Var.b(pVar);
        return f0Var;
    }

    public static final t0.p c(a aVar, t0.q qVar, zd.p<? super t0.l, ? super Integer, i0> pVar) {
        q0.f5391a.b();
        i iVar = null;
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof i) {
                iVar = (i) childAt;
            }
        } else {
            aVar.removeAllViews();
        }
        if (iVar == null) {
            iVar = new i(aVar.getContext(), qVar.h());
            aVar.addView(iVar.getView(), f2922a);
        }
        return b(iVar, qVar, pVar);
    }
}
