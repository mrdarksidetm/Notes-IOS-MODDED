package o3;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f16309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f16310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f16311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f16313e;

    public d0(View view) {
        this.f16311c = view;
    }

    private boolean h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentI;
        int i15;
        int i16;
        int[] iArr3;
        if (!m() || (viewParentI = i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f16311c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrJ = j();
            iArrJ[0] = 0;
            iArrJ[1] = 0;
            iArr3 = iArrJ;
        } else {
            iArr3 = iArr2;
        }
        androidx.core.view.k.d(viewParentI, this.f16311c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f16311c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent i(int i10) {
        if (i10 == 0) {
            return this.f16309a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f16310b;
    }

    private int[] j() {
        if (this.f16313e == null) {
            this.f16313e = new int[2];
        }
        return this.f16313e;
    }

    private void o(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f16309a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f16310b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return androidx.core.view.k.a(viewParentI, this.f16311c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return androidx.core.view.k.b(viewParentI, this.f16311c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentI;
        int i13;
        int i14;
        if (!m() || (viewParentI = i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f16311c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        androidx.core.view.k.c(viewParentI, this.f16311c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f16311c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i10) {
        return i(i10) != null;
    }

    public boolean m() {
        return this.f16312d;
    }

    public void n(boolean z10) {
        if (this.f16312d) {
            androidx.core.view.h.p0(this.f16311c);
        }
        this.f16312d = z10;
    }

    public boolean p(int i10) {
        return q(i10, 0);
    }

    public boolean q(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f16311c;
        for (ViewParent parent = this.f16311c.getParent(); parent != null; parent = parent.getParent()) {
            if (androidx.core.view.k.f(parent, view, this.f16311c, i10, i11)) {
                o(i11, parent);
                androidx.core.view.k.e(parent, view, this.f16311c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i10) {
        ViewParent viewParentI = i(i10);
        if (viewParentI != null) {
            androidx.core.view.k.g(viewParentI, this.f16311c, i10);
            o(i10, null);
        }
    }
}
