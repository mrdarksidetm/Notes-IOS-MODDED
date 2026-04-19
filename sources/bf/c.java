package bf;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements we.b<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f5797a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f5798b = a.f5799b;

    private static final class a implements ye.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f5799b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f5800c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ ye.f f5801a = xe.a.g(j.f5830a).getDescriptor();

        private a() {
        }

        @Override // ye.f
        public String a() {
            return f5800c;
        }

        @Override // ye.f
        public boolean c() {
            return this.f5801a.c();
        }

        @Override // ye.f
        public int d(String str) {
            ae.r.f(str, "name");
            return this.f5801a.d(str);
        }

        @Override // ye.f
        public ye.j e() {
            return this.f5801a.e();
        }

        @Override // ye.f
        public int f() {
            return this.f5801a.f();
        }

        @Override // ye.f
        public String g(int i10) {
            return this.f5801a.g(i10);
        }

        @Override // ye.f
        public List<Annotation> getAnnotations() {
            return this.f5801a.getAnnotations();
        }

        @Override // ye.f
        public List<Annotation> h(int i10) {
            return this.f5801a.h(i10);
        }

        @Override // ye.f
        public ye.f i(int i10) {
            return this.f5801a.i(i10);
        }

        @Override // ye.f
        public boolean isInline() {
            return this.f5801a.isInline();
        }

        @Override // ye.f
        public boolean j(int i10) {
            return this.f5801a.j(i10);
        }
    }

    private c() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        k.g(eVar);
        return new b((List) xe.a.g(j.f5830a).deserialize(eVar));
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, b bVar) {
        ae.r.f(fVar, "encoder");
        ae.r.f(bVar, "value");
        k.h(fVar);
        xe.a.g(j.f5830a).serialize(fVar, bVar);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f5798b;
    }
}
