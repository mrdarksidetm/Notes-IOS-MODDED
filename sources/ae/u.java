package ae;

import he.i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends w implements he.g {
    public u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.a
    protected he.b computeReflected() {
        return i0.d(this);
    }

    @Override // he.i
    public i.a g() {
        return ((he.g) getReflected()).g();
    }

    @Override // zd.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
