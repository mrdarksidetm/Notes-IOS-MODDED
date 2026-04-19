package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m9.e;
import w8.k;
import w8.m;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f8693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f8694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f8695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f8696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m9.a f8698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f8700h;

    SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, List list, m9.a aVar, String str) {
        this.f8693a = num;
        this.f8694b = d10;
        this.f8695c = uri;
        this.f8696d = bArr;
        m.b((list == null || list.isEmpty()) ? false : true, "registeredKeys must not be null or empty");
        this.f8697e = list;
        this.f8698f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            m.b((eVar.u() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
            eVar.x();
            m.b(true, "register request has null challenge and no default challenge isprovided");
            if (eVar.u() != null) {
                hashSet.add(Uri.parse(eVar.u()));
            }
        }
        this.f8700h = hashSet;
        m.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f8699g = str;
    }

    public String A() {
        return this.f8699g;
    }

    public List<e> B() {
        return this.f8697e;
    }

    public Integer C() {
        return this.f8693a;
    }

    public Double D() {
        return this.f8694b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return k.b(this.f8693a, signRequestParams.f8693a) && k.b(this.f8694b, signRequestParams.f8694b) && k.b(this.f8695c, signRequestParams.f8695c) && Arrays.equals(this.f8696d, signRequestParams.f8696d) && this.f8697e.containsAll(signRequestParams.f8697e) && signRequestParams.f8697e.containsAll(this.f8697e) && k.b(this.f8698f, signRequestParams.f8698f) && k.b(this.f8699g, signRequestParams.f8699g);
    }

    public int hashCode() {
        return k.c(this.f8693a, this.f8695c, this.f8694b, this.f8697e, this.f8698f, this.f8699g, Integer.valueOf(Arrays.hashCode(this.f8696d)));
    }

    public Uri u() {
        return this.f8695c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 2, C(), false);
        c.o(parcel, 3, D(), false);
        c.A(parcel, 4, u(), i10, false);
        c.k(parcel, 5, z(), false);
        c.G(parcel, 6, B(), false);
        c.A(parcel, 7, x(), i10, false);
        c.C(parcel, 8, A(), false);
        c.b(parcel, iA);
    }

    public m9.a x() {
        return this.f8698f;
    }

    public byte[] z() {
        return this.f8696d;
    }
}
