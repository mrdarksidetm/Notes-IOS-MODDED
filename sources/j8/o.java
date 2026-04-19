package j8;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f14118a = {"com.google", "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14119b = "androidPackageName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ComponentName f14120c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z8.a f14121d = j.a("GoogleAuthUtil");

    public static void a(Context context, String str) throws d, IOException {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0L, null).zza();
    }

    public static TokenData d(final Context context, final Account account, final String str, Bundle bundle, long j10, Executor executor) throws d, IOException {
        w8.m.j("Calling this from your main thread can lead to deadlock");
        w8.m.f(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        zzdc.zzd(context);
        if (zzhw.zze() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(zzh.zza(context).zzc(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f14120c, new n() { // from class: j8.l
            @Override // j8.n
            public final Object a(IBinder iBinder) {
                return o.e(account, str, bundle2, context, iBinder);
            }
        }, 0L, null);
    }

    static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws IOException {
        Bundle bundleZze = zze.zzb(iBinder).zze(account, str, bundle);
        if (bundleZze != null) {
            return h(context, "getTokenWithDetails", bundleZze);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object f(Object obj) throws IOException {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j10) throws d, IOException {
        w8.m.j("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        zzdc.zzd(context);
        if (zzhw.zze() && q(context)) {
            zzg zzgVarZza = zzh.zza(context);
            zzbw zzbwVar = new zzbw();
            zzbwVar.zza(str);
            try {
                j(zzgVarZza.zza(zzbwVar), "clear token");
                return;
            } catch (com.google.android.gms.common.api.b e10) {
                m(e10, "clear token");
            }
        }
        i(context, f14120c, new m(str, bundle), 0L, null);
    }

    private static TokenData h(Context context, String str, Bundle bundle) throws d, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new d("Invalid state. Shouldn't happen");
    }

    private static Object i(Context context, ComponentName componentName, n nVar, long j10, Executor executor) throws IOException {
        t8.a aVar = new t8.a();
        com.google.android.gms.common.internal.e eVarC = com.google.android.gms.common.internal.e.c(context);
        try {
            try {
                if (!eVarC.a(componentName, aVar, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return nVar.a(aVar.a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                eVarC.e(componentName, aVar, "GoogleAuthUtil");
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(Task task, String str) throws IOException, com.google.android.gms.common.api.b {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String str2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f14121d.h(str2, new Object[0]);
            throw new IOException(str2, e10);
        } catch (CancellationException e11) {
            String str3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f14121d.h(str3, new Object[0]);
            throw new IOException(str3, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof com.google.android.gms.common.api.b) {
                throw ((com.google.android.gms.common.api.b) cause);
            }
            String str4 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f14121d.h(str4, new Object[0]);
            throw new IOException(str4, e12);
        }
    }

    private static Object k(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        f14121d.h("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) throws d {
        try {
            t8.l.a(context.getApplicationContext(), i10);
        } catch (GooglePlayServicesIncorrectManifestValueException e10) {
            e = e10;
            throw new d(e.getMessage(), e);
        } catch (t8.i e11) {
            e = e11;
            throw new d(e.getMessage(), e);
        } catch (t8.j e12) {
            throw new f(e12.b(), e12.getMessage(), e12.a());
        }
    }

    private static void m(com.google.android.gms.common.api.b bVar, String str) {
        f14121d.h("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f14119b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws d, IOException {
        zzby zzbyVarZza = zzby.zza(str2);
        z8.a aVar = f14121d;
        aVar.h(String.format("[GoogleAuthUtil] error status:%s with method:%s", zzbyVarZza, str), new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zzbyVarZza) && !zzby.CAPTCHA.equals(zzbyVarZza) && !zzby.NEED_PERMISSION.equals(zzbyVarZza) && !zzby.NEED_REMOTE_CONSENT.equals(zzbyVarZza) && !zzby.NEEDS_BROWSER.equals(zzbyVarZza) && !zzby.USER_CANCEL.equals(zzbyVarZza) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVarZza) && !zzby.DM_INTERNAL_ERROR.equals(zzbyVarZza) && !zzby.DM_SYNC_DISABLED.equals(zzbyVarZza) && !zzby.DM_ADMIN_BLOCKED.equals(zzbyVarZza) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zzbyVarZza) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zzbyVarZza) && !zzby.DM_DEACTIVATED.equals(zzbyVarZza) && !zzby.DM_REQUIRED.equals(zzbyVarZza) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zzbyVarZza) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zzbyVarZza)) {
            if (!zzby.NETWORK_ERROR.equals(zzbyVarZza) && !zzby.SERVICE_UNAVAILABLE.equals(zzbyVarZza) && !zzby.INTNERNAL_ERROR.equals(zzbyVarZza) && !zzby.AUTH_SECURITY_ERROR.equals(zzbyVarZza) && !zzby.ACCOUNT_NOT_PRESENT.equals(zzbyVarZza)) {
                throw new d(str2);
            }
            throw new IOException(str2);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (t8.g.m().a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            Integer numValueOf = Integer.valueOf(a.e.API_PRIORITY_OTHER);
            aVar.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", numValueOf, str, numValueOf), new Object[0]);
        }
        if (intent == null) {
            aVar.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f14118a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean q(Context context) {
        if (t8.g.m().h(context, 17895000) != 0) {
            return false;
        }
        List listZzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        Iterator it = listZzq.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
