package f;

import ae.s;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.r;
import e.u;
import e.x;
import t0.a2;
import t0.l;
import t0.v;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11017a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a2<u> f11018b = v.d(null, a.f11019a, 1, null);

    static final class a extends s implements zd.a<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11019a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return null;
        }
    }

    private c() {
    }

    public final u a(l lVar, int i10) {
        lVar.e(-2068013981);
        u uVarA = (u) lVar.P(f11018b);
        lVar.e(1680121597);
        if (uVarA == null) {
            uVarA = x.a((View) lVar.P(r.j()));
        }
        lVar.K();
        if (uVarA == null) {
            Object baseContext = (Context) lVar.P(r.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof u) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            uVarA = (u) baseContext;
        }
        lVar.K();
        return uVarA;
    }
}
