package c9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends x8.a implements a.b<String, Integer> {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f6592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f6593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f6594c;

    public a() {
        this.f6592a = 1;
        this.f6593b = new HashMap();
        this.f6594c = new SparseArray();
    }

    a(int i10, ArrayList arrayList) {
        this.f6592a = i10;
        this.f6593b = new HashMap();
        this.f6594c = new SparseArray();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            u(dVar.f6598b, dVar.f6599c);
        }
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final /* bridge */ /* synthetic */ Object f(Object obj) {
        String str = (String) this.f6594c.get(((Integer) obj).intValue());
        return (str == null && this.f6593b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.a.b
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        Integer num = (Integer) this.f6593b.get((String) obj);
        return num == null ? (Integer) this.f6593b.get("gms_unknown") : num;
    }

    public a u(String str, int i10) {
        this.f6593b.put(str, Integer.valueOf(i10));
        this.f6594c.put(i10, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f6592a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f6593b.keySet()) {
            arrayList.add(new d(str, ((Integer) this.f6593b.get(str)).intValue()));
        }
        x8.c.G(parcel, 2, arrayList, false);
        x8.c.b(parcel, iA);
    }
}
