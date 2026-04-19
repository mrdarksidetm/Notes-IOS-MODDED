package t0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import qd.g;
import t0.c1;

/* JADX INFO: loaded from: classes.dex */
final class p2 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f20900a = new p2();

    /* JADX INFO: Add missing generic type declarations: [R] */
    @sd.d(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {R.styleable.AppCompatTheme_colorButtonNormal}, m = "invokeSuspend")
    static final class a<R> extends sd.j implements zd.p<le.n0, qd.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Long, R> f20902b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.l<? super Long, ? extends R> lVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f20902b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f20902b, dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super R> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f20901a;
            if (i10 == 0) {
                md.u.b(obj);
                this.f20901a = 1;
                if (le.x0.a(16L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return this.f20902b.invoke(sd.a.e(System.nanoTime()));
        }
    }

    private p2() {
    }

    @Override // t0.c1
    public <R> Object M(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar) {
        return le.i.g(le.d1.c(), new a(lVar, null), dVar);
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) c1.a.a(this, r10, pVar);
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) c1.a.b(this, cVar);
    }

    @Override // qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return c1.a.c(this, cVar);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return c1.a.d(this, gVar);
    }
}
