package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public class d0 extends h {
    public static final Parcelable.Creator<d0> CREATOR = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5565a;

    d0(String str) {
        this.f5565a = w8.m.e(str);
    }

    public static zzahr A(d0 d0Var, String str) {
        w8.m.k(d0Var);
        return new zzahr(null, d0Var.f5565a, d0Var.u(), null, null, null, str, null, null);
    }

    @Override // ba.h
    public String u() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5565a, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return "github.com";
    }

    @Override // ba.h
    public final h z() {
        return new d0(this.f5565a);
    }
}
