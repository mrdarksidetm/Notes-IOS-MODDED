package okhttp3.internal.cache;

import ae.r;
import ae.s;
import java.io.IOException;
import md.i0;
import okhttp3.internal.cache.DiskLruCache;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class DiskLruCache$Editor$newSink$1$1 extends s implements l<IOException, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f17083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ DiskLruCache.Editor f17084b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.f17083a = diskLruCache;
        this.f17084b = editor;
    }

    public final void a(IOException iOException) {
        r.f(iOException, "it");
        DiskLruCache diskLruCache = this.f17083a;
        DiskLruCache.Editor editor = this.f17084b;
        synchronized (diskLruCache) {
            editor.c();
            i0 i0Var = i0.f15558a;
        }
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(IOException iOException) {
        a(iOException);
        return i0.f15558a;
    }
}
