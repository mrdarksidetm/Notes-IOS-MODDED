package kotlin.coroutines.jvm.internal;

import ae.r;
import java.io.Serializable;
import md.i0;
import md.t;
import md.u;
import qd.d;
import sd.c;
import sd.e;
import sd.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements d<Object>, c, Serializable {
    private final d<Object> completion;

    public a(d<Object> dVar) {
        this.completion = dVar;
    }

    public d<i0> create(Object obj, d<?> dVar) {
        r.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public d<i0> create(d<?> dVar) {
        r.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // sd.c
    public c getCallerFrame() {
        d<Object> dVar = this.completion;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    public final d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return e.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // qd.d
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        d<Object> dVar = this;
        while (true) {
            f.b(dVar);
            a aVar = (a) dVar;
            d<Object> dVar2 = aVar.completion;
            r.c(dVar2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                t.a aVar2 = t.f15576b;
                obj = t.b(u.a(th));
            }
            if (objInvokeSuspend == rd.d.e()) {
                return;
            }
            obj = t.b(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
