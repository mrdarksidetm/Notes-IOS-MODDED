package androidx.compose.foundation.layout;

import a2.r0;
import f1.b;

/* JADX INFO: loaded from: classes.dex */
final class WrapContentElement extends r0<s> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2464g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.m f2465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.p<w2.p, w2.r, w2.n> f2467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f2468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f2469f;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        static final class C0051a extends ae.s implements zd.p<w2.p, w2.r, w2.n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.c f2470a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0051a(b.c cVar) {
                super(2);
                this.f2470a = cVar;
            }

            public final long a(long j10, w2.r rVar) {
                return w2.o.a(0, this.f2470a.a(0, w2.p.f(j10)));
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ w2.n invoke(w2.p pVar, w2.r rVar) {
                return w2.n.b(a(pVar.j(), rVar));
            }
        }

        static final class b extends ae.s implements zd.p<w2.p, w2.r, w2.n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f1.b f2471a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f1.b bVar) {
                super(2);
                this.f2471a = bVar;
            }

            public final long a(long j10, w2.r rVar) {
                return this.f2471a.a(w2.p.f22421b.a(), j10, rVar);
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ w2.n invoke(w2.p pVar, w2.r rVar) {
                return w2.n.b(a(pVar.j(), rVar));
            }
        }

        static final class c extends ae.s implements zd.p<w2.p, w2.r, w2.n> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0266b f2472a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b.InterfaceC0266b interfaceC0266b) {
                super(2);
                this.f2472a = interfaceC0266b;
            }

            public final long a(long j10, w2.r rVar) {
                return w2.o.a(this.f2472a.a(0, w2.p.g(j10), rVar), 0);
            }

            @Override // zd.p
            public /* bridge */ /* synthetic */ w2.n invoke(w2.p pVar, w2.r rVar) {
                return w2.n.b(a(pVar.j(), rVar));
            }
        }

        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final WrapContentElement a(b.c cVar, boolean z10) {
            return new WrapContentElement(h0.m.Vertical, z10, new C0051a(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(f1.b bVar, boolean z10) {
            return new WrapContentElement(h0.m.Both, z10, new b(bVar), bVar, "wrapContentSize");
        }

        public final WrapContentElement c(b.InterfaceC0266b interfaceC0266b, boolean z10) {
            return new WrapContentElement(h0.m.Horizontal, z10, new c(interfaceC0266b), interfaceC0266b, "wrapContentWidth");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(h0.m mVar, boolean z10, zd.p<? super w2.p, ? super w2.r, w2.n> pVar, Object obj, String str) {
        this.f2465b = mVar;
        this.f2466c = z10;
        this.f2467d = pVar;
        this.f2468e = obj;
        this.f2469f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f2465b == wrapContentElement.f2465b && this.f2466c == wrapContentElement.f2466c && ae.r.b(this.f2468e, wrapContentElement.f2468e);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s a() {
        return new s(this.f2465b, this.f2466c, this.f2467d);
    }

    @Override // a2.r0
    public int hashCode() {
        return (((this.f2465b.hashCode() * 31) + Boolean.hashCode(this.f2466c)) * 31) + this.f2468e.hashCode();
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(s sVar) {
        sVar.c2(this.f2465b);
        sVar.d2(this.f2466c);
        sVar.b2(this.f2467d);
    }
}
