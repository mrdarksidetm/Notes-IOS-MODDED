package z6;

import ae.r;
import android.content.Context;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import jc.a;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements jc.a, j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f24253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24254b;

    private final String a() {
        Context context = this.f24254b;
        if (context == null) {
            r.t("applicationContext");
            context = null;
        }
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(context);
        r.d(dateFormat, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String localizedPattern = ((SimpleDateFormat) dateFormat).toLocalizedPattern();
        r.e(localizedPattern, "toLocalizedPattern(...)");
        return localizedPattern;
    }

    private final String b() {
        Context context = this.f24254b;
        if (context == null) {
            r.t("applicationContext");
            context = null;
        }
        DateFormat dateInstance = DateFormat.getDateInstance(0, context.getResources().getConfiguration().locale);
        r.d(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String localizedPattern = ((SimpleDateFormat) dateInstance).toLocalizedPattern();
        r.e(localizedPattern, "toLocalizedPattern(...)");
        return localizedPattern;
    }

    private final String c() {
        Context context = this.f24254b;
        if (context == null) {
            r.t("applicationContext");
            context = null;
        }
        DateFormat longDateFormat = android.text.format.DateFormat.getLongDateFormat(context);
        r.d(longDateFormat, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String localizedPattern = ((SimpleDateFormat) longDateFormat).toLocalizedPattern();
        r.e(localizedPattern, "toLocalizedPattern(...)");
        return localizedPattern;
    }

    private final String d() {
        Context context = this.f24254b;
        if (context == null) {
            r.t("applicationContext");
            context = null;
        }
        DateFormat mediumDateFormat = android.text.format.DateFormat.getMediumDateFormat(context);
        r.d(mediumDateFormat, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String localizedPattern = ((SimpleDateFormat) mediumDateFormat).toLocalizedPattern();
        r.e(localizedPattern, "toLocalizedPattern(...)");
        return localizedPattern;
    }

    private final String e() {
        Context context = this.f24254b;
        if (context == null) {
            r.t("applicationContext");
            context = null;
        }
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(context);
        r.d(timeFormat, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String localizedPattern = ((SimpleDateFormat) timeFormat).toLocalizedPattern();
        r.e(localizedPattern, "toLocalizedPattern(...)");
        return localizedPattern;
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        r.f(bVar, "flutterPluginBinding");
        j jVar = new j(bVar.b(), "system_date_time_format");
        this.f24253a = jVar;
        jVar.e(this);
        Context contextA = bVar.a();
        r.e(contextA, "getApplicationContext(...)");
        this.f24254b = contextA;
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        r.f(bVar, "binding");
        j jVar = this.f24253a;
        if (jVar == null) {
            r.t("channel");
            jVar = null;
        }
        jVar.e(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        String strD;
        r.f(iVar, "call");
        r.f(dVar, "result");
        String str = iVar.f20503a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1635213808:
                    if (str.equals("getMediumDateFormat")) {
                        strD = d();
                    }
                    break;
                case -142503621:
                    if (str.equals("getDateFormat")) {
                        strD = a();
                    }
                    break;
                case 118743322:
                    if (str.equals("getTimeFormat")) {
                        strD = e();
                    }
                    break;
                case 1499749847:
                    if (str.equals("getLongDateFormat")) {
                        strD = c();
                    }
                    break;
                case 2119695914:
                    if (str.equals("getFullDateFormat")) {
                        strD = b();
                    }
                    break;
            }
            dVar.success(strD);
            return;
        }
        dVar.notImplemented();
    }
}
