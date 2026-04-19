package r8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f19216c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f19217d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f19218a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f19219b;

    c(Context context) {
        this.f19219b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        w8.m.k(context);
        Lock lock = f19216c;
        lock.lock();
        try {
            if (f19217d == null) {
                f19217d = new c(context.getApplicationContext());
            }
            c cVar = f19217d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f19216c.unlock();
            throw th;
        }
    }

    private static final String i(String str, String str2) {
        return str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2;
    }

    public void a() {
        this.f19218a.lock();
        try {
            this.f19219b.edit().clear().apply();
        } finally {
            this.f19218a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG2) || (strG = g(i("googleSignInAccount", strG2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.G(strG);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG2) || (strG = g(i("googleSignInOptions", strG2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.F(strG);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        w8.m.k(googleSignInAccount);
        w8.m.k(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.H());
        w8.m.k(googleSignInAccount);
        w8.m.k(googleSignInOptions);
        String strH = googleSignInAccount.H();
        h(i("googleSignInAccount", strH), googleSignInAccount.I());
        h(i("googleSignInOptions", strH), googleSignInOptions.J());
    }

    protected final String g(String str) {
        this.f19218a.lock();
        try {
            return this.f19219b.getString(str, null);
        } finally {
            this.f19218a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f19218a.lock();
        try {
            this.f19219b.edit().putString(str, str2).apply();
        } finally {
            this.f19218a.unlock();
        }
    }
}
