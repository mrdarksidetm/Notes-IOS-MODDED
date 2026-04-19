package ye;

import ae.i0;
import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24009a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24010a = new b();

        private b() {
            super(null);
        }
    }

    private j() {
    }

    public /* synthetic */ j(ae.j jVar) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String strB = i0.b(getClass()).b();
        r.c(strB);
        return strB;
    }
}
