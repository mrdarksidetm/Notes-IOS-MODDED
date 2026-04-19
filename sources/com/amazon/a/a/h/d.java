package com.amazon.a.a.h;

/* JADX INFO: loaded from: classes.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7165a = new com.amazon.a.a.o.c("MetricsManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f7166b = new b();

    @Override // com.amazon.a.a.h.c
    public synchronized b a() {
        if (this.f7166b.a()) {
            return this.f7166b;
        }
        b bVar = this.f7166b;
        this.f7166b = new b();
        return bVar;
    }

    @Override // com.amazon.a.a.h.c
    public synchronized void a(a aVar) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7165a.a("Recording Metric: " + aVar);
        }
        this.f7166b.a(aVar);
    }
}
