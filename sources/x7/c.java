package x7;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g8.a f23058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g8.a f23059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23060d;

    c(Context context, g8.a aVar, g8.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f23057a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f23058b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f23059c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f23060d = str;
    }

    @Override // x7.h
    public Context b() {
        return this.f23057a;
    }

    @Override // x7.h
    public String c() {
        return this.f23060d;
    }

    @Override // x7.h
    public g8.a d() {
        return this.f23059c;
    }

    @Override // x7.h
    public g8.a e() {
        return this.f23058b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f23057a.equals(hVar.b()) && this.f23058b.equals(hVar.e()) && this.f23059c.equals(hVar.d()) && this.f23060d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f23057a.hashCode() ^ 1000003) * 1000003) ^ this.f23058b.hashCode()) * 1000003) ^ this.f23059c.hashCode()) * 1000003) ^ this.f23060d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f23057a + ", wallClock=" + this.f23058b + ", monotonicClock=" + this.f23059c + ", backendName=" + this.f23060d + "}";
    }
}
