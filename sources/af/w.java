package af;

import java.util.Iterator;
import ye.j;
import ye.k;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends a1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ye.j f842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final md.l f843n;

    static final class a extends ae.s implements zd.a<ye.f[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f846c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, String str, w wVar) {
            super(0);
            this.f844a = i10;
            this.f845b = str;
            this.f846c = wVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ye.f[] invoke() {
            int i10 = this.f844a;
            ye.f[] fVarArr = new ye.f[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fVarArr[i11] = ye.i.c(this.f845b + com.amazon.a.a.o.c.a.b.f7490a + this.f846c.g(i11), k.d.f24014a, new ye.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, int i10) {
        super(str, null, i10, 2, null);
        ae.r.f(str, "name");
        this.f842m = j.b.f24010a;
        this.f843n = md.n.b(new a(i10, str, this));
    }

    private final ye.f[] t() {
        return (ye.f[]) this.f843n.getValue();
    }

    @Override // af.a1, ye.f
    public ye.j e() {
        return this.f842m;
    }

    @Override // af.a1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ye.f)) {
            return false;
        }
        ye.f fVar = (ye.f) obj;
        return fVar.e() == j.b.f24010a && ae.r.b(a(), fVar.a()) && ae.r.b(y0.a(this), y0.a(fVar));
    }

    @Override // af.a1
    public int hashCode() {
        int iHashCode = a().hashCode();
        Iterator<String> it = ye.h.b(this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i10 = iHashCode2 * 31;
            String next = it.next();
            iHashCode2 = i10 + (next != null ? next.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // af.a1, ye.f
    public ye.f i(int i10) {
        return t()[i10];
    }

    @Override // af.a1
    public String toString() {
        return nd.c0.h0(ye.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
