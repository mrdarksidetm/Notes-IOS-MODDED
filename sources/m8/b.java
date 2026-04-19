package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f15479f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f15480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f15481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f15482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f15484e;

    static {
        HashMap map = new HashMap();
        f15479f = map;
        map.put("authenticatorData", a.C0179a.z("authenticatorData", 2, g.class));
        map.put("progress", a.C0179a.x("progress", 4, e.class));
    }

    public b() {
        this.f15480a = new HashSet(1);
        this.f15481b = 1;
    }

    b(Set set, int i10, ArrayList arrayList, int i11, e eVar) {
        this.f15480a = set;
        this.f15481b = i10;
        this.f15482c = arrayList;
        this.f15483d = i11;
        this.f15484e = eVar;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeArrayInternal(a.C0179a c0179a, String str, ArrayList arrayList) {
        int iD = c0179a.D();
        if (iD != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(iD), arrayList.getClass().getCanonicalName()));
        }
        this.f15482c = arrayList;
        this.f15480a.add(Integer.valueOf(iD));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0179a c0179a, String str, com.google.android.gms.common.server.response.a aVar) {
        int iD = c0179a.D();
        if (iD != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iD), aVar.getClass().getCanonicalName()));
        }
        this.f15484e = (e) aVar;
        this.f15480a.add(Integer.valueOf(iD));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f15479f;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0179a c0179a) {
        int iD = c0179a.D();
        if (iD == 1) {
            return Integer.valueOf(this.f15481b);
        }
        if (iD == 2) {
            return this.f15482c;
        }
        if (iD == 4) {
            return this.f15484e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0179a.D());
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0179a c0179a) {
        return this.f15480a.contains(Integer.valueOf(c0179a.D()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        Set set = this.f15480a;
        if (set.contains(1)) {
            x8.c.s(parcel, 1, this.f15481b);
        }
        if (set.contains(2)) {
            x8.c.G(parcel, 2, this.f15482c, true);
        }
        if (set.contains(3)) {
            x8.c.s(parcel, 3, this.f15483d);
        }
        if (set.contains(4)) {
            x8.c.A(parcel, 4, this.f15484e, i10, true);
        }
        x8.c.b(parcel, iA);
    }
}
