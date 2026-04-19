package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends x8.a {
    public static final Parcelable.Creator<f> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f8651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f8652c;

    f(int i10, String str, ArrayList arrayList) {
        this.f8650a = i10;
        this.f8651b = str;
        this.f8652c = arrayList;
    }

    f(String str, Map map) {
        ArrayList arrayList;
        this.f8650a = 1;
        this.f8651b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g(str2, (a.C0179a) map.get(str2)));
            }
        }
        this.f8652c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8650a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.C(parcel, 2, this.f8651b, false);
        x8.c.G(parcel, 3, this.f8652c, false);
        x8.c.b(parcel, iA);
    }
}
