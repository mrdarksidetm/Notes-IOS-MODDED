package ed;

import android.content.Context;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import d4.d;
import ed.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jc.a;
import le.n0;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements jc.a, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f10824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d0 f10825c = new ed.b();

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", f = "SharedPreferencesPlugin.kt", l = {R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<n0, qd.d<? super d4.d>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10826a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f10828c;

        /* JADX INFO: renamed from: ed.f0$a$a, reason: collision with other inner class name */
        @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        static final class C0251a extends sd.j implements zd.p<d4.a, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10830b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f10831c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0251a(List<String> list, qd.d<? super C0251a> dVar) {
                super(2, dVar);
                this.f10831c = list;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d4.a aVar, qd.d<? super i0> dVar) {
                return ((C0251a) create(aVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                C0251a c0251a = new C0251a(this.f10831c, dVar);
                c0251a.f10830b = obj;
                return c0251a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                i0 i0Var;
                rd.d.e();
                if (this.f10829a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                d4.a aVar = (d4.a) this.f10830b;
                List<String> list = this.f10831c;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        aVar.i(d4.f.a((String) it.next()));
                    }
                    i0Var = i0.f15558a;
                } else {
                    i0Var = null;
                }
                if (i0Var == null) {
                    aVar.f();
                }
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f10828c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return f0.this.new a(this.f10828c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super d4.d> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10826a;
            if (i10 == 0) {
                md.u.b(obj);
                Context context = f0.this.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a4.f fVarB = g0.b(context);
                C0251a c0251a = new C0251a(this.f10828c, null);
                this.f10826a = 1;
                obj = d4.g.a(fVarB, c0251a, this);
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

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<d4.a, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d.a<String> f10834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10835d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d.a<String> aVar, String str, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f10834c = aVar;
            this.f10835d = str;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d4.a aVar, qd.d<? super i0> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f10834c, this.f10835d, dVar);
            bVar.f10833b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f10832a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            ((d4.a) this.f10833b).j(this.f10834c, this.f10835d);
            return i0.f15558a;
        }
    }

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", f = "SharedPreferencesPlugin.kt", l = {135}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<n0, qd.d<? super Map<String, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10836a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f10838c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f10838c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return f0.this.new c(this.f10838c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super Map<String, ? extends Object>> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10836a;
            if (i10 == 0) {
                md.u.b(obj);
                f0 f0Var = f0.this;
                List<String> list = this.f10838c;
                this.f10836a = 1;
                obj = f0Var.s(list, this);
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

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1", f = "SharedPreferencesPlugin.kt", l = {159}, m = "invokeSuspend")
    static final class d extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f10842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ae.h0<Boolean> f10843e;

        public static final class a implements oe.e<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.e f10844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f10845b;

            /* JADX INFO: renamed from: ed.f0$d$a$a, reason: collision with other inner class name */
            public static final class C0252a<T> implements oe.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ oe.f f10846a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d.a f10847b;

                /* JADX INFO: renamed from: ed.f0$d$a$a$a, reason: collision with other inner class name */
                @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
                public static final class C0253a extends kotlin.coroutines.jvm.internal.b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f10848a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f10849b;

                    public C0253a(qd.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f10848a = obj;
                        this.f10849b |= Integer.MIN_VALUE;
                        return C0252a.this.b(null, this);
                    }
                }

                public C0252a(oe.f fVar, d.a aVar) {
                    this.f10846a = fVar;
                    this.f10847b = aVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oe.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r5, qd.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ed.f0.d.a.C0252a.C0253a
                        if (r0 == 0) goto L13
                        r0 = r6
                        ed.f0$d$a$a$a r0 = (ed.f0.d.a.C0252a.C0253a) r0
                        int r1 = r0.f10849b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10849b = r1
                        goto L18
                    L13:
                        ed.f0$d$a$a$a r0 = new ed.f0$d$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f10848a
                        java.lang.Object r1 = rd.b.e()
                        int r2 = r0.f10849b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        md.u.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        md.u.b(r6)
                        oe.f r6 = r4.f10846a
                        d4.d r5 = (d4.d) r5
                        d4.d$a r2 = r4.f10847b
                        java.lang.Object r5 = r5.b(r2)
                        r0.f10849b = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        md.i0 r5 = md.i0.f15558a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ed.f0.d.a.C0252a.b(java.lang.Object, qd.d):java.lang.Object");
                }
            }

            public a(oe.e eVar, d.a aVar) {
                this.f10844a = eVar;
                this.f10845b = aVar;
            }

            @Override // oe.e
            public Object a(oe.f<? super Boolean> fVar, qd.d dVar) {
                Object objA = this.f10844a.a(new C0252a(fVar, this.f10845b), dVar);
                return objA == rd.d.e() ? objA : i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, f0 f0Var, ae.h0<Boolean> h0Var, qd.d<? super d> dVar) {
            super(2, dVar);
            this.f10841c = str;
            this.f10842d = f0Var;
            this.f10843e = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new d(this.f10841c, this.f10842d, this.f10843e, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ae.h0<Boolean> h0Var;
            T t10;
            Object objE = rd.d.e();
            int i10 = this.f10840b;
            if (i10 == 0) {
                md.u.b(obj);
                d.a<Boolean> aVarA = d4.f.a(this.f10841c);
                Context context = this.f10842d.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a aVar = new a(g0.b(context).getData(), aVarA);
                ae.h0<Boolean> h0Var2 = this.f10843e;
                this.f10839a = h0Var2;
                this.f10840b = 1;
                Object objN = oe.g.n(aVar, this);
                if (objN == objE) {
                    return objE;
                }
                h0Var = h0Var2;
                t10 = objN;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (ae.h0) this.f10839a;
                md.u.b(obj);
                t10 = obj;
            }
            h0Var.f712a = t10;
            return i0.f15558a;
        }
    }

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", f = "SharedPreferencesPlugin.kt", l = {173}, m = "invokeSuspend")
    static final class e extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f10854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ae.h0<Double> f10855e;

        public static final class a implements oe.e<Double> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.e f10856a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f10857b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f0 f10858c;

            /* JADX INFO: renamed from: ed.f0$e$a$a, reason: collision with other inner class name */
            public static final class C0254a<T> implements oe.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ oe.f f10859a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d.a f10860b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ f0 f10861c;

                /* JADX INFO: renamed from: ed.f0$e$a$a$a, reason: collision with other inner class name */
                @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
                public static final class C0255a extends kotlin.coroutines.jvm.internal.b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f10862a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f10863b;

                    public C0255a(qd.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f10862a = obj;
                        this.f10863b |= Integer.MIN_VALUE;
                        return C0254a.this.b(null, this);
                    }
                }

                public C0254a(oe.f fVar, d.a aVar, f0 f0Var) {
                    this.f10859a = fVar;
                    this.f10860b = aVar;
                    this.f10861c = f0Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oe.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r5, qd.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ed.f0.e.a.C0254a.C0255a
                        if (r0 == 0) goto L13
                        r0 = r6
                        ed.f0$e$a$a$a r0 = (ed.f0.e.a.C0254a.C0255a) r0
                        int r1 = r0.f10863b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10863b = r1
                        goto L18
                    L13:
                        ed.f0$e$a$a$a r0 = new ed.f0$e$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f10862a
                        java.lang.Object r1 = rd.b.e()
                        int r2 = r0.f10863b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        md.u.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        md.u.b(r6)
                        oe.f r6 = r4.f10859a
                        d4.d r5 = (d4.d) r5
                        d4.d$a r2 = r4.f10860b
                        java.lang.Object r5 = r5.b(r2)
                        ed.f0 r2 = r4.f10861c
                        ed.d0 r2 = ed.f0.p(r2)
                        java.lang.Object r5 = ed.g0.d(r5, r2)
                        java.lang.Double r5 = (java.lang.Double) r5
                        r0.f10863b = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        md.i0 r5 = md.i0.f15558a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ed.f0.e.a.C0254a.b(java.lang.Object, qd.d):java.lang.Object");
                }
            }

            public a(oe.e eVar, d.a aVar, f0 f0Var) {
                this.f10856a = eVar;
                this.f10857b = aVar;
                this.f10858c = f0Var;
            }

            @Override // oe.e
            public Object a(oe.f<? super Double> fVar, qd.d dVar) {
                Object objA = this.f10856a.a(new C0254a(fVar, this.f10857b, this.f10858c), dVar);
                return objA == rd.d.e() ? objA : i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, f0 f0Var, ae.h0<Double> h0Var, qd.d<? super e> dVar) {
            super(2, dVar);
            this.f10853c = str;
            this.f10854d = f0Var;
            this.f10855e = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new e(this.f10853c, this.f10854d, this.f10855e, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((e) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ae.h0<Double> h0Var;
            T t10;
            Object objE = rd.d.e();
            int i10 = this.f10852b;
            if (i10 == 0) {
                md.u.b(obj);
                d.a<String> aVarF = d4.f.f(this.f10853c);
                Context context = this.f10854d.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a aVar = new a(g0.b(context).getData(), aVarF, this.f10854d);
                ae.h0<Double> h0Var2 = this.f10855e;
                this.f10851a = h0Var2;
                this.f10852b = 1;
                Object objN = oe.g.n(aVar, this);
                if (objN == objE) {
                    return objE;
                }
                h0Var = h0Var2;
                t10 = objN;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (ae.h0) this.f10851a;
                md.u.b(obj);
                t10 = obj;
            }
            h0Var.f712a = t10;
            return i0.f15558a;
        }
    }

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1", f = "SharedPreferencesPlugin.kt", l = {145}, m = "invokeSuspend")
    static final class f extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f10868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ae.h0<Long> f10869e;

        public static final class a implements oe.e<Long> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.e f10870a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f10871b;

            /* JADX INFO: renamed from: ed.f0$f$a$a, reason: collision with other inner class name */
            public static final class C0256a<T> implements oe.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ oe.f f10872a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d.a f10873b;

                /* JADX INFO: renamed from: ed.f0$f$a$a$a, reason: collision with other inner class name */
                @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
                public static final class C0257a extends kotlin.coroutines.jvm.internal.b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f10874a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f10875b;

                    public C0257a(qd.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f10874a = obj;
                        this.f10875b |= Integer.MIN_VALUE;
                        return C0256a.this.b(null, this);
                    }
                }

                public C0256a(oe.f fVar, d.a aVar) {
                    this.f10872a = fVar;
                    this.f10873b = aVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oe.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r5, qd.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ed.f0.f.a.C0256a.C0257a
                        if (r0 == 0) goto L13
                        r0 = r6
                        ed.f0$f$a$a$a r0 = (ed.f0.f.a.C0256a.C0257a) r0
                        int r1 = r0.f10875b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10875b = r1
                        goto L18
                    L13:
                        ed.f0$f$a$a$a r0 = new ed.f0$f$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f10874a
                        java.lang.Object r1 = rd.b.e()
                        int r2 = r0.f10875b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        md.u.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        md.u.b(r6)
                        oe.f r6 = r4.f10872a
                        d4.d r5 = (d4.d) r5
                        d4.d$a r2 = r4.f10873b
                        java.lang.Object r5 = r5.b(r2)
                        r0.f10875b = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        md.i0 r5 = md.i0.f15558a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ed.f0.f.a.C0256a.b(java.lang.Object, qd.d):java.lang.Object");
                }
            }

            public a(oe.e eVar, d.a aVar) {
                this.f10870a = eVar;
                this.f10871b = aVar;
            }

            @Override // oe.e
            public Object a(oe.f<? super Long> fVar, qd.d dVar) {
                Object objA = this.f10870a.a(new C0256a(fVar, this.f10871b), dVar);
                return objA == rd.d.e() ? objA : i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, f0 f0Var, ae.h0<Long> h0Var, qd.d<? super f> dVar) {
            super(2, dVar);
            this.f10867c = str;
            this.f10868d = f0Var;
            this.f10869e = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new f(this.f10867c, this.f10868d, this.f10869e, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((f) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ae.h0<Long> h0Var;
            T t10;
            Object objE = rd.d.e();
            int i10 = this.f10866b;
            if (i10 == 0) {
                md.u.b(obj);
                d.a<Long> aVarE = d4.f.e(this.f10867c);
                Context context = this.f10868d.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a aVar = new a(g0.b(context).getData(), aVarE);
                ae.h0<Long> h0Var2 = this.f10869e;
                this.f10865a = h0Var2;
                this.f10866b = 1;
                Object objN = oe.g.n(aVar, this);
                if (objN == objE) {
                    return objE;
                }
                h0Var = h0Var2;
                t10 = objN;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (ae.h0) this.f10865a;
                md.u.b(obj);
                t10 = obj;
            }
            h0Var.f712a = t10;
            return i0.f15558a;
        }
    }

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getKeys$prefs$1", f = "SharedPreferencesPlugin.kt", l = {202}, m = "invokeSuspend")
    static final class g extends sd.j implements zd.p<n0, qd.d<? super Map<String, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10877a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f10879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List<String> list, qd.d<? super g> dVar) {
            super(2, dVar);
            this.f10879c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return f0.this.new g(this.f10879c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super Map<String, ? extends Object>> dVar) {
            return ((g) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10877a;
            if (i10 == 0) {
                md.u.b(obj);
                f0 f0Var = f0.this;
                List<String> list = this.f10879c;
                this.f10877a = 1;
                obj = f0Var.s(list, this);
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

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f = "SharedPreferencesPlugin.kt", l = {210, 212}, m = "getPrefs")
    static final class h extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f10885f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f10887h;

        h(qd.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10885f = obj;
            this.f10887h |= Integer.MIN_VALUE;
            return f0.this.s(null, this);
        }
    }

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1", f = "SharedPreferencesPlugin.kt", l = {186}, m = "invokeSuspend")
    static final class i extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f0 f10891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ae.h0<String> f10892e;

        public static final class a implements oe.e<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.e f10893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f10894b;

            /* JADX INFO: renamed from: ed.f0$i$a$a, reason: collision with other inner class name */
            public static final class C0258a<T> implements oe.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ oe.f f10895a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d.a f10896b;

                /* JADX INFO: renamed from: ed.f0$i$a$a$a, reason: collision with other inner class name */
                @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
                public static final class C0259a extends kotlin.coroutines.jvm.internal.b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f10897a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f10898b;

                    public C0259a(qd.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f10897a = obj;
                        this.f10898b |= Integer.MIN_VALUE;
                        return C0258a.this.b(null, this);
                    }
                }

                public C0258a(oe.f fVar, d.a aVar) {
                    this.f10895a = fVar;
                    this.f10896b = aVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oe.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object b(java.lang.Object r5, qd.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof ed.f0.i.a.C0258a.C0259a
                        if (r0 == 0) goto L13
                        r0 = r6
                        ed.f0$i$a$a$a r0 = (ed.f0.i.a.C0258a.C0259a) r0
                        int r1 = r0.f10898b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10898b = r1
                        goto L18
                    L13:
                        ed.f0$i$a$a$a r0 = new ed.f0$i$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f10897a
                        java.lang.Object r1 = rd.b.e()
                        int r2 = r0.f10898b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        md.u.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        md.u.b(r6)
                        oe.f r6 = r4.f10895a
                        d4.d r5 = (d4.d) r5
                        d4.d$a r2 = r4.f10896b
                        java.lang.Object r5 = r5.b(r2)
                        r0.f10898b = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        md.i0 r5 = md.i0.f15558a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ed.f0.i.a.C0258a.b(java.lang.Object, qd.d):java.lang.Object");
                }
            }

            public a(oe.e eVar, d.a aVar) {
                this.f10893a = eVar;
                this.f10894b = aVar;
            }

            @Override // oe.e
            public Object a(oe.f<? super String> fVar, qd.d dVar) {
                Object objA = this.f10893a.a(new C0258a(fVar, this.f10894b), dVar);
                return objA == rd.d.e() ? objA : i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, f0 f0Var, ae.h0<String> h0Var, qd.d<? super i> dVar) {
            super(2, dVar);
            this.f10890c = str;
            this.f10891d = f0Var;
            this.f10892e = h0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new i(this.f10890c, this.f10891d, this.f10892e, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((i) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ae.h0<String> h0Var;
            T t10;
            Object objE = rd.d.e();
            int i10 = this.f10889b;
            if (i10 == 0) {
                md.u.b(obj);
                d.a<String> aVarF = d4.f.f(this.f10890c);
                Context context = this.f10891d.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a aVar = new a(g0.b(context).getData(), aVarF);
                ae.h0<String> h0Var2 = this.f10892e;
                this.f10888a = h0Var2;
                this.f10889b = 1;
                Object objN = oe.g.n(aVar, this);
                if (objN == objE) {
                    return objE;
                }
                h0Var = h0Var2;
                t10 = objN;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (ae.h0) this.f10888a;
                md.u.b(obj);
                t10 = obj;
            }
            h0Var.f712a = t10;
            return i0.f15558a;
        }
    }

    public static final class j implements oe.e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oe.e f10900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.a f10901b;

        public static final class a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.f f10902a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d.a f10903b;

            /* JADX INFO: renamed from: ed.f0$j$a$a, reason: collision with other inner class name */
            @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
            public static final class C0260a extends kotlin.coroutines.jvm.internal.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f10904a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f10905b;

                public C0260a(qd.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f10904a = obj;
                    this.f10905b |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(oe.f fVar, d.a aVar) {
                this.f10902a = fVar;
                this.f10903b = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oe.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r5, qd.d r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ed.f0.j.a.C0260a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ed.f0$j$a$a r0 = (ed.f0.j.a.C0260a) r0
                    int r1 = r0.f10905b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f10905b = r1
                    goto L18
                L13:
                    ed.f0$j$a$a r0 = new ed.f0$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f10904a
                    java.lang.Object r1 = rd.b.e()
                    int r2 = r0.f10905b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    md.u.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    md.u.b(r6)
                    oe.f r6 = r4.f10902a
                    d4.d r5 = (d4.d) r5
                    d4.d$a r2 = r4.f10903b
                    java.lang.Object r5 = r5.b(r2)
                    r0.f10905b = r3
                    java.lang.Object r5 = r6.b(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    md.i0 r5 = md.i0.f15558a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ed.f0.j.a.b(java.lang.Object, qd.d):java.lang.Object");
            }
        }

        public j(oe.e eVar, d.a aVar) {
            this.f10900a = eVar;
            this.f10901b = aVar;
        }

        @Override // oe.e
        public Object a(oe.f<? super Object> fVar, qd.d dVar) {
            Object objA = this.f10900a.a(new a(fVar, this.f10901b), dVar);
            return objA == rd.d.e() ? objA : i0.f15558a;
        }
    }

    public static final class k implements oe.e<Set<? extends d.a<?>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ oe.e f10907a;

        public static final class a<T> implements oe.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.f f10908a;

            /* JADX INFO: renamed from: ed.f0$k$a$a, reason: collision with other inner class name */
            @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", f = "SharedPreferencesPlugin.kt", l = {223}, m = "emit")
            public static final class C0261a extends kotlin.coroutines.jvm.internal.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f10909a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f10910b;

                public C0261a(qd.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f10909a = obj;
                    this.f10910b |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(oe.f fVar) {
                this.f10908a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oe.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object b(java.lang.Object r5, qd.d r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ed.f0.k.a.C0261a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ed.f0$k$a$a r0 = (ed.f0.k.a.C0261a) r0
                    int r1 = r0.f10910b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f10910b = r1
                    goto L18
                L13:
                    ed.f0$k$a$a r0 = new ed.f0$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f10909a
                    java.lang.Object r1 = rd.b.e()
                    int r2 = r0.f10910b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    md.u.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    md.u.b(r6)
                    oe.f r6 = r4.f10908a
                    d4.d r5 = (d4.d) r5
                    java.util.Map r5 = r5.a()
                    java.util.Set r5 = r5.keySet()
                    r0.f10910b = r3
                    java.lang.Object r5 = r6.b(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    md.i0 r5 = md.i0.f15558a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ed.f0.k.a.b(java.lang.Object, qd.d):java.lang.Object");
            }
        }

        public k(oe.e eVar) {
            this.f10907a = eVar;
        }

        @Override // oe.e
        public Object a(oe.f<? super Set<? extends d.a<?>>> fVar, qd.d dVar) {
            Object objA = this.f10907a.a(new a(fVar), dVar);
            return objA == rd.d.e() ? objA : i0.f15558a;
        }
    }

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", f = "SharedPreferencesPlugin.kt", l = {R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend")
    static final class l extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f10914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10915d;

        @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<d4.a, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10916a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10917b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d.a<Boolean> f10918c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f10919d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d.a<Boolean> aVar, boolean z10, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10918c = aVar;
                this.f10919d = z10;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d4.a aVar, qd.d<? super i0> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10918c, this.f10919d, dVar);
                aVar.f10917b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f10916a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                ((d4.a) this.f10917b).j(this.f10918c, sd.a.a(this.f10919d));
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, f0 f0Var, boolean z10, qd.d<? super l> dVar) {
            super(2, dVar);
            this.f10913b = str;
            this.f10914c = f0Var;
            this.f10915d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new l(this.f10913b, this.f10914c, this.f10915d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((l) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10912a;
            if (i10 == 0) {
                md.u.b(obj);
                d.a<Boolean> aVarA = d4.f.a(this.f10913b);
                Context context = this.f10914c.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a4.f fVarB = g0.b(context);
                a aVar = new a(aVarA, this.f10915d, null);
                this.f10912a = 1;
                if (d4.g.a(fVarB, aVar, this) == objE) {
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

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", f = "SharedPreferencesPlugin.kt", l = {R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "invokeSuspend")
    static final class m extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f10922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f10923d;

        @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<d4.a, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10925b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d.a<Double> f10926c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ double f10927d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d.a<Double> aVar, double d10, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10926c = aVar;
                this.f10927d = d10;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d4.a aVar, qd.d<? super i0> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10926c, this.f10927d, dVar);
                aVar.f10925b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f10924a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                ((d4.a) this.f10925b).j(this.f10926c, sd.a.b(this.f10927d));
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, f0 f0Var, double d10, qd.d<? super m> dVar) {
            super(2, dVar);
            this.f10921b = str;
            this.f10922c = f0Var;
            this.f10923d = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new m(this.f10921b, this.f10922c, this.f10923d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((m) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10920a;
            if (i10 == 0) {
                md.u.b(obj);
                d.a<Double> aVarB = d4.f.b(this.f10921b);
                Context context = this.f10922c.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a4.f fVarB = g0.b(context);
                a aVar = new a(aVarB, this.f10923d, null);
                this.f10920a = 1;
                if (d4.g.a(fVarB, aVar, this) == objE) {
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

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1", f = "SharedPreferencesPlugin.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "invokeSuspend")
    static final class n extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f10929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f10930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f10931d;

        @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<d4.a, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10933b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d.a<Long> f10934c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f10935d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d.a<Long> aVar, long j10, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f10934c = aVar;
                this.f10935d = j10;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(d4.a aVar, qd.d<? super i0> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f10934c, this.f10935d, dVar);
                aVar.f10933b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f10932a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
                ((d4.a) this.f10933b).j(this.f10934c, sd.a.e(this.f10935d));
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, f0 f0Var, long j10, qd.d<? super n> dVar) {
            super(2, dVar);
            this.f10929b = str;
            this.f10930c = f0Var;
            this.f10931d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new n(this.f10929b, this.f10930c, this.f10931d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((n) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10928a;
            if (i10 == 0) {
                md.u.b(obj);
                d.a<Long> aVarE = d4.f.e(this.f10929b);
                Context context = this.f10930c.f10823a;
                if (context == null) {
                    ae.r.t("context");
                    context = null;
                }
                a4.f fVarB = g0.b(context);
                a aVar = new a(aVarE, this.f10931d, null);
                this.f10928a = 1;
                if (d4.g.a(fVarB, aVar, this) == objE) {
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

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1", f = "SharedPreferencesPlugin.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
    static final class o extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10936a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, qd.d<? super o> dVar) {
            super(2, dVar);
            this.f10938c = str;
            this.f10939d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return f0.this.new o(this.f10938c, this.f10939d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((o) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10936a;
            if (i10 == 0) {
                md.u.b(obj);
                f0 f0Var = f0.this;
                String str = this.f10938c;
                String str2 = this.f10939d;
                this.f10936a = 1;
                if (f0Var.r(str, str2, this) == objE) {
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

    @sd.d(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setStringList$1", f = "SharedPreferencesPlugin.kt", l = {R.styleable.AppCompatTheme_toolbarStyle}, m = "invokeSuspend")
    static final class p extends sd.j implements zd.p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10940a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f10942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10943d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, String str2, qd.d<? super p> dVar) {
            super(2, dVar);
            this.f10942c = str;
            this.f10943d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return f0.this.new p(this.f10942c, this.f10943d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((p) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10940a;
            if (i10 == 0) {
                md.u.b(obj);
                f0 f0Var = f0.this;
                String str = this.f10942c;
                String str2 = this.f10943d;
                this.f10940a = 1;
                if (f0Var.r(str, str2, this) == objE) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(String str, String str2, qd.d<? super i0> dVar) {
        d.a<String> aVarF = d4.f.f(str);
        Context context = this.f10823a;
        if (context == null) {
            ae.r.t("context");
            context = null;
        }
        Object objA = d4.g.a(g0.b(context), new b(aVarF, str2, null), dVar);
        return objA == rd.d.e() ? objA : i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a1 -> B:32:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(java.util.List<java.lang.String> r9, qd.d<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ed.f0.h
            if (r0 == 0) goto L13
            r0 = r10
            ed.f0$h r0 = (ed.f0.h) r0
            int r1 = r0.f10887h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10887h = r1
            goto L18
        L13:
            ed.f0$h r0 = new ed.f0$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f10885f
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f10887h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r9 = r0.f10884e
            d4.d$a r9 = (d4.d.a) r9
            java.lang.Object r2 = r0.f10883d
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f10882c
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f10881b
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.f10880a
            ed.f0 r6 = (ed.f0) r6
            md.u.b(r10)
            goto La4
        L40:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L48:
            java.lang.Object r9 = r0.f10882c
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.f10881b
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.f10880a
            ed.f0 r4 = (ed.f0) r4
            md.u.b(r10)
            goto L79
        L58:
            md.u.b(r10)
            if (r9 == 0) goto L62
            java.util.Set r9 = nd.s.H0(r9)
            goto L63
        L62:
            r9 = 0
        L63:
            r2 = r9
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.f10880a = r8
            r0.f10881b = r2
            r0.f10882c = r9
            r0.f10887h = r4
            java.lang.Object r10 = r8.u(r0)
            if (r10 != r1) goto L78
            return r1
        L78:
            r4 = r8
        L79:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto Lbf
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L85:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lbe
            java.lang.Object r9 = r2.next()
            d4.d$a r9 = (d4.d.a) r9
            r0.f10880a = r6
            r0.f10881b = r5
            r0.f10882c = r4
            r0.f10883d = r2
            r0.f10884e = r9
            r0.f10887h = r3
            java.lang.Object r10 = r6.t(r9, r0)
            if (r10 != r1) goto La4
            return r1
        La4:
            java.lang.String r7 = r9.toString()
            boolean r7 = ed.g0.c(r7, r10, r5)
            if (r7 == 0) goto L85
            ed.d0 r7 = r6.f10825c
            java.lang.Object r10 = ed.g0.d(r10, r7)
            if (r10 == 0) goto L85
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L85
        Lbe:
            r9 = r4
        Lbf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.f0.s(java.util.List, qd.d):java.lang.Object");
    }

    private final Object t(d.a<?> aVar, qd.d<Object> dVar) {
        Context context = this.f10823a;
        if (context == null) {
            ae.r.t("context");
            context = null;
        }
        return oe.g.n(new j(g0.b(context).getData(), aVar), dVar);
    }

    private final Object u(qd.d<? super Set<? extends d.a<?>>> dVar) {
        Context context = this.f10823a;
        if (context == null) {
            ae.r.t("context");
            context = null;
        }
        return oe.g.n(new k(g0.b(context).getData()), dVar);
    }

    private final void v(sc.b bVar, Context context) {
        this.f10823a = context;
        try {
            a0.O.o(bVar, this, "data_store");
            this.f10824b = new b0(bVar, context, this.f10825c);
        } catch (Exception e10) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e10);
        }
    }

    @Override // ed.a0
    public List<String> a(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        List list = (List) g0.d(e(str, e0Var), this.f10825c);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ed.a0
    public Boolean b(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        ae.h0 h0Var = new ae.h0();
        le.j.b(null, new d(str, this, h0Var, null), 1, null);
        return (Boolean) h0Var.f712a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ed.a0
    public Double c(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        ae.h0 h0Var = new ae.h0();
        le.j.b(null, new e(str, this, h0Var, null), 1, null);
        return (Double) h0Var.f712a;
    }

    @Override // ed.a0
    public void d(String str, boolean z10, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        le.j.b(null, new l(str, this, z10, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ed.a0
    public String e(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        ae.h0 h0Var = new ae.h0();
        le.j.b(null, new i(str, this, h0Var, null), 1, null);
        return (String) h0Var.f712a;
    }

    @Override // ed.a0
    public void f(String str, double d10, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        le.j.b(null, new m(str, this, d10, null), 1, null);
    }

    @Override // ed.a0
    public void g(String str, long j10, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        le.j.b(null, new n(str, this, j10, null), 1, null);
    }

    @Override // ed.a0
    public void h(List<String> list, e0 e0Var) {
        ae.r.f(e0Var, "options");
        le.j.b(null, new a(list, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ed.a0
    public Long i(String str, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(e0Var, "options");
        ae.h0 h0Var = new ae.h0();
        le.j.b(null, new f(str, this, h0Var, null), 1, null);
        return (Long) h0Var.f712a;
    }

    @Override // ed.a0
    public void j(String str, String str2, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(str2, "value");
        ae.r.f(e0Var, "options");
        le.j.b(null, new o(str, str2, null), 1, null);
    }

    @Override // ed.a0
    public void k(String str, List<String> list, e0 e0Var) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(list, "value");
        ae.r.f(e0Var, "options");
        le.j.b(null, new p(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f10825c.a(list), null), 1, null);
    }

    @Override // ed.a0
    public Map<String, Object> l(List<String> list, e0 e0Var) {
        ae.r.f(e0Var, "options");
        return (Map) le.j.b(null, new c(list, null), 1, null);
    }

    @Override // ed.a0
    public List<String> m(List<String> list, e0 e0Var) {
        ae.r.f(e0Var, "options");
        return nd.c0.C0(((Map) le.j.b(null, new g(list, null), 1, null)).keySet());
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        ae.r.f(bVar, "binding");
        sc.b bVarB = bVar.b();
        ae.r.e(bVarB, "getBinaryMessenger(...)");
        Context contextA = bVar.a();
        ae.r.e(contextA, "getApplicationContext(...)");
        v(bVarB, contextA);
        new ed.a().onAttachedToEngine(bVar);
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        ae.r.f(bVar, "binding");
        a0.a aVar = a0.O;
        sc.b bVarB = bVar.b();
        ae.r.e(bVarB, "getBinaryMessenger(...)");
        aVar.o(bVarB, null, "data_store");
        b0 b0Var = this.f10824b;
        if (b0Var != null) {
            b0Var.o();
        }
        this.f10824b = null;
    }
}
