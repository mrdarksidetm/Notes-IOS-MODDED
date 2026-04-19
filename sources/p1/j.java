package p1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<h> f18016a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f18017b = new float[64];

    public final j a(String str) {
        int i10;
        char cCharAt;
        int i11;
        this.f18016a.clear();
        int length = str.length();
        int i12 = 0;
        while (i12 < length && ae.r.g(str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && ae.r.g(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                cCharAt = str.charAt(i12);
                int i14 = cCharAt | ' ';
                if ((i14 - 97) * (i14 - 122) <= 0 && i14 != 101) {
                    break;
                }
                if (i10 >= length) {
                    cCharAt = 0;
                    break;
                }
                i12 = i10;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || ae.r.g(str.charAt(i10), 32) > 0) {
                            long jA = b.a(str, i10, length);
                            i11 = (int) (jA >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f18017b;
                                int i15 = i13 + 1;
                                fArr[i13] = fIntBitsToFloat;
                                if (i15 >= fArr.length) {
                                    float[] fArr2 = new float[i15 * 2];
                                    this.f18017b = fArr2;
                                    nd.o.e(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i15;
                            }
                            while (i11 < length && str.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                i.a(cCharAt, this.f18016a, this.f18017b, i13);
            }
            i12 = i10;
        }
        return this;
    }

    public final List<h> b() {
        return this.f18016a;
    }
}
