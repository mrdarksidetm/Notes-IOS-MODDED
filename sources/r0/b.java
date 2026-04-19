package r0;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.ui.platform.r;
import b2.k0;
import java.util.List;
import m5.m;
import md.i0;
import nd.u;
import oe.f;
import t0.f3;
import t0.l;
import t0.o;
import t0.p3;
import w2.k;
import w2.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a implements oe.e<List<? extends m5.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oe.e f19132a;

        /* JADX INFO: renamed from: r0.b$a$a, reason: collision with other inner class name */
        public static final class C0401a<T> implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f19133a;

            /* JADX INFO: renamed from: r0.b$a$a$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$2$$inlined$map$1$2", f = "AndroidWindowAdaptiveInfo.android.kt", l = {223}, m = "emit")
            public static final class C0402a extends kotlin.coroutines.jvm.internal.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f19134a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f19135b;

                public C0402a(qd.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f19134a = obj;
                    this.f19135b |= Integer.MIN_VALUE;
                    return C0401a.this.b(null, this);
                }
            }

            public C0401a(f fVar) {
                this.f19133a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oe.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r7, qd.d r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof r0.b.a.C0401a.C0402a
                    if (r0 == 0) goto L13
                    r0 = r8
                    r0.b$a$a$a r0 = (r0.b.a.C0401a.C0402a) r0
                    int r1 = r0.f19135b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19135b = r1
                    goto L18
                L13:
                    r0.b$a$a$a r0 = new r0.b$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f19134a
                    java.lang.Object r1 = rd.b.e()
                    int r2 = r0.f19135b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    md.u.b(r8)
                    goto L60
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    md.u.b(r8)
                    oe.f r8 = r6.f19133a
                    m5.k r7 = (m5.k) r7
                    java.util.List r7 = r7.a()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L45:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L57
                    java.lang.Object r4 = r7.next()
                    boolean r5 = r4 instanceof m5.c
                    if (r5 == 0) goto L45
                    r2.add(r4)
                    goto L45
                L57:
                    r0.f19135b = r3
                    java.lang.Object r7 = r8.b(r2, r0)
                    if (r7 != r1) goto L60
                    return r1
                L60:
                    md.i0 r7 = md.i0.f15558a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: r0.b.a.C0401a.b(java.lang.Object, qd.d):java.lang.Object");
            }
        }

        public a(oe.e eVar) {
            this.f19132a = eVar;
        }

        @Override // oe.e
        public Object a(f<? super List<? extends m5.c>> fVar, qd.d dVar) {
            Object objA = this.f19132a.a(new C0401a(fVar), dVar);
            return objA == rd.d.e() ? objA : i0.f15558a;
        }
    }

    public static final p3<List<m5.c>> a(l lVar, int i10) {
        lVar.e(-883534959);
        if (o.I()) {
            o.U(-883534959, i10, -1, "androidx.compose.material3.adaptive.collectFoldingFeaturesAsState (AndroidWindowAdaptiveInfo.android.kt:68)");
        }
        Context context = (Context) lVar.P(r.g());
        lVar.e(793549594);
        boolean zN = lVar.N(context);
        Object objF = lVar.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new a(m5.f.f15442a.d(context).b(context));
            lVar.E(objF);
        }
        lVar.K();
        p3<List<m5.c>> p3VarA = f3.a((oe.e) objF, u.m(), null, lVar, 48, 2);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return p3VarA;
    }

    public static final e b(l lVar, int i10) {
        lVar.e(-2003129230);
        if (o.I()) {
            o.U(-2003129230, i10, -1, "androidx.compose.material3.adaptive.currentWindowAdaptiveInfo (AndroidWindowAdaptiveInfo.android.kt:35)");
        }
        lVar.e(-1765630114);
        long jN = ((w2.d) lVar.P(k0.c())).N(q.c(c(lVar, 0)));
        lVar.K();
        e eVar = new e(j5.b.f13924c.a(k.e(jN), k.d(jN)), r0.a.a(a(lVar, 0).getValue()));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return eVar;
    }

    public static final long c(l lVar, int i10) {
        lVar.e(-1153163183);
        if (o.I()) {
            o.U(-1153163183, i10, -1, "androidx.compose.material3.adaptive.currentWindowSize (AndroidWindowAdaptiveInfo.android.kt:49)");
        }
        lVar.P(r.f());
        Rect rectA = m.f15468a.a().c((Context) lVar.P(r.g())).a();
        long jA = q.a(rectA.width(), rectA.height());
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return jA;
    }
}
