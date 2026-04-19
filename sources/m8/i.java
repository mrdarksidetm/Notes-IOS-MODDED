package m8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i extends zzbz {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f15499h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f15500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f15501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f15504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PendingIntent f15505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f15506g;

    static {
        HashMap map = new HashMap();
        f15499h = map;
        map.put("accountType", a.C0179a.B("accountType", 2));
        map.put("status", a.C0179a.A("status", 3));
        map.put("transferBytes", a.C0179a.u("transferBytes", 4));
    }

    public i() {
        this.f15500a = new z.b(3);
        this.f15501b = 1;
    }

    i(Set set, int i10, String str, int i11, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.f15500a = set;
        this.f15501b = i10;
        this.f15502c = str;
        this.f15503d = i11;
        this.f15504e = bArr;
        this.f15505f = pendingIntent;
        this.f15506g = aVar;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final /* synthetic */ Map getFieldMappings() {
        return f15499h;
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final Object getFieldValue(a.C0179a c0179a) {
        int i10;
        int iD = c0179a.D();
        if (iD == 1) {
            i10 = this.f15501b;
        } else {
            if (iD == 2) {
                return this.f15502c;
            }
            if (iD != 3) {
                if (iD == 4) {
                    return this.f15504e;
                }
                throw new IllegalStateException("Unknown SafeParcelable id=" + c0179a.D());
            }
            i10 = this.f15503d;
        }
        return Integer.valueOf(i10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final boolean isFieldSet(a.C0179a c0179a) {
        return this.f15500a.contains(Integer.valueOf(c0179a.D()));
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setDecodedBytesInternal(a.C0179a c0179a, String str, byte[] bArr) {
        int iD = c0179a.D();
        if (iD == 4) {
            this.f15504e = bArr;
            this.f15500a.add(Integer.valueOf(iD));
        } else {
            throw new IllegalArgumentException("Field with id=" + iD + " is not known to be a byte array.");
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setIntegerInternal(a.C0179a c0179a, String str, int i10) {
        int iD = c0179a.D();
        if (iD == 3) {
            this.f15503d = i10;
            this.f15500a.add(Integer.valueOf(iD));
        } else {
            throw new IllegalArgumentException("Field with id=" + iD + " is not known to be an int.");
        }
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0179a c0179a, String str, String str2) {
        int iD = c0179a.D();
        if (iD != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iD)));
        }
        this.f15502c = str2;
        this.f15500a.add(Integer.valueOf(iD));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        Set set = this.f15500a;
        if (set.contains(1)) {
            x8.c.s(parcel, 1, this.f15501b);
        }
        if (set.contains(2)) {
            x8.c.C(parcel, 2, this.f15502c, true);
        }
        if (set.contains(3)) {
            x8.c.s(parcel, 3, this.f15503d);
        }
        if (set.contains(4)) {
            x8.c.k(parcel, 4, this.f15504e, true);
        }
        if (set.contains(5)) {
            x8.c.A(parcel, 5, this.f15505f, i10, true);
        }
        if (set.contains(6)) {
            x8.c.A(parcel, 6, this.f15506g, i10, true);
        }
        x8.c.b(parcel, iA);
    }
}
