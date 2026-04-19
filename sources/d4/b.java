package d4;

import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import md.i0;
import md.u;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a4.f<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a4.f<d> f9482a;

    @sd.d(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "invokeSuspend")
    static final class a extends j implements p<d, qd.d<? super d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f9484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<d, qd.d<? super d>, Object> f9485c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super d, ? super qd.d<? super d>, ? extends Object> pVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f9485c = pVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, qd.d<? super d> dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f9485c, dVar);
            aVar.f9484b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f9483a;
            if (i10 == 0) {
                u.b(obj);
                d dVar = (d) this.f9484b;
                p<d, qd.d<? super d>, Object> pVar = this.f9485c;
                this.f9483a = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            d dVar2 = (d) obj;
            ((d4.a) dVar2).g();
            return dVar2;
        }
    }

    public b(a4.f<d> fVar) {
        r.f(fVar, "delegate");
        this.f9482a = fVar;
    }

    @Override // a4.f
    public Object a(p<? super d, ? super qd.d<? super d>, ? extends Object> pVar, qd.d<? super d> dVar) {
        return this.f9482a.a(new a(pVar, null), dVar);
    }

    @Override // a4.f
    public oe.e<d> getData() {
        return this.f9482a.getData();
    }
}
