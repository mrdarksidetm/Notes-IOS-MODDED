package m2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import md.i0;
import r2.r;
import r2.s;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f15295a = r.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<K, V> f15296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashSet<K> f15297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f15303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15304j;

    public b(int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f15299e = i10;
        this.f15296b = new HashMap<>(0, 0.75f);
        this.f15297c = new LinkedHashSet<>();
    }

    private final int g(K k10, V v10) {
        int i10 = i(k10, v10);
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + k10 + '=' + v10).toString());
    }

    protected V b(K k10) {
        return null;
    }

    protected void c(boolean z10, K k10, V v10, V v11) {
    }

    public final V d(K k10) {
        synchronized (this.f15295a) {
            V v10 = this.f15296b.get(k10);
            if (v10 != null) {
                this.f15297c.remove(k10);
                this.f15297c.add(k10);
                this.f15303i++;
                return v10;
            }
            this.f15304j++;
            V vB = b(k10);
            if (vB == null) {
                return null;
            }
            synchronized (this.f15295a) {
                this.f15301g++;
                V vPut = this.f15296b.put(k10, vB);
                this.f15297c.remove(k10);
                this.f15297c.add(k10);
                if (vPut != null) {
                    this.f15296b.put(k10, vPut);
                    v10 = vPut;
                } else {
                    this.f15298d = h() + g(k10, vB);
                }
                i0 i0Var = i0.f15558a;
            }
            if (v10 != null) {
                c(false, k10, vB, v10);
                return v10;
            }
            j(this.f15299e);
            return vB;
        }
    }

    public final V e(K k10, V v10) {
        V vPut;
        if (k10 == null || v10 == null) {
            throw null;
        }
        synchronized (this.f15295a) {
            this.f15300f++;
            this.f15298d = h() + g(k10, v10);
            vPut = this.f15296b.put(k10, v10);
            if (vPut != null) {
                this.f15298d = h() - g(k10, vPut);
            }
            if (this.f15297c.contains(k10)) {
                this.f15297c.remove(k10);
            }
            this.f15297c.add(k10);
        }
        if (vPut != null) {
            c(false, k10, vPut, v10);
        }
        j(this.f15299e);
        return vPut;
    }

    public final V f(K k10) {
        V vRemove;
        k10.getClass();
        synchronized (this.f15295a) {
            vRemove = this.f15296b.remove(k10);
            this.f15297c.remove(k10);
            if (vRemove != null) {
                this.f15298d = h() - g(k10, vRemove);
            }
            i0 i0Var = i0.f15558a;
        }
        if (vRemove != null) {
            c(false, k10, vRemove, null);
        }
        return vRemove;
    }

    public final int h() {
        int i10;
        synchronized (this.f15295a) {
            i10 = this.f15298d;
        }
        return i10;
    }

    protected int i(K k10, V v10) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            r2.s r0 = r7.f15295a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            if (r1 < 0) goto L89
            java.util.HashMap<K, V> r1 = r7.f15296b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L17
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L89
        L17:
            java.util.HashMap<K, V> r1 = r7.f15296b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r2 = r7.f15297c     // Catch: java.lang.Throwable -> L91
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != r2) goto L89
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L74
            java.util.HashMap<K, V> r1 = r7.f15296b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L74
            java.util.LinkedHashSet<K> r1 = r7.f15297c     // Catch: java.lang.Throwable -> L91
            java.lang.Object r1 = nd.s.X(r1)     // Catch: java.lang.Throwable -> L91
            java.util.HashMap<K, V> r4 = r7.f15296b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L6c
            java.util.HashMap<K, V> r5 = r7.f15296b     // Catch: java.lang.Throwable -> L91
            java.util.Map r5 = ae.n0.d(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r5 = r7.f15297c     // Catch: java.lang.Throwable -> L91
            java.util.Collection r5 = ae.n0.a(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L91
            ae.r.c(r1)     // Catch: java.lang.Throwable -> L91
            ae.r.c(r4)     // Catch: java.lang.Throwable -> L91
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L91
            int r5 = r5 - r6
            r7.f15298d = r5     // Catch: java.lang.Throwable -> L91
            int r5 = r7.f15302h     // Catch: java.lang.Throwable -> L91
            int r5 = r5 + r2
            r7.f15302h = r5     // Catch: java.lang.Throwable -> L91
            goto L76
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L74:
            r1 = r3
            r4 = r1
        L76:
            md.i0 r5 = md.i0.f15558a     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)
            if (r1 != 0) goto L7e
            if (r4 != 0) goto L7e
            return
        L7e:
            ae.r.c(r1)
            ae.r.c(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L89:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.b.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f15295a) {
            int i10 = this.f15303i;
            int i11 = this.f15304j + i10;
            str = "LruCache[maxSize=" + this.f15299e + ",hits=" + this.f15303i + ",misses=" + this.f15304j + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
        }
        return str;
    }
}
