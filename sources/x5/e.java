package x5;

import ae.s;
import android.content.Context;
import h6.c;
import md.l;
import md.n;
import o6.i;
import o6.o;
import o6.r;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import x5.c;

/* JADX INFO: loaded from: classes.dex */
public interface e {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f22995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j6.c f22996b = i.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l<? extends h6.c> f22997c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l<? extends b6.a> f22998d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private l<? extends Call.Factory> f22999e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.InterfaceC0478c f23000f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x5.b f23001g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private o f23002h = new o(false, false, false, 0, null, 31, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private r f23003i = null;

        /* JADX INFO: renamed from: x5.e$a$a, reason: collision with other inner class name */
        static final class C0479a extends s implements zd.a<h6.c> {
            C0479a() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h6.c invoke() {
                return new c.a(a.this.f22995a).a();
            }
        }

        static final class b extends s implements zd.a<b6.a> {
            b() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // zd.a
            public final b6.a invoke() {
                return o6.s.f16404a.a(a.this.f22995a);
            }
        }

        static final class c extends s implements zd.a<OkHttpClient> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f23006a = new c();

            c() {
                super(0);
            }

            @Override // zd.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient invoke() {
                return new OkHttpClient();
            }
        }

        public a(Context context) {
            this.f22995a = context.getApplicationContext();
        }

        public final e b() {
            Context context = this.f22995a;
            j6.c cVar = this.f22996b;
            l<? extends h6.c> lVarB = this.f22997c;
            if (lVarB == null) {
                lVarB = n.b(new C0479a());
            }
            l<? extends h6.c> lVar = lVarB;
            l<? extends b6.a> lVarB2 = this.f22998d;
            if (lVarB2 == null) {
                lVarB2 = n.b(new b());
            }
            l<? extends b6.a> lVar2 = lVarB2;
            l<? extends Call.Factory> lVarB3 = this.f22999e;
            if (lVarB3 == null) {
                lVarB3 = n.b(c.f23006a);
            }
            l<? extends Call.Factory> lVar3 = lVarB3;
            c.InterfaceC0478c interfaceC0478c = this.f23000f;
            if (interfaceC0478c == null) {
                interfaceC0478c = c.InterfaceC0478c.f22993b;
            }
            c.InterfaceC0478c interfaceC0478c2 = interfaceC0478c;
            x5.b bVar = this.f23001g;
            if (bVar == null) {
                bVar = new x5.b();
            }
            return new h(context, cVar, lVar, lVar2, lVar3, interfaceC0478c2, bVar, this.f23002h, this.f23003i);
        }

        public final a c(zd.a<? extends b6.a> aVar) {
            this.f22998d = n.b(aVar);
            return this;
        }

        public final a d(j6.b bVar) {
            j6.c cVar = this.f22996b;
            this.f22996b = cVar.a((24575 & 1) != 0 ? cVar.f13941a : null, (24575 & 2) != 0 ? cVar.f13942b : null, (24575 & 4) != 0 ? cVar.f13943c : null, (24575 & 8) != 0 ? cVar.f13944d : null, (24575 & 16) != 0 ? cVar.f13945e : null, (24575 & 32) != 0 ? cVar.f13946f : null, (24575 & 64) != 0 ? cVar.f13947g : null, (24575 & 128) != 0 ? cVar.f13948h : false, (24575 & 256) != 0 ? cVar.f13949i : false, (24575 & 512) != 0 ? cVar.f13950j : null, (24575 & 1024) != 0 ? cVar.f13951k : null, (24575 & 2048) != 0 ? cVar.f13952l : null, (24575 & 4096) != 0 ? cVar.f13953m : null, (24575 & 8192) != 0 ? cVar.f13954n : bVar, (24575 & 16384) != 0 ? cVar.f13955o : null);
            return this;
        }

        public final a e(h6.c cVar) {
            this.f22997c = md.o.c(cVar);
            return this;
        }

        public final a f(j6.b bVar) {
            j6.c cVar = this.f22996b;
            this.f22996b = cVar.a((24575 & 1) != 0 ? cVar.f13941a : null, (24575 & 2) != 0 ? cVar.f13942b : null, (24575 & 4) != 0 ? cVar.f13943c : null, (24575 & 8) != 0 ? cVar.f13944d : null, (24575 & 16) != 0 ? cVar.f13945e : null, (24575 & 32) != 0 ? cVar.f13946f : null, (24575 & 64) != 0 ? cVar.f13947g : null, (24575 & 128) != 0 ? cVar.f13948h : false, (24575 & 256) != 0 ? cVar.f13949i : false, (24575 & 512) != 0 ? cVar.f13950j : null, (24575 & 1024) != 0 ? cVar.f13951k : null, (24575 & 2048) != 0 ? cVar.f13952l : null, (24575 & 4096) != 0 ? cVar.f13953m : bVar, (24575 & 8192) != 0 ? cVar.f13954n : null, (24575 & 16384) != 0 ? cVar.f13955o : null);
            return this;
        }
    }

    Object a(j6.h hVar, qd.d<? super j6.i> dVar);

    j6.e b(j6.h hVar);

    j6.c c();

    h6.c d();

    b getComponents();
}
