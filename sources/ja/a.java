package ja;

import ja.d;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f14152b = d.a.DEFAULT;

    /* JADX INFO: renamed from: ja.a$a, reason: collision with other inner class name */
    private static final class C0329a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f14154b;

        C0329a(int i10, d.a aVar) {
            this.f14153a = i10;
            this.f14154b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f14153a == dVar.tag() && this.f14154b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f14153a ^ 14552422) + (this.f14154b.hashCode() ^ 2041407134);
        }

        @Override // ja.d
        public d.a intEncoding() {
            return this.f14154b;
        }

        @Override // ja.d
        public int tag() {
            return this.f14153a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f14153a + "intEncoding=" + this.f14154b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0329a(this.f14151a, this.f14152b);
    }

    public a c(int i10) {
        this.f14151a = i10;
        return this;
    }
}
