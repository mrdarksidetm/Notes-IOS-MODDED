package s6;

import android.content.Context;
import android.util.Pair;
import com.aheaditec.talsec_security.security.Natives;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3 f20322a = new t3();

    public static final Pair<String, X509Certificate> a(Context context, String[] strArr) {
        ae.r.f(context, f1.a("542B017CAC3B5B"));
        ae.r.f(strArr, f1.b(f1.c("56341F40A830474497")));
        return Natives.f7024a.a(context, strArr);
    }

    public static final String b(Context context, String[] strArr) {
        ae.r.f(context, f1.a("542B017CAC3B5B"));
        ae.r.f(strArr, f1.b(f1.c("56280367BE264B718F1373553C680F")));
        return Natives.f7024a.d(context, strArr);
    }

    public static final String c(Context context, String[] strArr) {
        ae.r.f(context, f1.a("542B017CAC3B5B"));
        ae.r.f(strArr, f1.b(f1.c("56280367BE264B72901B4F5122")));
        return Natives.f7024a.e(context, strArr);
    }
}
