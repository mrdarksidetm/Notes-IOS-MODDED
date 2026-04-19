package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public class z0 extends h {
    public static final Parcelable.Creator<z0> CREATOR = new t1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5647b;

    z0(String str, String str2) {
        this.f5646a = w8.m.e(str);
        this.f5647b = w8.m.e(str2);
    }

    public static zzahr A(z0 z0Var, String str) {
        w8.m.k(z0Var);
        return new zzahr(null, z0Var.f5646a, z0Var.u(), null, z0Var.f5647b, null, str, null, null);
    }

    @Override // ba.h
    public String u() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5646a, false);
        x8.c.C(parcel, 2, this.f5647b, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return "twitter.com";
    }

    @Override // ba.h
    public final h z() {
        return new z0(this.f5646a, this.f5647b);
    }
}
