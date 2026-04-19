package kotlin.jvm.internal;

import ae.i0;
import ae.n;
import ae.r;
import he.f;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a implements n, f {
    private final int arity;
    private final int flags;

    public b(int i10) {
        this(i10, a.NO_RECEIVER, null, null, null, 0);
    }

    public b(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public b(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.a
    protected he.b computeReflected() {
        return i0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return getName().equals(bVar.getName()) && getSignature().equals(bVar.getSignature()) && this.flags == bVar.flags && this.arity == bVar.arity && r.b(getBoundReceiver(), bVar.getBoundReceiver()) && r.b(getOwner(), bVar.getOwner());
        }
        if (obj instanceof f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // ae.n
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a
    public f getReflected() {
        return (f) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // he.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // he.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // he.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // he.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.a, he.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        he.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
