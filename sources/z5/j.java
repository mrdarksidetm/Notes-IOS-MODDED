package z5;

import ae.s;
import android.content.Context;
import androidx.compose.ui.platform.r;
import ge.o;
import j6.h;
import j6.k;
import md.i0;
import w2.q;
import y1.f;
import z5.b;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f24246a = w2.b.f22395b.c(0, 0);

    static final class a extends s implements l<b.c, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<b.c.C0496c, i0> f24247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<b.c.d, i0> f24248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<b.c.C0495b, i0> f24249c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super b.c.C0496c, i0> lVar, l<? super b.c.d, i0> lVar2, l<? super b.c.C0495b, i0> lVar3) {
            super(1);
            this.f24247a = lVar;
            this.f24248b = lVar2;
            this.f24249c = lVar3;
        }

        public final void a(b.c cVar) {
            l lVar;
            if (cVar instanceof b.c.C0496c) {
                lVar = this.f24247a;
                if (lVar == null) {
                    return;
                }
            } else if (cVar instanceof b.c.d) {
                lVar = this.f24248b;
                if (lVar == null) {
                    return;
                }
            } else if (!(cVar instanceof b.c.C0495b)) {
                boolean z10 = cVar instanceof b.c.a;
                return;
            } else {
                lVar = this.f24249c;
                if (lVar == null) {
                    return;
                }
            }
            lVar.invoke(cVar);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(b.c cVar) {
            a(cVar);
            return i0.f15558a;
        }
    }

    static final class b extends s implements l<b.c, b.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1.c f24250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o1.c f24251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o1.c f24252c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o1.c cVar, o1.c cVar2, o1.c cVar3) {
            super(1);
            this.f24250a = cVar;
            this.f24251b = cVar2;
            this.f24252c = cVar3;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b.c invoke(b.c cVar) {
            o1.c cVar2;
            if (cVar instanceof b.c.C0496c) {
                o1.c cVar3 = this.f24250a;
                b.c.C0496c c0496c = (b.c.C0496c) cVar;
                return cVar3 != null ? c0496c.b(cVar3) : c0496c;
            }
            if (!(cVar instanceof b.c.C0495b)) {
                return cVar;
            }
            b.c.C0495b c0495b = (b.c.C0495b) cVar;
            if (c0495b.d().c() instanceof k) {
                cVar2 = this.f24251b;
                if (cVar2 == null) {
                    return c0495b;
                }
            } else {
                cVar2 = this.f24252c;
                if (cVar2 == null) {
                    return c0495b;
                }
            }
            return b.c.C0495b.c(c0495b, cVar2, null, 2, null);
        }
    }

    public static final float a(long j10, float f10) {
        return o.k(f10, w2.b.o(j10), w2.b.m(j10));
    }

    public static final float b(long j10, float f10) {
        return o.k(f10, w2.b.p(j10), w2.b.n(j10));
    }

    public static final long c() {
        return f24246a;
    }

    public static final l<b.c, i0> d(l<? super b.c.C0496c, i0> lVar, l<? super b.c.d, i0> lVar2, l<? super b.c.C0495b, i0> lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new a(lVar, lVar2, lVar3);
    }

    public static final j6.h e(Object obj, t0.l lVar, int i10) {
        if (t0.o.I()) {
            t0.o.U(1151830858, i10, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        return obj instanceof j6.h ? (j6.h) obj : new h.a((Context) lVar.P(r.g())).c(obj).a();
    }

    public static final long f(long j10) {
        return q.a(ce.c.d(k1.l.i(j10)), ce.c.d(k1.l.g(j10)));
    }

    public static final k6.h g(y1.f fVar) {
        f.a aVar = y1.f.f23237a;
        return ae.r.b(fVar, aVar.b()) ? true : ae.r.b(fVar, aVar.c()) ? k6.h.FIT : k6.h.FILL;
    }

    public static final l<b.c, b.c> h(o1.c cVar, o1.c cVar2, o1.c cVar3) {
        return (cVar == null && cVar2 == null && cVar3 == null) ? z5.b.f24176v.a() : new b(cVar, cVar3, cVar2);
    }
}
