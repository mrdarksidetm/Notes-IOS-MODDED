package i5;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
final class i<T> extends h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f12542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f12544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f12545e;

    public i(T t10, String str, j jVar, g gVar) {
        r.f(t10, "value");
        r.f(str, "tag");
        r.f(jVar, "verificationMode");
        r.f(gVar, "logger");
        this.f12542b = t10;
        this.f12543c = str;
        this.f12544d = jVar;
        this.f12545e = gVar;
    }

    @Override // i5.h
    public T a() {
        return this.f12542b;
    }

    @Override // i5.h
    public h<T> c(String str, zd.l<? super T, Boolean> lVar) {
        r.f(str, "message");
        r.f(lVar, "condition");
        return lVar.invoke(this.f12542b).booleanValue() ? this : new f(this.f12542b, this.f12543c, str, this.f12545e, this.f12544d);
    }
}
