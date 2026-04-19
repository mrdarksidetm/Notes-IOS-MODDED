package q2;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f18972b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f18973a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public d(String str) {
        this(h.a().c(str));
    }

    public d(f fVar) {
        this.f18973a = fVar;
    }

    public final f a() {
        return this.f18973a;
    }

    public final String b() {
        return this.f18973a.a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return r.b(b(), ((d) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }
}
