package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3324a;

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.a$a, reason: collision with other inner class name */
    static class C0078a {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static b f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new b(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new b(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new b(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(b bVar) {
            if (bVar == null) {
                return null;
            }
            if (bVar.a() != null) {
                return new FingerprintManager.CryptoObject(bVar.a());
            }
            if (bVar.c() != null) {
                return new FingerprintManager.CryptoObject(bVar.c());
            }
            if (bVar.b() != null) {
                return new FingerprintManager.CryptoObject(bVar.b());
            }
            return null;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Signature f3325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f3326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Mac f3327c;

        public b(Signature signature) {
            this.f3325a = signature;
            this.f3326b = null;
            this.f3327c = null;
        }

        public b(Cipher cipher) {
            this.f3326b = cipher;
            this.f3325a = null;
            this.f3327c = null;
        }

        public b(Mac mac) {
            this.f3327c = mac;
            this.f3326b = null;
            this.f3325a = null;
        }

        public Cipher a() {
            return this.f3326b;
        }

        public Mac b() {
            return this.f3327c;
        }

        public Signature c() {
            return this.f3325a;
        }
    }

    private a(Context context) {
        this.f3324a = context;
    }

    public static a a(Context context) {
        return new a(context);
    }

    private static FingerprintManager b(Context context) {
        return C0078a.c(context);
    }

    public boolean c() {
        FingerprintManager fingerprintManagerB = b(this.f3324a);
        return fingerprintManagerB != null && C0078a.d(fingerprintManagerB);
    }

    public boolean d() {
        FingerprintManager fingerprintManagerB = b(this.f3324a);
        return fingerprintManagerB != null && C0078a.e(fingerprintManagerB);
    }
}
