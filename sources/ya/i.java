package ya;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import ya.d;

/* JADX INFO: loaded from: classes2.dex */
final class i extends e {
    public static final Parcelable.Creator<i> CREATOR = new h();

    i(List list, d.b bVar) {
        super(list, bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(a());
        parcel.writeParcelable(b(), i10);
    }
}
