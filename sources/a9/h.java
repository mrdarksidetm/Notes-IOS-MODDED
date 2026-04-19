package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class h extends x8.a {
    public static final Parcelable.Creator<h> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f679f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f681b;

        a(long j10, long j11) {
            w8.m.m(j11);
            this.f680a = j10;
            this.f681b = j11;
        }
    }

    public h(int i10, int i11, Long l10, Long l11, int i12) {
        this.f674a = i10;
        this.f675b = i11;
        this.f676c = l10;
        this.f677d = l11;
        this.f678e = i12;
        this.f679f = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new a(l10.longValue(), l11.longValue());
    }

    public int u() {
        return this.f678e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, z());
        x8.c.s(parcel, 2, x());
        x8.c.x(parcel, 3, this.f676c, false);
        x8.c.x(parcel, 4, this.f677d, false);
        x8.c.s(parcel, 5, u());
        x8.c.b(parcel, iA);
    }

    public int x() {
        return this.f675b;
    }

    public int z() {
        return this.f674a;
    }
}
