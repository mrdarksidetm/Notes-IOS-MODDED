package y;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: y.a$a, reason: collision with other inner class name */
    public static class C0481a implements a {
        @Override // y.a
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f23142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23143b;

        public b(boolean z10, int i10) {
            this.f23142a = z10;
            this.f23143b = i10;
        }

        @Override // y.a
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f23142a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f23143b);
            return bundle;
        }
    }

    Bundle a();
}
