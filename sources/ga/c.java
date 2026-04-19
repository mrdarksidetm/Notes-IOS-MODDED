package ga;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f11500b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f11502b = null;

        b(String str) {
            this.f11501a = str;
        }

        public c a() {
            return new c(this.f11501a, this.f11502b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f11502b)));
        }

        public <T extends Annotation> b b(T t10) {
            if (this.f11502b == null) {
                this.f11502b = new HashMap();
            }
            this.f11502b.put(t10.annotationType(), t10);
            return this;
        }
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f11499a = str;
        this.f11500b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f11499a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f11500b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11499a.equals(cVar.f11499a) && this.f11500b.equals(cVar.f11500b);
    }

    public int hashCode() {
        return (this.f11499a.hashCode() * 31) + this.f11500b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f11499a + ", properties=" + this.f11500b.values() + "}";
    }
}
