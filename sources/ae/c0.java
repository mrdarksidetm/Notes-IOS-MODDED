package ae;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c0 extends kotlin.jvm.internal.a implements he.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f697a;

    public c0() {
        this.f697a = false;
    }

    public c0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f697a = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.a
    public he.b compute() {
        return this.f697a ? this : super.compute();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public he.j getReflected() {
        if (this.f697a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (he.j) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return getOwner().equals(c0Var.getOwner()) && getName().equals(c0Var.getName()) && getSignature().equals(c0Var.getSignature()) && r.b(getBoundReceiver(), c0Var.getBoundReceiver());
        }
        if (obj instanceof he.j) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        he.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
