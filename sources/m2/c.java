package m2;

import ae.j;
import ae.r;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import nd.o;

/* JADX INFO: loaded from: classes.dex */
public final class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f15305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f15306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15307c;

    public c() {
        this(0, 1, null);
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f15305a = a.f15293a;
            this.f15306b = a.f15294b;
        } else {
            this.f15305a = new int[i10];
            this.f15306b = new Object[i10 << 1];
        }
        this.f15307c = 0;
    }

    public /* synthetic */ c(int i10, int i11, j jVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public final boolean a(K k10) {
        return d(k10) >= 0;
    }

    public final V b(K k10) {
        int iD = d(k10);
        if (iD >= 0) {
            return (V) this.f15306b[(iD << 1) + 1];
        }
        return null;
    }

    protected final int c(Object obj, int i10) {
        int i11 = this.f15307c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.f15305a, i11, i10);
        if (iA < 0 || r.b(obj, this.f15306b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f15305a[i12] == i10) {
            if (r.b(obj, this.f15306b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f15305a[i13] == i10; i13--) {
            if (r.b(obj, this.f15306b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    protected final int e() {
        int i10 = this.f15307c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.f15305a, i10, 0);
        if (iA < 0 || this.f15306b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f15305a[i11] == 0) {
            if (this.f15306b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f15305a[i12] == 0; i12--) {
            if (this.f15306b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f15307c;
                if (i10 != cVar.f15307c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    K kG = g(i11);
                    V vI = i(i11);
                    Object objB = cVar.b(kG);
                    if (vI == null) {
                        if (objB != null || !cVar.a(kG)) {
                            return false;
                        }
                    } else if (!r.b(vI, objB)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f15307c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f15307c;
            for (int i13 = 0; i13 < i12; i13++) {
                K kG2 = g(i13);
                V vI2 = i(i13);
                Object obj2 = ((Map) obj).get(kG2);
                if (vI2 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(kG2)) {
                        return false;
                    }
                } else if (!r.b(vI2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f15307c <= 0;
    }

    public final K g(int i10) {
        return (K) this.f15306b[i10 << 1];
    }

    public final V h(K k10, V v10) {
        int iHashCode;
        int iC;
        int i10 = this.f15307c;
        if (k10 == null) {
            iHashCode = 0;
            iC = e();
        } else {
            iHashCode = k10.hashCode();
            iC = c(k10, iHashCode);
        }
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f15306b;
            V v11 = (V) objArr[i11];
            objArr[i11] = v10;
            return v11;
        }
        int i12 = ~iC;
        int[] iArr = this.f15305a;
        if (i10 >= iArr.length) {
            int i13 = 4;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i13 = 8;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f15305a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15306b, i13 << 1);
            r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15306b = objArrCopyOf;
            if (i10 != this.f15307c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f15305a;
            int i14 = i12 + 1;
            o.f(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f15306b;
            o.h(objArr2, objArr2, i14 << 1, i12 << 1, this.f15307c << 1);
        }
        int i15 = this.f15307c;
        if (i10 == i15) {
            int[] iArr3 = this.f15305a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f15306b;
                int i16 = i12 << 1;
                objArr3[i16] = k10;
                objArr3[i16 + 1] = v10;
                this.f15307c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.f15305a;
        Object[] objArr = this.f15306b;
        int i10 = this.f15307c;
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

    public final V i(int i10) {
        return (V) this.f15306b[(i10 << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f15307c * 28);
        sb2.append('{');
        int i10 = this.f15307c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kG = g(i11);
            if (kG != this) {
                sb2.append(kG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vI = i(i11);
            if (vI != this) {
                sb2.append(vI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
