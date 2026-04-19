package o9;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;

/* JADX INFO: loaded from: classes.dex */
final class b extends a.AbstractC0174a {
    b() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, w8.c cVar, Object obj, e.b bVar, e.c cVar2) {
        return new p9.a(context, looper, true, cVar, p9.a.c(cVar), bVar, cVar2);
    }
}
