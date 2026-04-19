package h1;

import a2.k;
import a2.r1;
import a2.s1;
import a2.t1;
import ae.d0;
import ae.h0;
import ae.j;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends e.c implements s1, h1.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f11802r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f11803s = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final l<h1.b, g> f11804n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f11805o = a.C0286a.f11808a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h1.d f11806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g f11807q;

    public static final class a {

        /* JADX INFO: renamed from: h1.e$a$a, reason: collision with other inner class name */
        private static final class C0286a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0286a f11808a = new C0286a();

            private C0286a() {
            }
        }

        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    static final class b extends s implements l<e, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f11809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h1.b f11810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f11811c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0 d0Var, h1.b bVar, e eVar) {
            super(1);
            this.f11809a = d0Var;
            this.f11810b = bVar;
            this.f11811c = eVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e eVar) {
            d0 d0Var = this.f11809a;
            boolean z10 = d0Var.f699a;
            boolean zA2 = eVar.a2(this.f11810b);
            e eVar2 = this.f11811c;
            if (zA2) {
                k.l(eVar2).getDragAndDropManager().a(eVar);
            }
            i0 i0Var = i0.f15558a;
            d0Var.f699a = z10 | zA2;
            return Boolean.TRUE;
        }
    }

    static final class c extends s implements l<e, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h1.b f11812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h1.b bVar) {
            super(1);
            this.f11812a = bVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e eVar) {
            eVar.Y(this.f11812a);
            return Boolean.TRUE;
        }
    }

    public static final class d extends s implements l<s1, r1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f11813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f11814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h1.b f11815c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h0 h0Var, e eVar, h1.b bVar) {
            super(1);
            this.f11813a = h0Var;
            this.f11814b = eVar;
            this.f11815c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r1 invoke(s1 s1Var) {
            if (s1Var instanceof h1.d) {
                h1.d dVar = (h1.d) s1Var;
                if (k.l(this.f11814b).getDragAndDropManager().b(dVar) && f.c(dVar, i.a(this.f11815c))) {
                    this.f11813a.f712a = s1Var;
                    return r1.CancelTraversal;
                }
            }
            return r1.ContinueTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super h1.b, ? extends g> lVar) {
        this.f11804n = lVar;
    }

    @Override // h1.g
    public void A0(h1.b bVar) {
        g gVar = this.f11807q;
        if (gVar != null) {
            gVar.A0(bVar);
        }
        h1.d dVar = this.f11806p;
        if (dVar != null) {
            dVar.A0(bVar);
        }
        this.f11806p = null;
    }

    @Override // a2.s1
    public Object I() {
        return this.f11805o;
    }

    @Override // androidx.compose.ui.e.c
    public void L1() {
        this.f11807q = null;
        this.f11806p = null;
    }

    @Override // h1.g
    public void W(h1.b bVar) {
        h1.d dVar;
        h1.d dVar2 = this.f11806p;
        if (dVar2 != null && f.c(dVar2, i.a(bVar))) {
            dVar = dVar2;
        } else if (L0().H1()) {
            h0 h0Var = new h0();
            t1.c(this, a.C0286a.f11808a, new d(h0Var, this, bVar));
            dVar = (h1.d) h0Var.f712a;
        } else {
            dVar = null;
        }
        if (dVar == null || dVar2 != null) {
            if (dVar == null && dVar2 != null) {
                dVar2.A0(bVar);
                g gVar = this.f11807q;
                if (gVar != null) {
                    f.d(gVar, bVar);
                }
            } else if (!r.b(dVar, dVar2)) {
                if (dVar2 != null) {
                    dVar2.A0(bVar);
                }
                if (dVar != null) {
                }
            } else if (dVar != null) {
                dVar.W(bVar);
            } else {
                g gVar2 = this.f11807q;
                if (gVar2 != null) {
                    gVar2.W(bVar);
                }
            }
            this.f11806p = dVar;
        }
        g gVar3 = this.f11807q;
        if (gVar3 != null) {
            gVar3.A0(bVar);
        }
        f.d(dVar, bVar);
        this.f11806p = dVar;
    }

    @Override // h1.g
    public void Y(h1.b bVar) {
        if (L0().H1()) {
            t1.b(this, new c(bVar));
            g gVar = this.f11807q;
            if (gVar != null) {
                gVar.Y(bVar);
            }
            this.f11807q = null;
            this.f11806p = null;
        }
    }

    @Override // h1.g
    public boolean Z0(h1.b bVar) {
        g gVar = this.f11806p;
        if (gVar == null && (gVar = this.f11807q) == null) {
            return false;
        }
        return gVar.Z0(bVar);
    }

    public boolean a2(h1.b bVar) {
        if (!H1()) {
            return false;
        }
        if (!(this.f11807q == null)) {
            throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
        }
        this.f11807q = this.f11804n.invoke(bVar);
        d0 d0Var = new d0();
        t1.b(this, new b(d0Var, bVar, this));
        return d0Var.f699a || this.f11807q != null;
    }

    @Override // h1.g
    public void c1(h1.b bVar) {
        g gVar = this.f11807q;
        if (gVar == null && (gVar = this.f11806p) == null) {
            return;
        }
        gVar.c1(bVar);
    }

    @Override // h1.g
    public void t1(h1.b bVar) {
        g gVar = this.f11807q;
        if (gVar == null && (gVar = this.f11806p) == null) {
            return;
        }
        gVar.t1(bVar);
    }
}
