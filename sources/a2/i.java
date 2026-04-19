package a2;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final <T> T a(h hVar, t0.u<T> uVar) {
        if (hVar.L0().H1()) {
            return (T) k.k(hVar).H().a(uVar);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.".toString());
    }
}
