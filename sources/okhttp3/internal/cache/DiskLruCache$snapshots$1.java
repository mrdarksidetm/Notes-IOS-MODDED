package okhttp3.internal.cache;

import ae.r;
import be.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import md.i0;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<DiskLruCache.Entry> f17106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DiskLruCache.Snapshot f17107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DiskLruCache.Snapshot f17108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f17109d;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DiskLruCache.Snapshot next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        DiskLruCache.Snapshot snapshot = this.f17107b;
        this.f17108c = snapshot;
        this.f17107b = null;
        r.c(snapshot);
        return snapshot;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f17107b != null) {
            return true;
        }
        DiskLruCache diskLruCache = this.f17109d;
        synchronized (diskLruCache) {
            if (diskLruCache.P()) {
                return false;
            }
            while (this.f17106a.hasNext()) {
                DiskLruCache.Entry next = this.f17106a.next();
                DiskLruCache.Snapshot snapshotR = next == null ? null : next.r();
                if (snapshotR != null) {
                    this.f17107b = snapshotR;
                    return true;
                }
            }
            i0 i0Var = i0.f15558a;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        DiskLruCache.Snapshot snapshot = this.f17108c;
        if (snapshot == null) {
            throw new IllegalStateException("remove() before next()".toString());
        }
        try {
            this.f17109d.n0(snapshot.l());
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f17108c = null;
            throw th;
        }
        this.f17108c = null;
    }
}
