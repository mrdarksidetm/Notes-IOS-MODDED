package q6;

import ae.j;
import ae.r;
import ae.s;
import java.util.List;
import md.i0;
import md.l;
import md.n;
import md.t;
import md.u;
import sc.a;
import sc.h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f18999c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l<g> f19000d = n.b(a.f19003a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.b f19001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19002b;

    static final class a extends s implements zd.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19003a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        public final h<Object> a() {
            return (h) e.f19000d.getValue();
        }
    }

    public e(sc.b bVar, String str) {
        r.f(bVar, "binaryMessenger");
        r.f(str, "messageChannelSuffix");
        this.f19001a = bVar;
        this.f19002b = str;
    }

    public /* synthetic */ e(sc.b bVar, String str, int i10, j jVar) {
        this(bVar, (i10 & 2) != 0 ? "" : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(zd.l lVar, String str, Object obj) {
        q6.a aVarB;
        Object objA;
        r.f(lVar, "$callback");
        r.f(str, "$channelName");
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() <= 1) {
                t.a aVar = t.f15576b;
                objA = i0.f15558a;
                lVar.invoke(t.a(t.b(objA)));
            } else {
                t.a aVar2 = t.f15576b;
                Object obj2 = list.get(0);
                r.d(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = list.get(1);
                r.d(obj3, "null cannot be cast to non-null type kotlin.String");
                aVarB = new q6.a((String) obj2, (String) obj3, (String) list.get(2));
            }
        } else {
            t.a aVar3 = t.f15576b;
            aVarB = f.b(str);
        }
        objA = u.a(aVarB);
        lVar.invoke(t.a(t.b(objA)));
    }

    public final void c(List<c> list, final zd.l<? super t<i0>, i0> lVar) {
        String str;
        r.f(list, "packageInfoArg");
        r.f(lVar, "callback");
        if (this.f19002b.length() > 0) {
            str = com.amazon.a.a.o.c.a.b.f7490a + this.f19002b;
        } else {
            str = "";
        }
        final String str2 = "dev.flutter.pigeon.freerasp.TalsecPigeonApi.onMalwareDetected" + str;
        new sc.a(this.f19001a, str2, f18999c.a()).d(nd.t.d(list), new a.e() { // from class: q6.d
            @Override // sc.a.e
            public final void a(Object obj) {
                e.d(lVar, str2, obj);
            }
        });
    }
}
