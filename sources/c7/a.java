package c7;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(null);
        r.f(str, "value");
        this.f6557a = str;
    }

    @Override // c7.b
    public String a() {
        return b();
    }

    public String b() {
        return this.f6557a;
    }
}
