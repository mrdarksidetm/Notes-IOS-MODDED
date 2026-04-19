package n2;

import android.content.Context;
import android.graphics.Typeface;
import n2.b;

/* JADX INFO: loaded from: classes.dex */
final class j implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f15829a = new j();

    private j() {
    }

    @Override // n2.b.a
    public Object a(Context context, b bVar, qd.d<?> dVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // n2.b.a
    public Typeface b(Context context, b bVar) {
        i iVar = bVar instanceof i ? (i) bVar : null;
        if (iVar != null) {
            return iVar.g(context);
        }
        return null;
    }
}
