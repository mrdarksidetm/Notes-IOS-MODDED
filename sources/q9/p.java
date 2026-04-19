package q9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class p extends a implements r {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q9.r
    public final void C(Bundle bundle, s sVar) {
        Parcel parcelV = V();
        l.c(parcelV, bundle);
        parcelV.writeStrongBinder(sVar);
        W(2, parcelV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q9.r
    public final void U(Bundle bundle, s sVar) {
        Parcel parcelV = V();
        l.c(parcelV, bundle);
        parcelV.writeStrongBinder(sVar);
        W(3, parcelV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q9.r
    public final void a(Bundle bundle, x xVar) {
        Parcel parcelV = V();
        l.c(parcelV, bundle);
        parcelV.writeStrongBinder(xVar);
        W(6, parcelV);
    }
}
