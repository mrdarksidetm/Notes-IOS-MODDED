package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f14822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b2 f14823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f14824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h2 f14825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k0 f14826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m0 f14827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d2 f14828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p0 f14829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s f14830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r0 f14831j;

    d(r rVar, b2 b2Var, f0 f0Var, h2 h2Var, k0 k0Var, m0 m0Var, d2 d2Var, p0 p0Var, s sVar, r0 r0Var) {
        this.f14822a = rVar;
        this.f14824c = f0Var;
        this.f14823b = b2Var;
        this.f14825d = h2Var;
        this.f14826e = k0Var;
        this.f14827f = m0Var;
        this.f14828g = d2Var;
        this.f14829h = p0Var;
        this.f14830i = sVar;
        this.f14831j = r0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return w8.k.b(this.f14822a, dVar.f14822a) && w8.k.b(this.f14823b, dVar.f14823b) && w8.k.b(this.f14824c, dVar.f14824c) && w8.k.b(this.f14825d, dVar.f14825d) && w8.k.b(this.f14826e, dVar.f14826e) && w8.k.b(this.f14827f, dVar.f14827f) && w8.k.b(this.f14828g, dVar.f14828g) && w8.k.b(this.f14829h, dVar.f14829h) && w8.k.b(this.f14830i, dVar.f14830i) && w8.k.b(this.f14831j, dVar.f14831j);
    }

    public int hashCode() {
        return w8.k.c(this.f14822a, this.f14823b, this.f14824c, this.f14825d, this.f14826e, this.f14827f, this.f14828g, this.f14829h, this.f14830i, this.f14831j);
    }

    public r u() {
        return this.f14822a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 2, u(), i10, false);
        x8.c.A(parcel, 3, this.f14823b, i10, false);
        x8.c.A(parcel, 4, x(), i10, false);
        x8.c.A(parcel, 5, this.f14825d, i10, false);
        x8.c.A(parcel, 6, this.f14826e, i10, false);
        x8.c.A(parcel, 7, this.f14827f, i10, false);
        x8.c.A(parcel, 8, this.f14828g, i10, false);
        x8.c.A(parcel, 9, this.f14829h, i10, false);
        x8.c.A(parcel, 10, this.f14830i, i10, false);
        x8.c.A(parcel, 11, this.f14831j, i10, false);
        x8.c.b(parcel, iA);
    }

    public f0 x() {
        return this.f14824c;
    }
}
