package n9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends x8.a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f16064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f16065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f16066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f16067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f16068e;

    public o0() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER);
    }

    o0(boolean z10, long j10, float f10, long j11, int i10) {
        this.f16064a = z10;
        this.f16065b = j10;
        this.f16066c = f10;
        this.f16067d = j11;
        this.f16068e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f16064a == o0Var.f16064a && this.f16065b == o0Var.f16065b && Float.compare(this.f16066c, o0Var.f16066c) == 0 && this.f16067d == o0Var.f16067d && this.f16068e == o0Var.f16068e;
    }

    public final int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f16064a), Long.valueOf(this.f16065b), Float.valueOf(this.f16066c), Long.valueOf(this.f16067d), Integer.valueOf(this.f16068e));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f16064a);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f16065b);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f16066c);
        long j10 = this.f16067d;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f16068e != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f16068e);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.g(parcel, 1, this.f16064a);
        x8.c.v(parcel, 2, this.f16065b);
        x8.c.p(parcel, 3, this.f16066c);
        x8.c.v(parcel, 4, this.f16067d);
        x8.c.s(parcel, 5, this.f16068e);
        x8.c.b(parcel, iA);
    }
}
