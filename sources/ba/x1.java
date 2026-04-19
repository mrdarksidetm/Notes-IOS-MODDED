package ba;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public class x1 extends m0 {
    public static final Parcelable.Creator<x1> CREATOR = new w1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzahr f5641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f5644g;

    x1(String str, String str2, String str3, zzahr zzahrVar, String str4, String str5, String str6) {
        this.f5638a = zzag.zzb(str);
        this.f5639b = str2;
        this.f5640c = str3;
        this.f5641d = zzahrVar;
        this.f5642e = str4;
        this.f5643f = str5;
        this.f5644g = str6;
    }

    public static x1 D(zzahr zzahrVar) {
        w8.m.l(zzahrVar, "Must specify a non-null webSignInCredential");
        return new x1(null, null, null, zzahrVar, null, null, null);
    }

    static x1 E(String str, String str2, String str3, String str4) {
        w8.m.f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new x1(str, str2, str3, null, null, null, str4);
    }

    public static x1 F(String str, String str2, String str3, String str4, String str5) {
        w8.m.f(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new x1(str, str2, str3, null, str4, str5, null);
    }

    public static zzahr G(x1 x1Var, String str) {
        w8.m.k(x1Var);
        zzahr zzahrVar = x1Var.f5641d;
        return zzahrVar != null ? zzahrVar : new zzahr(x1Var.B(), x1Var.A(), x1Var.u(), null, x1Var.C(), null, str, x1Var.f5642e, x1Var.f5644g);
    }

    @Override // ba.m0
    public String A() {
        return this.f5640c;
    }

    @Override // ba.m0
    public String B() {
        return this.f5639b;
    }

    @Override // ba.m0
    public String C() {
        return this.f5643f;
    }

    @Override // ba.h
    public String u() {
        return this.f5638a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, u(), false);
        x8.c.C(parcel, 2, B(), false);
        x8.c.C(parcel, 3, A(), false);
        x8.c.A(parcel, 4, this.f5641d, i10, false);
        x8.c.C(parcel, 5, this.f5642e, false);
        x8.c.C(parcel, 6, C(), false);
        x8.c.C(parcel, 7, this.f5644g, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return this.f5638a;
    }

    @Override // ba.h
    public final h z() {
        return new x1(this.f5638a, this.f5639b, this.f5640c, this.f5641d, this.f5642e, this.f5643f, this.f5644g);
    }
}
