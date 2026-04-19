package v7;

import v7.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    public static abstract class a {
        public abstract k a();

        public abstract a b(v7.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22166a;

        b(int i10) {
            this.f22166a = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract v7.a b();

    public abstract b c();
}
