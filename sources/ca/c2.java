package ca;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 implements ba.i {
    public static final Parcelable.Creator<c2> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f6633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a2 f6634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ba.x1 f6635c;

    public c2(g gVar) {
        g gVar2 = (g) w8.m.k(gVar);
        this.f6633a = gVar2;
        List<e2> listH0 = gVar2.h0();
        this.f6634b = null;
        for (int i10 = 0; i10 < listH0.size(); i10++) {
            if (!TextUtils.isEmpty(listH0.get(i10).zza())) {
                this.f6634b = new a2(listH0.get(i10).c(), listH0.get(i10).zza(), gVar.i0());
            }
        }
        if (this.f6634b == null) {
            this.f6634b = new a2(gVar.i0());
        }
        this.f6635c = gVar.f0();
    }

    c2(g gVar, a2 a2Var, ba.x1 x1Var) {
        this.f6633a = gVar;
        this.f6634b = a2Var;
        this.f6635c = x1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ba.i
    public final ba.g p() {
        return this.f6634b;
    }

    @Override // ba.i
    public final ba.h q() {
        return this.f6635c;
    }

    @Override // ba.i
    public final ba.a0 s() {
        return this.f6633a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, s(), i10, false);
        x8.c.A(parcel, 2, p(), i10, false);
        x8.c.A(parcel, 3, this.f6635c, i10, false);
        x8.c.b(parcel, iA);
    }
}
