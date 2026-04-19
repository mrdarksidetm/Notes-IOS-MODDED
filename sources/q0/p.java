package q0;

import c0.i1;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0.b0 f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i1<w2.h> f18820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i1<w2.h> f18821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i1<w2.h> f18822d;

    static {
        c0.v vVar = new c0.v(0.4f, 0.0f, 0.6f, 1.0f);
        f18819a = vVar;
        f18820b = new i1<>(R.styleable.AppCompatTheme_windowFixedHeightMajor, 0, c0.d0.c(), 2, null);
        f18821c = new i1<>(150, 0, vVar, 2, null);
        f18822d = new i1<>(R.styleable.AppCompatTheme_windowFixedHeightMajor, 0, vVar, 2, null);
    }

    public static final Object d(c0.a<w2.h, ?> aVar, float f10, g0.j jVar, g0.j jVar2, qd.d<? super md.i0> dVar) {
        c0.i<w2.h> iVarA = jVar2 != null ? o.f18797a.a(jVar2) : jVar != null ? o.f18797a.b(jVar) : null;
        if (iVarA != null) {
            Object objF = c0.a.f(aVar, w2.h.i(f10), iVarA, null, null, dVar, 12, null);
            return objF == rd.d.e() ? objF : md.i0.f15558a;
        }
        Object objT = aVar.t(w2.h.i(f10), dVar);
        return objT == rd.d.e() ? objT : md.i0.f15558a;
    }
}
