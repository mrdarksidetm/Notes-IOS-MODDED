package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e9.d f8320n = e9.f.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f8326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f8328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List f8330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f8331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f8332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f8333m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f8321a = i10;
        this.f8322b = str;
        this.f8323c = str2;
        this.f8324d = str3;
        this.f8325e = str4;
        this.f8326f = uri;
        this.f8327g = str5;
        this.f8328h = j10;
        this.f8329i = str6;
        this.f8330j = list;
        this.f8331k = str7;
        this.f8332l = str8;
    }

    public static GoogleSignInAccount F(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), m.e(str7), new ArrayList((Collection) m.k(set)), str5, str6);
    }

    public static GoogleSignInAccount G(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountF = F(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountF.f8327g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountF;
    }

    public String A() {
        return this.f8322b;
    }

    public String B() {
        return this.f8323c;
    }

    public Set<Scope> C() {
        HashSet hashSet = new HashSet(this.f8330j);
        hashSet.addAll(this.f8333m);
        return hashSet;
    }

    public String D() {
        return this.f8327g;
    }

    public boolean E() {
        return f8320n.a() / 1000 >= this.f8328h + (-300);
    }

    public final String H() {
        return this.f8329i;
    }

    public final String I() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (A() != null) {
                jSONObject.put("id", A());
            }
            if (B() != null) {
                jSONObject.put("tokenId", B());
            }
            if (t() != null) {
                jSONObject.put("email", t());
            }
            if (k() != null) {
                jSONObject.put("displayName", k());
            }
            if (x() != null) {
                jSONObject.put("givenName", x());
            }
            if (u() != null) {
                jSONObject.put("familyName", u());
            }
            Uri uriB = b();
            if (uriB != null) {
                jSONObject.put("photoUrl", uriB.toString());
            }
            if (D() != null) {
                jSONObject.put("serverAuthCode", D());
            }
            jSONObject.put("expirationTime", this.f8328h);
            jSONObject.put("obfuscatedIdentifier", this.f8329i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f8330j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: q8.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).u().compareTo(((Scope) obj2).u());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.u());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Uri b() {
        return this.f8326f;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f8329i.equals(this.f8329i) && googleSignInAccount.C().equals(C());
    }

    public int hashCode() {
        return ((this.f8329i.hashCode() + 527) * 31) + C().hashCode();
    }

    public String k() {
        return this.f8325e;
    }

    public Account r() {
        String str = this.f8324d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String t() {
        return this.f8324d;
    }

    public String u() {
        return this.f8332l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f8321a);
        x8.c.C(parcel, 2, A(), false);
        x8.c.C(parcel, 3, B(), false);
        x8.c.C(parcel, 4, t(), false);
        x8.c.C(parcel, 5, k(), false);
        x8.c.A(parcel, 6, b(), i10, false);
        x8.c.C(parcel, 7, D(), false);
        x8.c.v(parcel, 8, this.f8328h);
        x8.c.C(parcel, 9, this.f8329i, false);
        x8.c.G(parcel, 10, this.f8330j, false);
        x8.c.C(parcel, 11, x(), false);
        x8.c.C(parcel, 12, u(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f8331k;
    }

    public Set<Scope> z() {
        return new HashSet(this.f8330j);
    }
}
