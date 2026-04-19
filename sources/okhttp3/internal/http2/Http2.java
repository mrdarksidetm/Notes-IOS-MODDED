package okhttp3.internal.http2;

import ae.r;
import hf.f;
import je.v;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Http2 f17364a = new Http2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f17365b = f.f11960d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f17366c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f17367d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f17368e;

    static {
        String[] strArr = new String[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            r.e(binaryString, "toBinaryString(it)");
            strArr[i11] = v.B(Util.s("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f17368e = strArr;
        String[] strArr2 = f17367d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = 0;
        while (i12 < 1) {
            int i13 = iArr[i12];
            i12++;
            String[] strArr3 = f17367d;
            strArr3[i13 | 8] = r.m(strArr3[i13], "|PADDED");
        }
        String[] strArr4 = f17367d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i14 = 0;
        while (i14 < 3) {
            int i15 = iArr2[i14];
            i14++;
            int i16 = 0;
            while (i16 < 1) {
                int i17 = iArr[i16];
                i16++;
                String[] strArr5 = f17367d;
                int i18 = i17 | i15;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) strArr5[i17]);
                sb2.append('|');
                sb2.append((Object) strArr5[i15]);
                strArr5[i18] = sb2.toString();
                strArr5[i18 | 8] = ((Object) strArr5[i17]) + '|' + ((Object) strArr5[i15]) + "|PADDED";
            }
        }
        int length = f17367d.length;
        while (i10 < length) {
            int i19 = i10 + 1;
            String[] strArr6 = f17367d;
            if (strArr6[i10] == null) {
                strArr6[i10] = f17368e[i10];
            }
            i10 = i19;
        }
    }

    private Http2() {
    }

    public final String a(int i10, int i11) {
        String str;
        boolean z10;
        int i12;
        Object obj;
        String str2;
        String str3;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f17368e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f17367d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    r.c(str);
                } else {
                    str = f17368e[i11];
                }
                String str4 = str;
                if (i10 == 5 && (i11 & 4) != 0) {
                    z10 = false;
                    i12 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else {
                    if (i10 != 0 || (i11 & 32) == 0) {
                        return str4;
                    }
                    z10 = false;
                    i12 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return v.C(str4, str2, str3, z10, i12, obj);
            }
        }
        return f17368e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f17366c;
        return i10 < strArr.length ? strArr[i10] : Util.s("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return Util.s("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
