package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m9.d;
import m9.e;
import w8.k;
import w8.m;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f8685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f8686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f8687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m9.a f8690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Set f8692h;

    RegisterRequestParams(Integer num, Double d10, Uri uri, List list, List list2, m9.a aVar, String str) {
        this.f8685a = num;
        this.f8686b = d10;
        this.f8687c = uri;
        m.b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f8688d = list;
        this.f8689e = list2;
        this.f8690f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            m.b((uri == null && dVar.u() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (dVar.u() != null) {
                hashSet.add(Uri.parse(dVar.u()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            m.b((uri == null && eVar.u() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (eVar.u() != null) {
                hashSet.add(Uri.parse(eVar.u()));
            }
        }
        this.f8692h = hashSet;
        m.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f8691g = str;
    }

    public List<d> A() {
        return this.f8688d;
    }

    public List<e> B() {
        return this.f8689e;
    }

    public Integer C() {
        return this.f8685a;
    }

    public Double D() {
        return this.f8686b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return k.b(this.f8685a, registerRequestParams.f8685a) && k.b(this.f8686b, registerRequestParams.f8686b) && k.b(this.f8687c, registerRequestParams.f8687c) && k.b(this.f8688d, registerRequestParams.f8688d) && (((list = this.f8689e) == null && registerRequestParams.f8689e == null) || (list != null && (list2 = registerRequestParams.f8689e) != null && list.containsAll(list2) && registerRequestParams.f8689e.containsAll(this.f8689e))) && k.b(this.f8690f, registerRequestParams.f8690f) && k.b(this.f8691g, registerRequestParams.f8691g);
    }

    public int hashCode() {
        return k.c(this.f8685a, this.f8687c, this.f8686b, this.f8688d, this.f8689e, this.f8690f, this.f8691g);
    }

    public Uri u() {
        return this.f8687c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.u(parcel, 2, C(), false);
        c.o(parcel, 3, D(), false);
        c.A(parcel, 4, u(), i10, false);
        c.G(parcel, 5, A(), false);
        c.G(parcel, 6, B(), false);
        c.A(parcel, 7, x(), i10, false);
        c.C(parcel, 8, z(), false);
        c.b(parcel, iA);
    }

    public m9.a x() {
        return this.f8690f;
    }

    public String z() {
        return this.f8691g;
    }
}
