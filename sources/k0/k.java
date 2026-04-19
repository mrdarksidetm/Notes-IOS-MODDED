package k0;

import android.graphics.Rect;
import android.view.View;
import md.i0;
import y1.r;
import y1.s;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a2.h f14331a;

        a(a2.h hVar) {
            this.f14331a = hVar;
        }

        @Override // k0.c
        public final Object o0(r rVar, zd.a<k1.h> aVar, qd.d<? super i0> dVar) {
            View view = (View) a2.i.a(this.f14331a, androidx.compose.ui.platform.r.j());
            long jE = s.e(rVar);
            k1.h hVarInvoke = aVar.invoke();
            k1.h hVarQ = hVarInvoke != null ? hVarInvoke.q(jE) : null;
            if (hVarQ != null) {
                view.requestRectangleOnScreen(k.c(hVarQ), false);
            }
            return i0.f15558a;
        }
    }

    public static final c b(a2.h hVar) {
        return new a(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(k1.h hVar) {
        return new Rect((int) hVar.f(), (int) hVar.i(), (int) hVar.g(), (int) hVar.c());
    }
}
