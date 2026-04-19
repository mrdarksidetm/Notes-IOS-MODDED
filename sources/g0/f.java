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
public final class f {

    @sd.d(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {R.styleable.AppCompatTheme_editTextColor}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f11239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f11240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k1<Boolean> f11241c;

        /* JADX INFO: renamed from: g0.f$a$a, reason: collision with other inner class name */
        static final class C0271a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<d> f11242a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1<Boolean> f11243b;

            C0271a(List<d> list, k1<Boolean> k1Var) {
                this.f11242a = list;
                this.f11243b = k1Var;
            }

            @Override // oe.f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(j jVar, qd.d<? super i0> dVar) {
                if (jVar instanceof d) {
                    this.f11242a.add(jVar);
                } else if (jVar instanceof e) {
                    this.f11242a.remove(((e) jVar).a());
                }
                this.f11243b.setValue(sd.a.a(!this.f11242a.isEmpty()));
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, k1<Boolean> k1Var, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f11240b = kVar;
            this.f11241c = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f11240b, this.f11241c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f11239a;
            if (i10 == 0) {
                u.b(obj);
                ArrayList arrayList = new ArrayList();
                oe.e<j> eVarB = this.f11240b.b();
                C0271a c0271a = new C0271a(arrayList, this.f11241c);
                this.f11239a = 1;
                if (eVarB.a(c0271a, this) == objE) {
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
        lVar.e(-1805515472);
        if (t0.o.I()) {
            t0.o.U(-1805515472, i10, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
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
        lVar.e(2084875410);
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
