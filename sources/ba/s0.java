package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public class s0 extends h {
    public static final Parcelable.Creator<s0> CREATOR = new r1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5627a;

    s0(String str) {
        this.f5627a = w8.m.e(str);
    }

    public static zzahr A(s0 s0Var, String str) {
        w8.m.k(s0Var);
        return new zzahr(null, null, s0Var.u(), null, null, s0Var.f5627a, str, null, null);
    }

    @Override // ba.h
    public String u() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5627a, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return "playgames.google.com";
    }

    @Override // ba.h
    public final h z() {
        return new s0(this.f5627a);
    }
}
