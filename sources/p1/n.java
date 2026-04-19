package p1;

import java.util.Iterator;
import java.util.List;
import nd.u;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p implements Iterable<p>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f18037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f18039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f18040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f18041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f18042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<h> f18043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<p> f18044j;

    public static final class a implements Iterator<p>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator<p> f18045a;

        a(n nVar) {
            this.f18045a = nVar.f18044j.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p next() {
            return this.f18045a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18045a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends h> list, List<? extends p> list2) {
        super(null);
        this.f18035a = str;
        this.f18036b = f10;
        this.f18037c = f11;
        this.f18038d = f12;
        this.f18039e = f13;
        this.f18040f = f14;
        this.f18041g = f15;
        this.f18042h = f16;
        this.f18043i = list;
        this.f18044j = list2;
    }

    public /* synthetic */ n(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & 256) != 0 ? o.e() : list, (i10 & 512) != 0 ? u.m() : list2);
    }

    public final p d(int i10) {
        return this.f18044j.get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!ae.r.b(this.f18035a, nVar.f18035a)) {
            return false;
        }
        if (!(this.f18036b == nVar.f18036b)) {
            return false;
        }
        if (!(this.f18037c == nVar.f18037c)) {
            return false;
        }
        if (!(this.f18038d == nVar.f18038d)) {
            return false;
        }
        if (!(this.f18039e == nVar.f18039e)) {
            return false;
        }
        if (!(this.f18040f == nVar.f18040f)) {
            return false;
        }
        if (this.f18041g == nVar.f18041g) {
            return ((this.f18042h > nVar.f18042h ? 1 : (this.f18042h == nVar.f18042h ? 0 : -1)) == 0) && ae.r.b(this.f18043i, nVar.f18043i) && ae.r.b(this.f18044j, nVar.f18044j);
        }
        return false;
    }

    public final List<h> f() {
        return this.f18043i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f18035a.hashCode() * 31) + Float.hashCode(this.f18036b)) * 31) + Float.hashCode(this.f18037c)) * 31) + Float.hashCode(this.f18038d)) * 31) + Float.hashCode(this.f18039e)) * 31) + Float.hashCode(this.f18040f)) * 31) + Float.hashCode(this.f18041g)) * 31) + Float.hashCode(this.f18042h)) * 31) + this.f18043i.hashCode()) * 31) + this.f18044j.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<p> iterator() {
        return new a(this);
    }

    public final String l() {
        return this.f18035a;
    }

    public final float n() {
        return this.f18037c;
    }

    public final float o() {
        return this.f18038d;
    }

    public final float r() {
        return this.f18036b;
    }

    public final float s() {
        return this.f18039e;
    }

    public final float t() {
        return this.f18040f;
    }

    public final int u() {
        return this.f18044j.size();
    }

    public final float v() {
        return this.f18041g;
    }

    public final float w() {
        return this.f18042h;
    }
}
