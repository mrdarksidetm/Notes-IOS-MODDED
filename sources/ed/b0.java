package ed;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sc.b f10809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d0 f10811c;

    public b0(sc.b bVar, Context context, d0 d0Var) {
        ae.r.f(bVar, "messenger");
        ae.r.f(context, "context");
        ae.r.f(d0Var, "listEncoder");
        this.f10809a = bVar;
        this.f10810b = context;
        this.f10811c = d0Var;
        try {
            a0.O.o(bVar, this, "shared_preferences");
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e10);
        }
    }

    private final SharedPreferences n(e0 e0Var) {
        SharedPreferences sharedPreferencesA = e0Var.a() == null ? u4.b.a(this.f10810b) : this.f10810b.getSharedPreferences(e0Var.a(), 0);
        ae.r.c(sharedPreferencesA);
        return sharedPreferencesA;
    }

    @Override // ed.a0
    public List<String> a(String str, e0 e0Var) {
        List list;
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        SharedPreferences sharedPreferencesN = n(e0Var);
        ArrayList arrayList = null;
        if (sharedPreferencesN.contains(str) && (list = (List) g0.d(sharedPreferencesN.getString(str, ""), this.f10811c)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // ed.a0
    public Boolean b(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        SharedPreferences sharedPreferencesN = n(e0Var);
        if (sharedPreferencesN.contains(str)) {
            return Boolean.valueOf(sharedPreferencesN.getBoolean(str, true));
        }
        return null;
    }

    @Override // ed.a0
    public Double c(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        SharedPreferences sharedPreferencesN = n(e0Var);
        if (!sharedPreferencesN.contains(str)) {
            return null;
        }
        Object objD = g0.d(sharedPreferencesN.getString(str, ""), this.f10811c);
        ae.r.d(objD, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objD;
    }

    @Override // ed.a0
    public void d(String str, boolean z10, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        n(e0Var).edit().putBoolean(str, z10).apply();
    }

    @Override // ed.a0
    public String e(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        SharedPreferences sharedPreferencesN = n(e0Var);
        if (sharedPreferencesN.contains(str)) {
            return sharedPreferencesN.getString(str, "");
        }
        return null;
    }

    @Override // ed.a0
    public void f(String str, double d10, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        n(e0Var).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d10).apply();
    }

    @Override // ed.a0
    public void g(String str, long j10, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        n(e0Var).edit().putLong(str, j10).apply();
    }

    @Override // ed.a0
    public void h(List<String> list, e0 e0Var) {
        ae.r.f(e0Var, "options");
        SharedPreferences sharedPreferencesN = n(e0Var);
        SharedPreferences.Editor editorEdit = sharedPreferencesN.edit();
        ae.r.e(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesN.getAll();
        ae.r.e(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (g0.c(str, all.get(str), list != null ? nd.c0.H0(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    @Override // ed.a0
    public Long i(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        SharedPreferences sharedPreferencesN = n(e0Var);
        if (sharedPreferencesN.contains(str)) {
            return Long.valueOf(sharedPreferencesN.getLong(str, 0L));
        }
        return null;
    }

    @Override // ed.a0
    public void j(String str, String str2, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(str2, "value");
        ae.r.f(e0Var, "options");
        n(e0Var).edit().putString(str, str2).apply();
    }

    @Override // ed.a0
    public void k(String str, List<String> list, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(list, "value");
        ae.r.f(e0Var, "options");
        n(e0Var).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f10811c.a(list)).apply();
    }

    @Override // ed.a0
    public Map<String, Object> l(List<String> list, e0 e0Var) {
        Object value;
        ae.r.f(e0Var, "options");
        Map<String, ?> all = n(e0Var).getAll();
        ae.r.e(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (g0.c(entry.getKey(), entry.getValue(), list != null ? nd.c0.H0(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objD = g0.d(value, this.f10811c);
                ae.r.d(objD, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objD);
            }
        }
        return map;
    }

    @Override // ed.a0
    public List<String> m(List<String> list, e0 e0Var) {
        ae.r.f(e0Var, "options");
        Map<String, ?> all = n(e0Var).getAll();
        ae.r.e(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            ae.r.e(key, "<get-key>(...)");
            if (g0.c(key, entry.getValue(), list != null ? nd.c0.H0(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return nd.c0.C0(linkedHashMap.keySet());
    }

    public final void o() {
        a0.O.o(this.f10809a, null, "shared_preferences");
    }
}
