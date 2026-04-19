package j1;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    static /* synthetic */ void e(f fVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        fVar.o(z10);
    }

    boolean j(int i10);

    void o(boolean z10);
}
