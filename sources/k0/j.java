package k0;

import ae.o;
import ae.r;
import ae.s;
import le.a2;
import le.n0;
import le.o0;
import md.i0;
import md.u;
import md.x;
import y1.r;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k0.a implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h f14310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final z1.g f14311q = z1.i.b(x.a(k0.b.a(), this));

    @sd.d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    static final class a extends sd.j implements p<n0, qd.d<? super a2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14313b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f14315d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ zd.a<k1.h> f14316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ zd.a<k1.h> f14317f;

        /* JADX INFO: renamed from: k0.j$a$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {176}, m = "invokeSuspend")
        static final class C0331a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f14319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ r f14320c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ zd.a<k1.h> f14321d;

            /* JADX INFO: renamed from: k0.j$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0332a extends o implements zd.a<k1.h> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f14322a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ r f14323b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ zd.a<k1.h> f14324c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0332a(j jVar, r rVar, zd.a<k1.h> aVar) {
                    super(0, r.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f14322a = jVar;
                    this.f14323b = rVar;
                    this.f14324c = aVar;
                }

                @Override // zd.a
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public final k1.h invoke() {
                    return j.e2(this.f14322a, this.f14323b, this.f14324c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0331a(j jVar, y1.r rVar, zd.a<k1.h> aVar, qd.d<? super C0331a> dVar) {
                super(2, dVar);
                this.f14319b = jVar;
                this.f14320c = rVar;
                this.f14321d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new C0331a(this.f14319b, this.f14320c, this.f14321d, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((C0331a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f14318a;
                if (i10 == 0) {
                    u.b(obj);
                    h hVarF2 = this.f14319b.f2();
                    C0332a c0332a = new C0332a(this.f14319b, this.f14320c, this.f14321d);
                    this.f14318a = 1;
                    if (hVarF2.T(c0332a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f15558a;
            }
        }

        @sd.d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {185}, m = "invokeSuspend")
        static final class b extends sd.j implements p<n0, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f14326b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ zd.a<k1.h> f14327c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, zd.a<k1.h> aVar, qd.d<? super b> dVar) {
                super(2, dVar);
                this.f14326b = jVar;
                this.f14327c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new b(this.f14326b, this.f14327c, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
                return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f14325a;
                if (i10 == 0) {
                    u.b(obj);
                    c cVarC2 = this.f14326b.c2();
                    y1.r rVarA2 = this.f14326b.a2();
                    if (rVarA2 == null) {
                        return i0.f15558a;
                    }
                    zd.a<k1.h> aVar = this.f14327c;
                    this.f14325a = 1;
                    if (cVarC2.o0(rVarA2, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y1.r rVar, zd.a<k1.h> aVar, zd.a<k1.h> aVar2, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f14315d = rVar;
            this.f14316e = aVar;
            this.f14317f = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = j.this.new a(this.f14315d, this.f14316e, this.f14317f, dVar);
            aVar.f14313b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super a2> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f14312a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n0 n0Var = (n0) this.f14313b;
            le.k.d(n0Var, null, null, new C0331a(j.this, this.f14315d, this.f14316e, null), 3, null);
            return le.k.d(n0Var, null, null, new b(j.this, this.f14317f, null), 3, null);
        }
    }

    static final class b extends s implements zd.a<k1.h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.r f14329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.a<k1.h> f14330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y1.r rVar, zd.a<k1.h> aVar) {
            super(0);
            this.f14329b = rVar;
            this.f14330c = aVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.h invoke() {
            k1.h hVarE2 = j.e2(j.this, this.f14329b, this.f14330c);
            if (hVarE2 != null) {
                return j.this.f2().v0(hVarE2);
            }
            return null;
        }
    }

    public j(h hVar) {
        this.f14310p = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k1.h e2(j jVar, y1.r rVar, zd.a<k1.h> aVar) {
        k1.h hVarInvoke;
        y1.r rVarA2 = jVar.a2();
        if (rVarA2 == null) {
            return null;
        }
        if (!rVar.v()) {
            rVar = null;
        }
        if (rVar == null || (hVarInvoke = aVar.invoke()) == null) {
            return null;
        }
        return i.b(rVarA2, rVar, hVarInvoke);
    }

    public final h f2() {
        return this.f14310p;
    }

    @Override // k0.c
    public Object o0(y1.r rVar, zd.a<k1.h> aVar, qd.d<? super i0> dVar) {
        Object objE = o0.e(new a(rVar, aVar, new b(rVar, aVar), null), dVar);
        return objE == rd.d.e() ? objE : i0.f15558a;
    }

    @Override // z1.h
    public z1.g u0() {
        return this.f14311q;
    }
}
