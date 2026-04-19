package x5;

import a6.b;
import ae.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import d6.a;
import d6.b;
import d6.c;
import d6.e;
import d6.f;
import d6.j;
import d6.k;
import d6.l;
import j6.h;
import j6.i;
import j6.p;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import le.d1;
import le.k;
import le.k0;
import le.n0;
import le.o0;
import le.u0;
import le.w2;
import md.i0;
import md.l;
import md.u;
import nd.c0;
import o6.o;
import o6.r;
import o6.t;
import okhttp3.Call;
import okhttp3.HttpUrl;
import x5.c;

/* JADX INFO: loaded from: classes.dex */
public final class h implements x5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f23007p = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.c f23009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l<h6.c> f23010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l<b6.a> f23011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l<Call.Factory> f23012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c.InterfaceC0478c f23013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x5.b f23014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f23015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r f23016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final n0 f23017j = o0.a(w2.b(null, 1, null).plus(d1.c().m0()).plus(new f(k0.Q, this)));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final t f23018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f23019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final x5.b f23020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<e6.b> f23021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f23022o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    @sd.d(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {R.styleable.AppCompatTheme_windowActionBar}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<n0, qd.d<? super i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23023a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j6.h f23025c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j6.h hVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f23025c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return h.this.new b(this.f23025c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            r rVarH;
            Object objE = rd.d.e();
            int i10 = this.f23023a;
            if (i10 == 0) {
                u.b(obj);
                h hVar = h.this;
                j6.h hVar2 = this.f23025c;
                this.f23023a = 1;
                obj = hVar.g(hVar2, 0, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            h hVar3 = h.this;
            i iVar = (i) obj;
            if ((iVar instanceof j6.f) && (rVarH = hVar3.h()) != null) {
                o6.h.a(rVarH, "RealImageLoader", ((j6.f) iVar).c());
            }
            return obj;
        }
    }

    @sd.d(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {140}, m = "invokeSuspend")
    static final class c extends sd.j implements zd.p<n0, qd.d<? super i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j6.h f23028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f23029d;

        @sd.d(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {133}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<n0, qd.d<? super i>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f23031b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ j6.h f23032c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, j6.h hVar2, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f23031b = hVar;
                this.f23032c = hVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                return new a(this.f23031b, this.f23032c, dVar);
            }

            @Override // zd.p
            public final Object invoke(n0 n0Var, qd.d<? super i> dVar) {
                return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = rd.d.e();
                int i10 = this.f23030a;
                if (i10 == 0) {
                    u.b(obj);
                    h hVar = this.f23031b;
                    j6.h hVar2 = this.f23032c;
                    this.f23030a = 1;
                    obj = hVar.g(hVar2, 1, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j6.h hVar, h hVar2, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f23028c = hVar;
            this.f23029d = hVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            c cVar = new c(this.f23028c, this.f23029d, dVar);
            cVar.f23027b = obj;
            return cVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f23026a;
            if (i10 == 0) {
                u.b(obj);
                u0<? extends i> u0VarB = k.b((n0) this.f23027b, d1.c().m0(), null, new a(this.f23029d, this.f23028c, null), 2, null);
                if (this.f23028c.M() instanceof l6.b) {
                    o6.j.m(((l6.b) this.f23028c.M()).getView()).b(u0VarB);
                }
                this.f23026a = 1;
                obj = u0VarB.await(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return obj;
        }
    }

    @sd.d(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {166, 178, 182}, m = "executeMain")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f23033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f23034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f23035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f23036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f23037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f23038f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f23040h;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23038f = obj;
            this.f23040h |= Integer.MIN_VALUE;
            return h.this.g(null, 0, this);
        }
    }

    @sd.d(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {191}, m = "invokeSuspend")
    static final class e extends sd.j implements zd.p<n0, qd.d<? super i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j6.h f23042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f23043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k6.i f23044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ x5.c f23045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f23046f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j6.h hVar, h hVar2, k6.i iVar, x5.c cVar, Bitmap bitmap, qd.d<? super e> dVar) {
            super(2, dVar);
            this.f23042b = hVar;
            this.f23043c = hVar2;
            this.f23044d = iVar;
            this.f23045e = cVar;
            this.f23046f = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new e(this.f23042b, this.f23043c, this.f23044d, this.f23045e, this.f23046f, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i> dVar) {
            return ((e) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f23041a;
            if (i10 == 0) {
                u.b(obj);
                e6.c cVar = new e6.c(this.f23042b, this.f23043c.f23021n, 0, this.f23042b, this.f23044d, this.f23045e, this.f23046f != null);
                j6.h hVar = this.f23042b;
                this.f23041a = 1;
                obj = cVar.h(hVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return obj;
        }
    }

    public static final class f extends qd.a implements k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f23047b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k0.a aVar, h hVar) {
            super(aVar);
            this.f23047b = hVar;
        }

        @Override // le.k0
        public void o(qd.g gVar, Throwable th) {
            r rVarH = this.f23047b.h();
            if (rVarH != null) {
                o6.h.a(rVarH, "RealImageLoader", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, j6.c cVar, l<? extends h6.c> lVar, l<? extends b6.a> lVar2, l<? extends Call.Factory> lVar3, c.InterfaceC0478c interfaceC0478c, x5.b bVar, o oVar, r rVar) {
        this.f23008a = context;
        this.f23009b = cVar;
        this.f23010c = lVar;
        this.f23011d = lVar2;
        this.f23012e = lVar3;
        this.f23013f = interfaceC0478c;
        this.f23014g = bVar;
        this.f23015h = oVar;
        this.f23016i = rVar;
        t tVar = new t(this, context, oVar.d());
        this.f23018k = tVar;
        p pVar = new p(this, tVar, rVar);
        this.f23019l = pVar;
        this.f23020m = bVar.h().d(new g6.c(), HttpUrl.class).d(new g6.g(), String.class).d(new g6.b(), Uri.class).d(new g6.f(), Uri.class).d(new g6.e(), Integer.class).d(new g6.a(), byte[].class).c(new f6.c(), Uri.class).c(new f6.a(oVar.a()), File.class).b(new k.b(lVar3, lVar2, oVar.e()), Uri.class).b(new j.a(), File.class).b(new a.C0226a(), Uri.class).b(new e.a(), Uri.class).b(new l.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new b.c(oVar.c(), oVar.b())).e();
        this.f23021n = c0.o0(getComponents().c(), new e6.a(this, pVar, rVar));
        this.f23022o = new AtomicBoolean(false);
        tVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108 A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116 A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[Catch: all -> 0x01a2, TryCatch #2 {all -> 0x01a2, blocks: (B:42:0x00ec, B:44:0x00f2, B:46:0x00f8, B:49:0x0100, B:52:0x0108, B:54:0x011a, B:56:0x0120, B:57:0x0123, B:59:0x012c, B:60:0x012f, B:53:0x0116), top: B:96:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x017f, B:70:0x0185, B:71:0x0190, B:73:0x0194), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x017f, B:70:0x0185, B:71:0x0190, B:73:0x0194), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6 A[Catch: all -> 0x01cb, TRY_LEAVE, TryCatch #3 {all -> 0x01cb, blocks: (B:82:0x01b2, B:84:0x01b6, B:87:0x01c7, B:88:0x01ca), top: B:98:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c7 A[Catch: all -> 0x01cb, TRY_ENTER, TryCatch #3 {all -> 0x01cb, blocks: (B:82:0x01b2, B:84:0x01b6, B:87:0x01c7, B:88:0x01ca), top: B:98:0x01b2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(j6.h r21, int r22, qd.d<? super j6.i> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.g(j6.h, int, qd.d):java.lang.Object");
    }

    private final void i(j6.h hVar, x5.c cVar) {
        r rVar = this.f23016i;
        if (rVar != null && rVar.a() <= 4) {
            rVar.b("RealImageLoader", 4, "🏗  Cancelled - " + hVar.m(), null);
        }
        cVar.d(hVar);
        h.b bVarA = hVar.A();
        if (bVarA != null) {
            bVarA.d(hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(j6.f r7, l6.a r8, x5.c r9) {
        /*
            r6 = this;
            j6.h r0 = r7.b()
            o6.r r1 = r6.f23016i
            if (r1 == 0) goto L36
            r2 = 4
            int r3 = r1.a()
            if (r3 > r2) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r3.append(r4)
            java.lang.Object r4 = r0.m()
            r3.append(r4)
            java.lang.String r4 = " - "
            r3.append(r4)
            java.lang.Throwable r4 = r7.c()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.b(r5, r2, r3, r4)
        L36:
            boolean r1 = r8 instanceof n6.d
            if (r1 != 0) goto L3d
            if (r8 == 0) goto L69
            goto L50
        L3d:
            j6.h r1 = r7.b()
            n6.c$a r1 = r1.P()
            r2 = r8
            n6.d r2 = (n6.d) r2
            n6.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof n6.b
            if (r2 == 0) goto L58
        L50:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.b(r1)
            goto L69
        L58:
            j6.h r8 = r7.b()
            r9.e(r8, r1)
            r1.a()
            j6.h r8 = r7.b()
            r9.i(r8, r1)
        L69:
            r9.a(r0, r7)
            j6.h$b r8 = r0.A()
            if (r8 == 0) goto L75
            r8.a(r0, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.j(j6.f, l6.a, x5.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(j6.q r7, l6.a r8, x5.c r9) {
        /*
            r6 = this;
            j6.h r0 = r7.b()
            a6.d r1 = r7.c()
            o6.r r2 = r6.f23016i
            if (r2 == 0) goto L41
            r3 = 4
            int r4 = r2.a()
            if (r4 > r3) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = o6.j.g(r1)
            r4.append(r5)
            java.lang.String r5 = " Successful ("
            r4.append(r5)
            java.lang.String r1 = r1.name()
            r4.append(r1)
            java.lang.String r1 = ") - "
            r4.append(r1)
            java.lang.Object r1 = r0.m()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.b(r5, r3, r1, r4)
        L41:
            boolean r1 = r8 instanceof n6.d
            if (r1 != 0) goto L48
            if (r8 == 0) goto L74
            goto L5b
        L48:
            j6.h r1 = r7.b()
            n6.c$a r1 = r1.P()
            r2 = r8
            n6.d r2 = (n6.d) r2
            n6.c r1 = r1.a(r2, r7)
            boolean r2 = r1 instanceof n6.b
            if (r2 == 0) goto L63
        L5b:
            android.graphics.drawable.Drawable r1 = r7.a()
            r8.a(r1)
            goto L74
        L63:
            j6.h r8 = r7.b()
            r9.e(r8, r1)
            r1.a()
            j6.h r8 = r7.b()
            r9.i(r8, r1)
        L74:
            r9.c(r0, r7)
            j6.h$b r8 = r0.A()
            if (r8 == 0) goto L80
            r8.c(r0, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.h.k(j6.q, l6.a, x5.c):void");
    }

    @Override // x5.e
    public Object a(j6.h hVar, qd.d<? super i> dVar) {
        return o0.e(new c(hVar, this, null), dVar);
    }

    @Override // x5.e
    public j6.e b(j6.h hVar) {
        u0<? extends i> u0VarB = le.k.b(this.f23017j, null, null, new b(hVar, null), 3, null);
        return hVar.M() instanceof l6.b ? o6.j.m(((l6.b) hVar.M()).getView()).b(u0VarB) : new j6.l(u0VarB);
    }

    @Override // x5.e
    public j6.c c() {
        return this.f23009b;
    }

    @Override // x5.e
    public h6.c d() {
        return this.f23010c.getValue();
    }

    @Override // x5.e
    public x5.b getComponents() {
        return this.f23020m;
    }

    public final r h() {
        return this.f23016i;
    }

    public final void l(int i10) {
        h6.c value;
        md.l<h6.c> lVar = this.f23010c;
        if (lVar == null || (value = lVar.getValue()) == null) {
            return;
        }
        value.b(i10);
    }
}
