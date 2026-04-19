package g2;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f11362a = new AtomicInteger(0);

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, zd.l<? super x, i0> lVar) {
        return eVar.h(new ClearAndSetSemanticsElement(lVar));
    }

    public static final int b() {
        return f11362a.addAndGet(1);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, zd.l<? super x, i0> lVar) {
        return eVar.h(new AppendedSemanticsElement(z10, lVar));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, boolean z10, zd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(eVar, z10, lVar);
    }
}
