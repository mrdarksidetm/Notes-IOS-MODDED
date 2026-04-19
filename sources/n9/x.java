package n9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.location.zzaz;

/* JADX INFO: loaded from: classes.dex */
final class x extends a.AbstractC0174a<zzaz, a.d.c> {
    x() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, w8.c cVar, a.d.c cVar2, e.b bVar, e.c cVar3) {
        return new zzaz(context, looper, bVar, cVar3, "locationServices", cVar);
    }
}
