package p0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import d1.x;
import java.util.Iterator;
import java.util.Map;
import l1.j0;
import le.n0;
import md.i0;
import md.u;
import t0.f3;
import t0.k2;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f17774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p3<j0> f17775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p3<f> f17776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x<g0.p, g> f17777f;

    @sd.d(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {R.styleable.AppCompatTheme_panelMenuListTheme}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f17779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f17780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0.p f17781d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, b bVar, g0.p pVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f17779b = gVar;
            this.f17780c = bVar;
            this.f17781d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f17779b, this.f17780c, this.f17781d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f17778a;
            try {
                if (i10 == 0) {
                    u.b(obj);
                    g gVar = this.f17779b;
                    this.f17778a = 1;
                    if (gVar.d(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                this.f17780c.f17777f.remove(this.f17781d);
                return i0.f15558a;
            } catch (Throwable th) {
                this.f17780c.f17777f.remove(this.f17781d);
                throw th;
            }
        }
    }

    private b(boolean z10, float f10, p3<j0> p3Var, p3<f> p3Var2) {
        super(z10, p3Var2);
        this.f17773b = z10;
        this.f17774c = f10;
        this.f17775d = p3Var;
        this.f17776e = p3Var2;
        this.f17777f = f3.h();
    }

    public /* synthetic */ b(boolean z10, float f10, p3 p3Var, p3 p3Var2, ae.j jVar) {
        this(z10, f10, p3Var, p3Var2);
    }

    private final void j(n1.f fVar, long j10) {
        Iterator<Map.Entry<g0.p, g>> it = this.f17777f.entrySet().iterator();
        while (it.hasNext()) {
            g value = it.next().getValue();
            float fD = this.f17776e.getValue().d();
            if (!(fD == 0.0f)) {
                value.e(fVar, j0.u(j10, fD, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // d0.z
    public void a(n1.c cVar) {
        long jE = this.f17775d.getValue().E();
        cVar.u1();
        f(cVar, this.f17774c, jE);
        j(cVar, jE);
    }

    @Override // t0.k2
    public void b() {
        this.f17777f.clear();
    }

    @Override // t0.k2
    public void c() {
        this.f17777f.clear();
    }

    @Override // t0.k2
    public void d() {
    }

    @Override // p0.m
    public void e(g0.p pVar, n0 n0Var) {
        Iterator<Map.Entry<g0.p, g>> it = this.f17777f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().h();
        }
        g gVar = new g(this.f17773b ? k1.f.d(pVar.a()) : null, this.f17774c, this.f17773b, null);
        this.f17777f.put(pVar, gVar);
        le.k.d(n0Var, null, null, new a(gVar, this, pVar, null), 3, null);
    }

    @Override // p0.m
    public void g(g0.p pVar) {
        g gVar = this.f17777f.get(pVar);
        if (gVar != null) {
            gVar.h();
        }
    }
}
