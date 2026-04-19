package s6;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import u6.d;

/* JADX INFO: loaded from: classes.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f20129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u6.f f20131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u6.d f20132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f20133e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u6.d f20135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedList<q1> f20136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v0 f20137d;

        static {
            System.loadLibrary(f1.a("5428066A"));
        }

        public b(u6.d dVar, String str, v0 v0Var) {
            this.f20136c = new LinkedList<>();
            this.f20134a = str;
            this.f20137d = v0Var;
            this.f20135b = dVar;
            Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new Runnable() { // from class: s6.i3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20152a.f();
                }
            }, 1L, 5L, TimeUnit.SECONDS);
        }

        public final String a(String str) {
            String strB = b(str.getBytes(StandardCharsets.UTF_8));
            if (strB == null) {
                return null;
            }
            return this.f20137d.a(strB);
        }

        public final String b(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            try {
                return Base64.encodeToString(MessageDigest.getInstance(f1.a("640C2E25FB7619")).digest(bArr), 2);
            } catch (Exception unused) {
                f1.a("7B0B28");
                f1.b(f1.c("622A0E6AA5260F558B545E5B3C7D0926FA4279675D5D603D06F97F736F93FF7B1722007AE9244657811A1D583E6A52"));
                return null;
            }
        }

        public final q1 c() {
            if (this.f20136c.isEmpty()) {
                return null;
            }
            return this.f20136c.remove(0);
        }

        public final void d(q1 q1Var) {
            this.f20136c.add(q1Var);
        }

        public final void f() {
            while (!this.f20136c.isEmpty()) {
                q1 q1VarC = c();
                if (q1VarC != null) {
                    g(q1VarC);
                }
            }
        }

        public final void g(q1 q1Var) {
            try {
                d.b bVarH = this.f20135b.h();
                String string = q1Var.c().toString();
                if (f1.a("4521036DA8304A").equals(f1.b(f1.c("53210D7DAE")))) {
                    f1.b(f1.c("7B0B28"));
                    return;
                }
                if (bVarH.b()) {
                    String str = null;
                    if (bVarH.d()) {
                        str = f1.b(f1.c("76341F61AA315651904E1D")) + a(string);
                    }
                    m3.a(string, bVarH.a(), bVarH.e(), str, this.f20134a);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public h3(g0 g0Var, u6.f fVar, String str, u6.d dVar, v0 v0Var) {
        this.f20129a = g0Var;
        this.f20130b = str != null;
        this.f20131c = fVar;
        this.f20132d = dVar;
        this.f20133e = new b(dVar, str, v0Var);
    }

    public a0 a() {
        return this.f20129a.a();
    }

    public void b(Context context) {
        Set<String> setD = e() ? s0.d(context) : null;
        g0 g0Var = this.f20129a;
        this.f20133e.d(new s0(g0Var, this.f20131c, g0Var.a(), setD, this.f20132d.d(), this.f20130b));
    }

    public void c(String str, List<o0> list, List<o0> list2) {
        g0 g0Var = this.f20129a;
        this.f20133e.g(new t(g0Var, this.f20131c, str, list, list2, g0Var.a(), this.f20132d.d(), this.f20130b));
    }

    public void d(String str, List<o0> list, List<o0> list2) {
        g0 g0Var = this.f20129a;
        this.f20133e.d(new t(g0Var, this.f20131c, str, list, list2, g0Var.a(), this.f20132d.d(), this.f20130b));
    }

    public boolean e() {
        return this.f20132d.h().c();
    }
}
