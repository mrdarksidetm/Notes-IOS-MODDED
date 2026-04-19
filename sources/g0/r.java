package g0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.List;
import le.n0;
import md.i0;
import md.u;
import t0.k1;
import t0.k3;
import t0.l;
import t0.l0;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    @sd.d(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f11255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1<Boolean> f11256c;

        /* JADX INFO: renamed from: g0.r$a$a, reason: collision with other inner class name */
        static final class C0273a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<p> f11257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1<Boolean> f11258b;

            C0273a(List<p> list, k1<Boolean> k1Var) {
                this.f11257a = list;
                this.f11258b = k1Var;
            }

            @Override // oe.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(j jVar, qd.d<? super i0> dVar) {
                List<p> list;
                p pVarA;
                if (jVar instanceof p) {
                    this.f11257a.add(jVar);
                } else {
                    if (jVar instanceof q) {
                        list = this.f11257a;
                        pVarA = ((q) jVar).a();
                    } else if (jVar instanceof o) {
                        list = this.f11257a;
                        pVarA = ((o) jVar).a();
                    }
                    list.remove(pVarA);
                }
                this.f11258b.setValue(sd.a.a(!this.f11257a.isEmpty()));
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, k1<Boolean> k1Var, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f11255b = kVar;
            this.f11256c = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f11255b, this.f11256c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f11254a;
            if (i10 == 0) {
                u.b(obj);
                ArrayList arrayList = new ArrayList();
                oe.e<j> eVarB = this.f11255b.b();
                C0273a c0273a = new C0273a(arrayList, this.f11256c);
                this.f11254a = 1;
                if (eVarB.a(c0273a, this) == objE) {
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

    public static final p3<Boolean> a(k kVar, t0.l lVar, int i10) {
        lVar.e(-1692965168);
        if (t0.o.I()) {
            t0.o.U(-1692965168, i10, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:83)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        l.a aVar = t0.l.f20813a;
        if (objF == aVar.a()) {
            objF = k3.e(Boolean.FALSE, null, 2, null);
            lVar.E(objF);
        }
        lVar.K();
        k1 k1Var = (k1) objF;
        lVar.e(727844388);
        boolean zN = lVar.N(kVar) | lVar.N(k1Var);
        Object objF2 = lVar.f();
        if (zN || objF2 == aVar.a()) {
            objF2 = new a(kVar, k1Var, null);
            lVar.E(objF2);
        }
        lVar.K();
        l0.d(kVar, (zd.p) objF2, lVar, (i10 & 14) | 64);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return k1Var;
    }
}
