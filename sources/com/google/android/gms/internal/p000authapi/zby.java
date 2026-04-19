package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import n8.o;
import v8.d;
import v8.h;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
final class zby extends a.AbstractC0174a {
    zby() {
    }

    @Override // com.google.android.gms.common.api.a.AbstractC0174a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, c cVar, Object obj, d dVar, h hVar) {
        return new zbg(context, looper, (o) obj, cVar, dVar, hVar);
    }
}
