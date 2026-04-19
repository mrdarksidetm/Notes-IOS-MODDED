package w0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface c<E> extends List<E>, b<E>, be.a {

    private static final class a<E> extends nd.c<E> implements c<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c<E> f22370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f22371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f22372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22373e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c<? extends E> cVar, int i10, int i11) {
            this.f22370b = cVar;
            this.f22371c = i10;
            this.f22372d = i11;
            a1.d.c(i10, i11, cVar.size());
            this.f22373e = i11 - i10;
        }

        @Override // nd.a
        public int a() {
            return this.f22373e;
        }

        @Override // nd.c, java.util.List
        public E get(int i10) {
            a1.d.a(i10, this.f22373e);
            return this.f22370b.get(this.f22371c + i10);
        }

        @Override // nd.c, java.util.List
        public c<E> subList(int i10, int i11) {
            a1.d.c(i10, i11, this.f22373e);
            c<E> cVar = this.f22370b;
            int i12 = this.f22371c;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    default c<E> subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}
