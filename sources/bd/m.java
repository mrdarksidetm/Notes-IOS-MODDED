package bd;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes2.dex */
public class m {
    com.google.android.gms.auth.api.signin.b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return com.google.android.gms.auth.api.signin.a.a(context, googleSignInOptions);
    }

    GoogleSignInAccount b(Context context) {
        return com.google.android.gms.auth.api.signin.a.b(context);
    }

    boolean c(GoogleSignInAccount googleSignInAccount, Scope scope) {
        return com.google.android.gms.auth.api.signin.a.d(googleSignInAccount, scope);
    }

    void d(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope[] scopeArr) {
        com.google.android.gms.auth.api.signin.a.e(activity, i10, googleSignInAccount, scopeArr);
    }
}
