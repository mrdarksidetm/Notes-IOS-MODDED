package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g extends j {
    public static final Parcelable.Creator<g> CREATOR = new s1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f14856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f14857e;

    g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f14853a = (byte[]) w8.m.k(bArr);
        this.f14854b = (byte[]) w8.m.k(bArr2);
        this.f14855c = (byte[]) w8.m.k(bArr3);
        this.f14856d = (byte[]) w8.m.k(bArr4);
        this.f14857e = bArr5;
    }

    public byte[] A() {
        return this.f14856d;
    }

    public byte[] B() {
        return this.f14857e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Arrays.equals(this.f14853a, gVar.f14853a) && Arrays.equals(this.f14854b, gVar.f14854b) && Arrays.equals(this.f14855c, gVar.f14855c) && Arrays.equals(this.f14856d, gVar.f14856d) && Arrays.equals(this.f14857e, gVar.f14857e);
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(Arrays.hashCode(this.f14853a)), Integer.valueOf(Arrays.hashCode(this.f14854b)), Integer.valueOf(Arrays.hashCode(this.f14855c)), Integer.valueOf(Arrays.hashCode(this.f14856d)), Integer.valueOf(Arrays.hashCode(this.f14857e)));
    }

    public String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzch zzchVarZzf = zzch.zzf();
        byte[] bArr = this.f14853a;
        zzamVarZza.zzb("keyHandle", zzchVarZzf.zzg(bArr, 0, bArr.length));
        zzch zzchVarZzf2 = zzch.zzf();
        byte[] bArr2 = this.f14854b;
        zzamVarZza.zzb("clientDataJSON", zzchVarZzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzchVarZzf3 = zzch.zzf();
        byte[] bArr3 = this.f14855c;
        zzamVarZza.zzb("authenticatorData", zzchVarZzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzchVarZzf4 = zzch.zzf();
        byte[] bArr4 = this.f14856d;
        zzamVarZza.zzb("signature", zzchVarZzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f14857e;
        if (bArr5 != null) {
            zzamVarZza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zzamVarZza.toString();
    }

    public byte[] u() {
        return this.f14855c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.k(parcel, 2, z(), false);
        x8.c.k(parcel, 3, x(), false);
        x8.c.k(parcel, 4, u(), false);
        x8.c.k(parcel, 5, A(), false);
        x8.c.k(parcel, 6, B(), false);
        x8.c.b(parcel, iA);
    }

    public byte[] x() {
        return this.f14854b;
    }

    @Deprecated
    public byte[] z() {
        return this.f14853a;
    }
}
