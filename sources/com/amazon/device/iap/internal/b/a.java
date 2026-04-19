package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f7826a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7827b = a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7828c = a.class.getName() + "_PREFS_";

    public static a a() {
        return f7826a;
    }

    public String a(String str, String str2) {
        com.amazon.device.iap.internal.util.b.a(f7827b, "enter getReceiptIdFromSku for sku [" + str2 + "], user [" + str + "]");
        String string = null;
        try {
            f.a(str, "userId");
            f.a(str2, "sku");
            Context contextB = com.amazon.device.iap.internal.d.f().b();
            f.a(contextB, "context");
            string = contextB.getSharedPreferences(f7828c + str, 0).getString(str2, null);
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.a(f7827b, "error in saving v1 Entitlement:" + str2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + th.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(f7827b, "leaving saveEntitlementRecord for sku [" + str2 + "], user [" + str + "]");
        return string;
    }

    public void a(String str, String str2, String str3) {
        com.amazon.device.iap.internal.util.b.a(f7827b, "enter saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
        try {
            f.a(str, "userId");
            f.a(str2, com.amazon.a.a.o.b.E);
            f.a(str3, "sku");
            Context contextB = com.amazon.device.iap.internal.d.f().b();
            f.a(contextB, "context");
            SharedPreferences.Editor editorEdit = contextB.getSharedPreferences(f7828c + str, 0).edit();
            editorEdit.putString(str3, str2);
            editorEdit.commit();
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.a(f7827b, "error in saving v1 Entitlement:" + str2 + "/" + str3 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + th.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(f7827b, "leaving saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
    }
}
