package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends x8.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f8334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f8335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Scope f8336n = new Scope("profile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope f8337o = new Scope("email");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Scope f8338p = new Scope("openid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Scope f8339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Scope f8340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Comparator f8341s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f8343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Account f8344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f8350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f8352k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f8353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f8357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Account f8358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f8359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f8360h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f8361i;

        public a() {
            this.f8353a = new HashSet();
            this.f8360h = new HashMap();
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f8353a = new HashSet();
            this.f8360h = new HashMap();
            m.k(googleSignInOptions);
            this.f8353a = new HashSet(googleSignInOptions.f8343b);
            this.f8354b = googleSignInOptions.f8346e;
            this.f8355c = googleSignInOptions.f8347f;
            this.f8356d = googleSignInOptions.f8345d;
            this.f8357e = googleSignInOptions.f8348g;
            this.f8358f = googleSignInOptions.f8344c;
            this.f8359g = googleSignInOptions.f8349h;
            this.f8360h = GoogleSignInOptions.Q(googleSignInOptions.f8350i);
            this.f8361i = googleSignInOptions.f8351j;
        }

        private final String k(String str) {
            m.e(str);
            String str2 = this.f8357e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            m.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f8353a.contains(GoogleSignInOptions.f8340r)) {
                Set set = this.f8353a;
                Scope scope = GoogleSignInOptions.f8339q;
                if (set.contains(scope)) {
                    this.f8353a.remove(scope);
                }
            }
            if (this.f8356d && (this.f8358f == null || !this.f8353a.isEmpty())) {
                c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f8353a), this.f8358f, this.f8356d, this.f8354b, this.f8355c, this.f8357e, this.f8359g, this.f8360h, this.f8361i);
        }

        public a b() {
            this.f8353a.add(GoogleSignInOptions.f8337o);
            return this;
        }

        public a c() {
            this.f8353a.add(GoogleSignInOptions.f8338p);
            return this;
        }

        public a d(String str) {
            this.f8356d = true;
            k(str);
            this.f8357e = str;
            return this;
        }

        public a e() {
            this.f8353a.add(GoogleSignInOptions.f8336n);
            return this;
        }

        public a f(Scope scope, Scope... scopeArr) {
            this.f8353a.add(scope);
            this.f8353a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a g(String str, boolean z10) {
            this.f8354b = true;
            k(str);
            this.f8357e = str;
            this.f8355c = z10;
            return this;
        }

        public a h(String str) {
            this.f8358f = new Account(m.e(str), "com.google");
            return this;
        }

        public a i(String str) {
            this.f8359g = m.e(str);
            return this;
        }

        public a j(String str) {
            this.f8361i = str;
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f8339q = scope;
        f8340r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.c();
        aVar.e();
        f8334l = aVar.a();
        a aVar2 = new a();
        aVar2.f(scope, new Scope[0]);
        f8335m = aVar2.a();
        CREATOR = new e();
        f8341s = new d();
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, Q(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f8342a = i10;
        this.f8343b = arrayList;
        this.f8344c = account;
        this.f8345d = z10;
        this.f8346e = z11;
        this.f8347f = z12;
        this.f8348g = str;
        this.f8349h = str2;
        this.f8350i = new ArrayList(map.values());
        this.f8352k = map;
        this.f8351j = str3;
    }

    public static GoogleSignInOptions F(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map Q(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r8.a aVar = (r8.a) it.next();
                map.put(Integer.valueOf(aVar.u()), aVar);
            }
        }
        return map;
    }

    public String A() {
        return this.f8348g;
    }

    public boolean B() {
        return this.f8347f;
    }

    public boolean C() {
        return this.f8345d;
    }

    public boolean D() {
        return this.f8346e;
    }

    public final String J() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f8343b, f8341s);
            Iterator it = this.f8343b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).u());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f8344c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f8345d);
            jSONObject.put("forceCodeForRefreshToken", this.f8347f);
            jSONObject.put("serverAuthRequested", this.f8346e);
            if (!TextUtils.isEmpty(this.f8348g)) {
                jSONObject.put("serverClientId", this.f8348g);
            }
            if (!TextUtils.isEmpty(this.f8349h)) {
                jSONObject.put("hostedDomain", this.f8349h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f8350i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f8350i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f8343b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f8343b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f8344c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.r()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.r()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f8348g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.A()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f8348g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.A()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f8347f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.B()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f8345d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.C()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f8346e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.D()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f8351j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.x()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f8343b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).u());
        }
        Collections.sort(arrayList);
        r8.b bVar = new r8.b();
        bVar.a(arrayList);
        bVar.a(this.f8344c);
        bVar.a(this.f8348g);
        bVar.c(this.f8347f);
        bVar.c(this.f8345d);
        bVar.c(this.f8346e);
        bVar.a(this.f8351j);
        return bVar.b();
    }

    public Account r() {
        return this.f8344c;
    }

    public ArrayList<r8.a> u() {
        return this.f8350i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8342a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.G(parcel, 2, z(), false);
        x8.c.A(parcel, 3, r(), i10, false);
        x8.c.g(parcel, 4, C());
        x8.c.g(parcel, 5, D());
        x8.c.g(parcel, 6, B());
        x8.c.C(parcel, 7, A(), false);
        x8.c.C(parcel, 8, this.f8349h, false);
        x8.c.G(parcel, 9, u(), false);
        x8.c.C(parcel, 10, x(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f8351j;
    }

    public ArrayList<Scope> z() {
        return new ArrayList<>(this.f8343b);
    }
}
