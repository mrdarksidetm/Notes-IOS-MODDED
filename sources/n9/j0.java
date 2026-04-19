package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends x8.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16045d;

    public j0(int i10, int i11, int i12, int i13) {
        w8.m.o(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        w8.m.o(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        w8.m.o(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        w8.m.o(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        w8.m.o(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.f16042a = i10;
        this.f16043b = i11;
        this.f16044c = i12;
        this.f16045d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f16042a == j0Var.f16042a && this.f16043b == j0Var.f16043b && this.f16044c == j0Var.f16044c && this.f16045d == j0Var.f16045d;
    }

    public final int hashCode() {
        return w8.k.c(Integer.valueOf(this.f16042a), Integer.valueOf(this.f16043b), Integer.valueOf(this.f16044c), Integer.valueOf(this.f16045d));
    }

    public final String toString() {
        int i10 = this.f16042a;
        int i11 = this.f16043b;
        int i12 = this.f16044c;
        int i13 = this.f16045d;
        StringBuilder sb2 = new StringBuilder(R.styleable.AppCompatTheme_windowActionBar);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i10);
        sb2.append(", startMinute=");
        sb2.append(i11);
        sb2.append(", endHour=");
        sb2.append(i12);
        sb2.append(", endMinute=");
        sb2.append(i13);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        w8.m.k(parcel);
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f16042a);
        x8.c.s(parcel, 2, this.f16043b);
        x8.c.s(parcel, 3, this.f16044c);
        x8.c.s(parcel, 4, this.f16045d);
        x8.c.b(parcel, iA);
    }
}
