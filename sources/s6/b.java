package s6;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f19995c = f1.a("5E2A1C7CA82D4C44AD10");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f19996d = f1.b(f1.c("4420045EAC315C488B1A"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f19997e = f1.b(f1.c("53211961AA26664F821B"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f19998f = f1.b(f1.c("53211961AA266645"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f19999g = f1.b(f1.c("47280E7CAF2C5D4C"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f20000h = f1.b(f1.c("58270C7DBB26414281"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20001i = f1.b(f1.c("523C1B6DBB2D4E4DAD10"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20002j = f1.b(f1.c("5B2B086FA02D487297186D5D3F63153CF8"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20003k = f1.b(f1.c("4E3D1671E40E620C80101A6076453468F20F105C6F5E015B638A484952"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f20004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20005b;

    public b(g0 g0Var, boolean z10) {
        this.f20004a = g0Var;
        this.f20005b = z10;
    }

    public final String a() {
        return new SimpleDateFormat(f1.a("4E3D1671E40E620C80101A6076453468F20F105C6F5E015B638A484952"), Locale.ENGLISH).format(Calendar.getInstance().getTime());
    }

    public final String b() {
        return DateTimeFormatter.ofPattern(f1.a("4E3D1671E40E620C80101A6076453468F20F105C6F5E015B638A484952")).withLocale(Locale.ENGLISH).withZone(ZoneId.systemDefault()).format(Instant.now());
    }

    public JSONObject c() throws JSONException {
        String strB;
        String strA;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f1.a("5E2A1C7CA82D4C44AD10"), this.f20004a.d());
        jSONObject.put(f1.b(f1.c("4420045EAC315C488B1A")), f1.b(f1.c("06774138E773")));
        jSONObject.put(f1.b(f1.c("47280E7CAF2C5D4C")), f1.b(f1.c("762A0B7AA62A4B")));
        jSONObject.put(f1.b(f1.c("53211961AA26664F821B")), new q2().a());
        jSONObject.put(f1.b(f1.c("53211961AA266645")), new c2(this.f20004a.c()).a());
        jSONObject.put(f1.b(f1.c("5B2B086FA02D487297186D5D3F63153CF8")), this.f20005b);
        String strG = this.f20004a.g();
        if (strG != null) {
            jSONObject.put(f1.b(f1.c("523C1B6DBB2D4E4DAD10")), strG);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            strB = f1.b(f1.c("58270C7DBB26414281"));
            strA = b();
        } else {
            strB = f1.b(f1.c("58270C7DBB26414281"));
            strA = a();
        }
        jSONObject.put(strB, strA);
        return jSONObject;
    }
}
