package c0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @sd.d(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
    static final class a<R> extends sd.j implements zd.l<qd.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Long, R> f6082b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.l<? super Long, ? extends R> lVar, qd.d<? super a> dVar) {
            super(1, dVar);
            this.f6082b = lVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qd.d<? super R> dVar) {
            return ((a) create(dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(qd.d<?> dVar) {
            return new a(this.f6082b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f6081a;
            if (i10 == 0) {
                md.u.b(obj);
                zd.l<Long, R> lVar = this.f6082b;
                this.f6081a = 1;
                obj = t0.d1.b(lVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return obj;
        }
    }

    public static final <R> Object a(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar) {
        b2.r0 r0Var = (b2.r0) dVar.getContext().get(b2.r0.M);
        return r0Var == null ? t0.d1.b(lVar, dVar) : r0Var.P(new a(lVar, null), dVar);
    }
}
