package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import w8.k;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends x8.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f8706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f8707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f8708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f8709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f8710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f8711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f8712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f8713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f8714i;

    @Deprecated
    public LocationRequest() {
        this.f8706a = R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
        this.f8707b = 3600000L;
        this.f8708c = 600000L;
        this.f8709d = false;
        this.f8710e = Long.MAX_VALUE;
        this.f8711f = a.e.API_PRIORITY_OTHER;
        this.f8712g = 0.0f;
        this.f8713h = 0L;
        this.f8714i = false;
    }

    LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f10, long j13, boolean z11) {
        this.f8706a = i10;
        this.f8707b = j10;
        this.f8708c = j11;
        this.f8709d = z10;
        this.f8710e = j12;
        this.f8711f = i11;
        this.f8712g = f10;
        this.f8713h = j13;
        this.f8714i = z11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f8706a == locationRequest.f8706a && this.f8707b == locationRequest.f8707b && this.f8708c == locationRequest.f8708c && this.f8709d == locationRequest.f8709d && this.f8710e == locationRequest.f8710e && this.f8711f == locationRequest.f8711f && this.f8712g == locationRequest.f8712g && x() == locationRequest.x() && this.f8714i == locationRequest.f8714i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f8706a), Long.valueOf(this.f8707b), Float.valueOf(this.f8712g), Long.valueOf(this.f8713h));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i10 = this.f8706a;
        sb2.append(i10 != 100 ? i10 != 102 ? i10 != 104 ? i10 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f8706a != 105) {
            sb2.append(" requested=");
            sb2.append(this.f8707b);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f8708c);
        sb2.append("ms");
        if (this.f8713h > this.f8707b) {
            sb2.append(" maxWait=");
            sb2.append(this.f8713h);
            sb2.append("ms");
        }
        if (this.f8712g > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f8712g);
            sb2.append("m");
        }
        long j10 = this.f8710e;
        if (j10 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - jElapsedRealtime);
            sb2.append("ms");
        }
        if (this.f8711f != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f8711f);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long u() {
        return this.f8707b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f8706a);
        x8.c.v(parcel, 2, this.f8707b);
        x8.c.v(parcel, 3, this.f8708c);
        x8.c.g(parcel, 4, this.f8709d);
        x8.c.v(parcel, 5, this.f8710e);
        x8.c.s(parcel, 6, this.f8711f);
        x8.c.p(parcel, 7, this.f8712g);
        x8.c.v(parcel, 8, this.f8713h);
        x8.c.g(parcel, 9, this.f8714i);
        x8.c.b(parcel, iA);
    }

    public long x() {
        long j10 = this.f8713h;
        long j11 = this.f8707b;
        return j10 < j11 ? j11 : j10;
    }
}
