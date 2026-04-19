package okhttp3;

import ae.r;
import be.a;
import hf.u;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;
import xd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Cache$urls$1 implements Iterator<String>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<DiskLruCache.Snapshot> f16656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16658c;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f16657b;
        r.c(str);
        this.f16657b = null;
        this.f16658c = true;
        return str;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f16657b != null) {
            return true;
        }
        this.f16658c = false;
        while (this.f16656a.hasNext()) {
            try {
                DiskLruCache.Snapshot next = this.f16656a.next();
                try {
                    continue;
                    this.f16657b = u.d(next.b(0)).J();
                    b.a(next, null);
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f16658c) {
            throw new IllegalStateException("remove() before next()".toString());
        }
        this.f16656a.remove();
    }
}
