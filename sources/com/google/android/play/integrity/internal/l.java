package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes.dex */
final class l extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ d f8878g;

    l(d dVar) {
        this.f8878g = dVar;
    }

    @Override // com.google.android.play.integrity.internal.i
    public final void b() {
        synchronized (this.f8878g.f8863f) {
            if (this.f8878g.f8869l.get() > 0 && this.f8878g.f8869l.decrementAndGet() > 0) {
                this.f8878g.f8859b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            d dVar = this.f8878g;
            if (dVar.f8871n != null) {
                dVar.f8859b.d("Unbind from service.", new Object[0]);
                d dVar2 = this.f8878g;
                dVar2.f8858a.unbindService(dVar2.f8870m);
                this.f8878g.f8864g = false;
                this.f8878g.f8871n = null;
                this.f8878g.f8870m = null;
            }
            this.f8878g.x();
        }
    }
}
