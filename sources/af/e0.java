package af;

import af.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements c0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ we.b<T> f752a;

        a(we.b<T> bVar) {
            this.f752a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // af.c0
        public we.b<?>[] childSerializers() {
            return new we.b[]{this.f752a};
        }

        @Override // we.a
        public T deserialize(ze.e eVar) {
            ae.r.f(eVar, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // we.b, we.h, we.a
        public ye.f getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // we.h
        public void serialize(ze.f fVar, T t10) {
            ae.r.f(fVar, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // af.c0
        public we.b<?>[] typeParametersSerializers() {
            return c0.a.a(this);
        }
    }

    public static final <T> ye.f a(String str, we.b<T> bVar) {
        ae.r.f(str, "name");
        ae.r.f(bVar, "primitiveSerializer");
        return new d0(str, new a(bVar));
    }
}
