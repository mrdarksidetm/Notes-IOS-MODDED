package r2;

import android.graphics.Typeface;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p3<Object> f19176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f19177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19178c;

    public t(p3<? extends Object> p3Var, t tVar) {
        this.f19176a = p3Var;
        this.f19177b = tVar;
        this.f19178c = p3Var.getValue();
    }

    public final Typeface a() {
        Object obj = this.f19178c;
        ae.r.d(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean b() {
        t tVar;
        return this.f19176a.getValue() != this.f19178c || ((tVar = this.f19177b) != null && tVar.b());
    }
}
