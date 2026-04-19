package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class a extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ IBinder f8853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f8854h;

    a(c cVar, IBinder iBinder) {
        this.f8854h = cVar;
        this.f8853g = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.i
    public final void b() {
        this.f8854h.f8856a.f8871n = (IInterface) this.f8854h.f8856a.f8866i.a(this.f8853g);
        d.r(this.f8854h.f8856a);
        this.f8854h.f8856a.f8864g = false;
        Iterator it = this.f8854h.f8856a.f8861d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f8854h.f8856a.f8861d.clear();
    }
}
