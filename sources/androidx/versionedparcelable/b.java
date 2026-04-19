package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f4923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f4924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f4927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4930k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new z.a(), new z.a(), new z.a());
    }

    private b(Parcel parcel, int i10, int i11, String str, z.a<String, Method> aVar, z.a<String, Method> aVar2, z.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4923d = new SparseIntArray();
        this.f4928i = -1;
        this.f4930k = -1;
        this.f4924e = parcel;
        this.f4925f = i10;
        this.f4926g = i11;
        this.f4929j = i10;
        this.f4927h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f4924e.writeInt(-1);
        } else {
            this.f4924e.writeInt(bArr.length);
            this.f4924e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4924e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f4924e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f4924e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f4924e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f4928i;
        if (i10 >= 0) {
            int i11 = this.f4923d.get(i10);
            int iDataPosition = this.f4924e.dataPosition();
            this.f4924e.setDataPosition(i11);
            this.f4924e.writeInt(iDataPosition - i11);
            this.f4924e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f4924e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f4929j;
        if (i10 == this.f4925f) {
            i10 = this.f4926g;
        }
        return new b(parcel, iDataPosition, i10, this.f4927h + "  ", this.f4920a, this.f4921b, this.f4922c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f4924e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i10 = this.f4924e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f4924e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4924e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f4929j < this.f4926g) {
            int i11 = this.f4930k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f4924e.setDataPosition(this.f4929j);
            int i12 = this.f4924e.readInt();
            this.f4930k = this.f4924e.readInt();
            this.f4929j += i12;
        }
        return this.f4930k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f4924e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f4924e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f4924e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f4928i = i10;
        this.f4923d.put(i10, this.f4924e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f4924e.writeInt(z10 ? 1 : 0);
    }
}
