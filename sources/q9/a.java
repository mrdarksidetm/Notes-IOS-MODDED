package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f19007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19008b;

    protected a(IBinder iBinder, String str) {
        this.f19007a = iBinder;
        this.f19008b = str;
    }

    protected final Parcel V() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f19008b);
        return parcelObtain;
    }

    protected final void W(int i10, Parcel parcel) {
        try {
            this.f19007a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19007a;
    }
}
