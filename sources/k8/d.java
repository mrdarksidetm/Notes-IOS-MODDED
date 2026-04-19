package k8;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

/* JADX INFO: loaded from: classes.dex */
public final class d extends zza implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // k8.f
    public final void D(c cVar, String str) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, cVar);
        parcelZza.writeString(str);
        zzc(2, parcelZza);
    }

    @Override // k8.f
    public final void I(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = zzc.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzc(1, parcelZza);
    }

    @Override // k8.f
    public final void e(c cVar, Account account) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, cVar);
        zzc.zzc(parcelZza, account);
        zzc(3, parcelZza);
    }
}
