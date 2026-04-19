package okhttp3.internal.ws;

import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import hf.c;

/* JADX INFO: loaded from: classes2.dex */
public final class WebSocketProtocol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WebSocketProtocol f17672a = new WebSocketProtocol();

    private WebSocketProtocol() {
    }

    public final String a(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return r.m("Code must be in range [1000,5000): ", Integer.valueOf(i10));
        }
        if (!(1004 <= i10 && i10 < 1007)) {
            if (!(1015 <= i10 && i10 < 3000)) {
                return null;
            }
        }
        return "Code " + i10 + " is reserved and may not be used.";
    }

    public final void b(c.a aVar, byte[] bArr) {
        r.f(aVar, b.f7428b);
        r.f(bArr, SubscriberAttributeKt.JSON_NAME_KEY);
        int length = bArr.length;
        int i10 = 0;
        do {
            byte[] bArr2 = aVar.f11939e;
            int i11 = aVar.f11940f;
            int i12 = aVar.f11941g;
            if (bArr2 != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr2[i11] = (byte) (bArr2[i11] ^ bArr[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (aVar.b() != -1);
    }

    public final void c(int i10) {
        String strA = a(i10);
        if (strA == null) {
            return;
        }
        r.c(strA);
        throw new IllegalArgumentException(strA.toString());
    }
}
