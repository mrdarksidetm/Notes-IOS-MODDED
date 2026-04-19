package z;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f24060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f24061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24062c;

    public c0() {
        this(0, 1, null);
    }

    public c0(int i10) {
        this.f24060a = i10 == 0 ? a0.a.f14a : new int[i10];
        this.f24061b = i10 == 0 ? a0.a.f16c : new Object[i10 << 1];
    }

    public /* synthetic */ c0(int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public c0(c0<? extends K, ? extends V> c0Var) {
        this(0, 1, null);
        if (c0Var != null) {
            h(c0Var);
        }
    }

    private final int d(K k10, int i10) {
        int i11 = this.f24062c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a0.a.a(this.f24060a, i11, i10);
        if (iA < 0 || ae.r.b(k10, this.f24061b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f24060a[i12] == i10) {
            if (ae.r.b(k10, this.f24061b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f24060a[i13] == i10; i13--) {
            if (ae.r.b(k10, this.f24061b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int f() {
        int i10 = this.f24062c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a0.a.a(this.f24060a, i10, 0);
        if (iA < 0 || this.f24061b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f24060a[i11] == 0) {
            if (this.f24061b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f24060a[i12] == 0; i12--) {
            if (this.f24061b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(V v10) {
        int i10 = this.f24062c * 2;
        Object[] objArr = this.f24061b;
        if (v10 == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (ae.r.b(v10, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void c(int i10) {
        int i11 = this.f24062c;
        int[] iArr = this.f24060a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f24060a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24061b, i10 * 2);
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f24061b = objArrCopyOf;
        }
        if (this.f24062c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f24062c > 0) {
            this.f24060a = a0.a.f14a;
            this.f24061b = a0.a.f16c;
            this.f24062c = 0;
        }
        if (this.f24062c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k10) {
        return e(k10) >= 0;
    }

    public boolean containsValue(V v10) {
        return a(v10) >= 0;
    }

    public int e(K k10) {
        return k10 == null ? f() : d(k10, k10.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c0) {
                if (size() != ((c0) obj).size()) {
                    return false;
                }
                c0 c0Var = (c0) obj;
                int i10 = this.f24062c;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kG = g(i11);
                    V vL = l(i11);
                    Object obj2 = c0Var.get(kG);
                    if (vL == null) {
                        if (obj2 != null || !c0Var.containsKey(kG)) {
                            return false;
                        }
                    } else if (!ae.r.b(vL, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f24062c;
            for (int i13 = 0; i13 < i12; i13++) {
                K kG2 = g(i13);
                V vL2 = l(i13);
                Object obj3 = ((Map) obj).get(kG2);
                if (vL2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!ae.r.b(vL2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public K g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24062c) {
            z10 = true;
        }
        if (z10) {
            return (K) this.f24061b[i10 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public V get(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return (V) this.f24061b[(iE << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v10) {
        int iE = e(obj);
        return iE >= 0 ? (V) this.f24061b[(iE << 1) + 1] : v10;
    }

    public void h(c0<? extends K, ? extends V> c0Var) {
        ae.r.f(c0Var, "map");
        int i10 = c0Var.f24062c;
        c(this.f24062c + i10);
        if (this.f24062c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(c0Var.g(i11), c0Var.l(i11));
            }
        } else if (i10 > 0) {
            nd.o.f(c0Var.f24060a, this.f24060a, 0, 0, i10);
            nd.o.h(c0Var.f24061b, this.f24061b, 0, 0, i10 << 1);
            this.f24062c = i10;
        }
    }

    public int hashCode() {
        int[] iArr = this.f24060a;
        Object[] objArr = this.f24061b;
        int i10 = this.f24062c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public V i(int i10) {
        if (!(i10 >= 0 && i10 < this.f24062c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        Object[] objArr = this.f24061b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f24062c;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f24060a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    int i15 = i13 + 1;
                    nd.o.f(iArr, iArr, i10, i14, i15);
                    Object[] objArr2 = this.f24061b;
                    nd.o.h(objArr2, objArr2, i11, i14 << 1, i15 << 1);
                }
                Object[] objArr3 = this.f24061b;
                int i16 = i13 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            } else {
                int i17 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i17);
                ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
                this.f24060a = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f24061b, i17 << 1);
                ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
                this.f24061b = objArrCopyOf;
                if (i12 != this.f24062c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    nd.o.f(iArr, this.f24060a, 0, 0, i10);
                    nd.o.h(objArr, this.f24061b, 0, 0, i11);
                }
                if (i10 < i13) {
                    int i18 = i10 + 1;
                    int i19 = i13 + 1;
                    nd.o.f(iArr, this.f24060a, i10, i18, i19);
                    nd.o.h(objArr, this.f24061b, i11, i18 << 1, i19 << 1);
                }
            }
            if (i12 != this.f24062c) {
                throw new ConcurrentModificationException();
            }
            this.f24062c = i13;
        }
        return v10;
    }

    public boolean isEmpty() {
        return this.f24062c <= 0;
    }

    public V j(int i10, V v10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24062c) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f24061b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V l(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24062c) {
            z10 = true;
        }
        if (z10) {
            return (V) this.f24061b[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public V put(K k10, V v10) {
        int i10 = this.f24062c;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        int iD = k10 != null ? d(k10, iHashCode) : f();
        if (iD >= 0) {
            int i11 = (iD << 1) + 1;
            Object[] objArr = this.f24061b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iD;
        int[] iArr = this.f24060a;
        if (i10 >= iArr.length) {
            int i13 = 4;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i13 = 8;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f24060a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24061b, i13 << 1);
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f24061b = objArrCopyOf;
            if (i10 != this.f24062c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f24060a;
            int i14 = i12 + 1;
            nd.o.f(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f24061b;
            nd.o.h(objArr2, objArr2, i14 << 1, i12 << 1, this.f24062c << 1);
        }
        int i15 = this.f24062c;
        if (i10 == i15) {
            int[] iArr3 = this.f24060a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f24061b;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f24062c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(K k10) {
        int iE = e(k10);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public boolean remove(K k10, V v10) {
        int iE = e(k10);
        if (iE < 0 || !ae.r.b(v10, l(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    public V replace(K k10, V v10) {
        int iE = e(k10);
        if (iE >= 0) {
            return j(iE, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int iE = e(k10);
        if (iE < 0 || !ae.r.b(v10, l(iE))) {
            return false;
        }
        j(iE, v11);
        return true;
    }

    public int size() {
        return this.f24062c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24062c * 28);
        sb2.append('{');
        int i10 = this.f24062c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kG = g(i11);
            if (kG != sb2) {
                sb2.append(kG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vL = l(i11);
            if (vL != sb2) {
                sb2.append(vL);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        ae.r.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
