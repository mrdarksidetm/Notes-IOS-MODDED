package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends ba.l0 {
    public static final Parcelable.Creator<r> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ba.r0> f6739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<ba.x0> f6740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f6741e;

    private r() {
    }

    r(String str, String str2, List<ba.r0> list, List<ba.x0> list2, g gVar) {
        this.f6737a = str;
        this.f6738b = str2;
        this.f6739c = list;
        this.f6740d = list2;
        this.f6741e = gVar;
    }

    public static r x(String str, g gVar) {
        w8.m.e(str);
        r rVar = new r();
        rVar.f6737a = str;
        rVar.f6741e = gVar;
        return rVar;
    }

    public static r z(List<ba.j0> list, String str) {
        List list2;
        x8.d dVar;
        w8.m.k(list);
        w8.m.e(str);
        r rVar = new r();
        rVar.f6739c = new ArrayList();
        rVar.f6740d = new ArrayList();
        for (ba.j0 j0Var : list) {
            if (j0Var instanceof ba.r0) {
                list2 = rVar.f6739c;
                dVar = (ba.r0) j0Var;
            } else {
                if (!(j0Var instanceof ba.x0)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + j0Var.x());
                }
                list2 = rVar.f6740d;
                dVar = (ba.x0) j0Var;
            }
            list2.add(dVar);
        }
        rVar.f6738b = str;
        return rVar;
    }

    public final String A() {
        return this.f6737a;
    }

    public final boolean B() {
        return this.f6737a != null;
    }

    public final g u() {
        return this.f6741e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f6737a, false);
        x8.c.C(parcel, 2, this.f6738b, false);
        x8.c.G(parcel, 3, this.f6739c, false);
        x8.c.G(parcel, 4, this.f6740d, false);
        x8.c.A(parcel, 5, this.f6741e, i10, false);
        x8.c.b(parcel, iA);
    }

    public final String zzc() {
        return this.f6738b;
    }
}
