package b9;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends zab implements k {
    public j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // com.google.android.gms.internal.base.zab
    protected final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        a9.h hVar = (a9.h) zac.zaa(parcel, a9.h.CREATOR);
        zac.zab(parcel);
        z(hVar);
        return true;
    }
}
