package ae;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s<R> implements n<R>, Serializable {
    private final int arity;

    public s(int i10) {
        this.arity = i10;
    }

    @Override // ae.n
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strH = i0.h(this);
        r.e(strH, "renderLambdaToString(...)");
        return strH;
    }
}
