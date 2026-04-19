package a4;

import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;
import md.i0;
import md.u;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f418a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: a4.e$a$a, reason: collision with other inner class name */
        @sd.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m = "invokeSuspend")
        static final class C0014a extends sd.j implements p<i<T>, qd.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f420b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<d<T>> f421c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0014a(List<? extends d<T>> list, qd.d<? super C0014a> dVar) {
                super(2, dVar);
                this.f421c = list;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<T> iVar, qd.d<? super i0> dVar) {
                return ((C0014a) create(iVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                C0014a c0014a = new C0014a(this.f421c, dVar);
                c0014a.f420b = obj;
                return c0014a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f419a;
                if (i10 == 0) {
                    u.b(obj);
                    i iVar = (i) this.f420b;
                    a aVar = e.f418a;
                    List<d<T>> list = this.f421c;
                    this.f419a = 1;
                    if (aVar.c(list, iVar, this) == objE) {
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

        @sd.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_colorPrimary}, m = "runMigrations")
        static final class b<T> extends kotlin.coroutines.jvm.internal.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f422a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f423b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f424c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f426e;

            b(qd.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f424c = obj;
                this.f426e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        @sd.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle, R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
        static final class c extends sd.j implements p<T, qd.d<? super T>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f428b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f429c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f430d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f431e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<d<T>> f432f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<zd.l<qd.d<? super i0>, Object>> f433g;

            /* JADX INFO: renamed from: a4.e$a$c$a, reason: collision with other inner class name */
            @sd.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle}, m = "invokeSuspend")
            static final class C0015a extends sd.j implements zd.l<qd.d<? super i0>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d<T> f435b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0015a(d<T> dVar, qd.d<? super C0015a> dVar2) {
                    super(1, dVar2);
                    this.f435b = dVar;
                }

                @Override // zd.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(qd.d<? super i0> dVar) {
                    return ((C0015a) create(dVar)).invokeSuspend(i0.f15558a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final qd.d<i0> create(qd.d<?> dVar) {
                    return new C0015a(this.f435b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = rd.d.e();
                    int i10 = this.f434a;
                    if (i10 == 0) {
                        u.b(obj);
                        d<T> dVar = this.f435b;
                        this.f434a = 1;
                        if (dVar.a(this) == objE) {
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
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends d<T>> list, List<zd.l<qd.d<? super i0>, Object>> list2, qd.d<? super c> dVar) {
                super(2, dVar);
                this.f432f = list;
                this.f433g = list2;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, qd.d<? super T> dVar) {
                return ((c) create(t10, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                c cVar = new c(this.f432f, this.f433g, dVar);
                cVar.f431e = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    r10 = this;
                    java.lang.Object r0 = rd.b.e()
                    int r1 = r10.f430d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.f427a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f431e
                    java.util.List r4 = (java.util.List) r4
                    md.u.b(r11)
                    r7 = r10
                    goto L8c
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.f429c
                    java.lang.Object r4 = r10.f428b
                    a4.d r4 = (a4.d) r4
                    java.lang.Object r5 = r10.f427a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f431e
                    java.util.List r6 = (java.util.List) r6
                    md.u.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6a
                L3a:
                    md.u.b(r11)
                    java.lang.Object r11 = r10.f431e
                    java.util.List<a4.d<T>> r1 = r10.f432f
                    java.util.List<zd.l<qd.d<? super md.i0>, java.lang.Object>> r4 = r10.f433g
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L48:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L91
                    java.lang.Object r6 = r1.next()
                    a4.d r6 = (a4.d) r6
                    r5.f431e = r4
                    r5.f427a = r1
                    r5.f428b = r6
                    r5.f429c = r11
                    r5.f430d = r3
                    java.lang.Object r7 = r6.b(r11, r5)
                    if (r7 != r0) goto L65
                    return r0
                L65:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L6a:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L8e
                    a4.e$a$c$a r11 = new a4.e$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f431e = r4
                    r7.f427a = r5
                    r7.f428b = r8
                    r7.f429c = r8
                    r7.f430d = r2
                    java.lang.Object r11 = r6.c(r1, r7)
                    if (r11 != r0) goto L8f
                    return r0
                L8c:
                    r5 = r7
                    goto L48
                L8e:
                    r11 = r1
                L8f:
                    r1 = r5
                    goto L8c
                L91:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: a4.e.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object c(java.util.List<? extends a4.d<T>> r7, a4.i<T> r8, qd.d<? super md.i0> r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof a4.e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                a4.e$a$b r0 = (a4.e.a.b) r0
                int r1 = r0.f426e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f426e = r1
                goto L18
            L13:
                a4.e$a$b r0 = new a4.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f424c
                java.lang.Object r1 = rd.b.e()
                int r2 = r0.f426e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f423b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f422a
                ae.h0 r8 = (ae.h0) r8
                md.u.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f422a
                java.util.List r7 = (java.util.List) r7
                md.u.b(r9)
                goto L60
            L46:
                md.u.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                a4.e$a$c r2 = new a4.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f422a = r9
                r0.f426e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                ae.h0 r8 = new ae.h0
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                zd.l r9 = (zd.l) r9
                r0.f422a = r8     // Catch: java.lang.Throwable -> L34
                r0.f423b = r7     // Catch: java.lang.Throwable -> L34
                r0.f426e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
                return r1
            L82:
                T r2 = r8.f712a
                if (r2 != 0) goto L89
                r8.f712a = r9
                goto L69
            L89:
                ae.r.c(r2)
                T r2 = r8.f712a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                md.e.a(r2, r9)
                goto L69
            L94:
                T r7 = r8.f712a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                md.i0 r7 = md.i0.f15558a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.e.a.c(java.util.List, a4.i, qd.d):java.lang.Object");
        }

        public final <T> p<i<T>, qd.d<? super i0>, Object> b(List<? extends d<T>> list) {
            r.f(list, "migrations");
            return new C0014a(list, null);
        }
    }
}
