package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends a.AbstractC0174a {
    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, c cVar, Object obj, e.b bVar, e.c cVar2) {
        return new zzk(context, looper, cVar, bVar, cVar2);
    }
}
