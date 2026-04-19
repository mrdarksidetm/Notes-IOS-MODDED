package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final e.c b(j jVar, int i10, int i11) {
        e.c cVarY1 = jVar.L0().y1();
        if (cVarY1 == null || (cVarY1.x1() & i10) == 0) {
            return null;
        }
        while (cVarY1 != null) {
            int iC1 = cVarY1.C1();
            if ((iC1 & i11) != 0) {
                return null;
            }
            if ((iC1 & i10) != 0) {
                return cVarY1;
            }
            cVarY1 = cVarY1.y1();
        }
        return null;
    }
}
