package b9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends x8.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Comparator f5523e = new Comparator() { // from class: b9.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            t8.d dVar = (t8.d) obj;
            t8.d dVar2 = (t8.d) obj2;
            Parcelable.Creator<a> creator = a.CREATOR;
            return !dVar.getName().equals(dVar2.getName()) ? dVar.getName().compareTo(dVar2.getName()) : (dVar.u() > dVar2.u() ? 1 : (dVar.u() == dVar2.u() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f5524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5527d;

    public a(List list, boolean z10, String str, String str2) {
        w8.m.k(list);
        this.f5524a = list;
        this.f5525b = z10;
        this.f5526c = str;
        this.f5527d = str2;
    }

    public static a u(a9.f fVar) {
        return z(fVar.a(), true);
    }

    static a z(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f5523e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((u8.b) it.next()).a());
        }
        return new a(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5525b == aVar.f5525b && w8.k.b(this.f5524a, aVar.f5524a) && w8.k.b(this.f5526c, aVar.f5526c) && w8.k.b(this.f5527d, aVar.f5527d);
    }

    public final int hashCode() {
        return w8.k.c(Boolean.valueOf(this.f5525b), this.f5524a, this.f5526c, this.f5527d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, x(), false);
        x8.c.g(parcel, 2, this.f5525b);
        x8.c.C(parcel, 3, this.f5526c, false);
        x8.c.C(parcel, 4, this.f5527d, false);
        x8.c.b(parcel, iA);
    }

    public List<t8.d> x() {
        return this.f5524a;
    }
}
