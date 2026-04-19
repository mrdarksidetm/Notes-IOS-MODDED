package bf;

import md.i0;
import ye.d;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements we.b<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f5830a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f5831b = ye.i.b("kotlinx.serialization.json.JsonElement", d.a.f23978a, new ye.f[0], a.f5832a);

    static final class a extends ae.s implements zd.l<ye.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5832a = new a();

        /* JADX INFO: renamed from: bf.j$a$a, reason: collision with other inner class name */
        static final class C0139a extends ae.s implements zd.a<ye.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0139a f5833a = new C0139a();

            C0139a() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ye.f invoke() {
                return x.f5853a.getDescriptor();
            }
        }

        static final class b extends ae.s implements zd.a<ye.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f5834a = new b();

            b() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ye.f invoke() {
                return t.f5845a.getDescriptor();
            }
        }

        static final class c extends ae.s implements zd.a<ye.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f5835a = new c();

            c() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ye.f invoke() {
                return p.f5842a.getDescriptor();
            }
        }

        static final class d extends ae.s implements zd.a<ye.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f5836a = new d();

            d() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ye.f invoke() {
                return v.f5848a.getDescriptor();
            }
        }

        static final class e extends ae.s implements zd.a<ye.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f5837a = new e();

            e() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ye.f invoke() {
                return bf.c.f5797a.getDescriptor();
            }
        }

        a() {
            super(1);
        }

        public final void a(ye.a aVar) {
            ae.r.f(aVar, "$this$buildSerialDescriptor");
            ye.a.b(aVar, "JsonPrimitive", k.f(C0139a.f5833a), null, false, 12, null);
            ye.a.b(aVar, "JsonNull", k.f(b.f5834a), null, false, 12, null);
            ye.a.b(aVar, "JsonLiteral", k.f(c.f5835a), null, false, 12, null);
            ye.a.b(aVar, "JsonObject", k.f(d.f5836a), null, false, 12, null);
            ye.a.b(aVar, "JsonArray", k.f(e.f5837a), null, false, 12, null);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(ye.a aVar) {
            a(aVar);
            return i0.f15558a;
        }
    }

    private j() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        return k.d(eVar).p();
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, h hVar) {
        we.b bVar;
        ae.r.f(fVar, "encoder");
        ae.r.f(hVar, "value");
        k.h(fVar);
        if (hVar instanceof w) {
            bVar = x.f5853a;
        } else if (hVar instanceof u) {
            bVar = v.f5848a;
        } else if (!(hVar instanceof b)) {
            return;
        } else {
            bVar = c.f5797a;
        }
        fVar.D(bVar, hVar);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f5831b;
    }
}
