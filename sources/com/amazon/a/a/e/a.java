package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import com.amazon.a.a.k.d;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends a<T>> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7137b = new com.amazon.a.a.o.c("Expirable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f7138a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f7139c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b<T>> f7140d = new Vector();

    private void h() {
        this.f7138a.a(com.amazon.a.a.n.b.d.BACKGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.e.a.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                a.this.c();
            }

            public String toString() {
                return "Expire: " + a.this.toString();
            }
        }, a());
    }

    private void i() {
        Iterator<b<T>> it = this.f7140d.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    protected abstract Date a();

    public final void a(b<T> bVar) {
        this.f7140d.add(bVar);
    }

    protected void b() {
    }

    public void c() {
        if (this.f7139c.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7137b.a("Expiring: " + this);
            }
            d();
            if (com.amazon.a.a.o.c.f7483a) {
                f7137b.a("Notifying Observers of expiration: " + this);
            }
            i();
        }
    }

    protected abstract void d();

    @Override // com.amazon.a.a.k.d
    public final void e() {
        h();
        b();
    }

    public final void f() {
        if (this.f7139c.compareAndSet(false, true)) {
            i();
        }
    }

    protected boolean g() {
        return this.f7139c.get();
    }
}
