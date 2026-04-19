package com.amazon.a.a.n.b;

import com.amazon.a.a.c.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.amazon.a.a.k.d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7383a = new com.amazon.a.a.o.c("ForegroundTaskPipeline");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f7384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f7385c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f7387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<com.amazon.a.a.n.a> f7388f = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f7386d = b.b("KIWI_UI");

    public a(c cVar) {
        this.f7387e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.amazon.a.a.n.a aVar, boolean z10) {
        if (this.f7384b.c()) {
            if (z10) {
                this.f7386d.b(aVar);
                return;
            } else {
                this.f7386d.a(aVar);
                return;
            }
        }
        if (com.amazon.a.a.o.c.f7483a) {
            f7383a.a("No UI visible to execute task: " + aVar + ", placing into pending queue until task is visible");
        }
        this.f7388f.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7383a.a("Activity resumed, scheduling tasks on UI thread");
        }
        Iterator<com.amazon.a.a.n.a> it = this.f7388f.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        this.f7388f.clear();
    }

    private com.amazon.a.a.n.a c(final com.amazon.a.a.n.a aVar) {
        return new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.n.b.a.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                a.this.a(aVar, true);
            }

            public String toString() {
                return "Future:PostToUITask: " + aVar.toString();
            }
        };
    }

    @Override // com.amazon.a.a.n.b.c
    public void a() {
        this.f7386d.a();
        this.f7387e.a();
        this.f7388f.clear();
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar) {
        a(aVar, false);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, long j10) {
        this.f7387e.a(c(aVar), j10);
    }

    @Override // com.amazon.a.a.n.b.c
    public void a(com.amazon.a.a.n.a aVar, Date date) {
        this.f7387e.a(c(aVar), date);
    }

    @Override // com.amazon.a.a.n.b.c
    public void b(com.amazon.a.a.n.a aVar) {
        a(aVar, true);
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f7385c.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.n.b.a.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                a.this.b();
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }

            public String toString() {
                return "ForegroundTaskPipeline:onResume listener";
            }
        });
    }
}
