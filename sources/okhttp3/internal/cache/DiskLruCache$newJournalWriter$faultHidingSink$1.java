package okhttp3.internal.cache;

import ae.r;
import ae.s;
import java.io.IOException;
import md.i0;
import okhttp3.internal.Util;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends s implements l<IOException, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f17105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f17105a = diskLruCache;
    }

    public final void a(IOException iOException) {
        r.f(iOException, "it");
        DiskLruCache diskLruCache = this.f17105a;
        if (!Util.f17028h || Thread.holdsLock(diskLruCache)) {
            this.f17105a.f17070m = true;
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(IOException iOException) {
        a(iOException);
        return i0.f15558a;
    }
}
