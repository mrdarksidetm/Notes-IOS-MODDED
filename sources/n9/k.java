package n9;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzz;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a<a.d.c> f16046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final e f16047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final g f16048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final p f16049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a.g<zzaz> f16050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a.AbstractC0174a<zzaz, a.d.c> f16051f;

    static {
        a.g<zzaz> gVar = new a.g<>();
        f16050e = gVar;
        x xVar = new x();
        f16051f = xVar;
        f16046a = new com.google.android.gms.common.api.a<>("LocationServices.API", xVar, gVar);
        f16047b = new zzz();
        f16048c = new zzaf();
        f16049d = new zzbi();
    }

    public static zzaz a(com.google.android.gms.common.api.e eVar) {
        w8.m.b(eVar != null, "GoogleApiClient parameter is required.");
        zzaz zzazVar = (zzaz) eVar.d(f16050e);
        w8.m.o(zzazVar != null, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzazVar;
    }
}
