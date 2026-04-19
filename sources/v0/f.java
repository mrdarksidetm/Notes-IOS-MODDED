package v0;

import ae.r;
import z.u;
import z.v;
import z.z;

/* JADX INFO: loaded from: classes.dex */
public final class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u<Object, Object> f21882a = z.b();

    public final void a(Object obj, T t10) {
        u<Object, Object> uVar = this.f21882a;
        int iJ = uVar.j(obj);
        boolean z10 = iJ < 0;
        Object obj2 = z10 ? null : uVar.f24114c[iJ];
        if (obj2 != null) {
            if (obj2 instanceof v) {
                r.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((v) obj2).g(t10);
            } else if (obj2 != t10) {
                v vVar = new v(0, 1, null);
                r.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                vVar.g(obj2);
                vVar.g(t10);
                t10 = (T) vVar;
            }
            t10 = (T) obj2;
        }
        if (!z10) {
            uVar.f24114c[iJ] = t10;
            return;
        }
        int i10 = ~iJ;
        uVar.f24113b[i10] = obj;
        uVar.f24114c[i10] = t10;
    }

    public final void b() {
        this.f21882a.h();
    }

    public final boolean c(Object obj) {
        return this.f21882a.a(obj);
    }

    public final u<Object, Object> d() {
        return this.f21882a;
    }

    public final boolean e(Object obj, T t10) {
        Object objB = this.f21882a.b(obj);
        if (objB == null) {
            return false;
        }
        if (!(objB instanceof v)) {
            if (!r.b(objB, t10)) {
                return false;
            }
            this.f21882a.n(obj);
            return true;
        }
        v vVar = (v) objB;
        boolean zP = vVar.p(t10);
        if (zP && vVar.d()) {
            this.f21882a.n(obj);
        }
        return zP;
    }

    public final void f(T t10) {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        long j10;
        int i14;
        int i15;
        u<Object, Object> uVarD = d();
        long[] jArr3 = uVarD.f24112a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j11 = jArr3[i16];
            char c10 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    boolean zD = true;
                    if ((j11 & 255) < 128) {
                        int i20 = (i16 << 3) + i19;
                        Object obj = uVarD.f24113b[i20];
                        Object obj2 = uVarD.f24114c[i20];
                        if (obj2 instanceof v) {
                            r.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                            v vVar = (v) obj2;
                            Object[] objArr = vVar.f24051b;
                            long[] jArr4 = vVar.f24050a;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            i11 = length;
                            if (length2 >= 0) {
                                int i21 = 0;
                                while (true) {
                                    long j13 = jArr4[i21];
                                    i13 = i18;
                                    long[] jArr5 = jArr4;
                                    j10 = -9187201950435737472L;
                                    if ((((~j13) << c10) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                        int i23 = 0;
                                        while (i23 < i22) {
                                            if ((j13 & 255) < 128) {
                                                int i24 = (i21 << 3) + i23;
                                                i15 = i16;
                                                if (objArr[i24] == t10) {
                                                    vVar.q(i24);
                                                }
                                            } else {
                                                i15 = i16;
                                            }
                                            j13 >>= 8;
                                            i23++;
                                            i16 = i15;
                                        }
                                        i12 = i16;
                                        if (i22 != 8) {
                                            break;
                                        }
                                    } else {
                                        i12 = i16;
                                    }
                                    if (i21 == length2) {
                                        break;
                                    }
                                    i21++;
                                    i18 = i13;
                                    jArr4 = jArr5;
                                    i16 = i12;
                                    c10 = 7;
                                }
                            } else {
                                i12 = i16;
                                i13 = i18;
                                j10 = -9187201950435737472L;
                            }
                            zD = vVar.d();
                        } else {
                            jArr2 = jArr3;
                            i11 = length;
                            i12 = i16;
                            i13 = i18;
                            j10 = j12;
                            r.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                            if (obj2 != t10) {
                                zD = false;
                            }
                        }
                        if (zD) {
                            uVarD.o(i20);
                        }
                        i14 = 8;
                    } else {
                        jArr2 = jArr3;
                        i11 = length;
                        i12 = i16;
                        i13 = i18;
                        j10 = j12;
                        i14 = i17;
                    }
                    j11 >>= i14;
                    i19++;
                    i17 = i14;
                    j12 = j10;
                    jArr3 = jArr2;
                    length = i11;
                    i18 = i13;
                    i16 = i12;
                    c10 = 7;
                }
                jArr = jArr3;
                int i25 = length;
                int i26 = i16;
                if (i18 != i17) {
                    return;
                }
                length = i25;
                i10 = i26;
            } else {
                jArr = jArr3;
                i10 = i16;
            }
            if (i10 == length) {
                return;
            }
            i16 = i10 + 1;
            jArr3 = jArr;
        }
    }
}
