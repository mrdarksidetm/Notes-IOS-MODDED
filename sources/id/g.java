package id;

import id.f;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends f {
    public static String a(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!f.a.g(b10)) {
                break;
            }
            i10++;
            f.a.b(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (f.a.g(b11)) {
                int i16 = i14 + 1;
                f.a.b(b11, cArr, i14);
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    if (!f.a.g(b12)) {
                        break;
                    }
                    i15++;
                    f.a.b(b12, cArr, i16);
                    i16++;
                }
                i10 = i15;
                i14 = i16;
            } else if (f.a.i(b11)) {
                if (i15 >= i12) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                f.a.d(b11, bArr[i15], cArr, i14);
                i10 = i15 + 1;
                i14++;
            } else if (f.a.h(b11)) {
                if (i15 >= i12 - 1) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i17 = i15 + 1;
                f.a.c(b11, bArr[i15], bArr[i17], cArr, i14);
                i10 = i17 + 1;
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
                int i18 = i15 + 1;
                byte b13 = bArr[i15];
                int i19 = i18 + 1;
                f.a.a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                i10 = i19 + 1;
                i14 = i14 + 1 + 1;
            }
        }
        return new String(cArr, 0, i14);
    }
}
