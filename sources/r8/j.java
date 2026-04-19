package r8;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class j extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f19226a;

    j(k kVar) {
        this.f19226a = kVar;
    }

    @Override // r8.e, r8.v
    public final void x(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            k kVar = this.f19226a;
            r.c(kVar.f19227a).e(kVar.f19228b, googleSignInAccount);
        }
        this.f19226a.setResult(new q8.b(googleSignInAccount, status));
    }
}
