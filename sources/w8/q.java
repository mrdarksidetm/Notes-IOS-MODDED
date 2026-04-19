package w8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q extends x8.a {
    public static final Parcelable.Creator<q> CREATOR = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f22662b;

    public q(int i10, List list) {
        this.f22661a = i10;
        this.f22662b = list;
    }

    public final int u() {
        return this.f22661a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f22661a);
        x8.c.G(parcel, 2, this.f22662b, false);
        x8.c.b(parcel, iA);
    }

    public final List x() {
        return this.f22662b;
    }

    public final void z(j jVar) {
        if (this.f22662b == null) {
            this.f22662b = new ArrayList();
        }
        this.f22662b.add(jVar);
    }
}
