package sd;

import ae.i0;
import ae.n;
import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends kotlin.coroutines.jvm.internal.b implements n<Object> {
    private final int arity;

    public j(int i10) {
        this(i10, null);
    }

    public j(int i10, qd.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // ae.n
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strG = i0.g(this);
        r.e(strG, "renderLambdaToString(...)");
        return strG;
    }
}
