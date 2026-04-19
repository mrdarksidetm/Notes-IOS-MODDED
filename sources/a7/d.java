package a7;

import ae.j;
import ae.r;
import ae.s;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import d7.v;
import d7.w;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import md.i0;
import nd.c0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c7.c f649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f650c;

    public static final class a {
    }

    public enum b {
        V_1(1),
        V_2(2),
        V_3(3),
        V_4(4),
        V_5(5);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f651b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f658a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(j jVar) {
                this();
            }

            public final b a() {
                return b.V_4;
            }
        }

        b(int i10) {
            this.f658a = i10;
        }

        public final int b() {
            return this.f658a;
        }
    }

    static final class c extends s implements l<v<?>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f659a = new c();

        c() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(v<?> vVar) {
            r.f(vVar, "it");
            return vVar.a();
        }
    }

    public d(a aVar, w wVar, c7.c cVar) {
        r.f(wVar, "fpSignalsProvider");
        r.f(cVar, "deviceIdSignalsProvider");
        this.f648a = wVar;
        this.f649b = cVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        r.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f650c = executorServiceNewSingleThreadExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(l lVar, d dVar, b bVar) {
        r.f(lVar, "$listener");
        r.f(dVar, "this$0");
        r.f(bVar, "$version");
        lVar.invoke(new a7.b(dVar.f649b.g(bVar).a(), dVar.f649b.e().a(), dVar.f649b.d().a(), dVar.f649b.f().a()));
    }

    public static /* synthetic */ String e(d dVar, List list, h7.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new h7.b();
        }
        return dVar.d(list, aVar);
    }

    private final String g(h7.a aVar, List<? extends v<?>> list) {
        return aVar.a(c0.h0(list, "", null, null, 0, null, c.f659a, 30, null));
    }

    public final void b(final b bVar, final l<? super a7.b, i0> lVar) {
        r.f(bVar, DiagnosticsEntry.VERSION_KEY);
        r.f(lVar, "listener");
        this.f650c.execute(new Runnable() { // from class: a7.c
            @Override // java.lang.Runnable
            public final void run() {
                d.c(lVar, this, bVar);
            }
        });
    }

    public final String d(List<? extends v<?>> list, h7.a aVar) {
        r.f(list, "fingerprintingSignals");
        r.f(aVar, "hasher");
        return g(aVar, list);
    }

    public final w f() {
        return this.f648a;
    }
}
