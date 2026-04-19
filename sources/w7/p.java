package w7;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class p implements u7.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<u7.b> f22574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f22575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f22576c;

    p(Set<u7.b> set, o oVar, s sVar) {
        this.f22574a = set;
        this.f22575b = oVar;
        this.f22576c = sVar;
    }

    @Override // u7.g
    public <T> u7.f<T> a(String str, Class<T> cls, u7.b bVar, u7.e<T, byte[]> eVar) {
        if (this.f22574a.contains(bVar)) {
            return new r(this.f22575b, str, bVar, eVar, this.f22576c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f22574a));
    }
}
