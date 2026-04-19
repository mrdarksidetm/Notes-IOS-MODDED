package b9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends zab implements h {
    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) zac.zaa(parcel, Status.CREATOR);
            a9.b bVar = (a9.b) zac.zaa(parcel, a9.b.CREATOR);
            zac.zab(parcel);
            O(status, bVar);
        } else if (i10 == 2) {
            Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
            a9.g gVar = (a9.g) zac.zaa(parcel, a9.g.CREATOR);
            zac.zab(parcel);
            M(status2, gVar);
        } else if (i10 == 3) {
            Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
            a9.e eVar = (a9.e) zac.zaa(parcel, a9.e.CREATOR);
            zac.zab(parcel);
            d(status3, eVar);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) zac.zaa(parcel, Status.CREATOR);
            zac.zab(parcel);
            K(status4);
        }
        return true;
    }
}
