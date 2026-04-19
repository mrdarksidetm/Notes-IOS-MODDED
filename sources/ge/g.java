package ge;

import nd.l0;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Iterable<Integer>, be.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11533d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11536c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final g a(int i10, int i11, int i12) {
            return new g(i10, i11, i12);
        }
    }

    public g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f11534a = i10;
        this.f11535b = ud.c.c(i10, i11, i12);
        this.f11536c = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f11534a != gVar.f11534a || this.f11535b != gVar.f11535b || this.f11536c != gVar.f11536c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f11534a * 31) + this.f11535b) * 31) + this.f11536c;
    }

    public boolean isEmpty() {
        if (this.f11536c > 0) {
            if (this.f11534a > this.f11535b) {
                return true;
            }
        } else if (this.f11534a < this.f11535b) {
            return true;
        }
        return false;
    }

    public final int l() {
        return this.f11534a;
    }

    public final int n() {
        return this.f11535b;
    }

    public final int o() {
        return this.f11536c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public l0 iterator() {
        return new h(this.f11534a, this.f11535b, this.f11536c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f11536c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f11534a);
            sb2.append("..");
            sb2.append(this.f11535b);
            sb2.append(" step ");
            i10 = this.f11536c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f11534a);
            sb2.append(" downTo ");
            sb2.append(this.f11535b);
            sb2.append(" step ");
            i10 = -this.f11536c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
