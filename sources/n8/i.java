package n8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class i extends x8.a {
    public static final Parcelable.Creator<i> CREATOR = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f15997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15999c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m f16000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16002c;

        public i a() {
            return new i(this.f16000a, this.f16001b, this.f16002c);
        }

        public a b(m mVar) {
            this.f16000a = mVar;
            return this;
        }

        public final a c(String str) {
            this.f16001b = str;
            return this;
        }

        public final a d(int i10) {
            this.f16002c = i10;
            return this;
        }
    }

    i(m mVar, String str, int i10) {
        this.f15997a = (m) w8.m.k(mVar);
        this.f15998b = str;
        this.f15999c = i10;
    }

    public static a u() {
        return new a();
    }

    public static a z(i iVar) {
        w8.m.k(iVar);
        a aVarU = u();
        aVarU.b(iVar.x());
        aVarU.d(iVar.f15999c);
        String str = iVar.f15998b;
        if (str != null) {
            aVarU.c(str);
        }
        return aVarU;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w8.k.b(this.f15997a, iVar.f15997a) && w8.k.b(this.f15998b, iVar.f15998b) && this.f15999c == iVar.f15999c;
    }

    public int hashCode() {
        return w8.k.c(this.f15997a, this.f15998b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, x(), i10, false);
        x8.c.C(parcel, 2, this.f15998b, false);
        x8.c.s(parcel, 3, this.f15999c);
        x8.c.b(parcel, iA);
    }

    public m x() {
        return this.f15997a;
    }
}
