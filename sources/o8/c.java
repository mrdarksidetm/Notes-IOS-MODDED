package o8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p001authapiphone.zzw;
import v8.d;
import v8.h;

/* JADX INFO: loaded from: classes.dex */
final class c extends a.AbstractC0174a {
    c() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, w8.c cVar, Object obj, d dVar, h hVar) {
        return new zzw(context, looper, cVar, dVar, hVar);
    }
}
