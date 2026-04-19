package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import w8.k;
import w8.m;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f8295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Account f8296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f8299h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f8300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Account f8304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f8305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f8306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f8307h;

        private final String h(String str) {
            m.k(str);
            String str2 = this.f8301b;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            m.b(z10, "two different server client ids provided");
            return str;
        }

        public AuthorizationRequest a() {
            return new AuthorizationRequest(this.f8300a, this.f8301b, this.f8302c, this.f8303d, this.f8304e, this.f8305f, this.f8306g, this.f8307h);
        }

        public a b(String str) {
            this.f8305f = m.e(str);
            return this;
        }

        public a c(String str, boolean z10) {
            h(str);
            this.f8301b = str;
            this.f8302c = true;
            this.f8307h = z10;
            return this;
        }

        public a d(Account account) {
            this.f8304e = (Account) m.k(account);
            return this;
        }

        public a e(List<Scope> list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            m.b(z10, "requestedScopes cannot be null or empty");
            this.f8300a = list;
            return this;
        }

        public final a f(String str) {
            h(str);
            this.f8301b = str;
            this.f8303d = true;
            return this;
        }

        public final a g(String str) {
            this.f8306g = str;
            return this;
        }
    }

    AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12) {
        boolean z13 = false;
        if (list != null && !list.isEmpty()) {
            z13 = true;
        }
        m.b(z13, "requestedScopes cannot be null or empty");
        this.f8292a = list;
        this.f8293b = str;
        this.f8294c = z10;
        this.f8295d = z11;
        this.f8296e = account;
        this.f8297f = str2;
        this.f8298g = str3;
        this.f8299h = z12;
    }

    public static a D(AuthorizationRequest authorizationRequest) {
        m.k(authorizationRequest);
        a aVarU = u();
        aVarU.e(authorizationRequest.z());
        boolean zB = authorizationRequest.B();
        String strX = authorizationRequest.x();
        Account accountR = authorizationRequest.r();
        String strA = authorizationRequest.A();
        String str = authorizationRequest.f8298g;
        if (str != null) {
            aVarU.g(str);
        }
        if (strX != null) {
            aVarU.b(strX);
        }
        if (accountR != null) {
            aVarU.d(accountR);
        }
        if (authorizationRequest.f8295d && strA != null) {
            aVarU.f(strA);
        }
        if (authorizationRequest.C() && strA != null) {
            aVarU.c(strA, zB);
        }
        return aVarU;
    }

    public static a u() {
        return new a();
    }

    public String A() {
        return this.f8293b;
    }

    public boolean B() {
        return this.f8299h;
    }

    public boolean C() {
        return this.f8294c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        return this.f8292a.size() == authorizationRequest.f8292a.size() && this.f8292a.containsAll(authorizationRequest.f8292a) && this.f8294c == authorizationRequest.f8294c && this.f8299h == authorizationRequest.f8299h && this.f8295d == authorizationRequest.f8295d && k.b(this.f8293b, authorizationRequest.f8293b) && k.b(this.f8296e, authorizationRequest.f8296e) && k.b(this.f8297f, authorizationRequest.f8297f) && k.b(this.f8298g, authorizationRequest.f8298g);
    }

    public int hashCode() {
        return k.c(this.f8292a, this.f8293b, Boolean.valueOf(this.f8294c), Boolean.valueOf(this.f8299h), Boolean.valueOf(this.f8295d), this.f8296e, this.f8297f, this.f8298g);
    }

    public Account r() {
        return this.f8296e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.G(parcel, 1, z(), false);
        c.C(parcel, 2, A(), false);
        c.g(parcel, 3, C());
        c.g(parcel, 4, this.f8295d);
        c.A(parcel, 5, r(), i10, false);
        c.C(parcel, 6, x(), false);
        c.C(parcel, 7, this.f8298g, false);
        c.g(parcel, 8, B());
        c.b(parcel, iA);
    }

    public String x() {
        return this.f8297f;
    }

    public List<Scope> z() {
        return this.f8292a;
    }
}
