package androidx.compose.ui.draw;

import i1.f;
import i1.k;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final i1.e a(l<? super f, k> lVar) {
        return new a(new f(), lVar);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, l<? super n1.f, i0> lVar) {
        return eVar.h(new DrawBehindElement(lVar));
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, l<? super f, k> lVar) {
        return eVar.h(new DrawWithCacheElement(lVar));
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, l<? super n1.c, i0> lVar) {
        return eVar.h(new DrawWithContentElement(lVar));
    }
}
