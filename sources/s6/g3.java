package s6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class g3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f20084n = f1.a("52361D67BB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.b f20085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f20086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f20087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f20094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f20095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f20096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f20097m;

    public g3(Context context) {
        this.f20085a = ((Build.VERSION.SDK_INT < 28 || context.checkSelfPermission(f1.a("562A0B7AA62A4B0F94114F59387E0F3BF00C047A4F350D4A7996565F5CA4C54C")) != 0) && context.checkSelfPermission(f1.a("562A0B7AA62A4B0F94114F59387E0F3BF00C047A4F350D4E79975C5F5AA6DE467910")) != 0) ? null : v.b.g(context);
        this.f20086b = u1.a(context);
        this.f20087c = new p1(context);
        this.f20088d = j(context);
        this.f20089e = f(context);
        this.f20090f = h(context);
        this.f20091g = r();
        this.f20092h = l();
        this.f20093i = q();
        this.f20094j = i();
        this.f20095k = x();
        this.f20096l = e(f1.a("5E373C4D852A41549C31535533611936"));
        this.f20097m = e(f1.a("5E373C4D852A41549C3153523E7F1F37FB"));
    }

    public final int a(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), f1.a("56200D57AC2D4E43881159"), 0);
    }

    public String b() {
        return String.valueOf(this.f20088d);
    }

    public final String c(String str) {
        String str2;
        try {
            String strD = j3.d(str);
            if (strD != null) {
                if (!strD.isEmpty()) {
                    return strD;
                }
            }
            str2 = "592B016D";
        } catch (Exception unused) {
            str2 = "52361D67BB";
        }
        return f1.a(str2);
    }

    public String d() {
        v.b bVar = this.f20085a;
        if (bVar == null) {
            return null;
        }
        try {
            int iA = bVar.a(255);
            if (iA == 0) {
                return f1.a("56271B61BF26");
            }
            if (iA != 1) {
                if (iA == 11) {
                    return f1.a("592B016D8C2D5D4E88185850");
                }
                if (iA != 12) {
                    return f1.a("52361D67BB");
                }
            }
            return f1.a("592B2769BB2758409611");
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final String e(String str) {
        try {
            return String.valueOf(((Boolean) Class.forName(f1.a("562A0B7AA62A4B0F8B0713671441153CEA1A")).getMethod(str, new Class[0]).invoke(null, new Object[0])).booleanValue());
        } catch (Error unused) {
            return f1.a("52361D67BB");
        } catch (Exception unused2) {
            return f1.a("52361D67BB");
        }
    }

    public final boolean f(Context context) {
        return t8.g.m().g(context) == 0;
    }

    public String g() {
        return this.f20094j;
    }

    public final boolean h(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(f1.a("542B0226A1364E56811D135C266418"), 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final String i() {
        return c(f1.a("50211B78BB2C5F01961B13563E62087CEC07464672052A"));
    }

    public final boolean j(Context context) {
        return a(context) == 1;
    }

    public String k() {
        return this.f20092h;
    }

    public final String l() {
        return c(f1.a("50211B78BB2C5F01961B135624641036B1114F43751E2770"));
    }

    public boolean m() {
        return this.f20089e;
    }

    public boolean n() {
        return this.f20090f;
    }

    public String o() {
        return this.f20087c.a().toString();
    }

    public String p() {
        u1 u1Var = this.f20086b;
        if (u1Var == null) {
            return f1.a("52361D67BB");
        }
        return f1.a(u1Var.b() ? "5B2B0C63AC27" : "422A0367AA284A45");
    }

    public final String q() {
        return c(f1.a("50211B6DA72540538711"));
    }

    public final String r() {
        return Build.VERSION.SECURITY_PATCH;
    }

    public String s() {
        return this.f20091g;
    }

    public String t() {
        return this.f20096l;
    }

    public String u() {
        return this.f20097m;
    }

    public String v() {
        return this.f20095k;
    }

    public String w() {
        return this.f20093i;
    }

    public final String x() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(f1.a("1837167BE6255C0E9711515D3F78047DFA0C4C406E1337"))));
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String strB = f1.b(f1.c("592B016D"));
                    bufferedReader.close();
                    return strB;
                }
                if (line.contains(f1.b(f1.c("07")))) {
                    String strB2 = f1.b(f1.c("47211D65A0305C489211"));
                    bufferedReader.close();
                    return strB2;
                }
                if (line.contains(f1.b(f1.c("06")))) {
                    String strB3 = f1.b(f1.c("522A0967BB20464F83"));
                    bufferedReader.close();
                    return strB3;
                }
                String strB4 = f1.b(f1.c("422A0466A63441"));
                bufferedReader.close();
                return strB4;
            } finally {
            }
        } catch (IOException unused) {
            return f1.b(f1.c("52361D67BB"));
        }
    }
}
