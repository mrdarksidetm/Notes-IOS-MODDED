package je;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface h {

    public static final class a {
        public static b a(h hVar) {
            return new b(hVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f14211a;

        public b(h hVar) {
            ae.r.f(hVar, "match");
            this.f14211a = hVar;
        }

        public final h a() {
            return this.f14211a;
        }
    }

    b a();

    List<String> b();

    ge.i c();

    String getValue();

    h next();
}
