package s6;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import java.io.File;
import java.nio.file.Files;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class s extends e1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20292e = f1.a("760C2D60A014766D973E7866156C3E6AEF2568486A20164B05915A2F7FDDFC594E37175D8C0C471087060509");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20294g = f1.b(f1.c("6325037BAC207072B4"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f20293f = {f1.b(f1.c("542B0239")), f1.b(f1.c("742B0239")), f1.b(f1.c("540B0239")), f1.b(f1.c("740B0239")), f1.b(f1.c("542B2239")), f1.b(f1.c("742B2239")), f1.b(f1.c("540B2239")), f1.b(f1.c("740B2239")), f1.b(f1.c("740B2239")), f1.b(f1.c("542B023A")), f1.b(f1.c("742B023A")), f1.b(f1.c("540B023A")), f1.b(f1.c("740B023A")), f1.b(f1.c("542B223A")), f1.b(f1.c("742B223A")), f1.b(f1.c("540B223A")), f1.b(f1.c("740B223A")), f1.b(f1.c("740B223A")), f1.b(f1.c("542B023B")), f1.b(f1.c("742B023B")), f1.b(f1.c("540B023B")), f1.b(f1.c("740B023B")), f1.b(f1.c("542B223B")), f1.b(f1.c("742B223B")), f1.b(f1.c("540B223B")), f1.b(f1.c("740B223B")), f1.b(f1.c("740B223B")), f1.b(f1.c("542B023C")), f1.b(f1.c("742B023C")), f1.b(f1.c("540B023C")), f1.b(f1.c("740B023C")), f1.b(f1.c("542B223C")), f1.b(f1.c("742B223C")), f1.b(f1.c("540B223C")), f1.b(f1.c("740B223C")), f1.b(f1.c("740B223C"))};

    public s(Context context) {
        super(context, f1.a("760C2D60A014766D973E7866156C3E6AEF2568486A20164B05915A2F7FDDFC594E37175D8C0C471087060509"), f20293f);
        l(context);
        i(m(f1.a("7F251C60AC27704C8D134F55256818")));
    }

    public s(Context context, String str, String[] strArr) {
        super(context, str, strArr);
    }

    public static String m(String str) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(f1.a("640C2E25FB7619")).digest(str.getBytes(je.d.f14191b)), 2);
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // s6.e1
    public void c() {
        super.c();
    }

    @Override // s6.e1
    public void f(String str, String str2) {
        super.f(m(str), str2);
    }

    @Override // s6.e1
    public boolean h(String str) {
        return k(str) != null;
    }

    @Override // s6.e1
    public void i(String str) {
        super.i(str);
    }

    @Override // s6.e1
    public String k(String str) {
        String strM = m(str);
        return this.f20058a.contains(strM) ? super.k(strM) : super.k(str);
    }

    public final void l(Context context) {
        try {
            File file = new File(context.getFilesDir().getParent() + e1.f20055b + f1.a("6325037BAC207072B4") + f1.a("193C0264"));
            if (file.exists()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    Files.delete(file.toPath());
                } else if (!file.delete()) {
                    new l1(-7774, f1.a("742B1A64AD2D0855C410585834791972F00E4E0F6C02376E55AB7E746B93AC695E280A"));
                }
            }
        } catch (Exception e10) {
            new l1(-7774, f1.a("723C0C6DB937464E8A54594123641235BF0D464B3C00206D56BC697F6695E97C17360A65A6354E4DCA"), e10);
        }
    }
}
