package d4;

import ae.r;
import java.util.Map;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9488a;

        public a(String str) {
            r.f(str, "name");
            this.f9488a = str;
        }

        public final String a() {
            return this.f9488a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return r.b(this.f9488a, ((a) obj).f9488a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9488a.hashCode();
        }

        public String toString() {
            return this.f9488a;
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<T> f9489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f9490b;

        public final a<T> a() {
            return this.f9489a;
        }

        public final T b() {
            return this.f9490b;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);

    public final d4.a c() {
        return new d4.a(r0.v(a()), false);
    }

    public final d d() {
        return new d4.a(r0.v(a()), true);
    }
}
