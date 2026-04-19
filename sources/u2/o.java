package u2;

import w2.t;
import w2.u;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21591c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o f21592d = new o(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21594b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final o a() {
            return o.f21592d;
        }
    }

    private o(long j10, long j11) {
        this.f21593a = j10;
        this.f21594b = j11;
    }

    public /* synthetic */ o(long j10, long j11, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? u.e(0) : j10, (i10 & 2) != 0 ? u.e(0) : j11, null);
    }

    public /* synthetic */ o(long j10, long j11, ae.j jVar) {
        this(j10, j11);
    }

    public final long b() {
        return this.f21593a;
    }

    public final long c() {
        return this.f21594b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return t.e(this.f21593a, oVar.f21593a) && t.e(this.f21594b, oVar.f21594b);
    }

    public int hashCode() {
        return (t.i(this.f21593a) * 31) + t.i(this.f21594b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) t.j(this.f21593a)) + ", restLine=" + ((Object) t.j(this.f21594b)) + ')';
    }
}
