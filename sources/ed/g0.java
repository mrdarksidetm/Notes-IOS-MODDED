package ed;

import ae.i0;
import android.content.Context;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ he.j<Object>[] f10945a = {i0.f(new ae.b0(g0.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final de.a f10946b = c4.a.b("FlutterSharedPreferences", null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final a4.f<d4.d> b(Context context) {
        return (a4.f) f10946b.a(context, f10945a[0]);
    }

    public static final boolean c(String str, Object obj, Set<String> set) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object d(Object obj, d0 d0Var) {
        ae.r.f(d0Var, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (je.v.G(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null)) {
            String strSubstring = str.substring(40);
            ae.r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return d0Var.b(strSubstring);
        }
        if (!je.v.G(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false, 2, null)) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        ae.r.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
        return Double.valueOf(Double.parseDouble(strSubstring2));
    }
}
