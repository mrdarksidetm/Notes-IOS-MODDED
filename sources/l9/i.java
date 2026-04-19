package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import l9.q;

/* JADX INFO: loaded from: classes.dex */
public class i extends j {
    public static final Parcelable.Creator<i> CREATOR = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f14872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14874c;

    i(int i10, String str, int i11) {
        try {
            this.f14872a = q.b(i10);
            this.f14873b = str;
            this.f14874c = i11;
        } catch (q.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w8.k.b(this.f14872a, iVar.f14872a) && w8.k.b(this.f14873b, iVar.f14873b) && w8.k.b(Integer.valueOf(this.f14874c), Integer.valueOf(iVar.f14874c));
    }

    public int hashCode() {
        return w8.k.c(this.f14872a, this.f14873b, Integer.valueOf(this.f14874c));
    }

    public String toString() {
        zzam zzamVarZza = zzan.zza(this);
        zzamVarZza.zza("errorCode", this.f14872a.a());
        String str = this.f14873b;
        if (str != null) {
            zzamVarZza.zzb(com.amazon.a.a.o.b.f7432f, str);
        }
        return zzamVarZza.toString();
    }

    public int u() {
        return this.f14872a.a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 2, u());
        x8.c.C(parcel, 3, x(), false);
        x8.c.s(parcel, 4, this.f14874c);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f14873b;
    }
}
