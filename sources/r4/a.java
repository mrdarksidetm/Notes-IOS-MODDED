package r4;

import ae.s;
import android.view.View;
import androidx.compose.ui.platform.r;
import o4.q;
import t0.a2;
import t0.l;
import t0.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19180a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a2<q> f19181b = v.d(null, C0403a.f19182a, 1, null);

    /* JADX INFO: renamed from: r4.a$a, reason: collision with other inner class name */
    static final class C0403a extends s implements zd.a<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0403a f19182a = new C0403a();

        C0403a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return null;
        }
    }

    private a() {
    }

    public final q a(l lVar, int i10) {
        lVar.e(-584162872);
        q qVarA = (q) lVar.P(f19181b);
        if (qVarA == null) {
            qVarA = o4.s.a((View) lVar.P(r.j()));
        }
        lVar.K();
        return qVarA;
    }
}
