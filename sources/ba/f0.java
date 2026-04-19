package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public class f0 extends h {
    public static final Parcelable.Creator<f0> CREATOR = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5592b;

    f0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f5591a = str;
        this.f5592b = str2;
    }

    public static zzahr A(f0 f0Var, String str) {
        w8.m.k(f0Var);
        return new zzahr(f0Var.f5591a, f0Var.f5592b, f0Var.u(), null, null, null, str, null, null);
    }

    @Override // ba.h
    public String u() {
        return "google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5591a, false);
        x8.c.C(parcel, 2, this.f5592b, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return "google.com";
    }

    @Override // ba.h
    public final h z() {
        return new f0(this.f5591a, this.f5592b);
    }
}
