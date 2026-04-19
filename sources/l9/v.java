package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzbc;
import com.google.android.gms.internal.fido.zzh;
import java.util.Arrays;
import java.util.List;
import l9.z;

/* JADX INFO: loaded from: classes.dex */
public class v extends x8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f14939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f14941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zzbc f14938d = zzbc.zzk(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator<v> CREATOR = new v0();

    public v(String str, byte[] bArr, List<Transport> list) {
        w8.m.k(str);
        try {
            this.f14939a = z.a(str);
            this.f14940b = (byte[]) w8.m.k(bArr);
            this.f14941c = list;
        } catch (z.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f14939a.equals(vVar.f14939a) || !Arrays.equals(this.f14940b, vVar.f14940b)) {
            return false;
        }
        List list2 = this.f14941c;
        if (list2 == null && vVar.f14941c == null) {
            return true;
        }
        return list2 != null && (list = vVar.f14941c) != null && list2.containsAll(list) && vVar.f14941c.containsAll(this.f14941c);
    }

    public int hashCode() {
        return w8.k.c(this.f14939a, Integer.valueOf(Arrays.hashCode(this.f14940b)), this.f14941c);
    }

    public byte[] u() {
        return this.f14940b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 2, z(), false);
        x8.c.k(parcel, 3, u(), false);
        x8.c.G(parcel, 4, x(), false);
        x8.c.b(parcel, iA);
    }

    public List<Transport> x() {
        return this.f14941c;
    }

    public String z() {
        return this.f14939a.toString();
    }
}
