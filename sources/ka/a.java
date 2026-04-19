package ka;

import da.c0;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f14453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f14454b;

    public a(Class<T> cls, T t10) {
        this.f14453a = (Class) c0.b(cls);
        this.f14454b = (T) c0.b(t10);
    }

    public Class<T> a() {
        return this.f14453a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f14453a, this.f14454b);
    }
}
