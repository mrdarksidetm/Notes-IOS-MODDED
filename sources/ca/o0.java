package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends x8.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ba.r0> f6721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ba.x0> f6722b;

    o0(List<ba.r0> list, List<ba.x0> list2) {
        this.f6721a = list == null ? new ArrayList<>() : list;
        this.f6722b = list2 == null ? new ArrayList<>() : list2;
    }

    public static o0 u(List<ba.j0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ba.j0 j0Var : list) {
            if (j0Var instanceof ba.r0) {
                arrayList.add((ba.r0) j0Var);
            } else if (j0Var instanceof ba.x0) {
                arrayList2.add((ba.x0) j0Var);
            }
        }
        return new o0(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, this.f6721a, false);
        x8.c.G(parcel, 2, this.f6722b, false);
        x8.c.b(parcel, iA);
    }

    public final List<ba.j0> x() {
        ArrayList arrayList = new ArrayList();
        Iterator<ba.r0> it = this.f6721a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<ba.x0> it2 = this.f6722b.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }
}
