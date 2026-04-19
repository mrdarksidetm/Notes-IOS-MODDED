package androidx.collection;

import a0.b;
import a0.c;
import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final b lock;
    private final c<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public a(int i10) {
        this.maxSize = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.map = new c<>(0, 0.75f);
        this.lock = new b();
    }

    private final int safeSizeOf(K k10, V v10) {
        int iSizeOf = sizeOf(k10, v10);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k10 + '=' + v10).toString());
    }

    protected V create(K k10) {
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    protected void entryRemoved(boolean z10, K k10, V v10, V v11) {
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(v10, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V get(K k10) {
        V v10;
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        synchronized (this.lock) {
            V vA = this.map.a(k10);
            if (vA != null) {
                this.hitCount++;
                return vA;
            }
            this.missCount++;
            V vCreate = create(k10);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                v10 = (V) this.map.d(k10, vCreate);
                if (v10 != null) {
                    this.map.d(k10, v10);
                } else {
                    this.size += safeSizeOf(k10, vCreate);
                    i0 i0Var = i0.f15558a;
                }
            }
            if (v10 != null) {
                entryRemoved(false, k10, vCreate, v10);
                return v10;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    public final V put(K k10, V v10) {
        V vD;
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(v10, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(k10, v10);
            vD = this.map.d(k10, v10);
            if (vD != null) {
                this.size -= safeSizeOf(k10, vD);
            }
            i0 i0Var = i0.f15558a;
        }
        if (vD != null) {
            entryRemoved(false, k10, vD, v10);
        }
        trimToSize(this.maxSize);
        return vD;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    public final V remove(K k10) {
        V vE;
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        synchronized (this.lock) {
            vE = this.map.e(k10);
            if (vE != null) {
                this.size -= safeSizeOf(k10, vE);
            }
            i0 i0Var = i0.f15558a;
        }
        if (vE != null) {
            entryRemoved(false, k10, vE, null);
        }
        return vE;
    }

    public void resize(int i10) {
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.lock) {
            this.maxSize = i10;
            i0 i0Var = i0.f15558a;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    protected int sizeOf(K k10, V v10) {
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(v10, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Iterator<T> it = this.map.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            i0 i0Var = i0.f15558a;
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            int i10 = this.hitCount;
            int i11 = this.missCount + i10;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            a0.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L65
            r2 = 1
            if (r1 < 0) goto L16
            a0.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L14
            int r1 = r6.size     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L16
        L14:
            r1 = r2
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L59
            int r1 = r6.size     // Catch: java.lang.Throwable -> L65
            if (r1 <= r7) goto L57
            a0.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L65
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L26
            goto L57
        L26:
            a0.c<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L65
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = nd.s.Z(r1)     // Catch: java.lang.Throwable -> L65
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L36
            monitor-exit(r0)
            return
        L36:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L65
            a0.c<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L65
            r4.e(r3)     // Catch: java.lang.Throwable -> L65
            int r4 = r6.size     // Catch: java.lang.Throwable -> L65
            int r5 = r6.safeSizeOf(r3, r1)     // Catch: java.lang.Throwable -> L65
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L65
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L65
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)
            r0 = 0
            r6.entryRemoved(r2, r3, r1, r0)
            goto L0
        L57:
            monitor-exit(r0)
            return
        L59:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L65
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L65
            throw r1     // Catch: java.lang.Throwable -> L65
        L65:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.a.trimToSize(int):void");
    }
}
