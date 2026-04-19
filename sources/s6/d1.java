package s6;

import android.content.Context;
import android.util.Base64;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20041j = f1.a("5E2A1C7CA82D4C44AD10");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20042k = f1.b(f1.c("51280E6FBA"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f20044i;

    public d1(Context context) {
        super(context);
        if (h(f1.a("5E2A1C7CA82D4C44AD10"))) {
            this.f20043h = k(f1.a("5E2A1C7CA82D4C44AD10"));
        } else {
            String string = UUID.randomUUID().toString();
            this.f20043h = string;
            f(f1.a("5E2A1C7CA82D4C44AD10"), string);
        }
        this.f20044i = new m(context);
    }

    public void n(byte[] bArr) {
        f(f1.a("51280E6FBA"), Base64.encodeToString(bArr, 2));
    }

    public String o() {
        return this.f20044i.a();
    }

    public byte[] p() {
        return !h(f1.a("51280E6FBA")) ? new byte[2] : Base64.decode(k(f1.b(f1.c("51280E6FBA"))), 2);
    }
}
