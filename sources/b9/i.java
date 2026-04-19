package b9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes.dex */
public final class i extends zaa {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void b(h hVar, a aVar, k kVar) {
        Parcel parcelZaa = zaa();
        zac.zad(parcelZaa, hVar);
        zac.zac(parcelZaa, aVar);
        zac.zad(parcelZaa, kVar);
        zac(2, parcelZaa);
    }

    public final void c(com.google.android.gms.common.api.internal.d dVar, k kVar) {
        Parcel parcelZaa = zaa();
        zac.zad(parcelZaa, dVar);
        zac.zad(parcelZaa, kVar);
        zac(6, parcelZaa);
    }
}
