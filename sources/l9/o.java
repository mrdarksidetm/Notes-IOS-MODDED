package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l9.a f14887a;

    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    o(l9.a aVar) {
        this.f14887a = (l9.a) w8.m.k(aVar);
    }

    public static o a(int i10) throws a {
        l9.a aVar;
        if (i10 == b0.LEGACY_RS1.a()) {
            aVar = b0.RS1;
        } else {
            b0[] b0VarArrValues = b0.values();
            int length = b0VarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.a() == i10) {
                            aVar = pVar;
                        }
                    }
                    throw new a(i10);
                }
                b0 b0Var = b0VarArrValues[i11];
                if (b0Var.a() == i10) {
                    aVar = b0Var;
                    break;
                }
                i11++;
            }
        }
        return new o(aVar);
    }

    public int b() {
        return this.f14887a.a();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && this.f14887a.a() == ((o) obj).f14887a.a();
    }

    public int hashCode() {
        return w8.k.c(this.f14887a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14887a.a());
    }
}
