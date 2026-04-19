package e0;

import d0.e0;
import le.n0;
import le.o0;
import md.i0;
import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
final class i implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<Float, Float> f10360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f10361b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f10362c = new e0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k1<Boolean> f10363d = k3.e(Boolean.FALSE, null, 2, null);

    @sd.d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {178}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10364a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d0.c0 f10366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<x, qd.d<? super i0>, Object> f10367d;

        /* JADX INFO: renamed from: e0.i$a$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {181}, m = "invokeSuspend")
        static final class C0245a extends sd.j implements zd.p<x, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f10369b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i f10370c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ zd.p<x, qd.d<? super i0>, Object> f10371d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0245a(i iVar, zd.p<? super x, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super C0245a> dVar) {
                super(2, dVar);
                this.f10370c = iVar;
                this.f10371d = pVar;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(x xVar, qd.d<? super i0> dVar) {
                return ((C0245a) create(xVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                C0245a c0245a = new C0245a(this.f10370c, this.f10371d, dVar);
                c0245a.f10369b = obj;
                return c0245a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f10368a;
                try {
                    if (i10 == 0) {
                        md.u.b(obj);
                        x xVar = (x) this.f10369b;
                        this.f10370c.f10363d.setValue(sd.a.a(true));
                        zd.p<x, qd.d<? super i0>, Object> pVar = this.f10371d;
                        this.f10368a = 1;
                        if (pVar.invoke(xVar, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        md.u.b(obj);
                    }
                    this.f10370c.f10363d.setValue(sd.a.a(false));
                    return i0.f15558a;
                } catch (Throwable th) {
                    this.f10370c.f10363d.setValue(sd.a.a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d0.c0 c0Var, zd.p<? super x, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f10366c = c0Var;
            this.f10367d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return i.this.new a(this.f10366c, this.f10367d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10364a;
            if (i10 == 0) {
                md.u.b(obj);
                e0 e0Var = i.this.f10362c;
                x xVar = i.this.f10361b;
                d0.c0 c0Var = this.f10366c;
                C0245a c0245a = new C0245a(i.this, this.f10367d, null);
                this.f10364a = 1;
                if (e0Var.d(xVar, c0Var, c0245a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public static final class b implements x {
        b() {
        }

        @Override // e0.x
        public float a(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            return i.this.j().invoke(Float.valueOf(f10)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(zd.l<? super Float, Float> lVar) {
        this.f10360a = lVar;
    }

    @Override // e0.z
    public boolean b() {
        return this.f10363d.getValue().booleanValue();
    }

    @Override // e0.z
    public float d(float f10) {
        return this.f10360a.invoke(Float.valueOf(f10)).floatValue();
    }

    @Override // e0.z
    public Object e(d0.c0 c0Var, zd.p<? super x, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super i0> dVar) {
        Object objE = o0.e(new a(c0Var, pVar, null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    public final zd.l<Float, Float> j() {
        return this.f10360a;
    }
}
