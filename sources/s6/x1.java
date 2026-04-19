package s6;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20383b = f1.a("552D016CA02D487E851A59463E64180DF606");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20384c = f1.b(f1.c("552D016CA02D487E94015F58386E2339FA1B"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f20385a;

    public x1(Context context) {
        this.f20385a = new s(context);
    }

    public void a(String str) {
        this.f20385a.f(f1.a("552D016CA02D487E851A59463E64180DF606"), str);
    }

    public void b(PublicKey publicKey) {
        this.f20385a.f(f1.a("552D016CA02D487E94015F58386E2339FA1B"), Base64.encodeToString(publicKey.getEncoded(), 2));
    }

    public boolean c() {
        return this.f20385a.h(f1.a("552D016CA02D487E851A59463E64180DF606"));
    }

    public String d() {
        if (this.f20385a.h(f1.a("552D016CA02D487E851A59463E64180DF606"))) {
            return this.f20385a.k(f1.b(f1.c("552D016CA02D487E851A59463E64180DF606")));
        }
        return null;
    }

    public PublicKey e() {
        if (!this.f20385a.h(f1.a("552D016CA02D487E94015F58386E2339FA1B"))) {
            return null;
        }
        try {
            return KeyFactory.getInstance(f1.b(f1.c("65172E"))).generatePublic(new X509EncodedKeySpec(Base64.decode(this.f20385a.k(f1.b(f1.c("552D016CA02D487E94015F58386E2339FA1B"))), 2)));
        } catch (Exception unused) {
            return null;
        }
    }
}
