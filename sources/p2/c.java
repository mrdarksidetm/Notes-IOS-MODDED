package p2;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f18088a = new c();

    private c() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, i2.d0 d0Var, k1.h hVar) {
        int iQ;
        int iQ2;
        if (!hVar.n() && (iQ = d0Var.q(hVar.i())) <= (iQ2 = d0Var.q(hVar.c()))) {
            while (true) {
                builder.addVisibleLineBounds(d0Var.r(iQ), d0Var.u(iQ), d0Var.s(iQ), d0Var.l(iQ));
                if (iQ == iQ2) {
                    break;
                }
                iQ++;
            }
        }
        return builder;
    }
}
