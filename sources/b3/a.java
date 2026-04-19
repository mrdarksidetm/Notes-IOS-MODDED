package b3;

import java.util.Locale;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements s9.d<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f5431d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ag));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f5432e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f5433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f5434g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f5435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f5436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f5437c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f5438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f5439d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f5440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f5441b;

        static {
            if (a.f5431d) {
                f5439d = null;
                f5438c = null;
            } else {
                f5439d = new c(false, null);
                f5438c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f5440a = z10;
            this.f5441b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f5442b = new d(new C0128a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f5443a;

        /* JADX INFO: renamed from: b3.a$d$a, reason: collision with other inner class name */
        class C0128a extends Throwable {
            C0128a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f5443a = (Throwable) a.j(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f5444d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f5445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f5446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f5447c;

        e(Runnable runnable, Executor executor) {
            this.f5445a = runnable;
            this.f5446b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f5448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f5449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f5450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f5451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f5452e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f5448a = atomicReferenceFieldUpdater;
            this.f5449b = atomicReferenceFieldUpdater2;
            this.f5450c = atomicReferenceFieldUpdater3;
            this.f5451d = atomicReferenceFieldUpdater4;
            this.f5452e = atomicReferenceFieldUpdater5;
        }

        @Override // b3.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return b3.b.a(this.f5451d, aVar, eVar, eVar2);
        }

        @Override // b3.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return b3.b.a(this.f5452e, aVar, obj, obj2);
        }

        @Override // b3.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return b3.b.a(this.f5450c, aVar, iVar, iVar2);
        }

        @Override // b3.a.b
        void d(i iVar, i iVar2) {
            this.f5449b.lazySet(iVar, iVar2);
        }

        @Override // b3.a.b
        void e(i iVar, Thread thread) {
            this.f5448a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f5453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final s9.d<? extends V> f5454b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5453a.f5435a != this) {
                return;
            }
            if (a.f5433f.b(this.f5453a, this, a.p(this.f5454b))) {
                a.m(this.f5453a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // b3.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f5436b != eVar) {
                    return false;
                }
                aVar.f5436b = eVar2;
                return true;
            }
        }

        @Override // b3.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f5435a != obj) {
                    return false;
                }
                aVar.f5435a = obj2;
                return true;
            }
        }

        @Override // b3.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f5437c != iVar) {
                    return false;
                }
                aVar.f5437c = iVar2;
                return true;
            }
        }

        @Override // b3.a.b
        void d(i iVar, i iVar2) {
            iVar.f5457b = iVar2;
        }

        @Override // b3.a.b
        void e(i iVar, Thread thread) {
            iVar.f5456a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f5455c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f5456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f5457b;

        i() {
            a.f5433f.e(this, Thread.currentThread());
        }

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f5433f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f5456a;
            if (thread != null) {
                this.f5456a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f5433f = hVar;
        if (th != null) {
            f5432e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5434g = new Object();
    }

    protected a() {
    }

    private void b(StringBuilder sb2) {
        String str = "]";
        try {
            Object objQ = q(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(x(objQ));
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(str);
        }
    }

    private static CancellationException i(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T j(T t10) {
        t10.getClass();
        return t10;
    }

    private e l(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f5436b;
        } while (!f5433f.a(this, eVar2, e.f5444d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f5447c;
            eVar4.f5447c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
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
    static void m(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.t();
            aVar.c();
            e eVarL = aVar.l(eVar);
            while (eVarL != null) {
                eVar = eVarL.f5447c;
                Runnable runnable = eVarL.f5445a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f5453a;
                    if (aVar.f5435a == gVar) {
                        if (f5433f.b(aVar, gVar, p(gVar.f5454b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    n(runnable, eVarL.f5446b);
                }
                eVarL = eVar;
            }
            return;
        }
    }

    private static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f5432e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V o(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw i("Task was cancelled.", ((c) obj).f5441b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f5443a);
        }
        if (obj == f5434g) {
            return null;
        }
        return obj;
    }

    static Object p(s9.d<?> dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f5435a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f5440a ? cVar.f5441b != null ? new c(false, cVar.f5441b) : c.f5439d : obj;
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f5431d) && zIsCancelled) {
            return c.f5439d;
        }
        try {
            Object objQ = q(dVar);
            return objQ == null ? f5434g : objQ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V q(Future<V> future) {
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

    private void t() {
        i iVar;
        do {
            iVar = this.f5437c;
        } while (!f5433f.c(this, iVar, i.f5455c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f5457b;
        }
    }

    private void u(i iVar) {
        iVar.f5456a = null;
        while (true) {
            i iVar2 = this.f5437c;
            if (iVar2 == i.f5455c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f5457b;
                if (iVar2.f5456a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f5457b = iVar4;
                    if (iVar3.f5456a == null) {
                        break;
                    }
                } else if (!f5433f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String x(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // s9.d
    public final void a(Runnable runnable, Executor executor) {
        j(runnable);
        j(executor);
        e eVar = this.f5436b;
        if (eVar != e.f5444d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f5447c = eVar;
                if (f5433f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f5436b;
                }
            } while (eVar != e.f5444d);
        }
        n(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f5435a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f5431d ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f5438c : c.f5439d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f5433f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.r();
                }
                m(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                s9.d<? extends V> dVar = ((g) obj).f5454b;
                if (!(dVar instanceof a)) {
                    dVar.cancel(z10);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f5435a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f5435a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5435a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return o(obj2);
        }
        i iVar = this.f5437c;
        if (iVar != i.f5455c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f5433f.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            u(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f5435a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return o(obj);
                }
                iVar = this.f5437c;
            } while (iVar != i.f5455c);
        }
        return o(this.f5435a);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5435a;
        if ((obj != null) && (!(obj instanceof g))) {
            return o(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f5437c;
            if (iVar != i.f5455c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f5433f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                u(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5435a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return o(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        u(iVar2);
                    } else {
                        iVar = this.f5437c;
                    }
                } while (iVar != i.f5455c);
            }
            return o(this.f5435a);
        }
        while (nanos > 0) {
            Object obj3 = this.f5435a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return o(obj3);
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
    public final boolean isCancelled() {
        return this.f5435a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f5435a != null);
    }

    protected void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String s() {
        Object obj = this.f5435a;
        if (obj instanceof g) {
            return "setFuture=[" + x(((g) obj).f5454b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strS;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                b(sb2);
            } else {
                try {
                    strS = s();
                } catch (RuntimeException e10) {
                    strS = "Exception thrown from implementation: " + e10.getClass();
                }
                if (strS == null || strS.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    b(sb2);
                } else {
                    sb2.append("PENDING, info=[");
                    sb2.append(strS);
                    sb2.append("]");
                }
            }
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
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
    protected boolean v(V v10) {
        if (v10 == null) {
            v10 = (V) f5434g;
        }
        if (!f5433f.b(this, null, v10)) {
            return false;
        }
        m(this);
        return true;
    }

    protected boolean w(Throwable th) {
        if (!f5433f.b(this, null, new d((Throwable) j(th)))) {
            return false;
        }
        m(this);
        return true;
    }

    protected final boolean y() {
        Object obj = this.f5435a;
        return (obj instanceof c) && ((c) obj).f5440a;
    }
}
