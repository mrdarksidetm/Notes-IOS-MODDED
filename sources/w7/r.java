package w7;

/* JADX INFO: loaded from: classes.dex */
final class r<T> implements u7.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f22577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7.b f22579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u7.e<T, byte[]> f22580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f22581e;

    r(o oVar, String str, u7.b bVar, u7.e<T, byte[]> eVar, s sVar) {
        this.f22577a = oVar;
        this.f22578b = str;
        this.f22579c = bVar;
        this.f22580d = eVar;
        this.f22581e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // u7.f
    public void a(u7.c<T> cVar) {
        d(cVar, new u7.h() { // from class: w7.q
            @Override // u7.h
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    public void d(u7.c<T> cVar, u7.h hVar) {
        this.f22581e.a(n.a().e(this.f22577a).c(cVar).f(this.f22578b).d(this.f22580d).b(this.f22579c).a(), hVar);
    }
}
