package j0;

import j0.i;
import y1.c;

/* JADX INFO: loaded from: classes.dex */
public final class j implements z1.j<y1.c>, y1.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f13718g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f13719h = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f13720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f13721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w2.r f13723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0.r f13724f;

    public static final class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f13725a;

        a() {
        }

        @Override // y1.c.a
        public boolean a() {
            return this.f13725a;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13726a;

        static {
            int[] iArr = new int[w2.r.values().length];
            try {
                iArr[w2.r.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w2.r.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13726a = iArr;
        }
    }

    public static final class d implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ae.h0<i.a> f13728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13729c;

        d(ae.h0<i.a> h0Var, int i10) {
            this.f13728b = h0Var;
            this.f13729c = i10;
        }

        @Override // y1.c.a
        public boolean a() {
            return j.this.n(this.f13728b.f712a, this.f13729c);
        }
    }

    public j(l lVar, i iVar, boolean z10, w2.r rVar, e0.r rVar2) {
        this.f13720b = lVar;
        this.f13721c = iVar;
        this.f13722d = z10;
        this.f13723e = rVar;
        this.f13724f = rVar2;
    }

    private final i.a g(i.a aVar, int i10) {
        int iB = aVar.b();
        int iA = aVar.a();
        if (u(i10)) {
            iA++;
        } else {
            iB--;
        }
        return this.f13721c.a(iB, iA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(i.a aVar, int i10) {
        if (w(i10)) {
            return false;
        }
        if (u(i10)) {
            if (aVar.a() >= this.f13720b.c() - 1) {
                return false;
            }
        } else if (aVar.b() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean u(int i10) {
        c.b.a aVar = c.b.f23214a;
        if (c.b.h(i10, aVar.c())) {
            return false;
        }
        if (!c.b.h(i10, aVar.b())) {
            if (!c.b.h(i10, aVar.a())) {
                if (c.b.h(i10, aVar.d())) {
                    if (this.f13722d) {
                        return false;
                    }
                } else if (c.b.h(i10, aVar.e())) {
                    int i11 = c.f13726a[this.f13723e.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new md.q();
                        }
                        if (this.f13722d) {
                            return false;
                        }
                    }
                } else {
                    if (!c.b.h(i10, aVar.f())) {
                        k.c();
                        throw new md.i();
                    }
                    int i12 = c.f13726a[this.f13723e.ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new md.q();
                        }
                    } else if (this.f13722d) {
                        return false;
                    }
                }
            }
            return this.f13722d;
        }
        return true;
    }

    private final boolean w(int i10) {
        c.b.a aVar = c.b.f23214a;
        if (!(c.b.h(i10, aVar.a()) ? true : c.b.h(i10, aVar.d()))) {
            if (!(c.b.h(i10, aVar.e()) ? true : c.b.h(i10, aVar.f()))) {
                if (!(c.b.h(i10, aVar.c()) ? true : c.b.h(i10, aVar.b()))) {
                    k.c();
                    throw new md.i();
                }
            } else if (this.f13724f == e0.r.Vertical) {
                return true;
            }
        } else if (this.f13724f == e0.r.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // y1.c
    public <T> T a(int i10, zd.l<? super c.a, ? extends T> lVar) {
        if (this.f13720b.c() <= 0 || !this.f13720b.f()) {
            return lVar.invoke(f13719h);
        }
        int iD = u(i10) ? this.f13720b.d() : this.f13720b.g();
        ae.h0 h0Var = new ae.h0();
        h0Var.f712a = (T) this.f13721c.a(iD, iD);
        T tInvoke = null;
        while (tInvoke == null && n((i.a) h0Var.f712a, i10)) {
            T t10 = (T) g((i.a) h0Var.f712a, i10);
            this.f13721c.e((i.a) h0Var.f712a);
            h0Var.f712a = t10;
            this.f13720b.e();
            tInvoke = lVar.invoke(new d(h0Var, i10));
        }
        this.f13721c.e((i.a) h0Var.f712a);
        this.f13720b.e();
        return tInvoke;
    }

    @Override // z1.j
    public z1.l<y1.c> getKey() {
        return y1.d.a();
    }

    @Override // z1.j
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public y1.c getValue() {
        return this;
    }
}
