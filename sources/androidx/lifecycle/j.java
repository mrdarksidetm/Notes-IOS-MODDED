package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import oe.h0;

/* JADX INFO: loaded from: classes.dex */
public class j extends g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f4324k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t.a<o4.d, b> f4326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g.b f4327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference<o4.e> f4328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<g.b> f4332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final oe.s<g.b> f4333j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final g.b a(g.b bVar, g.b bVar2) {
            ae.r.f(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g.b f4334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f4335b;

        public b(o4.d dVar, g.b bVar) {
            ae.r.f(bVar, "initialState");
            ae.r.c(dVar);
            this.f4335b = k.f(dVar);
            this.f4334a = bVar;
        }

        public final void a(o4.e eVar, g.a aVar) {
            ae.r.f(aVar, "event");
            g.b bVarC = aVar.c();
            this.f4334a = j.f4324k.a(this.f4334a, bVarC);
            i iVar = this.f4335b;
            ae.r.c(eVar);
            iVar.s(eVar, aVar);
            this.f4334a = bVarC;
        }

        public final g.b b() {
            return this.f4334a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(o4.e eVar) {
        this(eVar, true);
        ae.r.f(eVar, "provider");
    }

    private j(o4.e eVar, boolean z10) {
        this.f4325b = z10;
        this.f4326c = new t.a<>();
        g.b bVar = g.b.INITIALIZED;
        this.f4327d = bVar;
        this.f4332i = new ArrayList<>();
        this.f4328e = new WeakReference<>(eVar);
        this.f4333j = h0.a(bVar);
    }

    private final void d(o4.e eVar) {
        Iterator<Map.Entry<o4.d, b>> itDescendingIterator = this.f4326c.descendingIterator();
        ae.r.e(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f4331h) {
            Map.Entry<o4.d, b> next = itDescendingIterator.next();
            ae.r.e(next, "next()");
            o4.d key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.f4327d) > 0 && !this.f4331h && this.f4326c.contains(key)) {
                g.a aVarA = g.a.Companion.a(value.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.b());
                }
                l(aVarA.c());
                value.a(eVar, aVarA);
                k();
            }
        }
    }

    private final g.b e(o4.d dVar) {
        b value;
        Map.Entry<o4.d, b> entryO = this.f4326c.o(dVar);
        g.b bVar = null;
        g.b bVarB = (entryO == null || (value = entryO.getValue()) == null) ? null : value.b();
        if (!this.f4332i.isEmpty()) {
            bVar = this.f4332i.get(r0.size() - 1);
        }
        a aVar = f4324k;
        return aVar.a(aVar.a(this.f4327d, bVarB), bVar);
    }

    private final void f(String str) {
        if (!this.f4325b || s.c.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void g(o4.e eVar) {
        t.b<o4.d, b>.d dVarD = this.f4326c.d();
        ae.r.e(dVarD, "observerMap.iteratorWithAdditions()");
        while (dVarD.hasNext() && !this.f4331h) {
            Map.Entry next = dVarD.next();
            o4.d dVar = (o4.d) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f4327d) < 0 && !this.f4331h && this.f4326c.contains(dVar)) {
                l(bVar.b());
                g.a aVarB = g.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(eVar, aVarB);
                k();
            }
        }
    }

    private final boolean i() {
        if (this.f4326c.size() == 0) {
            return true;
        }
        Map.Entry<o4.d, b> entryA = this.f4326c.a();
        ae.r.c(entryA);
        g.b bVarB = entryA.getValue().b();
        Map.Entry<o4.d, b> entryF = this.f4326c.f();
        ae.r.c(entryF);
        g.b bVarB2 = entryF.getValue().b();
        return bVarB == bVarB2 && this.f4327d == bVarB2;
    }

    private final void j(g.b bVar) {
        g.b bVar2 = this.f4327d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == g.b.INITIALIZED && bVar == g.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f4327d + " in component " + this.f4328e.get()).toString());
        }
        this.f4327d = bVar;
        if (this.f4330g || this.f4329f != 0) {
            this.f4331h = true;
            return;
        }
        this.f4330g = true;
        n();
        this.f4330g = false;
        if (this.f4327d == g.b.DESTROYED) {
            this.f4326c = new t.a<>();
        }
    }

    private final void k() {
        this.f4332i.remove(r0.size() - 1);
    }

    private final void l(g.b bVar) {
        this.f4332i.add(bVar);
    }

    private final void n() {
        o4.e eVar = this.f4328e.get();
        if (eVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f4331h = false;
            if (zI) {
                this.f4333j.setValue(b());
                return;
            }
            g.b bVar = this.f4327d;
            Map.Entry<o4.d, b> entryA = this.f4326c.a();
            ae.r.c(entryA);
            if (bVar.compareTo(entryA.getValue().b()) < 0) {
                d(eVar);
            }
            Map.Entry<o4.d, b> entryF = this.f4326c.f();
            if (!this.f4331h && entryF != null && this.f4327d.compareTo(entryF.getValue().b()) > 0) {
                g(eVar);
            }
        }
    }

    @Override // androidx.lifecycle.g
    public void a(o4.d dVar) {
        o4.e eVar;
        ae.r.f(dVar, "observer");
        f("addObserver");
        g.b bVar = this.f4327d;
        g.b bVar2 = g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = g.b.INITIALIZED;
        }
        b bVar3 = new b(dVar, bVar2);
        if (this.f4326c.l(dVar, bVar3) == null && (eVar = this.f4328e.get()) != null) {
            boolean z10 = this.f4329f != 0 || this.f4330g;
            g.b bVarE = e(dVar);
            this.f4329f++;
            while (bVar3.b().compareTo(bVarE) < 0 && this.f4326c.contains(dVar)) {
                l(bVar3.b());
                g.a aVarB = g.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(eVar, aVarB);
                k();
                bVarE = e(dVar);
            }
            if (!z10) {
                n();
            }
            this.f4329f--;
        }
    }

    @Override // androidx.lifecycle.g
    public g.b b() {
        return this.f4327d;
    }

    @Override // androidx.lifecycle.g
    public void c(o4.d dVar) {
        ae.r.f(dVar, "observer");
        f("removeObserver");
        this.f4326c.n(dVar);
    }

    public void h(g.a aVar) {
        ae.r.f(aVar, "event");
        f("handleLifecycleEvent");
        j(aVar.c());
    }

    public void m(g.b bVar) {
        ae.r.f(bVar, "state");
        f("setCurrentState");
        j(bVar);
    }
}
