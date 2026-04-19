package ya;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class m extends g {
    public static final Parcelable.Creator<m> CREATOR = new l();

    m(Uri uri, int i10) {
        super(uri, i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(b(), i10);
        parcel.writeInt(a());
    }
}
