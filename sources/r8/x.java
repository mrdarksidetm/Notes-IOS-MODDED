package r8;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class x extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19236a;

    public x(Context context) {
        this.f19236a = context;
    }

    private final void V() {
        if (e9.p.a(this.f19236a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // r8.t
    public final void j() {
        V();
        r.c(this.f19236a).d();
    }

    @Override // r8.t
    public final void k() {
        V();
        c cVarB = c.b(this.f19236a);
        GoogleSignInAccount googleSignInAccountC = cVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f8334l;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = cVarB.d();
        }
        com.google.android.gms.auth.api.signin.b bVarA = com.google.android.gms.auth.api.signin.a.a(this.f19236a, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            bVarA.d();
        } else {
            bVarA.signOut();
        }
    }
}
