package s9;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<V> extends t9.a implements s9.d<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f20441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final s9.c f20442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f20443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f20444g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f20445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile e f20446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile l f20447c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract e d(a<?> aVar, e eVar);

        abstract l e(a<?> aVar, l lVar);

        abstract void f(l lVar, l lVar2);

        abstract void g(l lVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f20448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f20449d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f20450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f20451b;

        static {
            if (a.f20441d) {
                f20449d = null;
                f20448c = null;
            } else {
                f20449d = new c(false, null);
                f20448c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f20450a = z10;
            this.f20451b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f20452b = new d(new C0415a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f20453a;

        /* JADX INFO: renamed from: s9.a$d$a, reason: collision with other inner class name */
        class C0415a extends Throwable {
            C0415a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f20453a = (Throwable) r9.d.a(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f20454d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f20455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f20456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f20457c;

        e() {
            this.f20455a = null;
            this.f20456b = null;
        }

        e(Runnable runnable, Executor executor) {
            this.f20455a = runnable;
            this.f20456b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f20458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f20459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, l> f20460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, e> f20461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<? super a<?>, Object> f20462e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super a<?>, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super a<?>, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super a<?>, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f20458a = atomicReferenceFieldUpdater;
            this.f20459b = atomicReferenceFieldUpdater2;
            this.f20460c = atomicReferenceFieldUpdater3;
            this.f20461d = atomicReferenceFieldUpdater4;
            this.f20462e = atomicReferenceFieldUpdater5;
        }

        @Override // s9.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return b3.b.a(this.f20461d, aVar, eVar, eVar2);
        }

        @Override // s9.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return b3.b.a(this.f20462e, aVar, obj, obj2);
        }

        @Override // s9.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return b3.b.a(this.f20460c, aVar, lVar, lVar2);
        }

        @Override // s9.a.b
        e d(a<?> aVar, e eVar) {
            return this.f20461d.getAndSet(aVar, eVar);
        }

        @Override // s9.a.b
        l e(a<?> aVar, l lVar) {
            return this.f20460c.getAndSet(aVar, lVar);
        }

        @Override // s9.a.b
        void f(l lVar, l lVar2) {
            this.f20459b.lazySet(lVar, lVar2);
        }

        @Override // s9.a.b
        void g(l lVar, Thread thread) {
            this.f20458a.lazySet(lVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f20463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s9.d<? extends V> f20464b;

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f20463a).f20445a != this) {
                return;
            }
            if (a.f20443f.b(this.f20463a, this, a.v(this.f20464b))) {
                a.s(this.f20463a, false);
            }
        }
    }

    private static final class h extends b {
        private h() {
            super();
        }

        @Override // s9.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f20446b != eVar) {
                    return false;
                }
                ((a) aVar).f20446b = eVar2;
                return true;
            }
        }

        @Override // s9.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f20445a != obj) {
                    return false;
                }
                ((a) aVar).f20445a = obj2;
                return true;
            }
        }

        @Override // s9.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (((a) aVar).f20447c != lVar) {
                    return false;
                }
                ((a) aVar).f20447c = lVar2;
                return true;
            }
        }

        @Override // s9.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            synchronized (aVar) {
                eVar2 = ((a) aVar).f20446b;
                if (eVar2 != eVar) {
                    ((a) aVar).f20446b = eVar;
                }
            }
            return eVar2;
        }

        @Override // s9.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            synchronized (aVar) {
                lVar2 = ((a) aVar).f20447c;
                if (lVar2 != lVar) {
                    ((a) aVar).f20447c = lVar;
                }
            }
            return lVar2;
        }

        @Override // s9.a.b
        void f(l lVar, l lVar2) {
            lVar.f20473b = lVar2;
        }

        @Override // s9.a.b
        void g(l lVar, Thread thread) {
            lVar.f20472a = thread;
        }
    }

    interface i<V> extends s9.d<V> {
    }

    static abstract class j<V> extends a<V> implements i<V> {
        j() {
        }

        @Override // s9.a, s9.d
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // s9.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // s9.a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // s9.a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }

        @Override // s9.a, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // s9.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    private static final class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f20465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f20466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f20467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f20468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f20469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f20470f;

        /* JADX INFO: renamed from: s9.a$k$a, reason: collision with other inner class name */
        class C0416a implements PrivilegedExceptionAction<Unsafe> {
            C0416a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0416a());
                }
                try {
                    f20467c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                    f20466b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                    f20468d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                    f20469e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f20470f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f20465a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // s9.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return s9.b.a(f20465a, aVar, f20466b, eVar, eVar2);
        }

        @Override // s9.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return s9.b.a(f20465a, aVar, f20468d, obj, obj2);
        }

        @Override // s9.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return s9.b.a(f20465a, aVar, f20467c, lVar, lVar2);
        }

        @Override // s9.a.b
        e d(a<?> aVar, e eVar) {
            e eVar2;
            do {
                eVar2 = ((a) aVar).f20446b;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(aVar, eVar2, eVar));
            return eVar2;
        }

        @Override // s9.a.b
        l e(a<?> aVar, l lVar) {
            l lVar2;
            do {
                lVar2 = ((a) aVar).f20447c;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!c(aVar, lVar2, lVar));
            return lVar2;
        }

        @Override // s9.a.b
        void f(l lVar, l lVar2) {
            f20465a.putObject(lVar, f20470f, lVar2);
        }

        @Override // s9.a.b
        void g(l lVar, Thread thread) {
            f20465a.putObject(lVar, f20469e, thread);
        }
    }

    private static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final l f20471c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f20472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile l f20473b;

        l() {
            a.f20443f.g(this, Thread.currentThread());
        }

        l(boolean z10) {
        }

        void a(l lVar) {
            a.f20443f.f(this, lVar);
        }

        void b() {
            Thread thread = this.f20472a;
            if (thread != null) {
                this.f20472a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v3, types: [s9.a$a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    static {
        boolean z10;
        b hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ag));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f20441d = z10;
        f20442e = new s9.c(a.class);
        ?? r12 = 0;
        r12 = 0;
        try {
            hVar = new k();
            e = null;
        } catch (Error | Exception e10) {
            e = e10;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                hVar = new h();
                r12 = e11;
            }
        }
        f20443f = hVar;
        if (r12 != 0) {
            s9.c cVar = f20442e;
            Logger loggerA = cVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", e);
            cVar.a().log(level, "SafeAtomicHelper is broken!", r12);
        }
        f20444g = new Object();
    }

    protected a() {
    }

    private void A(l lVar) {
        lVar.f20472a = null;
        while (true) {
            l lVar2 = this.f20447c;
            if (lVar2 == l.f20471c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f20473b;
                if (lVar2.f20472a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f20473b = lVar4;
                    if (lVar3.f20472a == null) {
                        break;
                    }
                } else if (!f20443f.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void l(StringBuilder sb2) {
        String str = "]";
        try {
            Object objW = w(this);
            sb2.append("SUCCESS, result=[");
            o(sb2, objW);
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append(str);
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f20445a
            boolean r2 = r1 instanceof s9.a.g
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            s9.a$g r1 = (s9.a.g) r1
            s9.d<? extends V> r1 = r1.f20464b
            r5.p(r6, r1)
        L1d:
            r6.append(r3)
            goto L4d
        L21:
            java.lang.String r1 = r5.y()     // Catch: java.lang.StackOverflowError -> L2a java.lang.Exception -> L2c
            java.lang.String r1 = r9.e.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.Exception -> L2c
            goto L42
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Exception thrown from implementation: "
            r2.append(r4)
            java.lang.Class r1 = r1.getClass()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L42:
            if (r1 == 0) goto L4d
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            goto L1d
        L4d:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5d
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.l(r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.a.m(java.lang.StringBuilder):void");
    }

    private void o(StringBuilder sb2, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else if (obj == this) {
            hexString = "this future";
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb2.append(hexString);
    }

    private void p(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (Exception | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    private static CancellationException q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e r(e eVar) {
        e eVar2 = eVar;
        e eVarD = f20443f.d(this, e.f20454d);
        while (eVarD != null) {
            e eVar3 = eVarD.f20457c;
            eVarD.f20457c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void s(a<?> aVar, boolean z10) {
        e eVar = null;
        while (true) {
            aVar.z();
            if (z10) {
                aVar.x();
                z10 = false;
            }
            aVar.n();
            e eVarR = aVar.r(eVar);
            while (eVarR != null) {
                eVar = eVarR.f20457c;
                Runnable runnable = eVarR.f20455a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f20463a;
                    if (((a) aVar).f20445a == gVar) {
                        if (f20443f.b(aVar, gVar, v(gVar.f20464b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarR.f20456b;
                    Objects.requireNonNull(executor);
                    t(runnable2, executor);
                }
                eVarR = eVar;
            }
            return;
        }
    }

    private static void t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f20442e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V u(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw q("Task was cancelled.", ((c) obj).f20451b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f20453a);
        }
        return obj == f20444g ? (V) s9.e.a() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object v(s9.d<?> dVar) {
        Throwable thA;
        if (dVar instanceof i) {
            Object cVar = ((a) dVar).f20445a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f20450a) {
                    cVar = cVar2.f20451b != null ? new c(false, cVar2.f20451b) : c.f20449d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((dVar instanceof t9.a) && (thA = t9.b.a((t9.a) dVar)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f20441d) && zIsCancelled) {
            c cVar3 = c.f20449d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objW = w(dVar);
            if (!zIsCancelled) {
                return objW == null ? f20444g : objW;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + dVar));
        } catch (Error e10) {
            e = e10;
            return new d(e);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + dVar, e12));
        } catch (Exception e13) {
            e = e13;
            return new d(e);
        }
    }

    private static <V> V w(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void z() {
        for (l lVarE = f20443f.e(this, l.f20471c); lVarE != null; lVarE = lVarE.f20473b) {
            lVarE.b();
        }
    }

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
    protected boolean B(V v10) {
        if (v10 == null) {
            v10 = (V) f20444g;
        }
        if (!f20443f.b(this, null, v10)) {
            return false;
        }
        s(this, false);
        return true;
    }

    protected boolean C(Throwable th) {
        if (!f20443f.b(this, null, new d((Throwable) r9.d.a(th)))) {
            return false;
        }
        s(this, false);
        return true;
    }

    @Override // s9.d
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        r9.d.b(runnable, "Runnable was null.");
        r9.d.b(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f20446b) != e.f20454d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f20457c = eVar;
                if (f20443f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f20446b;
                }
            } while (eVar != e.f20454d);
        }
        t(runnable, executor);
    }

    @Override // t9.a
    protected final Throwable b() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f20445a;
        if (obj instanceof d) {
            return ((d) obj).f20453a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f20445a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f20441d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f20448c : c.f20449d;
            Objects.requireNonNull(cVar);
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f20443f.b(aVar, obj, cVar)) {
                s(aVar, z10);
                if (!(obj instanceof g)) {
                    return true;
                }
                s9.d<? extends V> dVar = ((g) obj).f20464b;
                if (!(dVar instanceof i)) {
                    dVar.cancel(z10);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f20445a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f20445a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f20445a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return u(obj2);
        }
        l lVar = this.f20447c;
        if (lVar != l.f20471c) {
            l lVar2 = new l();
            do {
                lVar2.a(lVar);
                if (f20443f.c(this, lVar, lVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            A(lVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f20445a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return u(obj);
                }
                lVar = this.f20447c;
            } while (lVar != l.f20471c);
        }
        Object obj3 = this.f20445a;
        Objects.requireNonNull(obj3);
        return u(obj3);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f20445a;
        if ((obj != null) && (!(obj instanceof g))) {
            return u(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f20447c;
            if (lVar != l.f20471c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f20443f.c(this, lVar, lVar2)) {
                        do {
                            s9.f.a(this, nanos);
                            if (Thread.interrupted()) {
                                A(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f20445a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return u(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        A(lVar2);
                    } else {
                        lVar = this.f20447c;
                    }
                } while (lVar != l.f20471c);
            }
            Object obj3 = this.f20445a;
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f20445a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return u(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + com.amazon.a.a.o.b.f.f7478a;
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f20445a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f20445a != null);
    }

    protected void n() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            l(sb2);
        } else {
            m(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void x() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }
}
