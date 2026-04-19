package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final z.a f15485g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f15486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f15487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f15488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f15489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f15490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f15491f;

    static {
        z.a aVar = new z.a();
        f15485g = aVar;
        aVar.put("registered", a.C0179a.C("registered", 2));
        aVar.put("in_progress", a.C0179a.C("in_progress", 3));
        aVar.put(com.amazon.device.simplesignin.a.a.a.f7928s, a.C0179a.C(com.amazon.device.simplesignin.a.a.a.f7928s, 4));
        aVar.put("failed", a.C0179a.C("failed", 5));
        aVar.put("escrowed", a.C0179a.C("escrowed", 6));
    }

    public e() {
        this.f15486a = 1;
    }

    e(int i10, List list, List list2, List list3, List list4, List list5) {
        this.f15486a = i10;
        this.f15487b = list;
        this.f15488c = list2;
        this.f15489d = list3;
        this.f15490e = list4;
        this.f15491f = list5;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Map getFieldMappings() {
        return f15485g;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0179a c0179a) {
        switch (c0179a.D()) {
            case 1:
                return Integer.valueOf(this.f15486a);
            case 2:
                return this.f15487b;
            case 3:
                return this.f15488c;
            case 4:
                return this.f15489d;
            case 5:
                return this.f15490e;
            case 6:
                return this.f15491f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0179a.D());
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0179a c0179a) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringsInternal(a.C0179a c0179a, String str, ArrayList arrayList) {
        int iD = c0179a.D();
        if (iD == 2) {
            this.f15487b = arrayList;
            return;
        }
        if (iD == 3) {
            this.f15488c = arrayList;
            return;
        }
        if (iD == 4) {
            this.f15489d = arrayList;
        } else if (iD == 5) {
            this.f15490e = arrayList;
        } else {
            if (iD != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(iD)));
            }
            this.f15491f = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, this.f15486a);
        x8.c.E(parcel, 2, this.f15487b, false);
        x8.c.E(parcel, 3, this.f15488c, false);
        x8.c.E(parcel, 4, this.f15489d, false);
        x8.c.E(parcel, 5, this.f15490e, false);
        x8.c.E(parcel, 6, this.f15491f, false);
        x8.c.b(parcel, iA);
    }
}
