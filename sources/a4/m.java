package a4;

import ae.d0;
import ae.h0;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import le.n0;
import le.x;
import le.z;
import md.i0;
import md.u;
import nd.c0;
import oe.s;

/* JADX INFO: loaded from: classes.dex */
public final class m<T> implements a4.f<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f449k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set<String> f450l = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f451m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<File> f452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a4.k<T> f453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a4.b<T> f454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n0 f455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final oe.e<T> f456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final md.l f458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s<a4.n<T>> f459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<? extends zd.p<? super a4.i<T>, ? super qd.d<? super i0>, ? extends Object>> f460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a4.l<b<T>> f461j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final Set<String> a() {
            return m.f450l;
        }

        public final Object b() {
            return m.f451m;
        }
    }

    private static abstract class b<T> {

        public static final class a<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a4.n<T> f462a;

            public a(a4.n<T> nVar) {
                super(null);
                this.f462a = nVar;
            }

            public a4.n<T> a() {
                return this.f462a;
            }
        }

        /* JADX INFO: renamed from: a4.m$b$b, reason: collision with other inner class name */
        public static final class C0016b<T> extends b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final zd.p<T, qd.d<? super T>, Object> f463a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final x<T> f464b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final a4.n<T> f465c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final qd.g f466d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0016b(zd.p<? super T, ? super qd.d<? super T>, ? extends Object> pVar, x<T> xVar, a4.n<T> nVar, qd.g gVar) {
                super(null);
                ae.r.f(pVar, "transform");
                ae.r.f(xVar, "ack");
                ae.r.f(gVar, "callerContext");
                this.f463a = pVar;
                this.f464b = xVar;
                this.f465c = nVar;
                this.f466d = gVar;
            }

            public final x<T> a() {
                return this.f464b;
            }

            public final qd.g b() {
                return this.f466d;
            }

            public a4.n<T> c() {
                return this.f465c;
            }

            public final zd.p<T, qd.d<? super T>, Object> d() {
                return this.f463a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }
    }

    private static final class c extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f467a;

        public c(FileOutputStream fileOutputStream) {
            ae.r.f(fileOutputStream, "fileOutputStream");
            this.f467a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f467a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f467a.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            ae.r.f(bArr, "b");
            this.f467a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            ae.r.f(bArr, "bytes");
            this.f467a.write(bArr, i10, i11);
        }
    }

    static final class d extends ae.s implements zd.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f468a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m<T> mVar) {
            super(1);
            this.f468a = mVar;
        }

        public final void a(Throwable th) {
            if (th != null) {
                ((m) this.f468a).f459h.setValue(new a4.h(th));
            }
            a aVar = m.f449k;
            Object objB = aVar.b();
            m<T> mVar = this.f468a;
            synchronized (objB) {
                aVar.a().remove(mVar.q().getAbsolutePath());
                i0 i0Var = i0.f15558a;
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f15558a;
        }
    }

    static final class e extends ae.s implements zd.p<b<T>, Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f469a = new e();

        e() {
            super(2);
        }

        public final void a(b<T> bVar, Throwable th) {
            ae.r.f(bVar, "msg");
            if (bVar instanceof b.C0016b) {
                x<T> xVarA = ((b.C0016b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                xVarA.a(th);
            }
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(Object obj, Throwable th) {
            a((b) obj, th);
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    static final class f extends sd.j implements zd.p<b<T>, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f472c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m<T> mVar, qd.d<? super f> dVar) {
            super(2, dVar);
            this.f472c = mVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b<T> bVar, qd.d<? super i0> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            f fVar = new f(this.f472c, dVar);
            fVar.f471b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f470a;
            if (i10 == 0) {
                u.b(obj);
                b bVar = (b) this.f471b;
                if (bVar instanceof b.a) {
                    this.f470a = 1;
                    if (this.f472c.r((b.a) bVar, this) == objE) {
                        return objE;
                    }
                } else if (bVar instanceof b.C0016b) {
                    this.f470a = 2;
                    if (this.f472c.s((b.C0016b) bVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {R.styleable.AppCompatTheme_windowActionBar}, m = "invokeSuspend")
    static final class g extends sd.j implements zd.p<oe.f<? super T>, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f475c;

        @sd.d(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        static final class a extends sd.j implements zd.p<a4.n<T>, qd.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f477b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a4.n<T> f478c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a4.n<T> nVar, qd.d<? super a> dVar) {
                super(2, dVar);
                this.f478c = nVar;
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(a4.n<T> nVar, qd.d<? super Boolean> dVar) {
                return ((a) create(nVar, dVar)).invokeSuspend(i0.f15558a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
                a aVar = new a(this.f478c, dVar);
                aVar.f477b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                rd.d.e();
                if (this.f476a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                a4.n<T> nVar = (a4.n) this.f477b;
                a4.n<T> nVar2 = this.f478c;
                boolean z10 = false;
                if (!(nVar2 instanceof a4.c) && !(nVar2 instanceof a4.h) && nVar == nVar2) {
                    z10 = true;
                }
                return sd.a.a(z10);
            }
        }

        public static final class b implements oe.e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ oe.e f479a;

            public static final class a implements oe.f<a4.n<T>> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ oe.f f480a;

                /* JADX INFO: renamed from: a4.m$g$b$a$a, reason: collision with other inner class name */
                @sd.d(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                public static final class C0017a extends kotlin.coroutines.jvm.internal.b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f481a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f482b;

                    public C0017a(qd.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f481a = obj;
                        this.f482b |= Integer.MIN_VALUE;
                        return a.this.b(null, this);
                    }
                }

                public a(oe.f fVar) {
                    this.f480a = fVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oe.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object b(java.lang.Object r5, qd.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof a4.m.g.b.a.C0017a
                        if (r0 == 0) goto L13
                        r0 = r6
                        a4.m$g$b$a$a r0 = (a4.m.g.b.a.C0017a) r0
                        int r1 = r0.f482b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f482b = r1
                        goto L18
                    L13:
                        a4.m$g$b$a$a r0 = new a4.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f481a
                        java.lang.Object r1 = rd.b.e()
                        int r2 = r0.f482b
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
                        oe.f r6 = r4.f480a
                        a4.n r5 = (a4.n) r5
                        boolean r2 = r5 instanceof a4.j
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof a4.h
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof a4.c
                        if (r2 == 0) goto L56
                        a4.c r5 = (a4.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f482b = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        md.i0 r5 = md.i0.f15558a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof a4.o
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        md.q r5 = new md.q
                        r5.<init>()
                        throw r5
                    L6c:
                        a4.h r5 = (a4.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L73:
                        a4.j r5 = (a4.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: a4.m.g.b.a.b(java.lang.Object, qd.d):java.lang.Object");
                }
            }

            public b(oe.e eVar) {
                this.f479a = eVar;
            }

            @Override // oe.e
            public Object a(oe.f fVar, qd.d dVar) {
                Object objA = this.f479a.a(new a(fVar), dVar);
                return objA == rd.d.e() ? objA : i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m<T> mVar, qd.d<? super g> dVar) {
            super(2, dVar);
            this.f475c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            g gVar = new g(this.f475c, dVar);
            gVar.f474b = obj;
            return gVar;
        }

        @Override // zd.p
        public final Object invoke(oe.f<? super T> fVar, qd.d<? super i0> dVar) {
            return ((g) create(fVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f473a;
            if (i10 == 0) {
                u.b(obj);
                oe.f fVar = (oe.f) this.f474b;
                a4.n nVar = (a4.n) ((m) this.f475c).f459h.getValue();
                if (!(nVar instanceof a4.c)) {
                    ((m) this.f475c).f461j.e(new b.a(nVar));
                }
                b bVar = new b(oe.g.h(((m) this.f475c).f459h, new a(nVar, null)));
                this.f473a = 1;
                if (oe.g.j(fVar, bVar, this) == objE) {
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

    static final class h extends ae.s implements zd.a<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f484a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m<T> mVar) {
            super(0);
            this.f484a = mVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) ((m) this.f484a).f452a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = m.f449k;
            synchronized (aVar.b()) {
                if (!(!aVar.a().contains(absolutePath))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set<String> setA = aVar.a();
                ae.r.e(absolutePath, "it");
                setA.add(absolutePath);
            }
            return file;
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    static final class i extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T> f489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f490f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m<T> mVar, qd.d<? super i> dVar) {
            super(dVar);
            this.f489e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f488d = obj;
            this.f490f |= Integer.MIN_VALUE;
            return this.f489e.s(null, this);
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    static final class j extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ m<T> f498h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f499i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m<T> mVar, qd.d<? super j> dVar) {
            super(dVar);
            this.f498h = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f497g = obj;
            this.f499i |= Integer.MIN_VALUE;
            return this.f498h.t(this);
        }
    }

    public static final class k implements a4.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ue.a f500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0<T> f502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f503d;

        @sd.d(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        static final class a extends kotlin.coroutines.jvm.internal.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f504a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f505b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f506c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f507d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f508e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f509f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f511h;

            a(qd.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f509f = obj;
                this.f511h |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(ue.a aVar, d0 d0Var, h0<T> h0Var, m<T> mVar) {
            this.f500a = aVar;
            this.f501b = d0Var;
            this.f502c = h0Var;
            this.f503d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // a4.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(zd.p<? super T, ? super qd.d<? super T>, ? extends java.lang.Object> r11, qd.d<? super T> r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.m.k.a(zd.p, qd.d):java.lang.Object");
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    static final class l extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(m<T> mVar, qd.d<? super l> dVar) {
            super(dVar);
            this.f514c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f513b = obj;
            this.f515d |= Integer.MIN_VALUE;
            return this.f514c.u(this);
        }
    }

    /* JADX INFO: renamed from: a4.m$m, reason: collision with other inner class name */
    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    static final class C0018m extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f519d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0018m(m<T> mVar, qd.d<? super C0018m> dVar) {
            super(dVar);
            this.f518c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f517b = obj;
            this.f519d |= Integer.MIN_VALUE;
            return this.f518c.v(this);
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    static final class n extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T> f524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f525f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(m<T> mVar, qd.d<? super n> dVar) {
            super(dVar);
            this.f524e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f523d = obj;
            this.f525f |= Integer.MIN_VALUE;
            return this.f524e.w(this);
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    static final class o extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f530e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(m<T> mVar, qd.d<? super o> dVar) {
            super(dVar);
            this.f529d = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f528c = obj;
            this.f530e |= Integer.MIN_VALUE;
            return this.f529d.x(this);
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    static final class p extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T> f535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f536f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(m<T> mVar, qd.d<? super p> dVar) {
            super(dVar);
            this.f535e = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f534d = obj;
            this.f536f |= Integer.MIN_VALUE;
            return this.f535e.y(null, null, this);
        }
    }

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    static final class q extends sd.j implements zd.p<n0, qd.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<T, qd.d<? super T>, Object> f538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(zd.p<? super T, ? super qd.d<? super T>, ? extends Object> pVar, T t10, qd.d<? super q> dVar) {
            super(2, dVar);
            this.f538b = pVar;
            this.f539c = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new q(this.f538b, this.f539c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super T> dVar) {
            return ((q) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f537a;
            if (i10 == 0) {
                u.b(obj);
                zd.p<T, qd.d<? super T>, Object> pVar = this.f538b;
                T t10 = this.f539c;
                this.f537a = 1;
                obj = pVar.invoke(t10, this);
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

    @sd.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    static final class r extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ m<T> f546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f547h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(m<T> mVar, qd.d<? super r> dVar) {
            super(dVar);
            this.f546g = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f545f = obj;
            this.f547h |= Integer.MIN_VALUE;
            return this.f546g.z(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(zd.a<? extends File> aVar, a4.k<T> kVar, List<? extends zd.p<? super a4.i<T>, ? super qd.d<? super i0>, ? extends Object>> list, a4.b<T> bVar, n0 n0Var) {
        ae.r.f(aVar, "produceFile");
        ae.r.f(kVar, "serializer");
        ae.r.f(list, "initTasksList");
        ae.r.f(bVar, "corruptionHandler");
        ae.r.f(n0Var, "scope");
        this.f452a = aVar;
        this.f453b = kVar;
        this.f454c = bVar;
        this.f455d = n0Var;
        this.f456e = oe.g.o(new g(this, null));
        this.f457f = ".tmp";
        this.f458g = md.n.b(new h(this));
        this.f459h = oe.h0.a(a4.o.f548a);
        this.f460i = c0.C0(list);
        this.f461j = new a4.l<>(n0Var, new d(this), e.f469a, new f(this, null));
    }

    private final void p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(ae.r.m("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.f458g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a<T> aVar, qd.d<? super i0> dVar) throws Throwable {
        a4.n<T> value = this.f459h.getValue();
        if (!(value instanceof a4.c)) {
            if (value instanceof a4.j) {
                if (value == aVar.a()) {
                    Object objV = v(dVar);
                    return objV == rd.d.e() ? objV : i0.f15558a;
                }
            } else {
                if (ae.r.b(value, a4.o.f548a)) {
                    Object objV2 = v(dVar);
                    return objV2 == rd.d.e() ? objV2 : i0.f15558a;
                }
                if (value instanceof a4.h) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return i0.f15558a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10, types: [a4.m] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a4.m, a4.m<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a4.m$b$b, a4.m$b$b<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [a4.m$b$b] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [le.x] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(a4.m.b.C0016b<T> r9, qd.d<? super md.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.s(a4.m$b$b, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [a4.m] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [a4.m] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [a4.m, a4.m<T>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(qd.d<? super md.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.t(qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(qd.d<? super md.i0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a4.m.l
            if (r0 == 0) goto L13
            r0 = r5
            a4.m$l r0 = (a4.m.l) r0
            int r1 = r0.f515d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f515d = r1
            goto L18
        L13:
            a4.m$l r0 = new a4.m$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f513b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f515d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f512a
            a4.m r0 = (a4.m) r0
            md.u.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            md.u.b(r5)
            r0.f512a = r4     // Catch: java.lang.Throwable -> L48
            r0.f515d = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            md.i0 r5 = md.i0.f15558a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            oe.s<a4.n<T>> r0 = r0.f459h
            a4.j r1 = new a4.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.u(qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(qd.d<? super md.i0> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a4.m.C0018m
            if (r0 == 0) goto L13
            r0 = r5
            a4.m$m r0 = (a4.m.C0018m) r0
            int r1 = r0.f519d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f519d = r1
            goto L18
        L13:
            a4.m$m r0 = new a4.m$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f517b
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f519d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f516a
            a4.m r0 = (a4.m) r0
            md.u.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            md.u.b(r5)
            r0.f516a = r4     // Catch: java.lang.Throwable -> L45
            r0.f519d = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            oe.s<a4.n<T>> r0 = r0.f459h
            a4.j r1 = new a4.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            md.i0 r5 = md.i0.f15558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.v(qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12, types: [a4.m] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [a4.m$n, qd.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [a4.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [a4.k, a4.k<T>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(qd.d<? super T> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a4.m.n
            if (r0 == 0) goto L13
            r0 = r6
            a4.m$n r0 = (a4.m.n) r0
            int r1 = r0.f525f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f525f = r1
            goto L18
        L13:
            a4.m$n r0 = new a4.m$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f523d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f525f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f522c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f521b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f520a
            a4.m r0 = (a4.m) r0
            md.u.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L60
        L35:
            r6 = move-exception
            goto L68
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            md.u.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6e
            java.io.File r6 = r5.q()     // Catch: java.io.FileNotFoundException -> L6e
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6e
            r6 = 0
            a4.k<T> r4 = r5.f453b     // Catch: java.lang.Throwable -> L66
            r0.f520a = r5     // Catch: java.lang.Throwable -> L66
            r0.f521b = r2     // Catch: java.lang.Throwable -> L66
            r0.f522c = r6     // Catch: java.lang.Throwable -> L66
            r0.f525f = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = r4.c(r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r1 = r6
            r6 = r0
            r0 = r5
        L60:
            xd.b.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L64
            return r6
        L64:
            r6 = move-exception
            goto L70
        L66:
            r6 = move-exception
            r0 = r5
        L68:
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            xd.b.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L64
            throw r1     // Catch: java.io.FileNotFoundException -> L64
        L6e:
            r6 = move-exception
            r0 = r5
        L70:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L81
            a4.k<T> r6 = r0.f453b
            java.lang.Object r6 = r6.a()
            return r6
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.w(qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a4.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [a4.m] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [a4.m] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v0, types: [a4.m, a4.m<T>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(qd.d<? super T> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a4.m.o
            if (r0 == 0) goto L13
            r0 = r8
            a4.m$o r0 = (a4.m.o) r0
            int r1 = r0.f530e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f530e = r1
            goto L18
        L13:
            a4.m$o r0 = new a4.m$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f528c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f530e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f527b
            java.lang.Object r0 = r0.f526a
            a4.a r0 = (a4.a) r0
            md.u.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f527b
            a4.a r2 = (a4.a) r2
            java.lang.Object r4 = r0.f526a
            a4.m r4 = (a4.m) r4
            md.u.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f526a
            a4.m r2 = (a4.m) r2
            md.u.b(r8)     // Catch: a4.a -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            md.u.b(r8)
            r0.f526a = r7     // Catch: a4.a -> L64
            r0.f530e = r5     // Catch: a4.a -> L64
            java.lang.Object r8 = r7.w(r0)     // Catch: a4.a -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            a4.b<T> r5 = r2.f454c
            r0.f526a = r2
            r0.f527b = r8
            r0.f530e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f526a = r2     // Catch: java.io.IOException -> L88
            r0.f527b = r8     // Catch: java.io.IOException -> L88
            r0.f530e = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.z(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            md.e.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.x(qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(zd.p<? super T, ? super qd.d<? super T>, ? extends java.lang.Object> r8, qd.g r9, qd.d<? super T> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof a4.m.p
            if (r0 == 0) goto L13
            r0 = r10
            a4.m$p r0 = (a4.m.p) r0
            int r1 = r0.f536f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f536f = r1
            goto L18
        L13:
            a4.m$p r0 = new a4.m$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f534d
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f536f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f532b
            java.lang.Object r9 = r0.f531a
            a4.m r9 = (a4.m) r9
            md.u.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f533c
            java.lang.Object r9 = r0.f532b
            a4.c r9 = (a4.c) r9
            java.lang.Object r2 = r0.f531a
            a4.m r2 = (a4.m) r2
            md.u.b(r10)
            goto L73
        L49:
            md.u.b(r10)
            oe.s<a4.n<T>> r10 = r7.f459h
            java.lang.Object r10 = r10.getValue()
            a4.c r10 = (a4.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            a4.m$q r6 = new a4.m$q
            r6.<init>(r8, r2, r3)
            r0.f531a = r7
            r0.f532b = r10
            r0.f533c = r2
            r0.f536f = r5
            java.lang.Object r8 = le.i.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = ae.r.b(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f531a = r2
            r0.f532b = r10
            r0.f533c = r3
            r0.f536f = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            oe.s<a4.n<T>> r9 = r9.f459h
            a4.c r10 = new a4.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.y(zd.p, qd.g, qd.d):java.lang.Object");
    }

    @Override // a4.f
    public Object a(zd.p<? super T, ? super qd.d<? super T>, ? extends Object> pVar, qd.d<? super T> dVar) throws Throwable {
        x xVarB = z.b(null, 1, null);
        this.f461j.e(new b.C0016b(pVar, xVarB, this.f459h.getValue(), dVar.getContext()));
        return xVarB.await(dVar);
    }

    @Override // a4.f
    public oe.e<T> getData() {
        return this.f456e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(T r8, qd.d<? super md.i0> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.m.z(java.lang.Object, qd.d):java.lang.Object");
    }
}
