package l8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.auth.zzbe;

/* JADX INFO: loaded from: classes.dex */
final class h extends a.AbstractC0174a {
    h() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, w8.c cVar, Object obj, v8.d dVar, v8.h hVar) {
        return new zzbe(context, looper, cVar, (c) obj, dVar, hVar);
    }
}
