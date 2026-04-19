package l9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class l extends n {
    public static final Parcelable.Creator<l> CREATOR = new w1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f14880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f14881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14882c;

    l(u uVar, Uri uri, byte[] bArr) {
        this.f14880a = (u) w8.m.k(uVar);
        A(uri);
        this.f14881b = uri;
        B(bArr);
        this.f14882c = bArr;
    }

    private static Uri A(Uri uri) {
        w8.m.k(uri);
        w8.m.b(uri.getScheme() != null, "origin scheme must be non-empty");
        w8.m.b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] B(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        w8.m.b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return w8.k.b(this.f14880a, lVar.f14880a) && w8.k.b(this.f14881b, lVar.f14881b);
    }

    public int hashCode() {
        return w8.k.c(this.f14880a, this.f14881b);
    }

    public byte[] u() {
        return this.f14882c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 2, z(), i10, false);
        x8.c.A(parcel, 3, x(), i10, false);
        x8.c.k(parcel, 4, u(), false);
        x8.c.b(parcel, iA);
    }

    public Uri x() {
        return this.f14881b;
    }

    public u z() {
        return this.f14880a;
    }
}
