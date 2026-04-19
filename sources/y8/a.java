package y8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;
import w8.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends zaa {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void b(q qVar) {
        Parcel parcelZaa = zaa();
        zac.zac(parcelZaa, qVar);
        zad(1, parcelZaa);
    }
}
