package q0;

/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f18797a = new o();

    private o() {
    }

    public final c0.i<w2.h> a(g0.j jVar) {
        if ((jVar instanceof g0.p) || (jVar instanceof g0.b) || (jVar instanceof g0.g) || (jVar instanceof g0.d)) {
            return p.f18820b;
        }
        return null;
    }

    public final c0.i<w2.h> b(g0.j jVar) {
        if (!(jVar instanceof g0.p) && !(jVar instanceof g0.b)) {
            if (jVar instanceof g0.g) {
                return p.f18822d;
            }
            if (!(jVar instanceof g0.d)) {
                return null;
            }
        }
        return p.f18821c;
    }
}
