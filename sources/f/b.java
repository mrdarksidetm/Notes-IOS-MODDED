package f;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.v;
import md.i0;
import o4.r;
import o4.s;
import t0.l;
import t0.q;
import x4.g;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f11016a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(androidx.activity.a aVar, q qVar, p<? super l, ? super Integer, i0> pVar) {
        View childAt = ((ViewGroup) aVar.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        v vVar = childAt instanceof v ? (v) childAt : null;
        if (vVar != null) {
            vVar.setParentCompositionContext(qVar);
            vVar.setContent(pVar);
            return;
        }
        v vVar2 = new v(aVar, null, 0, 6, null);
        vVar2.setParentCompositionContext(qVar);
        vVar2.setContent(pVar);
        c(aVar);
        aVar.setContentView(vVar2, f11016a);
    }

    public static /* synthetic */ void b(androidx.activity.a aVar, q qVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = null;
        }
        a(aVar, qVar, pVar);
    }

    private static final void c(androidx.activity.a aVar) {
        View decorView = aVar.getWindow().getDecorView();
        if (r.a(decorView) == null) {
            r.b(decorView, aVar);
        }
        if (s.a(decorView) == null) {
            s.b(decorView, aVar);
        }
        if (g.a(decorView) == null) {
            g.b(decorView, aVar);
        }
    }
}
