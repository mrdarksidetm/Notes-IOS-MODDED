package androidx.compose.ui.input.pointer;

import a2.r0;
import ae.j;
import ae.r;
import java.util.Arrays;
import md.i0;
import qd.d;
import v1.k0;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends r0<v1.r0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f2816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object[] f2817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p<k0, d<? super i0>, Object> f2818e;

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p<? super k0, ? super d<? super i0>, ? extends Object> pVar) {
        this.f2815b = obj;
        this.f2816c = obj2;
        this.f2817d = objArr;
        this.f2818e = pVar;
    }

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p pVar, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!r.b(this.f2815b, suspendPointerInputElement.f2815b) || !r.b(this.f2816c, suspendPointerInputElement.f2816c)) {
            return false;
        }
        Object[] objArr = this.f2817d;
        Object[] objArr2 = suspendPointerInputElement.f2817d;
        if (objArr != null) {
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (objArr2 != null) {
            return false;
        }
        return true;
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public v1.r0 a() {
        return new v1.r0(this.f2818e);
    }

    @Override // a2.r0
    public int hashCode() {
        Object obj = this.f2815b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f2816c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f2817d;
        return iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }

    @Override // a2.r0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void c(v1.r0 r0Var) {
        r0Var.f2(this.f2818e);
    }
}
