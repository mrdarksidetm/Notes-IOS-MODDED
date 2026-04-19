package l9;

import android.os.Parcel;
import android.os.Parcelable;
import l9.o;

/* JADX INFO: loaded from: classes.dex */
final class y1 implements Parcelable.Creator {
    y1() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return o.a(parcel.readInt());
        } catch (o.a e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o[i10];
    }
}
