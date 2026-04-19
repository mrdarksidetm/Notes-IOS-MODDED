package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(j jVar) {
        int iA = w0.a(4);
        int iA2 = w0.a(2);
        e.c cVarY1 = jVar.L0().y1();
        if (cVarY1 == null || (cVarY1.x1() & iA) == 0) {
            return null;
        }
        while (cVarY1 != null && (cVarY1.C1() & iA2) == 0) {
            if ((cVarY1.C1() & iA) != 0) {
                return cVarY1;
            }
            cVarY1 = cVarY1.y1();
        }
        return null;
    }
}
