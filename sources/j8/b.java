package j8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class b extends x8.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f14088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f14089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    String f14090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Account f14091d;

    b(int i10, int i11, String str, Account account) {
        this.f14088a = i10;
        this.f14089b = i11;
        this.f14090c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f14091d = account;
        } else {
            this.f14091d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f14088a);
        x8.c.s(parcel, 2, this.f14089b);
        x8.c.C(parcel, 3, this.f14090c, false);
        x8.c.A(parcel, 4, this.f14091d, i10, false);
        x8.c.b(parcel, iA);
    }
}
