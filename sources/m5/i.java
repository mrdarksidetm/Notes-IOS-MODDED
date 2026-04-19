package m5;

import ae.s;
import android.app.Activity;
import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import le.d1;
import m5.i;
import md.i0;
import md.u;
import ne.r;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f15450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n5.a f15451c;

    @sd.d(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {50}, m = "invokeSuspend")
    static final class a extends sd.j implements p<r<? super k>, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15453b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f15455d;

        /* JADX INFO: renamed from: m5.i$a$a, reason: collision with other inner class name */
        static final class C0354a extends s implements zd.a<i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f15456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n3.a<k> f15457b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0354a(i iVar, n3.a<k> aVar) {
                super(0);
                this.f15456a = iVar;
                this.f15457b = aVar;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f15456a.f15451c.a(this.f15457b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f15455d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(r rVar, k kVar) {
            rVar.i(kVar);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r<? super k> rVar, qd.d<? super i0> dVar) {
            return ((a) create(rVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = i.this.new a(this.f15455d, dVar);
            aVar.f15453b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f15452a;
            if (i10 == 0) {
                u.b(obj);
                final r rVar = (r) this.f15453b;
                n3.a<k> aVar = new n3.a() { // from class: m5.h
                    @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
                    public final void accept(Object obj2) {
                        i.a.m(rVar, (k) obj2);
                    }
                };
                i.this.f15451c.b(this.f15455d, new v4.b(), aVar);
                C0354a c0354a = new C0354a(i.this, aVar);
                this.f15452a = 1;
                if (ne.p.a(rVar, c0354a, this) == objE) {
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

    @sd.d(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
    static final class b extends sd.j implements p<r<? super k>, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15459b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f15461d;

        static final class a extends s implements zd.a<i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f15462a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n3.a<k> f15463b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, n3.a<k> aVar) {
                super(0);
                this.f15462a = iVar;
                this.f15463b = aVar;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f15462a.f15451c.a(this.f15463b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f15461d = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(r rVar, k kVar) {
            rVar.i(kVar);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r<? super k> rVar, qd.d<? super i0> dVar) {
            return ((b) create(rVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            b bVar = i.this.new b(this.f15461d, dVar);
            bVar.f15459b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f15458a;
            if (i10 == 0) {
                u.b(obj);
                final r rVar = (r) this.f15459b;
                n3.a<k> aVar = new n3.a() { // from class: m5.j
                    @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
                    public final void accept(Object obj2) {
                        i.b.m(rVar, (k) obj2);
                    }
                };
                i.this.f15451c.b(this.f15461d, new v4.b(), aVar);
                a aVar2 = new a(i.this, aVar);
                this.f15458a = 1;
                if (ne.p.a(rVar, aVar2, this) == objE) {
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

    public i(m mVar, n5.a aVar) {
        ae.r.f(mVar, "windowMetricsCalculator");
        ae.r.f(aVar, "windowBackend");
        this.f15450b = mVar;
        this.f15451c = aVar;
    }

    @Override // m5.f
    public oe.e<k> a(Activity activity) {
        ae.r.f(activity, "activity");
        return oe.g.q(oe.g.d(new b(activity, null)), d1.c());
    }

    @Override // m5.f
    public oe.e<k> b(Context context) {
        ae.r.f(context, "context");
        return oe.g.q(oe.g.d(new a(context, null)), d1.c());
    }
}
