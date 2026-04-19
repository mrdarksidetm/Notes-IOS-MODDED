package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b3.c<c> f4519a = b3.c.z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f4520b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f4521c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f4524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f4525d;

        b(int i10, int i11, long j10, long j11) {
            this.f4522a = i10;
            this.f4523b = i11;
            this.f4524c = j10;
            this.f4525d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4522a);
                dataOutputStream.writeInt(this.f4523b);
                dataOutputStream.writeLong(this.f4524c);
                dataOutputStream.writeLong(this.f4525d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4523b == bVar.f4523b && this.f4524c == bVar.f4524c && this.f4522a == bVar.f4522a && this.f4525d == bVar.f4525d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4523b), Long.valueOf(this.f4524c), Integer.valueOf(this.f4522a), Long.valueOf(this.f4525d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f4527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f4528c;

        c(int i10, boolean z10, boolean z11) {
            this.f4526a = i10;
            this.f4528c = z11;
            this.f4527b = z10;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f4521c = cVar;
        f4519a.v(cVar);
        return f4521c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.i.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.i.c(android.content.Context, boolean):androidx.profileinstaller.i$c");
    }
}
