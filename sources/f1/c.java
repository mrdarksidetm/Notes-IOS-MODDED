package f1;

import f1.b;
import w2.o;
import w2.p;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f1.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f11037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f11038c;

    public static final class a implements b.InterfaceC0266b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f11039a;

        public a(float f10) {
            this.f11039a = f10;
        }

        @Override // f1.b.InterfaceC0266b
        public int a(int i10, int i11, r rVar) {
            return ce.c.d(((i11 - i10) / 2.0f) * (1 + (rVar == r.Ltr ? this.f11039a : (-1) * this.f11039a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f11039a, ((a) obj).f11039a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f11039a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f11039a + ')';
        }
    }

    public static final class b implements b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f11040a;

        public b(float f10) {
            this.f11040a = f10;
        }

        @Override // f1.b.c
        public int a(int i10, int i11) {
            return ce.c.d(((i11 - i10) / 2.0f) * (1 + this.f11040a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f11040a, ((b) obj).f11040a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f11040a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f11040a + ')';
        }
    }

    public c(float f10, float f11) {
        this.f11037b = f10;
        this.f11038c = f11;
    }

    @Override // f1.b
    public long a(long j10, long j11, r rVar) {
        float fG = (p.g(j11) - p.g(j10)) / 2.0f;
        float f10 = (p.f(j11) - p.f(j10)) / 2.0f;
        float f11 = 1;
        return o.a(ce.c.d(fG * ((rVar == r.Ltr ? this.f11037b : (-1) * this.f11037b) + f11)), ce.c.d(f10 * (f11 + this.f11038c)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f11037b, cVar.f11037b) == 0 && Float.compare(this.f11038c, cVar.f11038c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f11037b) * 31) + Float.hashCode(this.f11038c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f11037b + ", verticalBias=" + this.f11038c + ')';
    }
}
