package j8;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f14117b;

    m(String str, Bundle bundle) {
        this.f14116a = str;
        this.f14117b = bundle;
    }

    @Override // j8.n
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws d, IOException {
        Bundle bundleZzd = zze.zzb(iBinder).zzd(this.f14116a, this.f14117b);
        o.f(bundleZzd);
        String string = bundleZzd.getString("Error");
        if (bundleZzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new d(string);
    }
}
