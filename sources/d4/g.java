package d4;

import md.i0;
import md.u;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    @sd.d(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    static final class a extends j implements p<d, qd.d<? super d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<d4.a, qd.d<? super i0>, Object> f9493c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super d4.a, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f9493c = pVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, qd.d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f9493c, dVar);
            aVar.f9492b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f9491a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d4.a aVar = (d4.a) this.f9492b;
                u.b(obj);
                return aVar;
            }
            u.b(obj);
            d4.a aVarC = ((d) this.f9492b).c();
            p<d4.a, qd.d<? super i0>, Object> pVar = this.f9493c;
            this.f9492b = aVarC;
            this.f9491a = 1;
            return pVar.invoke(aVarC, this) == objE ? objE : aVarC;
        }
    }

    public static final Object a(a4.f<d> fVar, p<? super d4.a, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super d> dVar) {
        return fVar.a(new a(pVar, null), dVar);
    }
}
