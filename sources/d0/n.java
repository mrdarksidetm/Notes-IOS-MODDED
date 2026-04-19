package d0;

import androidx.compose.ui.e;
import l1.b1;
import l1.t1;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f9264a = w2.h.m(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.e f9265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.compose.ui.e f9266c;

    public static final class a implements t1 {
        a() {
        }

        @Override // l1.t1
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public b1 mo253createOutlinePq9zytI(long j10, w2.r rVar, w2.d dVar) {
            float fA1 = dVar.a1(n.b());
            return new b1.b(new k1.h(0.0f, -fA1, k1.l.i(j10), k1.l.g(j10) + fA1));
        }
    }

    public static final class b implements t1 {
        b() {
        }

        @Override // l1.t1
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public b1 mo253createOutlinePq9zytI(long j10, w2.r rVar, w2.d dVar) {
            float fA1 = dVar.a1(n.b());
            return new b1.b(new k1.h(-fA1, 0.0f, k1.l.i(j10) + fA1, k1.l.g(j10)));
        }
    }

    static {
        e.a aVar = androidx.compose.ui.e.f2662a;
        f9265b = i1.g.a(aVar, new a());
        f9266c = i1.g.a(aVar, new b());
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, e0.r rVar) {
        return eVar.h(rVar == e0.r.Vertical ? f9266c : f9265b);
    }

    public static final float b() {
        return f9264a;
    }
}
