package w8;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z.c0 f22673a = new z.c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Locale f22674b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return g9.d.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? R.string.ok : s8.b.f20426a : s8.b.f20435j : s8.b.f20429d);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(s8.b.f20430e, strA);
        }
        if (i10 == 2) {
            return e9.g.d(context) ? resources.getString(s8.b.f20439n) : resources.getString(s8.b.f20436k, strA);
        }
        if (i10 == 3) {
            return resources.getString(s8.b.f20427b, strA);
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(s8.b.f20434i, strA);
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(s8.b.f20438m, strA);
            default:
                return resources.getString(t8.n.f21339a, strA);
        }
    }

    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    public static String e(Context context, int i10) {
        String strH = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return strH == null ? context.getResources().getString(s8.b.f20433h) : strH;
    }

    public static String f(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(s8.b.f20431f);
            case 2:
                return resources.getString(s8.b.f20437l);
            case 3:
                return resources.getString(s8.b.f20428c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i10;
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(t8.n.f21339a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    private static String h(Context context, String str) {
        z.c0 c0Var = f22673a;
        synchronized (c0Var) {
            Locale localeC = androidx.core.os.b.a(context.getResources().getConfiguration()).c(0);
            if (!localeC.equals(f22674b)) {
                c0Var.clear();
                f22674b = localeC;
            }
            String str2 = (String) c0Var.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources resourcesD = t8.k.d(context);
            if (resourcesD == null) {
                return null;
            }
            int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = resourcesD.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                c0Var.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}
