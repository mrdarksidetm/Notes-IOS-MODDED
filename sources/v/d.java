package v;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Cipher f21838b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Signature f21837a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Mac f21839c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IdentityCredential f21840d = null;

    public d(Cipher cipher) {
        this.f21838b = cipher;
    }

    public Cipher a() {
        return this.f21838b;
    }

    public IdentityCredential b() {
        return this.f21840d;
    }

    public Mac c() {
        return this.f21839c;
    }

    public Signature d() {
        return this.f21837a;
    }
}
