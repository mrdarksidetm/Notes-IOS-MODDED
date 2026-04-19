package q6;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f18987c;

    public a(String str, String str2, Object obj) {
        r.f(str, "code");
        this.f18985a = str;
        this.f18986b = str2;
        this.f18987c = obj;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f18986b;
    }
}
