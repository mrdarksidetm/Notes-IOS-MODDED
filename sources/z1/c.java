package z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<T> f24132a;

    /* JADX WARN: Multi-variable type inference failed */
    private c(zd.a<? extends T> aVar) {
        this.f24132a = aVar;
    }

    public /* synthetic */ c(zd.a aVar, ae.j jVar) {
        this(aVar);
    }

    public final zd.a<T> a() {
        return this.f24132a;
    }
}
