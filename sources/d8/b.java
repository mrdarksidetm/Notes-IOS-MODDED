package d8;

import d8.f;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g8.a f9775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<u7.d, f.b> f9776b;

    b(g8.a aVar, Map<u7.d, f.b> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f9775a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f9776b = map;
    }

    @Override // d8.f
    g8.a e() {
        return this.f9775a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f9775a.equals(fVar.e()) && this.f9776b.equals(fVar.h());
    }

    @Override // d8.f
    Map<u7.d, f.b> h() {
        return this.f9776b;
    }

    public int hashCode() {
        return ((this.f9775a.hashCode() ^ 1000003) * 1000003) ^ this.f9776b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f9775a + ", values=" + this.f9776b + "}";
    }
}
