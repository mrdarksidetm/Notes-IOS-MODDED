package qd;

import ae.j;
import ae.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import md.t;

/* JADX INFO: loaded from: classes2.dex */
public final class i<T> implements d<T>, sd.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f19041b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f19042c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d<T> f19043a;
    private volatile Object result;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d<? super T> dVar) {
        this(dVar, rd.a.f19460b);
        r.f(dVar, "delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(d<? super T> dVar, Object obj) {
        r.f(dVar, "delegate");
        this.f19043a = dVar;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        rd.a aVar = rd.a.f19460b;
        if (obj == aVar) {
            if (b3.b.a(f19042c, this, aVar, rd.d.e())) {
                return rd.d.e();
            }
            obj = this.result;
        }
        if (obj == rd.a.f19461c) {
            return rd.d.e();
        }
        if (obj instanceof t.b) {
            throw ((t.b) obj).f15578a;
        }
        return obj;
    }

    @Override // sd.c
    public sd.c getCallerFrame() {
        d<T> dVar = this.f19043a;
        if (dVar instanceof sd.c) {
            return (sd.c) dVar;
        }
        return null;
    }

    @Override // qd.d
    public g getContext() {
        return this.f19043a.getContext();
    }

    @Override // qd.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            rd.a aVar = rd.a.f19460b;
            if (obj2 == aVar) {
                if (b3.b.a(f19042c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != rd.d.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (b3.b.a(f19042c, this, rd.d.e(), rd.a.f19461c)) {
                    this.f19043a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f19043a;
    }
}
