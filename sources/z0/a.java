package z0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24120b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        a1.c cVar = a1.c.f19a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, a1.c.f19a);
    }

    public a(Object obj, Object obj2) {
        this.f24119a = obj;
        this.f24120b = obj2;
    }

    public final boolean a() {
        return this.f24120b != a1.c.f19a;
    }

    public final boolean b() {
        return this.f24119a != a1.c.f19a;
    }

    public final Object c() {
        return this.f24120b;
    }

    public final Object d() {
        return this.f24119a;
    }

    public final a e(Object obj) {
        return new a(this.f24119a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f24120b);
    }
}
