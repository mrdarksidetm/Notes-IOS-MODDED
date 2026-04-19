package com.amazon.a.b;

import android.app.Application;
import com.amazon.d.a.j;
import java.security.PublicKey;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7521b = new com.amazon.a.a.o.c("VerifyApplicationEntitlmentTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f7522c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f7523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f7524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f7525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f7526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f7527h;

    private b a(g gVar, PublicKey publicKey) {
        return new b(new com.amazon.a.a.o.b.f(gVar.c(), publicKey));
    }

    private void a(b bVar) {
        f7521b.a("License Verification succeeded!");
        this.f7526g.a(com.amazon.a.a.m.c.f7275b, new com.amazon.a.a.m.a(bVar, bVar.d()) { // from class: com.amazon.a.b.a.1
            @Override // com.amazon.a.a.e.a
            public void d() {
                this.f7138a.a(com.amazon.a.a.n.b.d.COMMAND, new a());
            }
        });
    }

    private void a(g gVar, b bVar) throws com.amazon.a.b.a.a {
        com.amazon.a.a.o.d.c cVar = new com.amazon.a.a.o.d.c();
        cVar.a(gVar.a(), bVar.b(), (com.amazon.a.a.o.d.b) h.CUSTOMER_ID);
        cVar.a(gVar.b(), bVar.c(), (com.amazon.a.a.o.d.b) h.DEVICE_ID);
        cVar.a(bVar.e(), this.f7524e.getPackageName(), (com.amazon.a.a.o.d.b) h.PACKAGE_NAME);
        cVar.a(bVar.d(), new Date(), (com.amazon.a.a.o.d.b) h.EXPIRATION);
        if (cVar.a()) {
            throw new com.amazon.a.b.a.a(cVar);
        }
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(com.amazon.d.a.h hVar) {
        com.amazon.a.a.i.c cVar = new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e());
        f7521b.a("onFailure: " + cVar);
        this.f7526g.a(com.amazon.a.a.m.c.f7276c, cVar);
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) throws com.amazon.a.b.a.a {
        g gVar = new g(jVar.b());
        b bVarA = a(gVar, this.f7527h.a());
        if (bVarA == null) {
            return;
        }
        a(gVar, bVarA);
        a(bVarA);
        this.f7523d.a(new com.amazon.a.b.b.a());
        this.f7525f.a(com.amazon.a.a.n.b.d.BACKGROUND, new i());
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "get_license";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        return null;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void b(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.i.c cVarA = this.f7522c.a(bVar);
        if (cVarA == null && com.amazon.a.a.o.c.f7484b) {
            f7521b.b("No mapping specified for exception: " + bVar, bVar);
        }
        this.f7526g.a(com.amazon.a.a.m.c.f7276c, cVarA);
        this.f7526g.a(com.amazon.a.a.m.c.f7277d, bVar.getClass().getName());
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return this.f7526g.a(com.amazon.a.a.m.c.f7275b) == null;
    }
}
