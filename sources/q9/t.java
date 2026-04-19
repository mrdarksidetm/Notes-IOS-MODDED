package q9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class t extends a implements v {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q9.v
    public final void a(Bundle bundle, x xVar) {
        Parcel parcelV = V();
        l.c(parcelV, bundle);
        parcelV.writeStrongBinder(xVar);
        W(3, parcelV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q9.v
    public final void o(Bundle bundle, w wVar) {
        Parcel parcelV = V();
        l.c(parcelV, bundle);
        parcelV.writeStrongBinder(wVar);
        W(2, parcelV);
    }
}
