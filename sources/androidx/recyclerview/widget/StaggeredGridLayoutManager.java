package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p3.g;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.n {
    private boolean D;
    private boolean E;
    private e F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    f[] f4715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    h f4716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    h f4717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f4718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f4719v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BitSet f4722y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f4714q = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f4720w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f4721x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f4723z = -1;
    int A = Integer.MIN_VALUE;
    d B = new d();
    private int C = 2;
    private final Rect G = new Rect();
    private final b H = new b();
    private boolean I = false;
    private boolean J = true;
    private final Runnable K = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.I0();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f4729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f4730f;

        b() {
            a();
        }

        void a() {
            this.f4725a = -1;
            this.f4726b = Integer.MIN_VALUE;
            this.f4727c = false;
            this.f4728d = false;
            this.f4729e = false;
            int[] iArr = this.f4730f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.o {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f4732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f4733f;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int b() {
            f fVar = this.f4732e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f4754e;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f4734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<a> f4735b;

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0109a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f4736a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f4737b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f4738c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f4739d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C0109a implements Parcelable.Creator<a> {
                C0109a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f4736a = parcel.readInt();
                this.f4737b = parcel.readInt();
                this.f4739d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f4738c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f4738c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4736a + ", mGapDir=" + this.f4737b + ", mHasUnwantedGapAfter=" + this.f4739d + ", mGapPerSpan=" + Arrays.toString(this.f4738c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4736a);
                parcel.writeInt(this.f4737b);
                parcel.writeInt(this.f4739d ? 1 : 0);
                int[] iArr = this.f4738c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4738c);
                }
            }
        }

        d() {
        }

        private int g(int i10) {
            if (this.f4735b == null) {
                return -1;
            }
            a aVarE = e(i10);
            if (aVarE != null) {
                this.f4735b.remove(aVarE);
            }
            int size = this.f4735b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f4735b.get(i11).f4736a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = this.f4735b.get(i11);
            this.f4735b.remove(i11);
            return aVar.f4736a;
        }

        private void j(int i10, int i11) {
            List<a> list = this.f4735b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4735b.get(size);
                int i12 = aVar.f4736a;
                if (i12 >= i10) {
                    aVar.f4736a = i12 + i11;
                }
            }
        }

        private void k(int i10, int i11) {
            List<a> list = this.f4735b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4735b.get(size);
                int i13 = aVar.f4736a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f4735b.remove(size);
                    } else {
                        aVar.f4736a = i13 - i11;
                    }
                }
            }
        }

        void a() {
            int[] iArr = this.f4734a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4735b = null;
        }

        void b(int i10) {
            int[] iArr = this.f4734a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f4734a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[l(i10)];
                this.f4734a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4734a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int c(int i10) {
            List<a> list = this.f4735b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4735b.get(size).f4736a >= i10) {
                        this.f4735b.remove(size);
                    }
                }
            }
            return f(i10);
        }

        public a d(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f4735b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f4735b.get(i13);
                int i14 = aVar.f4736a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f4737b == i12 || (z10 && aVar.f4739d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a e(int i10) {
            List<a> list = this.f4735b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4735b.get(size);
                if (aVar.f4736a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int f(int i10) {
            int[] iArr = this.f4734a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int iG = g(i10);
            if (iG == -1) {
                int[] iArr2 = this.f4734a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f4734a.length;
            }
            int i11 = iG + 1;
            Arrays.fill(this.f4734a, i10, i11, -1);
            return i11;
        }

        void h(int i10, int i11) {
            int[] iArr = this.f4734a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f4734a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f4734a, i10, i12, -1);
            j(i10, i11);
        }

        void i(int i10, int i11) {
            int[] iArr = this.f4734a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f4734a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f4734a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            k(i10, i11);
        }

        int l(int i10) {
            int length = this.f4734a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f4743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f4745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<d.a> f4746g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f4747h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f4748i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f4749j;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f4740a = parcel.readInt();
            this.f4741b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f4742c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f4743d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f4744e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f4745f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4747h = parcel.readInt() == 1;
            this.f4748i = parcel.readInt() == 1;
            this.f4749j = parcel.readInt() == 1;
            this.f4746g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f4742c = eVar.f4742c;
            this.f4740a = eVar.f4740a;
            this.f4741b = eVar.f4741b;
            this.f4743d = eVar.f4743d;
            this.f4744e = eVar.f4744e;
            this.f4745f = eVar.f4745f;
            this.f4747h = eVar.f4747h;
            this.f4748i = eVar.f4748i;
            this.f4749j = eVar.f4749j;
            this.f4746g = eVar.f4746g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4740a);
            parcel.writeInt(this.f4741b);
            parcel.writeInt(this.f4742c);
            if (this.f4742c > 0) {
                parcel.writeIntArray(this.f4743d);
            }
            parcel.writeInt(this.f4744e);
            if (this.f4744e > 0) {
                parcel.writeIntArray(this.f4745f);
            }
            parcel.writeInt(this.f4747h ? 1 : 0);
            parcel.writeInt(this.f4748i ? 1 : 0);
            parcel.writeInt(this.f4749j ? 1 : 0);
            parcel.writeList(this.f4746g);
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<View> f4750a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4751b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4752c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4753d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f4754e;

        f(int i10) {
            this.f4754e = i10;
        }

        void a() {
            d.a aVarE;
            ArrayList<View> arrayList = this.f4750a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarF = f(view);
            this.f4752c = StaggeredGridLayoutManager.this.f4716s.d(view);
            if (cVarF.f4733f && (aVarE = StaggeredGridLayoutManager.this.B.e(cVarF.a())) != null && aVarE.f4737b == 1) {
                this.f4752c += aVarE.a(this.f4754e);
            }
        }

        void b() {
            d.a aVarE;
            View view = this.f4750a.get(0);
            c cVarF = f(view);
            this.f4751b = StaggeredGridLayoutManager.this.f4716s.e(view);
            if (cVarF.f4733f && (aVarE = StaggeredGridLayoutManager.this.B.e(cVarF.a())) != null && aVarE.f4737b == -1) {
                this.f4751b -= aVarE.a(this.f4754e);
            }
        }

        void c() {
            this.f4750a.clear();
            i();
            this.f4753d = 0;
        }

        int d() {
            int i10 = this.f4752c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            a();
            return this.f4752c;
        }

        int e(int i10) {
            int i11 = this.f4752c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4750a.size() == 0) {
                return i10;
            }
            a();
            return this.f4752c;
        }

        c f(View view) {
            return (c) view.getLayoutParams();
        }

        int g() {
            int i10 = this.f4751b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            b();
            return this.f4751b;
        }

        int h(int i10) {
            int i11 = this.f4751b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4750a.size() == 0) {
                return i10;
            }
            b();
            return this.f4751b;
        }

        void i() {
            this.f4751b = Integer.MIN_VALUE;
            this.f4752c = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.n.c cVarJ = RecyclerView.n.J(context, attributeSet, i10, i11);
        X0(cVarJ.f4678a);
        Z0(cVarJ.f4679b);
        Y0(cVarJ.f4680c);
        this.f4719v = new androidx.recyclerview.widget.f();
        N0();
    }

    private boolean J0(f fVar) {
        if (this.f4721x) {
            if (fVar.d() < this.f4716s.f()) {
                ArrayList<View> arrayList = fVar.f4750a;
                return !fVar.f(arrayList.get(arrayList.size() - 1)).f4733f;
            }
        } else if (fVar.g() > this.f4716s.g()) {
            return !fVar.f(fVar.f4750a.get(0)).f4733f;
        }
        return false;
    }

    private int K0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        return j.a(yVar, this.f4716s, P0(!this.J), O0(!this.J), this, this.J);
    }

    private int L0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        return j.b(yVar, this.f4716s, P0(!this.J), O0(!this.J), this, this.J, this.f4721x);
    }

    private int M0(RecyclerView.y yVar) {
        if (t() == 0) {
            return 0;
        }
        return j.c(yVar, this.f4716s, P0(!this.J), O0(!this.J), this, this.J);
    }

    private void N0() {
        this.f4716s = h.b(this, this.f4718u);
        this.f4717t = h.b(this, 1 - this.f4718u);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void T0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4721x
            if (r0 == 0) goto L9
            int r0 = r6.S0()
            goto Ld
        L9:
            int r0 = r6.R0()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.B
            r4.f(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.i(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.B
            r7.h(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.i(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.h(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f4721x
            if (r7 == 0) goto L4d
            int r7 = r6.R0()
            goto L51
        L4d:
            int r7 = r6.S0()
        L51:
            if (r3 > r7) goto L56
            r6.D0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean H0() {
        return this.F == null;
    }

    boolean I0() {
        int iR0;
        int iS0;
        if (t() == 0 || this.C == 0 || !P()) {
            return false;
        }
        if (this.f4721x) {
            iR0 = S0();
            iS0 = R0();
        } else {
            iR0 = R0();
            iS0 = S0();
        }
        if (iR0 == 0 && U0() != null) {
            this.B.a();
        } else {
            if (!this.I) {
                return false;
            }
            int i10 = this.f4721x ? -1 : 1;
            int i11 = iS0 + 1;
            d.a aVarD = this.B.d(iR0, i11, i10, true);
            if (aVarD == null) {
                this.I = false;
                this.B.c(i11);
                return false;
            }
            d.a aVarD2 = this.B.d(iR0, aVarD.f4736a, i10 * (-1), true);
            if (aVarD2 == null) {
                this.B.c(aVarD.f4736a);
            } else {
                this.B.c(aVarD2.f4736a + 1);
            }
        }
        E0();
        D0();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int L(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.f4718u == 0 ? this.f4714q : super.L(uVar, yVar);
    }

    View O0(boolean z10) {
        int iG = this.f4716s.g();
        int iF = this.f4716s.f();
        View view = null;
        for (int iT = t() - 1; iT >= 0; iT--) {
            View viewS = s(iT);
            int iE = this.f4716s.e(viewS);
            int iD = this.f4716s.d(viewS);
            if (iD > iG && iE < iF) {
                if (iD <= iF || !z10) {
                    return viewS;
                }
                if (view == null) {
                    view = viewS;
                }
            }
        }
        return view;
    }

    View P0(boolean z10) {
        int iG = this.f4716s.g();
        int iF = this.f4716s.f();
        int iT = t();
        View view = null;
        for (int i10 = 0; i10 < iT; i10++) {
            View viewS = s(i10);
            int iE = this.f4716s.e(viewS);
            if (this.f4716s.d(viewS) > iG && iE < iF) {
                if (iE >= iG || !z10) {
                    return viewS;
                }
                if (view == null) {
                    view = viewS;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean Q() {
        return this.C != 0;
    }

    int Q0() {
        View viewO0 = this.f4721x ? O0(true) : P0(true);
        if (viewO0 == null) {
            return -1;
        }
        return I(viewO0);
    }

    int R0() {
        if (t() == 0) {
            return 0;
        }
        return I(s(0));
    }

    int S0() {
        int iT = t();
        if (iT == 0) {
            return 0;
        }
        return I(s(iT - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View U0() {
        /*
            r12 = this;
            int r0 = r12.t()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4714q
            r2.<init>(r3)
            int r3 = r12.f4714q
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4718u
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.W0()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f4721x
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.s(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4732e
            int r9 = r9.f4754e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4732e
            boolean r9 = r12.J0(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4732e
            int r9 = r9.f4754e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4733f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.s(r9)
            boolean r10 = r12.f4721x
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.h r10 = r12.f4716s
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.h r11 = r12.f4716s
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.h r10 = r12.f4716s
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.h r11 = r12.f4716s
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4732e
            int r8 = r8.f4754e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4732e
            int r9 = r9.f4754e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0():android.view.View");
    }

    public void V0() {
        this.B.a();
        D0();
    }

    boolean W0() {
        return C() == 1;
    }

    public void X0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i10 == this.f4718u) {
            return;
        }
        this.f4718u = i10;
        h hVar = this.f4716s;
        this.f4716s = this.f4717t;
        this.f4717t = hVar;
        D0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Y(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.Y(recyclerView, uVar);
        z0(this.K);
        for (int i10 = 0; i10 < this.f4714q; i10++) {
            this.f4715r[i10].c();
        }
        recyclerView.requestLayout();
    }

    public void Y0(boolean z10) {
        a(null);
        e eVar = this.F;
        if (eVar != null && eVar.f4747h != z10) {
            eVar.f4747h = z10;
        }
        this.f4720w = z10;
        D0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            View viewP0 = P0(false);
            View viewO0 = O0(false);
            if (viewP0 == null || viewO0 == null) {
                return;
            }
            int I = I(viewP0);
            int I2 = I(viewO0);
            if (I < I2) {
                accessibilityEvent.setFromIndex(I);
                accessibilityEvent.setToIndex(I2);
            } else {
                accessibilityEvent.setFromIndex(I2);
                accessibilityEvent.setToIndex(I);
            }
        }
    }

    public void Z0(int i10) {
        a(null);
        if (i10 != this.f4714q) {
            V0();
            this.f4714q = i10;
            this.f4722y = new BitSet(this.f4714q);
            this.f4715r = new f[this.f4714q];
            for (int i11 = 0; i11 < this.f4714q; i11++) {
                this.f4715r[i11] = new f(i11);
            }
            D0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void a(String str) {
        if (this.F == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b() {
        return this.f4718u == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c() {
        return this.f4718u == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e0(RecyclerView.u uVar, RecyclerView.y yVar, View view, p3.g gVar) {
        int iB;
        int i10;
        int iB2;
        boolean z10;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.d0(view, gVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f4718u == 0) {
            iB = cVar.b();
            z10 = cVar.f4733f;
            i10 = z10 ? this.f4714q : 1;
            iB2 = -1;
            i11 = -1;
        } else {
            iB = -1;
            i10 = -1;
            iB2 = cVar.b();
            z10 = cVar.f4733f;
            i11 = z10 ? this.f4714q : 1;
        }
        gVar.h0(g.f.a(iB, i10, iB2, i11, z10, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int f(RecyclerView.y yVar) {
        return K0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int g(RecyclerView.y yVar) {
        return L0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g0(RecyclerView recyclerView, int i10, int i11) {
        T0(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int h(RecyclerView.y yVar) {
        return M0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void h0(RecyclerView recyclerView) {
        this.B.a();
        D0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int i(RecyclerView.y yVar) {
        return K0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        T0(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int j(RecyclerView.y yVar) {
        return L0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void j0(RecyclerView recyclerView, int i10, int i11) {
        T0(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int k(RecyclerView.y yVar) {
        return M0(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        T0(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return this.f4718u == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o o(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void p0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.F = (e) parcelable;
            D0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public Parcelable q0() {
        int iH;
        int iG;
        int[] iArr;
        if (this.F != null) {
            return new e(this.F);
        }
        e eVar = new e();
        eVar.f4747h = this.f4720w;
        eVar.f4748i = this.D;
        eVar.f4749j = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f4734a) == null) {
            eVar.f4744e = 0;
        } else {
            eVar.f4745f = iArr;
            eVar.f4744e = iArr.length;
            eVar.f4746g = dVar.f4735b;
        }
        if (t() > 0) {
            eVar.f4740a = this.D ? S0() : R0();
            eVar.f4741b = Q0();
            int i10 = this.f4714q;
            eVar.f4742c = i10;
            eVar.f4743d = new int[i10];
            for (int i11 = 0; i11 < this.f4714q; i11++) {
                if (this.D) {
                    iH = this.f4715r[i11].e(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iG = this.f4716s.f();
                        iH -= iG;
                    }
                } else {
                    iH = this.f4715r[i11].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iG = this.f4716s.g();
                        iH -= iG;
                    }
                }
                eVar.f4743d[i11] = iH;
            }
        } else {
            eVar.f4740a = -1;
            eVar.f4741b = -1;
            eVar.f4742c = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void r0(int i10) {
        if (i10 == 0) {
            I0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int v(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.f4718u == 1 ? this.f4714q : super.v(uVar, yVar);
    }
}
