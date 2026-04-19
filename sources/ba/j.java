package ba;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;

/* JADX INFO: loaded from: classes2.dex */
public class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f5602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5603e;

    j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    j(String str, String str2, String str3, String str4, boolean z10) {
        this.f5599a = w8.m.e(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f5600b = str2;
        this.f5601c = str3;
        this.f5602d = str4;
        this.f5603e = z10;
    }

    public static boolean B(String str) {
        f fVarC;
        return (TextUtils.isEmpty(str) || (fVarC = f.c(str)) == null || fVarC.b() != 4) ? false : true;
    }

    public final j A(a0 a0Var) {
        this.f5602d = a0Var.zze();
        this.f5603e = true;
        return this;
    }

    public final String C() {
        return this.f5602d;
    }

    public final boolean D() {
        return !TextUtils.isEmpty(this.f5601c);
    }

    @Override // ba.h
    public String u() {
        return URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, this.f5599a, false);
        x8.c.C(parcel, 2, this.f5600b, false);
        x8.c.C(parcel, 3, this.f5601c, false);
        x8.c.C(parcel, 4, this.f5602d, false);
        x8.c.g(parcel, 5, this.f5603e);
        x8.c.b(parcel, iA);
    }

    @Override // ba.h
    public String x() {
        return !TextUtils.isEmpty(this.f5600b) ? URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD : "emailLink";
    }

    @Override // ba.h
    public final h z() {
        return new j(this.f5599a, this.f5600b, this.f5601c, this.f5602d, this.f5603e);
    }

    public final String zzc() {
        return this.f5599a;
    }

    public final String zzd() {
        return this.f5600b;
    }

    public final String zze() {
        return this.f5601c;
    }

    public final boolean zzg() {
        return this.f5603e;
    }
}
