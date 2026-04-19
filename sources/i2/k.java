package i2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final int a(List<n> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            n nVar = list.get(i12);
            byte b10 = nVar.f() > i10 ? (byte) 1 : nVar.b() <= i10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int b(List<n> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            n nVar = list.get(i12);
            byte b10 = nVar.g() > i10 ? (byte) 1 : nVar.c() <= i10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int c(List<n> list, float f10) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            n nVar = list.get(i11);
            byte b10 = nVar.h() > f10 ? (byte) 1 : nVar.a() <= f10 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void d(List<n> list, long j10, zd.l<? super n, md.i0> lVar) {
        int size = list.size();
        for (int iA = a(list, e0.j(j10)); iA < size; iA++) {
            n nVar = list.get(iA);
            if (nVar.f() >= e0.i(j10)) {
                return;
            }
            if (nVar.f() != nVar.b()) {
                lVar.invoke(nVar);
            }
        }
    }
}
