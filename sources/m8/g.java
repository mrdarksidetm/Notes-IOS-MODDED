package m8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap f15492g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f15493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f15494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f15495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f15497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f15498f;

    static {
        HashMap map = new HashMap();
        f15492g = map;
        map.put("authenticatorInfo", a.C0179a.x("authenticatorInfo", 2, i.class));
        map.put("signature", a.C0179a.B("signature", 3));
        map.put("package", a.C0179a.B("package", 4));
    }

    public g() {
        this.f15493a = new HashSet(3);
        this.f15494b = 1;
    }

    g(Set set, int i10, i iVar, String str, String str2, String str3) {
        this.f15493a = set;
        this.f15494b = i10;
        this.f15495c = iVar;
        this.f15496d = str;
        this.f15497e = str2;
        this.f15498f = str3;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final void addConcreteTypeInternal(a.C0179a c0179a, String str, com.google.android.gms.common.server.response.a aVar) {
        int iD = c0179a.D();
        if (iD != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(iD), aVar.getClass().getCanonicalName()));
        }
        this.f15495c = (i) aVar;
        this.f15493a.add(Integer.valueOf(iD));
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f15492g;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0179a c0179a) {
        int iD = c0179a.D();
        if (iD == 1) {
            return Integer.valueOf(this.f15494b);
        }
        if (iD == 2) {
            return this.f15495c;
        }
        if (iD == 3) {
            return this.f15496d;
        }
        if (iD == 4) {
            return this.f15497e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + c0179a.D());
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0179a c0179a) {
        return this.f15493a.contains(Integer.valueOf(c0179a.D()));
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0179a c0179a, String str, String str2) {
        int iD = c0179a.D();
        if (iD == 3) {
            this.f15496d = str2;
        } else {
            if (iD != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iD)));
            }
            this.f15497e = str2;
        }
        this.f15493a.add(Integer.valueOf(iD));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        Set set = this.f15493a;
        if (set.contains(1)) {
            x8.c.s(parcel, 1, this.f15494b);
        }
        if (set.contains(2)) {
            x8.c.A(parcel, 2, this.f15495c, i10, true);
        }
        if (set.contains(3)) {
            x8.c.C(parcel, 3, this.f15496d, true);
        }
        if (set.contains(4)) {
            x8.c.C(parcel, 4, this.f15497e, true);
        }
        if (set.contains(5)) {
            x8.c.C(parcel, 5, this.f15498f, true);
        }
        x8.c.b(parcel, iA);
    }
}
