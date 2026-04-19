package q0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import l1.j0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f18900a = new t();

    private t() {
    }

    public final s a(h hVar, t0.l lVar, int i10) {
        lVar.e(1437915677);
        if (t0.o.I()) {
            t0.o.U(1437915677, i10, -1, "androidx.compose.material3.IconButtonDefaults.<get-defaultIconButtonColors> (IconButton.kt:589)");
        }
        s sVarC = hVar.c();
        if (sVarC == null) {
            long jE = ((l1.j0) lVar.P(k.a())).E();
            j0.a aVar = l1.j0.f14524b;
            sVarC = new s(aVar.i(), jE, aVar.i(), l1.j0.u(jE, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            hVar.O(sVarC);
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return sVarC;
    }

    public final s b(t0.l lVar, int i10) {
        lVar.e(-1519621781);
        if (t0.o.I()) {
            t0.o.U(-1519621781, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:551)");
        }
        s sVarA = a(y.f18928a.a(lVar, 6), lVar, (i10 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        long jE = ((l1.j0) lVar.P(k.a())).E();
        if (l1.j0.w(sVarA.e(), jE)) {
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return sVarA;
        }
        s sVarC = sVarA.c((5 & 1) != 0 ? sVarA.f18893a : 0L, (5 & 2) != 0 ? sVarA.f18894b : jE, (5 & 4) != 0 ? sVarA.f18895c : 0L, (5 & 8) != 0 ? sVarA.f18896d : l1.j0.u(jE, 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return sVarC;
    }
}
