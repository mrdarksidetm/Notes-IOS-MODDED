package da;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class d0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f9870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f9871b;

    private @interface a {
    }

    public d0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f9870a = cls;
        this.f9871b = cls2;
    }

    public static <T> d0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new d0<>(cls, cls2);
    }

    public static <T> d0<T> b(Class<T> cls) {
        return new d0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f9871b.equals(d0Var.f9871b)) {
            return this.f9870a.equals(d0Var.f9870a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f9871b.hashCode() * 31) + this.f9870a.hashCode();
    }

    public String toString() {
        if (this.f9870a == a.class) {
            return this.f9871b.getName();
        }
        return "@" + this.f9870a.getName() + " " + this.f9871b.getName();
    }
}
