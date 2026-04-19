package n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class d extends x8.a {
    public static final Parcelable.Creator<d> CREATOR = new n0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator<c> f16023e = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<c> f16024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<w8.b> f16026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16027d;

    public d(List<c> list, String str, List<w8.b> list2, String str2) {
        w8.m.l(list, "transitions can't be null");
        w8.m.b(list.size() > 0, "transitions can't be empty.");
        w8.m.k(list);
        TreeSet treeSet = new TreeSet(f16023e);
        for (c cVar : list) {
            w8.m.b(treeSet.add(cVar), String.format("Found duplicated transition: %s.", cVar));
        }
        this.f16024a = Collections.unmodifiableList(list);
        this.f16025b = str;
        this.f16026c = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f16027d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (w8.k.b(this.f16024a, dVar.f16024a) && w8.k.b(this.f16025b, dVar.f16025b) && w8.k.b(this.f16027d, dVar.f16027d) && w8.k.b(this.f16026c, dVar.f16026c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f16024a.hashCode() * 31;
        String str = this.f16025b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<w8.b> list = this.f16026c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f16027d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f16024a);
        String str = this.f16025b;
        String strValueOf2 = String.valueOf(this.f16026c);
        String str2 = this.f16027d;
        int length = strValueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 79 + length2 + strValueOf2.length() + String.valueOf(str2).length());
        sb2.append("ActivityTransitionRequest [mTransitions=");
        sb2.append(strValueOf);
        sb2.append(", mTag='");
        sb2.append(str);
        sb2.append("', mClients=");
        sb2.append(strValueOf2);
        sb2.append(", mAttributionTag=");
        sb2.append(str2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        w8.m.k(parcel);
        int iA = x8.c.a(parcel);
        x8.c.G(parcel, 1, this.f16024a, false);
        x8.c.C(parcel, 2, this.f16025b, false);
        x8.c.G(parcel, 3, this.f16026c, false);
        x8.c.C(parcel, 4, this.f16027d, false);
        x8.c.b(parcel, iA);
    }
}
