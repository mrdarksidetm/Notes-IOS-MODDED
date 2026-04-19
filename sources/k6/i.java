package k6;

import ae.r;
import k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14418c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f14419d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f14420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f14421b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    static {
        c.b bVar = c.b.f14406a;
        f14419d = new i(bVar, bVar);
    }

    public i(c cVar, c cVar2) {
        this.f14420a = cVar;
        this.f14421b = cVar2;
    }

    public final c a() {
        return this.f14421b;
    }

    public final c b() {
        return this.f14420a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return r.b(this.f14420a, iVar.f14420a) && r.b(this.f14421b, iVar.f14421b);
    }

    public int hashCode() {
        return (this.f14420a.hashCode() * 31) + this.f14421b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f14420a + ", height=" + this.f14421b + ')';
    }
}
