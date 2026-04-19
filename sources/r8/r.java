package r8;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f19232d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c f19233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f19234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f19235c;

    private r(Context context) {
        c cVarB = c.b(context);
        this.f19233a = cVarB;
        this.f19234b = cVarB.c();
        this.f19235c = cVarB.d();
    }

    public static synchronized r c(Context context) {
        return f(context.getApplicationContext());
    }

    private static synchronized r f(Context context) {
        r rVar = f19232d;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(context);
        f19232d = rVar2;
        return rVar2;
    }

    public final synchronized GoogleSignInAccount a() {
        return this.f19234b;
    }

    public final synchronized GoogleSignInOptions b() {
        return this.f19235c;
    }

    public final synchronized void d() {
        this.f19233a.a();
        this.f19234b = null;
        this.f19235c = null;
    }

    public final synchronized void e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f19233a.f(googleSignInAccount, googleSignInOptions);
        this.f19234b = googleSignInAccount;
        this.f19235c = googleSignInOptions;
    }
}
