package j0;

import j0.d;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(v0.d<d.a<T>> dVar, int i10) {
        int iO = dVar.o() - 1;
        int i11 = 0;
        while (i11 < iO) {
            int i12 = ((iO - i11) / 2) + i11;
            int iB = dVar.n()[i12].b();
            if (iB == i10) {
                return i12;
            }
            if (iB < i10) {
                i11 = i12 + 1;
                if (i10 < dVar.n()[i11].b()) {
                    return i12;
                }
            } else {
                iO = i12 - 1;
            }
        }
        return i11;
    }
}
