package n2;

import android.content.Context;
import android.graphics.Typeface;
import n2.b;

/* JADX INFO: loaded from: classes.dex */
final class l0 implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f15858a = new l0();

    private l0() {
    }

    @Override // n2.b.a
    public Object a(Context context, b bVar, qd.d<? super Typeface> dVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // n2.b.a
    public Typeface b(Context context, b bVar) {
        p pVar = bVar instanceof p ? (p) bVar : null;
        if (pVar != null) {
            return pVar.f(context);
        }
        return null;
    }
}
