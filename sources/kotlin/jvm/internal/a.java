package kotlin.jvm.internal;

import ae.i0;
import he.e;
import he.k;
import he.l;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements he.b, Serializable {
    public static final Object NO_RECEIVER = C0338a.f14478a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient he.b reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.a$a, reason: collision with other inner class name */
    private static class C0338a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0338a f14478a = new C0338a();

        private C0338a() {
        }
    }

    public a() {
        this(NO_RECEIVER);
    }

    protected a(Object obj) {
        this(obj, null, null, null, false);
    }

    protected a(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // he.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // he.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public he.b compute() {
        he.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        he.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract he.b computeReflected();

    @Override // he.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? i0.c(cls) : i0.b(cls);
    }

    @Override // he.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected he.b getReflected() {
        he.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new yd.b();
    }

    @Override // he.b
    public k getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // he.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // he.b
    public l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // he.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // he.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // he.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // he.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
