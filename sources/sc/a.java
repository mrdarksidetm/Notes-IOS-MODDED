package sc;

import java.nio.ByteBuffer;
import sc.b;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc.b f20479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h<T> f20481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.c f20482d;

    private final class b implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<T> f20483a;

        /* JADX INFO: renamed from: sc.a$b$a, reason: collision with other inner class name */
        class C0418a implements e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b.InterfaceC0419b f20485a;

            C0418a(b.InterfaceC0419b interfaceC0419b) {
                this.f20485a = interfaceC0419b;
            }

            @Override // sc.a.e
            public void a(T t10) {
                this.f20485a.a(a.this.f20481c.a(t10));
            }
        }

        private b(d<T> dVar) {
            this.f20483a = dVar;
        }

        @Override // sc.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0419b interfaceC0419b) {
            try {
                this.f20483a.a((T) a.this.f20481c.b(byteBuffer), new C0418a(interfaceC0419b));
            } catch (RuntimeException e10) {
                cc.b.c("BasicMessageChannel#" + a.this.f20480b, "Failed to handle message", e10);
                interfaceC0419b.a(null);
            }
        }
    }

    private final class c implements b.InterfaceC0419b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e<T> f20487a;

        private c(e<T> eVar) {
            this.f20487a = eVar;
        }

        @Override // sc.b.InterfaceC0419b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f20487a.a((T) a.this.f20481c.b(byteBuffer));
            } catch (RuntimeException e10) {
                cc.b.c("BasicMessageChannel#" + a.this.f20480b, "Failed to handle message reply", e10);
            }
        }
    }

    public interface d<T> {
        void a(T t10, e<T> eVar);
    }

    public interface e<T> {
        void a(T t10);
    }

    public a(sc.b bVar, String str, h<T> hVar) {
        this(bVar, str, hVar, null);
    }

    public a(sc.b bVar, String str, h<T> hVar, b.c cVar) {
        this.f20479a = bVar;
        this.f20480b = str;
        this.f20481c = hVar;
        this.f20482d = cVar;
    }

    public void c(T t10) {
        d(t10, null);
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
    public void d(T t10, e<T> eVar) {
        this.f20479a.b(this.f20480b, this.f20481c.a(t10), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [sc.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [sc.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sc.b$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
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
    public void e(d<T> dVar) {
        if (this.f20482d != null) {
            this.f20479a.e(this.f20480b, dVar != null ? new b(dVar) : null, this.f20482d);
        } else {
            this.f20479a.f(this.f20480b, dVar != null ? new b(dVar) : 0);
        }
    }
}
