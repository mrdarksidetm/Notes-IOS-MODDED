package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e extends x8.a {
    public static final Parcelable.Creator<e> CREATOR = new l1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f14838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1 f14839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f14840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q1 f14841d;

    e(g0 g0Var, o1 o1Var, f fVar, q1 q1Var) {
        this.f14838a = g0Var;
        this.f14839b = o1Var;
        this.f14840c = fVar;
        this.f14841d = q1Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return w8.k.b(this.f14838a, eVar.f14838a) && w8.k.b(this.f14839b, eVar.f14839b) && w8.k.b(this.f14840c, eVar.f14840c) && w8.k.b(this.f14841d, eVar.f14841d);
    }

    public int hashCode() {
        return w8.k.c(this.f14838a, this.f14839b, this.f14840c, this.f14841d);
    }

    public f u() {
        return this.f14840c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, x(), i10, false);
        x8.c.A(parcel, 2, this.f14839b, i10, false);
        x8.c.A(parcel, 3, u(), i10, false);
        x8.c.A(parcel, 4, this.f14841d, i10, false);
        x8.c.b(parcel, iA);
    }

    public g0 x() {
        return this.f14838a;
    }
}
