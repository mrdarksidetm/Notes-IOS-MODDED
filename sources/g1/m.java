package g1;

import ae.r;
import java.util.List;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11266d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f11267e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<o> f11268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k1.h f11269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.l<String, i0> f11270c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public final List<o> a() {
        return this.f11268a;
    }

    public final k1.h b() {
        return this.f11269b;
    }

    public final zd.l<String, i0> c() {
        return this.f11270c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return r.b(this.f11268a, mVar.f11268a) && r.b(this.f11269b, mVar.f11269b) && r.b(this.f11270c, mVar.f11270c);
    }

    public int hashCode() {
        int iHashCode = this.f11268a.hashCode() * 31;
        k1.h hVar = this.f11269b;
        int iHashCode2 = (iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        zd.l<String, i0> lVar = this.f11270c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
