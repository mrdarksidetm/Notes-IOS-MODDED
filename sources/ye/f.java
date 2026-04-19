package ye;

import java.lang.annotation.Annotation;
import java.util.List;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public interface f {

    public static final class a {
        public static List<Annotation> a(f fVar) {
            return u.m();
        }

        public static boolean b(f fVar) {
            return false;
        }

        public static boolean c(f fVar) {
            return false;
        }
    }

    String a();

    boolean c();

    int d(String str);

    j e();

    int f();

    String g(int i10);

    List<Annotation> getAnnotations();

    List<Annotation> h(int i10);

    f i(int i10);

    boolean isInline();

    boolean j(int i10);
}
