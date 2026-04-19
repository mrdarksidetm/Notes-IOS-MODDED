package j9;

import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g f14122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f14123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzaa f14124c;

    static {
        a.g gVar = new a.g();
        f14122a = gVar;
        f14123b = new com.google.android.gms.common.api.a("Fido.U2F_ZERO_PARTY_API", new zzab(), gVar);
        f14124c = new zzaa();
    }

    public static k9.a a(Activity activity) {
        return new k9.a(activity);
    }
}
