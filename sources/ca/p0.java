package ca;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f6724d = 3600000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zzal<String> f6725e = zzal.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", DiagnosticsEntry.TIMESTAMP_KEY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p0 f6726f = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Task<ba.i> f6727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Task<String> f6728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6729c = 0;

    private p0() {
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.x());
        editorEdit.putString("statusMessage", status.z());
        editorEdit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, e9.f.b().a());
        editorEdit.commit();
    }

    public static void c(Context context, zzahr zzahrVar, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", x8.e.f(zzahrVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, e9.f.b().a());
        editorEdit.commit();
    }

    public static void d(Context context, FirebaseAuth firebaseAuth) {
        w8.m.k(context);
        w8.m.k(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.i().p());
        editorEdit.commit();
    }

    public static void e(Context context, FirebaseAuth firebaseAuth, ba.a0 a0Var) {
        w8.m.k(context);
        w8.m.k(firebaseAuth);
        w8.m.k(a0Var);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.i().p());
        editorEdit.putString("firebaseUserUid", a0Var.d());
        editorEdit.commit();
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong(DiagnosticsEntry.TIMESTAMP_KEY, e9.f.b().a());
        editorEdit.commit();
    }

    private static void g(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzal<String> zzalVar = f6725e;
        int size = zzalVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzalVar.get(i10);
            i10++;
            editorEdit.remove(str);
        }
        editorEdit.commit();
    }

    public static p0 j() {
        return f6726f;
    }

    public final void a(Context context) {
        w8.m.k(context);
        g(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f6727a = null;
        this.f6729c = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void h(FirebaseAuth firebaseAuth) {
        zzahr zzahrVar;
        String string;
        Task<ba.i> taskT0;
        w8.m.k(firebaseAuth);
        SharedPreferences sharedPreferences = firebaseAuth.i().l().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.i().p().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (!sharedPreferences.contains("recaptchaToken")) {
                    if (sharedPreferences.contains("statusCode")) {
                        Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                        this.f6729c = sharedPreferences.getLong(DiagnosticsEntry.TIMESTAMP_KEY, 0L);
                        g(sharedPreferences);
                        this.f6727a = Tasks.forException(zzadg.zza(status));
                        return;
                    }
                    return;
                }
                String string2 = sharedPreferences.getString("recaptchaToken", "");
                String string3 = sharedPreferences.getString("operation", "");
                this.f6729c = sharedPreferences.getLong(DiagnosticsEntry.TIMESTAMP_KEY, 0L);
                string3.hashCode();
                if (string3.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    this.f6728b = Tasks.forResult(string2);
                } else {
                    this.f6728b = null;
                }
                g(sharedPreferences);
                return;
            }
            zzahrVar = (zzahr) x8.e.c(sharedPreferences.getString("verifyAssertionRequest", ""), zzahr.CREATOR);
            String string4 = sharedPreferences.getString("operation", "");
            String string5 = sharedPreferences.getString("tenantId", null);
            string = sharedPreferences.getString("firebaseUserUid", "");
            this.f6729c = sharedPreferences.getLong(DiagnosticsEntry.TIMESTAMP_KEY, 0L);
            if (string5 != null) {
                firebaseAuth.x(string5);
                zzahrVar.zzb(string5);
            }
            string4.hashCode();
            switch (string4) {
                case "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE":
                    if (firebaseAuth.j().d().equals(string)) {
                        taskT0 = firebaseAuth.t0(firebaseAuth.j(), ba.x1.D(zzahrVar));
                        this.f6727a = taskT0;
                        break;
                    }
                    this.f6727a = null;
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_LINK":
                    if (firebaseAuth.j().d().equals(string)) {
                        taskT0 = firebaseAuth.N(firebaseAuth.j(), ba.x1.D(zzahrVar));
                        this.f6727a = taskT0;
                        break;
                    }
                    this.f6727a = null;
                    break;
                case "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN":
                    taskT0 = firebaseAuth.z(ba.x1.D(zzahrVar));
                    this.f6727a = taskT0;
                    break;
                default:
                    this.f6727a = null;
                    break;
            }
            g(sharedPreferences);
        }
    }

    public final Task<String> i() {
        if (e9.f.b().a() - this.f6729c < f6724d) {
            return this.f6728b;
        }
        return null;
    }
}
