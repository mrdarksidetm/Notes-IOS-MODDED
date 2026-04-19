package ca;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f6631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z8.a f6632d;

    public c1(Context context, String str) {
        w8.m.k(context);
        this.f6630b = w8.m.e(str);
        this.f6629a = context.getApplicationContext();
        this.f6631c = this.f6629a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f6630b), 0);
        this.f6632d = new z8.a("StorageHelpers", new String[0]);
    }

    private final g b(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        i iVarA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z10 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString(DiagnosticsEntry.VERSION_KEY);
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(e2.u(jSONArray3.getString(i10)));
            }
            g gVar = new g(x9.f.o(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                gVar.U(zzagl.zzb(string));
            }
            if (!z10) {
                gVar.V();
            }
            gVar.b0(str);
            if (jSONObject.has("userMetadata") && (iVarA = i.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                gVar.d0(iVarA);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i11));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? ba.r0.A(jSONObject2) : Objects.equals(strOptString, "totp") ? ba.x0.A(jSONObject2) : null);
                }
                gVar.Y(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    arrayList3.add(ba.n1.u(new JSONObject(jSONArray.getString(i12))));
                }
                gVar.W(arrayList3);
            }
            return gVar;
        } catch (zzzh | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e10) {
            this.f6632d.j(e10);
            return null;
        }
    }

    private final String g(ba.a0 a0Var) {
        JSONObject jSONObject = new JSONObject();
        if (!g.class.isAssignableFrom(a0Var.getClass())) {
            return null;
        }
        g gVar = (g) a0Var;
        try {
            jSONObject.put("cachedTokenState", gVar.zze());
            jSONObject.put("applicationName", gVar.T().p());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (gVar.h0() != null) {
                JSONArray jSONArray = new JSONArray();
                List<e2> listH0 = gVar.h0();
                int size = listH0.size();
                if (listH0.size() > 30) {
                    this.f6632d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(listH0.size()));
                    size = 30;
                }
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    e2 e2Var = listH0.get(i10);
                    if (e2Var.c().equals("firebase")) {
                        z10 = true;
                    }
                    if (i10 == size - 1 && !z10) {
                        break;
                    }
                    jSONArray.put(e2Var.x());
                }
                if (!z10) {
                    int i11 = size - 1;
                    while (true) {
                        if (i11 >= listH0.size() || i11 < 0) {
                            break;
                        }
                        e2 e2Var2 = listH0.get(i11);
                        if (e2Var2.c().equals("firebase")) {
                            jSONArray.put(e2Var2.x());
                            z10 = true;
                            break;
                        }
                        if (i11 == listH0.size() - 1) {
                            jSONArray.put(e2Var2.x());
                        }
                        i11++;
                    }
                    if (!z10) {
                        this.f6632d.h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(listH0.size()), Integer.valueOf(size));
                        if (listH0.size() < 5) {
                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                            Iterator<e2> it = listH0.iterator();
                            while (it.hasNext()) {
                                sb2.append(String.format("Provider - %s\n", it.next().c()));
                            }
                            this.f6632d.h(sb2.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", gVar.D());
            jSONObject.put(DiagnosticsEntry.VERSION_KEY, "2");
            if (gVar.z() != null) {
                jSONObject.put("userMetadata", ((i) gVar.z()).b());
            }
            List<ba.j0> listB = ((k) gVar.A()).b();
            if (listB != null && !listB.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i12 = 0; i12 < listB.size(); i12++) {
                    jSONArray2.put(listB.get(i12).z());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List<ba.n1> listZ = gVar.Z();
            if (listZ != null && !listZ.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i13 = 0; i13 < listZ.size(); i13++) {
                    jSONArray3.put(ba.n1.z(listZ.get(i13)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            this.f6632d.i("Failed to turn object into JSON", e10, new Object[0]);
            throw new zzzh(e10);
        }
    }

    public final ba.a0 a() {
        String string = this.f6631c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return b(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzagl c(ba.a0 a0Var) {
        w8.m.k(a0Var);
        String string = this.f6631c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.d()), null);
        if (string != null) {
            return zzagl.zzb(string);
        }
        return null;
    }

    public final void d(ba.a0 a0Var, zzagl zzaglVar) {
        w8.m.k(a0Var);
        w8.m.k(zzaglVar);
        this.f6631c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", a0Var.d()), zzaglVar.zzf()).apply();
    }

    public final void e(String str) {
        this.f6631c.edit().remove(str).apply();
    }

    public final void f(ba.a0 a0Var) {
        w8.m.k(a0Var);
        String strG = g(a0Var);
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        this.f6631c.edit().putString("com.google.firebase.auth.FIREBASE_USER", strG).apply();
    }
}
