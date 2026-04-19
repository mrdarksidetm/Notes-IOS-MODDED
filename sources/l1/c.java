package l1;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Canvas f14497a = new Canvas();

    public static final b0 a(v0 v0Var) {
        b bVar = new b();
        bVar.x(new Canvas(g.b(v0Var)));
        return bVar;
    }

    public static final b0 b(Canvas canvas) {
        b bVar = new b();
        bVar.x(canvas);
        return bVar;
    }

    public static final Canvas d(b0 b0Var) {
        ae.r.d(b0Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((b) b0Var).w();
    }
}
