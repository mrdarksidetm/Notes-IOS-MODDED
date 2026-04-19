package le;

import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends qd.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15088c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15089b;

    public static final class a implements g.c<m0> {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && ae.r.b(this.f15089b, ((m0) obj).f15089b);
    }

    public final String g0() {
        return this.f15089b;
    }

    public int hashCode() {
        return this.f15089b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f15089b + ')';
    }
}
