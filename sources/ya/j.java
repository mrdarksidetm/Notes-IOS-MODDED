package ya;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ya.d;

/* JADX INFO: loaded from: classes2.dex */
final class j implements Parcelable.Creator {
    j() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new k((Uri) parcel.readParcelable(d.a.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
