package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x8.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f8657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8658c;

    h(int i10, ArrayList arrayList, String str) {
        this.f8656a = i10;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = (f) arrayList.get(i11);
            String str2 = fVar.f8651b;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) m.k(fVar.f8652c)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) fVar.f8652c.get(i12);
                map2.put(gVar.f8654b, gVar.f8655c);
            }
            map.put(str2, map2);
        }
        this.f8657b = map;
        this.f8658c = (String) m.k(str);
        z();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f8657b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f8657b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    public final String u() {
        return this.f8658c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f8656a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f8657b.keySet()) {
            arrayList.add(new f(str, (Map) this.f8657b.get(str)));
        }
        x8.c.G(parcel, 2, arrayList, false);
        x8.c.C(parcel, 3, this.f8658c, false);
        x8.c.b(parcel, iA);
    }

    public final Map x(String str) {
        return (Map) this.f8657b.get(str);
    }

    public final void z() {
        Iterator it = this.f8657b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f8657b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((a.C0179a) map.get((String) it2.next())).K(this);
            }
        }
    }
}
