package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class k {
    private static androidx.core.os.c a(androidx.core.os.c cVar, androidx.core.os.c cVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < cVar.g() + cVar2.g()) {
            Locale localeC = i10 < cVar.g() ? cVar.c(i10) : cVar2.c(i10 - cVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i10++;
        }
        return androidx.core.os.c.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static androidx.core.os.c b(androidx.core.os.c cVar, androidx.core.os.c cVar2) {
        return (cVar == null || cVar.f()) ? androidx.core.os.c.e() : a(cVar, cVar2);
    }
}
