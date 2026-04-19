package com.amazon.a.b;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.amazon.a.a.n.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7538a = new com.amazon.a.a.o.c("LicenseKillTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f7539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f7540c;

    private boolean b() {
        return this.f7539b.b(com.amazon.a.a.m.c.f7275b);
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.f7539b.a(com.amazon.a.a.m.c.f7276c);
        if (cVar == null) {
            return e.f7546e;
        }
        if (com.amazon.a.a.o.c.f7483a) {
            f7538a.a("Fetched failure content from store: " + cVar);
        }
        this.f7539b.c(com.amazon.a.a.m.c.f7276c);
        return cVar;
    }

    @Override // com.amazon.a.a.n.a
    public void a() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7538a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            f7538a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.f7483a) {
            f7538a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.f7540c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(c()));
    }
}
