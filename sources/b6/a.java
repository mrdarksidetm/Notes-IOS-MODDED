package b6;

import android.os.StatFs;
import ge.o;
import hf.j;
import hf.z;
import java.io.Closeable;
import java.io.File;
import le.d1;
import le.j0;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: b6.a$a, reason: collision with other inner class name */
    public static final class C0129a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z f5462a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f5467f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private j f5463b = j.f11987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f5464c = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5465d = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f5466e = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j0 f5468g = d1.b();

        public final a a() {
            long jM;
            z zVar = this.f5462a;
            if (zVar == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            if (this.f5464c > 0.0d) {
                try {
                    File file = zVar.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jM = o.m((long) (this.f5464c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f5465d, this.f5466e);
                } catch (Exception unused) {
                    jM = this.f5465d;
                }
            } else {
                jM = this.f5467f;
            }
            return new d(jM, zVar, this.f5463b, this.f5468g);
        }

        public final C0129a b(z zVar) {
            this.f5462a = zVar;
            return this;
        }

        public final C0129a c(File file) {
            return b(z.a.d(z.f12027b, file, false, 1, null));
        }

        public final C0129a d(long j10) {
            if (!(j10 > 0)) {
                throw new IllegalArgumentException("size must be > 0.".toString());
            }
            this.f5464c = 0.0d;
            this.f5467f = j10;
            return this;
        }
    }

    public interface b {
        void a();

        z f();

        c g();

        z getData();
    }

    public interface c extends Closeable {
        z f();

        z getData();

        b x();
    }

    b a(String str);

    c b(String str);

    j getFileSystem();
}
