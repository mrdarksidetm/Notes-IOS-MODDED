package bf;

import ae.m0;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements we.b<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f5848a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ye.f f5849b = a.f5850b;

    private static final class a implements ye.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f5850b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f5851c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ ye.f f5852a = xe.a.i(xe.a.y(m0.f720a), j.f5830a).getDescriptor();

        private a() {
        }

        @Override // ye.f
        public String a() {
            return f5851c;
        }

        @Override // ye.f
        public boolean c() {
            return this.f5852a.c();
        }

        @Override // ye.f
        public int d(String str) {
            ae.r.f(str, "name");
            return this.f5852a.d(str);
        }

        @Override // ye.f
        public ye.j e() {
            return this.f5852a.e();
        }

        @Override // ye.f
        public int f() {
            return this.f5852a.f();
        }

        @Override // ye.f
        public String g(int i10) {
            return this.f5852a.g(i10);
        }

        @Override // ye.f
        public List<Annotation> getAnnotations() {
            return this.f5852a.getAnnotations();
        }

        @Override // ye.f
        public List<Annotation> h(int i10) {
            return this.f5852a.h(i10);
        }

        @Override // ye.f
        public ye.f i(int i10) {
            return this.f5852a.i(i10);
        }

        @Override // ye.f
        public boolean isInline() {
            return this.f5852a.isInline();
        }

        @Override // ye.f
        public boolean j(int i10) {
            return this.f5852a.j(i10);
        }
    }

    private v() {
    }

    @Override // we.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u deserialize(ze.e eVar) {
        ae.r.f(eVar, "decoder");
        k.g(eVar);
        return new u((Map) xe.a.i(xe.a.y(m0.f720a), j.f5830a).deserialize(eVar));
    }

    @Override // we.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ze.f fVar, u uVar) {
        ae.r.f(fVar, "encoder");
        ae.r.f(uVar, "value");
        k.h(fVar);
        xe.a.i(xe.a.y(m0.f720a), j.f5830a).serialize(fVar, uVar);
    }

    @Override // we.b, we.h, we.a
    public ye.f getDescriptor() {
        return f5849b;
    }
}
