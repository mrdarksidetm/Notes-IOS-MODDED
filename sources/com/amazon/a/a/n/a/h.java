package com.amazon.a.a.n.a;

import com.amazon.d.a.j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7371b = new com.amazon.a.a.o.c("KiwiCommand");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.amazon.a.a.j.a f7372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f7376g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h f7379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private h f7380k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.amazon.a.b.f f7377h = new com.amazon.a.b.f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7381l = false;

    public h(com.amazon.a.a.j.a aVar, String str, String str2, String str3, String str4) {
        this.f7372c = aVar;
        this.f7373d = str3;
        this.f7374e = str;
        this.f7375f = str2;
        HashMap map = new HashMap();
        this.f7376g = map;
        map.put(com.amazon.a.a.o.b.B, str3);
        map.put(com.amazon.a.a.o.b.I, str4);
        this.f7378i = true;
        this.f7379j = null;
        this.f7380k = null;
    }

    private void a(com.amazon.a.a.i.c cVar) {
        if (cVar == null) {
            return;
        }
        com.amazon.a.a.i.a aVar = new com.amazon.a.a.i.a(cVar);
        com.amazon.a.a.i.e eVarA = com.amazon.a.a.a();
        if (eVarA == null) {
            f7371b.b("Prompt manager is null. Cannot show prompt dropping request");
        } else {
            eVarA.a((com.amazon.a.a.i.b) aVar);
        }
    }

    public h a(boolean z10) {
        this.f7381l = z10;
        return this;
    }

    public void a(h hVar) {
        this.f7379j = hVar;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(com.amazon.d.a.h hVar) {
        h hVar2;
        String str;
        f7371b.a("onFailure: result = " + hVar);
        if (((hVar == null || (str = (String) hVar.f().get(com.amazon.a.a.o.b.an)) == null || !str.equalsIgnoreCase("1.0")) ? false : true) && (hVar2 = this.f7380k) != null) {
            hVar2.a(this.f7381l);
            this.f7380k.l();
            return;
        }
        try {
            b(hVar);
        } catch (Exception e10) {
            f7371b.a("Error calling onResult: " + e10);
        }
        if (this.f7378i) {
            a(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e()));
        }
        if (this.f7381l) {
            return;
        }
        this.f7372c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
        h hVar;
        String str = (String) jVar.b().get(com.amazon.a.a.o.b.f7432f);
        f7371b.a("onSuccess: result = " + jVar + ", errorMessage: " + str);
        if (com.amazon.a.a.o.f.a(str)) {
            boolean zB = false;
            try {
                zB = b(jVar);
            } catch (Exception e10) {
                f7371b.a("Error calling onResult: " + e10);
            }
            if (zB && (hVar = this.f7379j) != null) {
                hVar.l();
                return;
            } else {
                if (this.f7381l) {
                    return;
                }
                if (zB) {
                    this.f7372c.b();
                    return;
                }
            }
        } else if (this.f7381l) {
            return;
        }
        this.f7372c.c();
    }

    protected void a(String str, Object obj) {
        this.f7376g.put(str, obj);
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return this.f7374e;
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        return this.f7376g;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void b(com.amazon.a.a.d.b bVar) {
        h hVar;
        if ("UNHANDLED_EXCEPTION".equals(bVar.a()) && com.amazon.a.a.o.b.ah.equals(this.f7375f) && (hVar = this.f7380k) != null) {
            hVar.a(this.f7381l);
            this.f7380k.l();
            return;
        }
        try {
            c(bVar);
        } catch (Exception e10) {
            f7371b.a("Error calling onResult: " + e10);
        }
        if (this.f7378i) {
            a(this.f7377h.a(bVar));
        }
        if (this.f7381l) {
            return;
        }
        this.f7372c.c();
    }

    public void b(h hVar) {
        this.f7380k = hVar;
    }

    protected void b(com.amazon.d.a.h hVar) {
    }

    protected void b(boolean z10) {
        this.f7378i = z10;
    }

    protected abstract boolean b(j jVar);

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return this.f7375f;
    }

    protected void c(com.amazon.a.a.d.b bVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return true;
    }

    public boolean i() {
        return this.f7381l;
    }

    protected com.amazon.a.a.j.a j() {
        return this.f7372c;
    }

    protected String k() {
        return this.f7373d;
    }

    public void l() {
        com.amazon.a.a.a(this);
    }
}
