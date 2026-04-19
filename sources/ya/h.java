package ya;

import android.os.Parcel;
import android.os.Parcelable;
import ya.d;

/* JADX INFO: loaded from: classes2.dex */
final class h implements Parcelable.Creator {
    h() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new i(parcel.readArrayList(d.class.getClassLoader()), (d.b) parcel.readParcelable(d.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
