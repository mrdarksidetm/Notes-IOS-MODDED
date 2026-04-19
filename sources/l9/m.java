package l9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class m extends n {
    public static final Parcelable.Creator<m> CREATOR = new x1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f14883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f14884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14885c;

    m(x xVar, Uri uri, byte[] bArr) {
        this.f14883a = (x) w8.m.k(xVar);
        A(uri);
        this.f14884b = uri;
        B(bArr);
        this.f14885c = bArr;
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return w8.k.b(this.f14883a, mVar.f14883a) && w8.k.b(this.f14884b, mVar.f14884b);
    }

    public int hashCode() {
        return w8.k.c(this.f14883a, this.f14884b);
    }

    public byte[] u() {
        return this.f14885c;
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
        return this.f14884b;
    }

    public x z() {
        return this.f14883a;
    }
}
