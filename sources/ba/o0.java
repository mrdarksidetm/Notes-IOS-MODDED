package ba;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class o0 extends h implements Cloneable {
    public static final Parcelable.Creator<o0> CREATOR = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5620e;

    o0(String str, String str2, String str3, boolean z10, String str4) {
        w8.m.b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f5616a = str;
        this.f5617b = str2;
        this.f5618c = str3;
        this.f5619d = z10;
        this.f5620e = str4;
    }

    public static o0 B(String str, String str2) {
        return new o0(str, str2, null, true, null);
    }

    public static o0 D(String str, String str2) {
        return new o0(null, null, str, true, str2);
    }

    public String A() {
        return this.f5617b;
    }

    public final o0 C(boolean z10) {
        this.f5619d = false;
        return this;
    }

    public final String E() {
        return this.f5618c;
    }

    public final boolean F() {
        return this.f5619d;
    }

    public /* synthetic */ Object clone() {
        return new o0(this.f5616a, A(), this.f5618c, this.f5619d, this.f5620e);
    }

    @Override // ba.h
    public String u() {
        return "phone";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5616a, false);
        x8.c.C(parcel, 2, A(), false);
        x8.c.C(parcel, 4, this.f5618c, false);
        x8.c.g(parcel, 5, this.f5619d);
        x8.c.C(parcel, 6, this.f5620e, false);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return "phone";
    }

    @Override // ba.h
    public final h z() {
        return (o0) clone();
    }

    public final String zzc() {
        return this.f5616a;
    }

    public final String zzd() {
        return this.f5620e;
    }
}
