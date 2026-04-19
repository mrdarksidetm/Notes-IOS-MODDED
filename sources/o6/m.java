package o6;

import android.os.SystemClock;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f16391a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f16392b = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16393c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f16394d = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f16395e = true;

    private m() {
    }

    private final boolean a() {
        int i10 = f16393c;
        f16393c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f16394d + ((long) 30000);
    }

    public final synchronized boolean b(r rVar) {
        if (a()) {
            f16393c = 0;
            f16394d = SystemClock.uptimeMillis();
            String[] list = f16392b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            boolean z10 = length < 800;
            f16395e = z10;
            if (!z10 && rVar != null && rVar.a() <= 5) {
                rVar.b("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
            }
        }
        return f16395e;
    }
}
