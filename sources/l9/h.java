package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h extends j {
    public static final Parcelable.Creator<h> CREATOR = new t1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f14862d;

    h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f14859a = (byte[]) w8.m.k(bArr);
        this.f14860b = (byte[]) w8.m.k(bArr2);
        this.f14861c = (byte[]) w8.m.k(bArr3);
        this.f14862d = (String[]) w8.m.k(strArr);
    }

    public String[] A() {
        return this.f14862d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Arrays.equals(this.f14859a, hVar.f14859a) && Arrays.equals(this.f14860b, hVar.f14860b) && Arrays.equals(this.f14861c, hVar.f14861c);
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(Arrays.hashCode(this.f14859a)), Integer.valueOf(Arrays.hashCode(this.f14860b)), Integer.valueOf(Arrays.hashCode(this.f14861c)));
    }

    public String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f14859a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f14860b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f14861c;
        zzamVarZza.zzb("attestationObject", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzamVarZza.zzb("transports", Arrays.toString(this.f14862d));
        return zzamVarZza.toString();
    }

    public byte[] u() {
        return this.f14861c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.k(parcel, 2, z(), false);
        x8.c.k(parcel, 3, x(), false);
        x8.c.k(parcel, 4, u(), false);
        x8.c.D(parcel, 5, A(), false);
        x8.c.b(parcel, iA);
    }

    public byte[] x() {
        return this.f14860b;
    }

    @Deprecated
    public byte[] z() {
        return this.f14859a;
    }
}
