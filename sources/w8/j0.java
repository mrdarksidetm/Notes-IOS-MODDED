package w8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x8.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f22640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f22641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f22643d;

    j0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f22640a = i10;
        this.f22641b = account;
        this.f22642c = i11;
        this.f22643d = googleSignInAccount;
    }

    public j0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22640a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.A(parcel, 2, this.f22641b, i10, false);
        x8.c.s(parcel, 3, this.f22642c);
        x8.c.A(parcel, 4, this.f22643d, i10, false);
        x8.c.b(parcel, iA);
    }
}
