package okhttp3.internal.cache;

import hf.u;
import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache$cleanupTask$1 extends Task {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f17104e;

    @Override // okhttp3.internal.concurrent.Task
    public long f() {
        DiskLruCache diskLruCache = this.f17104e;
        synchronized (diskLruCache) {
            if (!diskLruCache.f17072o || diskLruCache.P()) {
                return -1L;
            }
            try {
                diskLruCache.q0();
            } catch (IOException unused) {
                diskLruCache.f17074q = true;
            }
            try {
                if (diskLruCache.h0()) {
                    diskLruCache.m0();
                    diskLruCache.f17069l = 0;
                }
            } catch (IOException unused2) {
                diskLruCache.f17075r = true;
                diskLruCache.f17067j = u.c(u.b());
            }
            return -1L;
        }
    }
}
