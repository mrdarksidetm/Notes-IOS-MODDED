package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import w8.k;
import w8.m;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f8308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8313f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PendingIntent f8314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f8315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f8316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f8317d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f8318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f8319f;

        public SaveAccountLinkingTokenRequest a() {
            m.b(this.f8314a != null, "Consent PendingIntent cannot be null");
            m.b("auth_code".equals(this.f8315b), "Invalid tokenType");
            m.b(!TextUtils.isEmpty(this.f8316c), "serviceId cannot be null or empty");
            m.b(this.f8317d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f8314a, this.f8315b, this.f8316c, this.f8317d, this.f8318e, this.f8319f);
        }

        public a b(PendingIntent pendingIntent) {
            this.f8314a = pendingIntent;
            return this;
        }

        public a c(List<String> list) {
            this.f8317d = list;
            return this;
        }

        public a d(String str) {
            this.f8316c = str;
            return this;
        }

        public a e(String str) {
            this.f8315b = str;
            return this;
        }

        public final a f(String str) {
            this.f8318e = str;
            return this;
        }

        public final a g(int i10) {
            this.f8319f = i10;
            return this;
        }
    }

    SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f8308a = pendingIntent;
        this.f8309b = str;
        this.f8310c = str2;
        this.f8311d = list;
        this.f8312e = str3;
        this.f8313f = i10;
    }

    public static a C(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        m.k(saveAccountLinkingTokenRequest);
        a aVarU = u();
        aVarU.c(saveAccountLinkingTokenRequest.z());
        aVarU.d(saveAccountLinkingTokenRequest.A());
        aVarU.b(saveAccountLinkingTokenRequest.x());
        aVarU.e(saveAccountLinkingTokenRequest.B());
        aVarU.g(saveAccountLinkingTokenRequest.f8313f);
        String str = saveAccountLinkingTokenRequest.f8312e;
        if (!TextUtils.isEmpty(str)) {
            aVarU.f(str);
        }
        return aVarU;
    }

    public static a u() {
        return new a();
    }

    public String A() {
        return this.f8310c;
    }

    public String B() {
        return this.f8309b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f8311d.size() == saveAccountLinkingTokenRequest.f8311d.size() && this.f8311d.containsAll(saveAccountLinkingTokenRequest.f8311d) && k.b(this.f8308a, saveAccountLinkingTokenRequest.f8308a) && k.b(this.f8309b, saveAccountLinkingTokenRequest.f8309b) && k.b(this.f8310c, saveAccountLinkingTokenRequest.f8310c) && k.b(this.f8312e, saveAccountLinkingTokenRequest.f8312e) && this.f8313f == saveAccountLinkingTokenRequest.f8313f;
    }

    public int hashCode() {
        return k.c(this.f8308a, this.f8309b, this.f8310c, this.f8311d, this.f8312e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.A(parcel, 1, x(), i10, false);
        c.C(parcel, 2, B(), false);
        c.C(parcel, 3, A(), false);
        c.E(parcel, 4, z(), false);
        c.C(parcel, 5, this.f8312e, false);
        c.s(parcel, 6, this.f8313f);
        c.b(parcel, iA);
    }

    public PendingIntent x() {
        return this.f8308a;
    }

    public List<String> z() {
        return this.f8311d;
    }
}
