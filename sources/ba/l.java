package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new z1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5604a;

    l(String str) {
        this.f5604a = w8.m.e(str);
    }

    public static zzahr A(l lVar, String str) {
        w8.m.k(lVar);
        return new zzahr(null, lVar.f5604a, lVar.u(), null, null, null, str, null, null);
    }

    @Override // ba.h
    public String u() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5604a, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return "facebook.com";
    }

    @Override // ba.h
    public final h z() {
        return new l(this.f5604a);
    }
}
