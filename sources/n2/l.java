package n2;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import n2.c1;
import t0.k1;
import t0.k3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p3<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<s> f15833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f15834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f15835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.l<c1.b, md.i0> f15836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n0 f15837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k1 f15838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15839g = true;

    @sd.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {272, 285}, m = "load")
    static final class a extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f15842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15845f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15847h;

        a(qd.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15845f = obj;
            this.f15847h |= Integer.MIN_VALUE;
            return l.this.i(this);
        }
    }

    @sd.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.l<qd.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15848a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f15850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar, qd.d<? super b> dVar) {
            super(1, dVar);
            this.f15850c = sVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qd.d<Object> dVar) {
            return ((b) create(dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(qd.d<?> dVar) {
            return l.this.new b(this.f15850c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f15848a;
            if (i10 == 0) {
                md.u.b(obj);
                l lVar = l.this;
                s sVar = this.f15850c;
                this.f15848a = 1;
                obj = lVar.j(sVar, this);
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

    @sd.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {RCHTTPStatusCodes.NOT_MODIFIED}, m = "loadWithTimeoutOrNull$ui_text_release")
    static final class c extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15852b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15854d;

        c(qd.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f15852b = obj;
            this.f15854d |= Integer.MIN_VALUE;
            return l.this.j(null, this);
        }
    }

    @sd.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {305}, m = "invokeSuspend")
    static final class d extends sd.j implements zd.p<le.n0, qd.d<? super Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15855a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f15857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s sVar, qd.d<? super d> dVar) {
            super(2, dVar);
            this.f15857c = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return l.this.new d(this.f15857c, dVar);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(le.n0 n0Var, qd.d<? super Object> dVar) {
            return invoke2(n0Var, (qd.d<Object>) dVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(le.n0 n0Var, qd.d<Object> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f15855a;
            if (i10 == 0) {
                md.u.b(obj);
                n0 n0Var = l.this.f15837e;
                s sVar = this.f15857c;
                this.f15855a = 1;
                obj = n0Var.c(sVar, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends s> list, Object obj, a1 a1Var, m mVar, zd.l<? super c1.b, md.i0> lVar, n0 n0Var) {
        this.f15833a = list;
        this.f15834b = a1Var;
        this.f15835c = mVar;
        this.f15836d = lVar;
        this.f15837e = n0Var;
        this.f15838f = k3.e(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.f15838f.setValue(obj);
    }

    public final boolean f() {
        return this.f15839g;
    }

    @Override // t0.p3
    public Object getValue() {
        return this.f15838f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0102 -> B:42:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010a -> B:46:0x010c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(qd.d<? super md.i0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.l.i(qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(n2.s r8, qd.d<java.lang.Object> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof n2.l.c
            if (r0 == 0) goto L13
            r0 = r9
            n2.l$c r0 = (n2.l.c) r0
            int r1 = r0.f15854d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15854d = r1
            goto L18
        L13:
            n2.l$c r0 = new n2.l$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f15852b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f15854d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.f15851a
            n2.s r8 = (n2.s) r8
            md.u.b(r9)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            goto L4b
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            md.u.b(r9)
            r5 = 15000(0x3a98, double:7.411E-320)
            n2.l$d r9 = new n2.l$d     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r9.<init>(r8, r4)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.f15851a = r8     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.f15854d = r3     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            java.lang.Object r9 = le.c3.d(r5, r9, r0)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            if (r9 != r1) goto L4b
            return r1
        L4b:
            r4 = r9
            goto L85
        L4d:
            r9 = move-exception
            qd.g r1 = r0.getContext()
            le.k0$a r2 = le.k0.Q
            qd.g$b r1 = r1.get(r2)
            le.k0 r1 = (le.k0) r1
            if (r1 == 0) goto L85
            qd.g r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r2.<init>(r8, r9)
            r1.o(r0, r2)
            goto L85
        L7a:
            r8 = move-exception
            qd.g r9 = r0.getContext()
            boolean r9 = le.e2.o(r9)
            if (r9 == 0) goto L86
        L85:
            return r4
        L86:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.l.j(n2.s, qd.d):java.lang.Object");
    }
}
