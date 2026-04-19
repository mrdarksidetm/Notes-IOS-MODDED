package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f22614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f22617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f22619f;

    public d(o oVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f22614a = oVar;
        this.f22615b = z10;
        this.f22616c = z11;
        this.f22617d = iArr;
        this.f22618e = i10;
        this.f22619f = iArr2;
    }

    public boolean A() {
        return this.f22615b;
    }

    public boolean B() {
        return this.f22616c;
    }

    public final o C() {
        return this.f22614a;
    }

    public int u() {
        return this.f22618e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, this.f22614a, i10, false);
        x8.c.g(parcel, 2, A());
        x8.c.g(parcel, 3, B());
        x8.c.t(parcel, 4, x(), false);
        x8.c.s(parcel, 5, u());
        x8.c.t(parcel, 6, z(), false);
        x8.c.b(parcel, iA);
    }

    public int[] x() {
        return this.f22617d;
    }

    public int[] z() {
        return this.f22619f;
    }
}
