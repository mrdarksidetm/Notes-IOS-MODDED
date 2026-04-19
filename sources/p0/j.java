package p0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, l> f17832a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<l, a> f17833b = new LinkedHashMap();

    public final a a(l lVar) {
        return this.f17833b.get(lVar);
    }

    public final l b(a aVar) {
        return this.f17832a.get(aVar);
    }

    public final void c(a aVar) {
        l lVar = this.f17832a.get(aVar);
        if (lVar != null) {
            this.f17833b.remove(lVar);
        }
        this.f17832a.remove(aVar);
    }

    public final void d(a aVar, l lVar) {
        this.f17832a.put(aVar, lVar);
        this.f17833b.put(lVar, aVar);
    }
}
