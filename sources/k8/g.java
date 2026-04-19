package k8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.internal.auth.zzam;

/* JADX INFO: loaded from: classes.dex */
final class g extends a.AbstractC0174a {
    g() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, w8.c cVar, Object obj, e.b bVar, e.c cVar2) {
        return new zzam(context, looper, cVar, bVar, cVar2);
    }
}
