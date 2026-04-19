package i0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: i0.a$a, reason: collision with other inner class name */
    public static final class C0294a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f12042a;

        private C0294a(float f10) {
            this.f12042a = f10;
            if (w2.h.l(f10, w2.h.m((float) 0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) w2.h.q(f10)) + " should be larger than zero.").toString());
        }

        public /* synthetic */ C0294a(float f10, ae.j jVar) {
            this(f10);
        }

        @Override // i0.a
        public List<Integer> a(w2.d dVar, int i10, int i11) {
            return h.c(i10, Math.max((i10 + i11) / (dVar.a1(this.f12042a) + i11), 1), i11);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0294a) && w2.h.o(this.f12042a, ((C0294a) obj).f12042a);
        }

        public int hashCode() {
            return w2.h.p(this.f12042a);
        }
    }

    List<Integer> a(w2.d dVar, int i10, int i11);
}
