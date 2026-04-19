package v;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt$CryptoObject;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f21833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiometricManager f21834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.core.hardware.fingerprint.a f21835c;

    private static class a {
        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt$CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: v.b$b, reason: collision with other inner class name */
    private static class C0448b {
        static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    private static class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f21836a;

        c(Context context) {
            this.f21836a = context.getApplicationContext();
        }

        @Override // v.b.d
        public BiometricManager a() {
            return a.b(this.f21836a);
        }

        @Override // v.b.d
        public boolean b() {
            return g.a(this.f21836a) != null;
        }

        @Override // v.b.d
        public boolean c() {
            return h.a(this.f21836a);
        }

        @Override // v.b.d
        public boolean d() {
            return g.b(this.f21836a);
        }

        @Override // v.b.d
        public boolean e() {
            return f.a(this.f21836a, Build.MODEL);
        }

        @Override // v.b.d
        public androidx.core.hardware.fingerprint.a f() {
            return androidx.core.hardware.fingerprint.a.a(this.f21836a);
        }
    }

    interface d {
        BiometricManager a();

        boolean b();

        boolean c();

        boolean d();

        boolean e();

        androidx.core.hardware.fingerprint.a f();
    }

    b(d dVar) {
        this.f21833a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        this.f21834b = i10 >= 29 ? dVar.a() : null;
        this.f21835c = i10 <= 29 ? dVar.f() : null;
    }

    private int b(int i10) {
        if (!v.a.b(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f21833a.b()) {
            return 12;
        }
        if (v.a.a(i10)) {
            return this.f21833a.d() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return v.a.c(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f21833a.c()) {
            return d();
        }
        return 12;
    }

    private int c() {
        androidx.core.hardware.fingerprint.a aVar = this.f21835c;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (aVar.d()) {
            return !this.f21835c.c() ? 11 : 0;
        }
        return 12;
    }

    private int d() {
        return !this.f21833a.d() ? c() : c() == 0 ? 0 : -1;
    }

    private int e() {
        BiometricPrompt$CryptoObject biometricPrompt$CryptoObjectB;
        Method methodC = a.c();
        if (methodC != null && (biometricPrompt$CryptoObjectB = e.b(e.a())) != null) {
            try {
                Object objInvoke = methodC.invoke(this.f21834b, biometricPrompt$CryptoObjectB);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e10);
            }
        }
        int iF = f();
        return (this.f21833a.e() || iF != 0) ? iF : d();
    }

    private int f() {
        BiometricManager biometricManager = this.f21834b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static b g(Context context) {
        return new b(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f21834b;
        if (biometricManager != null) {
            return C0448b.a(biometricManager, i10);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
