package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import com.google.android.gms.common.api.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o3.c0;
import o3.d0;
import p3.g;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    private static final int[] L0 = {R.attr.nestedScrollingEnabled};
    private static final int[] M0 = {R.attr.clipToPadding};
    static final boolean N0 = false;
    static final boolean O0 = true;
    static final boolean P0 = true;
    static final boolean Q0 = true;
    private static final boolean R0 = false;
    private static final boolean S0 = false;
    private static final Class<?>[] T0;
    static final Interpolator U0;
    private final AccessibilityManager A;
    androidx.recyclerview.widget.i A0;
    private List<p> B;
    private i B0;
    boolean C;
    private final int[] C0;
    boolean D;
    private d0 D0;
    private int E;
    private final int[] E0;
    private int F;
    final int[] F0;
    private j G;
    private final int[] G0;
    private EdgeEffect H;
    final int[] H0;
    private EdgeEffect I;
    final List<b0> I0;
    private Runnable J0;
    private final m.b K0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f4566a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private EdgeEffect f4567a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final u f4568b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private EdgeEffect f4569b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f4570c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    k f4571c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.recyclerview.widget.a f4572d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f4573d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.b f4574e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f4575e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.recyclerview.widget.m f4576f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private VelocityTracker f4577f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f4578g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f4579g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Runnable f4580h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f4581h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Rect f4582i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f4583i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f4584j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f4585j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final RectF f4586k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f4587k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    n f4588l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final int f4589l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    v f4590m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final int f4591m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ArrayList<m> f4592n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f4593n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList<r> f4594o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f4595o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r f4596p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f4597p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f4598q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    final a0 f4599q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f4600r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    androidx.recyclerview.widget.e f4601r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f4602s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    e.b f4603s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f4604t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    final y f4605t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f4606u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private s f4607u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f4608v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private List<s> f4609v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f4610w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    boolean f4611w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4612x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    boolean f4613x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f4614y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private k.b f4615y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f4616z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    boolean f4617z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4604t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f4598q) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4610w) {
                recyclerView2.f4608v = true;
            } else {
                recyclerView2.l();
            }
        }
    }

    class a0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f4621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f4622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4624f;

        a0() {
            Interpolator interpolator = RecyclerView.U0;
            this.f4622d = interpolator;
            this.f4623e = false;
            this.f4624f = false;
            this.f4621c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11, int i12, int i13) {
            int iRound;
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i12 * i12) + (i13 * i13));
            int iSqrt2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i14 = width / 2;
            float f10 = width;
            float f11 = i14;
            float fC = f11 + (c(Math.min(1.0f, (iSqrt2 * 1.0f) / f10)) * f11);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fC / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f10) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private void b() {
            this.f4624f = false;
            this.f4623e = true;
        }

        private float c(float f10) {
            return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
        }

        private void d() {
            this.f4623e = false;
            if (this.f4624f) {
                f();
            }
        }

        public void e(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f4620b = 0;
            this.f4619a = 0;
            this.f4621c.fling(0, 0, i10, i11, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
            f();
        }

        void f() {
            if (this.f4623e) {
                this.f4624f = true;
            } else {
                RecyclerView.this.removeCallbacks(this);
                androidx.core.view.h.R(RecyclerView.this, this);
            }
        }

        public void g(int i10, int i11, int i12, Interpolator interpolator) {
            if (this.f4622d != interpolator) {
                this.f4622d = interpolator;
                this.f4621c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f4620b = 0;
            this.f4619a = 0;
            this.f4621c.startScroll(0, 0, i10, i11, i12);
            f();
        }

        public void h(int i10, int i11, Interpolator interpolator) {
            int iA = a(i10, i11, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.U0;
            }
            g(i10, i11, iA, interpolator);
        }

        public void i() {
            RecyclerView.this.removeCallbacks(this);
            this.f4621c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RecyclerView.this.f4588l == null) {
                i();
                return;
            }
            b();
            RecyclerView.this.l();
            OverScroller overScroller = this.f4621c;
            RecyclerView.this.f4588l.getClass();
            if (overScroller.computeScrollOffset()) {
                int[] iArr = RecyclerView.this.F0;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i10 = currX - this.f4619a;
                int i11 = currY - this.f4620b;
                this.f4619a = currX;
                this.f4620b = currY;
                if (RecyclerView.this.r(i10, i11, iArr, null, 1)) {
                    i10 -= iArr[0];
                    i11 -= iArr[1];
                }
                RecyclerView.this.getClass();
                if (!RecyclerView.this.f4592n.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.k(i10, i11);
                }
                RecyclerView.this.s(0, 0, 0, 0, null, 1);
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = (i10 == 0 && i11 == 0) || (i10 != 0 && RecyclerView.this.f4588l.b() && i10 == 0) || (i11 != 0 && RecyclerView.this.f4588l.c() && i11 == 0);
                if (overScroller.isFinished() || !(z10 || RecyclerView.this.K(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.Q0) {
                        RecyclerView.this.f4603s0.a();
                    }
                    RecyclerView.this.C0(1);
                } else {
                    f();
                    RecyclerView recyclerView = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView.f4601r0;
                    if (eVar != null) {
                        eVar.f(recyclerView, i10, i11);
                    }
                }
            }
            d();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = RecyclerView.this.f4571c0;
            if (kVar != null) {
                kVar.p();
            }
            RecyclerView.this.f4617z0 = false;
        }
    }

    public static abstract class b0 {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final List<Object> f4627s = Collections.emptyList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f4628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<RecyclerView> f4629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f4632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4634g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        b0 f4635h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        b0 f4636i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f4637j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        List<Object> f4638k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List<Object> f4639l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f4640m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        u f4641n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f4642o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f4643p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4644q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        RecyclerView f4645r;

        private void f() {
            if (this.f4638k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4638k = arrayList;
                this.f4639l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i10, int i11) {
            this.f4637j = (i10 & i11) | (this.f4637j & (~i11));
        }

        public final void B(boolean z10) {
            int i10;
            int i11 = this.f4640m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f4640m = i12;
            if (i12 < 0) {
                this.f4640m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f4637j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f4637j & (-17);
            }
            this.f4637j = i10;
        }

        void C(u uVar, boolean z10) {
            this.f4641n = uVar;
            this.f4642o = z10;
        }

        boolean D() {
            return (this.f4637j & 16) != 0;
        }

        boolean E() {
            return (this.f4637j & 128) != 0;
        }

        void F() {
            this.f4641n.B(this);
        }

        boolean G() {
            return (this.f4637j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f4637j) == 0) {
                f();
                this.f4638k.add(obj);
            }
        }

        void b(int i10) {
            this.f4637j = i10 | this.f4637j;
        }

        void c() {
            List<Object> list = this.f4638k;
            if (list != null) {
                list.clear();
            }
            this.f4637j &= -1025;
        }

        void d() {
            this.f4637j &= -33;
        }

        void e() {
            this.f4637j &= -257;
        }

        boolean g() {
            return (this.f4637j & 16) == 0 && androidx.core.view.h.E(this.f4628a);
        }

        void h(int i10, int i11, boolean z10) {
            b(8);
            x(i11, z10);
            this.f4630c = i10;
        }

        public final int i() {
            RecyclerView recyclerView = this.f4645r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.F(this);
        }

        public final int j() {
            return this.f4633f;
        }

        public final int k() {
            int i10 = this.f4634g;
            return i10 == -1 ? this.f4630c : i10;
        }

        public final int l() {
            return this.f4631d;
        }

        List<Object> m() {
            if ((this.f4637j & 1024) != 0) {
                return f4627s;
            }
            List<Object> list = this.f4638k;
            return (list == null || list.size() == 0) ? f4627s : this.f4639l;
        }

        boolean n(int i10) {
            return (i10 & this.f4637j) != 0;
        }

        boolean o() {
            return (this.f4637j & 512) != 0 || q();
        }

        boolean p() {
            return (this.f4637j & 1) != 0;
        }

        boolean q() {
            return (this.f4637j & 4) != 0;
        }

        public final boolean r() {
            return (this.f4637j & 16) == 0 && !androidx.core.view.h.E(this.f4628a);
        }

        boolean s() {
            return (this.f4637j & 8) != 0;
        }

        boolean t() {
            return this.f4641n != null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f4630c + " id=" + this.f4632e + ", oldPos=" + this.f4631d + ", pLpos:" + this.f4634g);
            if (t()) {
                sb2.append(" scrap ");
                sb2.append(this.f4642o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (q()) {
                sb2.append(" invalid");
            }
            if (!p()) {
                sb2.append(" unbound");
            }
            if (w()) {
                sb2.append(" update");
            }
            if (s()) {
                sb2.append(" removed");
            }
            if (E()) {
                sb2.append(" ignored");
            }
            if (u()) {
                sb2.append(" tmpDetached");
            }
            if (!r()) {
                sb2.append(" not recyclable(" + this.f4640m + ")");
            }
            if (o()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f4628a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        boolean u() {
            return (this.f4637j & 256) != 0;
        }

        boolean v() {
            return (this.f4637j & 2) != 0;
        }

        boolean w() {
            return (this.f4637j & 2) != 0;
        }

        void x(int i10, boolean z10) {
            if (this.f4631d == -1) {
                this.f4631d = this.f4630c;
            }
            if (this.f4634g == -1) {
                this.f4634g = this.f4630c;
            }
            if (z10) {
                this.f4634g += i10;
            }
            this.f4630c += i10;
            if (this.f4628a.getLayoutParams() != null) {
                ((o) this.f4628a.getLayoutParams()).f4684c = true;
            }
        }

        void y(RecyclerView recyclerView) {
            recyclerView.v0(this, this.f4643p);
            this.f4643p = 0;
        }

        void z() {
            this.f4637j = 0;
            this.f4630c = -1;
            this.f4631d = -1;
            this.f4632e = -1L;
            this.f4634g = -1;
            this.f4640m = 0;
            this.f4635h = null;
            this.f4636i = null;
            c();
            this.f4643p = 0;
            this.f4644q = -1;
            RecyclerView.j(this);
        }
    }

    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class d implements m.b {
        d() {
        }
    }

    class e implements b.InterfaceC0111b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public void c() {
            int iB = b();
            for (int i10 = 0; i10 < iB; i10++) {
                View viewA = a(i10);
                RecyclerView.this.o(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public int d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public b0 e(View view) {
            return RecyclerView.H(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public void f(int i10) {
            b0 b0VarH;
            View viewA = a(i10);
            if (viewA != null && (b0VarH = RecyclerView.H(viewA)) != null) {
                if (b0VarH.u() && !b0VarH.E()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + b0VarH + RecyclerView.this.B());
                }
                b0VarH.b(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public void g(View view) {
            b0 b0VarH = RecyclerView.H(view);
            if (b0VarH != null) {
                b0VarH.y(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0111b
        public void h(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.o(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }
    }

    class f implements a.InterfaceC0110a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public void a(int i10, int i11) {
            RecyclerView.this.Y(i10, i11);
            RecyclerView.this.f4611w0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.F0(i10, i11, obj);
            RecyclerView.this.f4613x0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public b0 e(int i10) {
            b0 b0VarD = RecyclerView.this.D(i10, true);
            if (b0VarD == null || RecyclerView.this.f4574e.i(b0VarD.f4628a)) {
                return null;
            }
            return b0VarD;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public void f(int i10, int i11) {
            RecyclerView.this.Z(i10, i11, false);
            RecyclerView.this.f4611w0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public void g(int i10, int i11) {
            RecyclerView.this.X(i10, i11);
            RecyclerView.this.f4611w0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0110a
        public void h(int i10, int i11) {
            RecyclerView.this.Z(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4611w0 = true;
            recyclerView.f4605t0.f4705d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f4764a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4588l.g0(recyclerView, bVar.f4765b, bVar.f4767d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4588l.j0(recyclerView2, bVar.f4765b, bVar.f4767d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4588l.l0(recyclerView3, bVar.f4765b, bVar.f4767d, bVar.f4766c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4588l.i0(recyclerView4, bVar.f4765b, bVar.f4767d, 1);
            }
        }
    }

    public static abstract class g<VH extends b0> {
    }

    public static abstract class h {
    }

    public interface i {
        int a(int i10, int i11);
    }

    public static class j {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f4649a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<a> f4650b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f4651c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4652d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4653e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f4654f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(b0 b0Var);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4655a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4656b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f4657c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f4658d;

            public c a(b0 b0Var) {
                return b(b0Var, 0);
            }

            public c b(b0 b0Var, int i10) {
                View view = b0Var.f4628a;
                this.f4655a = view.getLeft();
                this.f4656b = view.getTop();
                this.f4657c = view.getRight();
                this.f4658d = view.getBottom();
                return this;
            }
        }

        static int a(b0 b0Var) {
            int i10 = b0Var.f4637j & 14;
            if (b0Var.q()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int iL = b0Var.l();
            int i11 = b0Var.i();
            return (iL == -1 || i11 == -1 || iL == i11) ? i10 : i10 | 2048;
        }

        public abstract boolean b(b0 b0Var);

        public boolean c(b0 b0Var, List<Object> list) {
            return b(b0Var);
        }

        public final void d(b0 b0Var) {
            n(b0Var);
            b bVar = this.f4649a;
            if (bVar != null) {
                bVar.a(b0Var);
            }
        }

        public final void e() {
            int size = this.f4650b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4650b.get(i10).a();
            }
            this.f4650b.clear();
        }

        public abstract void f(b0 b0Var);

        public abstract void g();

        public long h() {
            return this.f4651c;
        }

        public long i() {
            return this.f4654f;
        }

        public long j() {
            return this.f4653e;
        }

        public long k() {
            return this.f4652d;
        }

        public abstract boolean l();

        public c m() {
            return new c();
        }

        public void n(b0 b0Var) {
        }

        public c o(y yVar, b0 b0Var, int i10, List<Object> list) {
            return m().a(b0Var);
        }

        public abstract void p();

        void q(b bVar) {
            this.f4649a = bVar;
        }
    }

    private class l implements k.b {
        l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k.b
        public void a(b0 b0Var) {
            b0Var.B(true);
            if (b0Var.f4635h != null && b0Var.f4636i == null) {
                b0Var.f4635h = null;
            }
            b0Var.f4636i = null;
            if (b0Var.D() || RecyclerView.this.n0(b0Var.f4628a) || !b0Var.u()) {
                return;
            }
            RecyclerView.this.removeDetachedView(b0Var.f4628a, false);
        }
    }

    public static abstract class m {
        @Deprecated
        public void d(Canvas canvas, RecyclerView recyclerView) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, y yVar) {
            d(canvas, recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, y yVar) {
            f(canvas, recyclerView);
        }
    }

    public static abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f4660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f4661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l.b f4662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l.b f4663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.l f4664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.l f4665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f4666g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f4667h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f4668i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f4669j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f4670k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f4671l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f4672m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f4673n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f4674o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f4675p;

        class a implements l.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i10) {
                return n.this.s(i10);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b(View view) {
                return n.this.y(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c() {
                return n.this.F();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d() {
                return n.this.O() - n.this.G();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return n.this.z(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements l.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i10) {
                return n.this.s(i10);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b(View view) {
                return n.this.A(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c() {
                return n.this.H();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d() {
                return n.this.B() - n.this.E();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return n.this.w(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4678a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4679b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f4680c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f4681d;
        }

        public n() {
            a aVar = new a();
            this.f4662c = aVar;
            b bVar = new b();
            this.f4663d = bVar;
            this.f4664e = new androidx.recyclerview.widget.l(aVar);
            this.f4665f = new androidx.recyclerview.widget.l(bVar);
            this.f4666g = false;
            this.f4667h = false;
            this.f4668i = false;
            this.f4669j = true;
            this.f4670k = true;
        }

        public static c J(Context context, AttributeSet attributeSet, int i10, int i11) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4.b.f22464h, i10, i11);
            cVar.f4678a = typedArrayObtainStyledAttributes.getInt(w4.b.f22465i, 1);
            cVar.f4679b = typedArrayObtainStyledAttributes.getInt(w4.b.f22474r, 1);
            cVar.f4680c = typedArrayObtainStyledAttributes.getBoolean(w4.b.f22473q, false);
            cVar.f4681d = typedArrayObtainStyledAttributes.getBoolean(w4.b.f22475s, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        private boolean R(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iF = F();
            int iH = H();
            int iO = O() - G();
            int iB = B() - E();
            Rect rect = this.f4661b.f4582i;
            x(focusedChild, rect);
            return rect.left - i10 < iO && rect.right - i10 > iF && rect.top - i11 < iB && rect.bottom - i11 > iH;
        }

        public static int e(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private int[] u(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            int[] iArr = new int[2];
            int iF = F();
            int iH = H();
            int iO = O() - G();
            int iB = B() - E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iF;
            int iMin = Math.min(0, i10);
            int i11 = top - iH;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iO;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB);
            if (C() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public int A(View view) {
            return view.getTop() - N(view);
        }

        public void A0(int i10) {
            if (s(i10) != null) {
                this.f4660a.k(i10);
            }
        }

        public int B() {
            return this.f4675p;
        }

        public boolean B0(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return C0(recyclerView, view, rect, z10, false);
        }

        public int C() {
            return androidx.core.view.h.t(this.f4661b);
        }

        public boolean C0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrU = u(recyclerView, view, rect, z10);
            int i10 = iArrU[0];
            int i11 = iArrU[1];
            if ((z11 && !R(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.x0(i10, i11);
            }
            return true;
        }

        public int D(View view) {
            return ((o) view.getLayoutParams()).f4683b.left;
        }

        public void D0() {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int E() {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void E0() {
            this.f4666g = true;
        }

        public int F() {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        void F0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f4661b = null;
                this.f4660a = null;
                height = 0;
                this.f4674o = 0;
            } else {
                this.f4661b = recyclerView;
                this.f4660a = recyclerView.f4574e;
                this.f4674o = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f4675p = height;
            this.f4672m = 1073741824;
            this.f4673n = 1073741824;
        }

        public int G() {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void G0() {
        }

        public int H() {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean H0() {
            return false;
        }

        public int I(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int K(View view) {
            return ((o) view.getLayoutParams()).f4683b.right;
        }

        public int L(u uVar, y yVar) {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView == null) {
                return 1;
            }
            recyclerView.getClass();
            return 1;
        }

        public int M(u uVar, y yVar) {
            return 0;
        }

        public int N(View view) {
            return ((o) view.getLayoutParams()).f4683b.top;
        }

        public int O() {
            return this.f4674o;
        }

        public boolean P() {
            return this.f4667h;
        }

        public boolean Q() {
            return this.f4668i;
        }

        public boolean S(u uVar, y yVar) {
            return false;
        }

        public boolean T() {
            return false;
        }

        public void U(g gVar, g gVar2) {
        }

        public boolean V(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void W(RecyclerView recyclerView) {
        }

        @Deprecated
        public void X(RecyclerView recyclerView) {
        }

        public void Y(RecyclerView recyclerView, u uVar) {
            X(recyclerView);
        }

        public void Z(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4661b;
            a0(recyclerView.f4568b, recyclerView.f4605t0, accessibilityEvent);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView != null) {
                recyclerView.g(str);
            }
        }

        public void a0(u uVar, y yVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4661b.canScrollVertically(-1) && !this.f4661b.canScrollHorizontally(-1) && !this.f4661b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            this.f4661b.getClass();
        }

        public boolean b() {
            return false;
        }

        public void b0(u uVar, y yVar, p3.g gVar) {
            if (this.f4661b.canScrollVertically(-1) || this.f4661b.canScrollHorizontally(-1)) {
                gVar.a(8192);
                gVar.C0(true);
            }
            if (this.f4661b.canScrollVertically(1) || this.f4661b.canScrollHorizontally(1)) {
                gVar.a(4096);
                gVar.C0(true);
            }
            gVar.g0(g.e.a(L(uVar, yVar), v(uVar, yVar), S(uVar, yVar), M(uVar, yVar)));
        }

        public boolean c() {
            return false;
        }

        void c0(p3.g gVar) {
            RecyclerView recyclerView = this.f4661b;
            b0(recyclerView.f4568b, recyclerView.f4605t0, gVar);
        }

        public boolean d(o oVar) {
            return oVar != null;
        }

        void d0(View view, p3.g gVar) {
            b0 b0VarH = RecyclerView.H(view);
            if (b0VarH == null || b0VarH.s() || this.f4660a.i(b0VarH.f4628a)) {
                return;
            }
            RecyclerView recyclerView = this.f4661b;
            e0(recyclerView.f4568b, recyclerView.f4605t0, view, gVar);
        }

        public void e0(u uVar, y yVar, View view, p3.g gVar) {
            gVar.h0(g.f.a(c() ? I(view) : 0, 1, b() ? I(view) : 0, 1, false, false));
        }

        public int f(y yVar) {
            return 0;
        }

        public View f0(View view, int i10) {
            return null;
        }

        public int g(y yVar) {
            return 0;
        }

        public void g0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int h(y yVar) {
            return 0;
        }

        public void h0(RecyclerView recyclerView) {
        }

        public int i(y yVar) {
            return 0;
        }

        public void i0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int j(y yVar) {
            return 0;
        }

        public void j0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int k(y yVar) {
            return 0;
        }

        public void k0(RecyclerView recyclerView, int i10, int i11) {
        }

        void l(RecyclerView recyclerView) {
            this.f4667h = true;
            W(recyclerView);
        }

        public void l0(RecyclerView recyclerView, int i10, int i11, Object obj) {
            k0(recyclerView, i10, i11);
        }

        void m(RecyclerView recyclerView, u uVar) {
            this.f4667h = false;
            Y(recyclerView, uVar);
        }

        public void m0(u uVar, y yVar, int i10, int i11) {
            this.f4661b.n(i10, i11);
        }

        public abstract o n();

        @Deprecated
        public boolean n0(RecyclerView recyclerView, View view, View view2) {
            return T() || recyclerView.T();
        }

        public o o(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public boolean o0(RecyclerView recyclerView, y yVar, View view, View view2) {
            return n0(recyclerView, view, view2);
        }

        public o p(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
        }

        public void p0(Parcelable parcelable) {
        }

        public int q() {
            return -1;
        }

        public Parcelable q0() {
            return null;
        }

        public int r(View view) {
            return ((o) view.getLayoutParams()).f4683b.bottom;
        }

        public void r0(int i10) {
        }

        public View s(int i10) {
            androidx.recyclerview.widget.b bVar = this.f4660a;
            if (bVar != null) {
                return bVar.c(i10);
            }
            return null;
        }

        boolean s0(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4661b;
            return t0(recyclerView.f4568b, recyclerView.f4605t0, i10, bundle);
        }

        public int t() {
            androidx.recyclerview.widget.b bVar = this.f4660a;
            if (bVar != null) {
                return bVar.d();
            }
            return 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[PHI: r2
  0x006f: PHI (r2v8 int) = (r2v4 int), (r2v12 int) binds: [B:22:0x005e, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean t0(androidx.recyclerview.widget.RecyclerView.u r2, androidx.recyclerview.widget.RecyclerView.y r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f4661b
                r3 = 0
                if (r2 != 0) goto L6
                return r3
            L6:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L42
                r5 = 8192(0x2000, float:1.148E-41)
                if (r4 == r5) goto L12
                r2 = r3
                r4 = r2
                goto L70
            L12:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L29
                int r2 = r1.B()
                int r5 = r1.H()
                int r2 = r2 - r5
                int r5 = r1.E()
                int r2 = r2 - r5
                int r2 = -r2
                goto L2a
            L29:
                r2 = r3
            L2a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f4661b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L6f
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
                int r4 = -r4
                goto L70
            L42:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L57
                int r2 = r1.B()
                int r4 = r1.H()
                int r2 = r2 - r4
                int r4 = r1.E()
                int r2 = r2 - r4
                goto L58
            L57:
                r2 = r3
            L58:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f4661b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L6f
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
                goto L70
            L6f:
                r4 = r3
            L70:
                if (r2 != 0) goto L75
                if (r4 != 0) goto L75
                return r3
            L75:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f4661b
                r3.x0(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.t0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        boolean u0(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4661b;
            return v0(recyclerView.f4568b, recyclerView.f4605t0, view, i10, bundle);
        }

        public int v(u uVar, y yVar) {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView == null) {
                return 1;
            }
            recyclerView.getClass();
            return 1;
        }

        public boolean v0(u uVar, y yVar, View view, int i10, Bundle bundle) {
            return false;
        }

        public int w(View view) {
            return view.getBottom() + r(view);
        }

        public void w0(u uVar) {
            for (int iT = t() - 1; iT >= 0; iT--) {
                if (!RecyclerView.H(s(iT)).E()) {
                    y0(iT, uVar);
                }
            }
        }

        public void x(View view, Rect rect) {
            RecyclerView.I(view, rect);
        }

        void x0(u uVar) {
            int iH = uVar.h();
            for (int i10 = iH - 1; i10 >= 0; i10--) {
                View viewJ = uVar.j(i10);
                b0 b0VarH = RecyclerView.H(viewJ);
                if (!b0VarH.E()) {
                    b0VarH.B(false);
                    if (b0VarH.u()) {
                        this.f4661b.removeDetachedView(viewJ, false);
                    }
                    k kVar = this.f4661b.f4571c0;
                    if (kVar != null) {
                        kVar.f(b0VarH);
                    }
                    b0VarH.B(true);
                    uVar.q(viewJ);
                }
            }
            uVar.c();
            if (iH > 0) {
                this.f4661b.invalidate();
            }
        }

        public int y(View view) {
            return view.getLeft() - D(view);
        }

        public void y0(int i10, u uVar) {
            View viewS = s(i10);
            A0(i10);
            uVar.t(viewS);
        }

        public int z(View view) {
            return view.getRight() + K(view);
        }

        public boolean z0(Runnable runnable) {
            RecyclerView recyclerView = this.f4661b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        b0 f4682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f4683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4685d;

        public o(int i10, int i11) {
            super(i10, i11);
            this.f4683b = new Rect();
            this.f4684c = true;
            this.f4685d = false;
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4683b = new Rect();
            this.f4684c = true;
            this.f4685d = false;
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4683b = new Rect();
            this.f4684c = true;
            this.f4685d = false;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4683b = new Rect();
            this.f4684c = true;
            this.f4685d = false;
        }

        public o(o oVar) {
            super((ViewGroup.LayoutParams) oVar);
            this.f4683b = new Rect();
            this.f4684c = true;
            this.f4685d = false;
        }

        public int a() {
            return this.f4682a.k();
        }
    }

    public interface p {
        void a(View view);
    }

    public static abstract class q {
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i10) {
        }
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<a> f4686a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4687b = 0;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList<b0> f4688a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f4689b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f4690c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f4691d = 0;

            a() {
            }
        }

        private a c(int i10) {
            a aVar = this.f4686a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4686a.put(i10, aVar2);
            return aVar2;
        }

        public void a() {
            for (int i10 = 0; i10 < this.f4686a.size(); i10++) {
                this.f4686a.valueAt(i10).f4688a.clear();
            }
        }

        void b() {
            this.f4687b--;
        }

        void d(g gVar, g gVar2, boolean z10) {
            if (z10 || this.f4687b != 0) {
                return;
            }
            a();
        }

        public void e(b0 b0Var) {
            int iJ = b0Var.j();
            ArrayList<b0> arrayList = c(iJ).f4688a;
            if (this.f4686a.get(iJ).f4689b <= arrayList.size()) {
                return;
            }
            b0Var.z();
            arrayList.add(b0Var);
        }

        boolean f(int i10, long j10, long j11) {
            long j12 = c(i10).f4691d;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<b0> f4692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b0> f4693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<b0> f4694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<b0> f4695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f4696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        t f4698g;

        public u() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.f4692a = arrayList;
            this.f4693b = null;
            this.f4694c = new ArrayList<>();
            this.f4695d = Collections.unmodifiableList(arrayList);
            this.f4696e = 2;
            this.f4697f = 2;
        }

        private boolean z(b0 b0Var, int i10, int i11, long j10) {
            b0Var.f4645r = RecyclerView.this;
            int iJ = b0Var.j();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f4698g.f(iJ, nanoTime, j10)) {
                return false;
            }
            RecyclerView.this.getClass();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0141 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.b0 A(int r12, boolean r13, long r14) {
            /*
                Method dump skipped, instruction units count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.A(int, boolean, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        void B(b0 b0Var) {
            (b0Var.f4642o ? this.f4693b : this.f4692a).remove(b0Var);
            b0Var.f4641n = null;
            b0Var.f4642o = false;
            b0Var.d();
        }

        void C() {
            n nVar = RecyclerView.this.f4588l;
            this.f4697f = this.f4696e + (nVar != null ? nVar.f4671l : 0);
            for (int size = this.f4694c.size() - 1; size >= 0 && this.f4694c.size() > this.f4697f; size--) {
                s(size);
            }
        }

        boolean D(b0 b0Var) {
            if (b0Var.s()) {
                return RecyclerView.this.f4605t0.b();
            }
            if (b0Var.f4630c >= 0) {
                RecyclerView.this.getClass();
                throw null;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + b0Var + RecyclerView.this.B());
        }

        void E(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f4694c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f4694c.get(size);
                if (b0Var != null && (i12 = b0Var.f4630c) >= i10 && i12 < i13) {
                    b0Var.b(2);
                    s(size);
                }
            }
        }

        void a(b0 b0Var, boolean z10) {
            RecyclerView.j(b0Var);
            if (b0Var.n(16384)) {
                b0Var.A(0, 16384);
                androidx.core.view.h.W(b0Var.f4628a, null);
            }
            if (z10) {
                e(b0Var);
            }
            b0Var.f4645r = null;
            g().e(b0Var);
        }

        public void b() {
            this.f4692a.clear();
            r();
        }

        void c() {
            this.f4692a.clear();
            ArrayList<b0> arrayList = this.f4693b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int d(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f4605t0.a()) {
                return !RecyclerView.this.f4605t0.b() ? i10 : RecyclerView.this.f4572d.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f4605t0.a() + RecyclerView.this.B());
        }

        void e(b0 b0Var) {
            v vVar = RecyclerView.this.f4590m;
            if (vVar != null) {
                vVar.a(b0Var);
            }
            RecyclerView.this.getClass();
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4605t0 != null) {
                recyclerView.f4576f.d(b0Var);
            }
        }

        b0 f(int i10) {
            int size;
            ArrayList<b0> arrayList = this.f4693b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            for (int i11 = 0; i11 < size; i11++) {
                b0 b0Var = this.f4693b.get(i11);
                if (!b0Var.G() && b0Var.k() == i10) {
                    b0Var.b(32);
                    return b0Var;
                }
            }
            RecyclerView.this.getClass();
            throw null;
        }

        t g() {
            if (this.f4698g == null) {
                this.f4698g = new t();
            }
            return this.f4698g;
        }

        int h() {
            return this.f4692a.size();
        }

        b0 i(int i10, boolean z10) {
            View viewB;
            int size = this.f4692a.size();
            for (int i11 = 0; i11 < size; i11++) {
                b0 b0Var = this.f4692a.get(i11);
                if (!b0Var.G() && b0Var.k() == i10 && !b0Var.q() && (RecyclerView.this.f4605t0.f4709h || !b0Var.s())) {
                    b0Var.b(32);
                    return b0Var;
                }
            }
            if (z10 || (viewB = RecyclerView.this.f4574e.b(i10)) == null) {
                int size2 = this.f4694c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    b0 b0Var2 = this.f4694c.get(i12);
                    if (!b0Var2.q() && b0Var2.k() == i10) {
                        if (!z10) {
                            this.f4694c.remove(i12);
                        }
                        return b0Var2;
                    }
                }
                return null;
            }
            b0 b0VarH = RecyclerView.H(viewB);
            RecyclerView.this.f4574e.m(viewB);
            int iH = RecyclerView.this.f4574e.h(viewB);
            if (iH != -1) {
                RecyclerView.this.f4574e.a(iH);
                v(viewB);
                b0VarH.b(8224);
                return b0VarH;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + b0VarH + RecyclerView.this.B());
        }

        View j(int i10) {
            return this.f4692a.get(i10).f4628a;
        }

        void k() {
            int size = this.f4694c.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) this.f4694c.get(i10).f4628a.getLayoutParams();
                if (oVar != null) {
                    oVar.f4684c = true;
                }
            }
        }

        void l() {
            int size = this.f4694c.size();
            for (int i10 = 0; i10 < size; i10++) {
                b0 b0Var = this.f4694c.get(i10);
                if (b0Var != null) {
                    b0Var.b(6);
                    b0Var.a(null);
                }
            }
            RecyclerView.this.getClass();
            r();
        }

        void m(int i10, int i11) {
            int size = this.f4694c.size();
            for (int i12 = 0; i12 < size; i12++) {
                b0 b0Var = this.f4694c.get(i12);
                if (b0Var != null && b0Var.f4630c >= i10) {
                    b0Var.x(i11, true);
                }
            }
        }

        void n(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f4694c.size();
            for (int i16 = 0; i16 < size; i16++) {
                b0 b0Var = this.f4694c.get(i16);
                if (b0Var != null && (i15 = b0Var.f4630c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        b0Var.x(i11 - i10, false);
                    } else {
                        b0Var.x(i12, false);
                    }
                }
            }
        }

        void o(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f4694c.size() - 1; size >= 0; size--) {
                b0 b0Var = this.f4694c.get(size);
                if (b0Var != null) {
                    int i13 = b0Var.f4630c;
                    if (i13 >= i12) {
                        b0Var.x(-i11, z10);
                    } else if (i13 >= i10) {
                        b0Var.b(8);
                        s(size);
                    }
                }
            }
        }

        void p(g gVar, g gVar2, boolean z10) {
            b();
            g().d(gVar, gVar2, z10);
        }

        void q(View view) {
            b0 b0VarH = RecyclerView.H(view);
            b0VarH.f4641n = null;
            b0VarH.f4642o = false;
            b0VarH.d();
            u(b0VarH);
        }

        void r() {
            for (int size = this.f4694c.size() - 1; size >= 0; size--) {
                s(size);
            }
            this.f4694c.clear();
            if (RecyclerView.Q0) {
                RecyclerView.this.f4603s0.a();
            }
        }

        void s(int i10) {
            a(this.f4694c.get(i10), true);
            this.f4694c.remove(i10);
        }

        public void t(View view) {
            b0 b0VarH = RecyclerView.H(view);
            if (b0VarH.u()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (b0VarH.t()) {
                b0VarH.F();
            } else if (b0VarH.G()) {
                b0VarH.d();
            }
            u(b0VarH);
        }

        void u(b0 b0Var) {
            boolean z10;
            boolean z11 = true;
            if (b0Var.t() || b0Var.f4628a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(b0Var.t());
                sb2.append(" isAttached:");
                sb2.append(b0Var.f4628a.getParent() != null);
                sb2.append(RecyclerView.this.B());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (b0Var.u()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + b0Var + RecyclerView.this.B());
            }
            if (b0Var.E()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.B());
            }
            boolean zG = b0Var.g();
            RecyclerView.this.getClass();
            if (b0Var.r()) {
                if (this.f4697f <= 0 || b0Var.n(526)) {
                    z10 = false;
                } else {
                    int size = this.f4694c.size();
                    if (size >= this.f4697f && size > 0) {
                        s(0);
                        size--;
                    }
                    if (RecyclerView.Q0 && size > 0 && !RecyclerView.this.f4603s0.c(b0Var.f4630c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f4603s0.c(this.f4694c.get(i10).f4630c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f4694c.add(size, b0Var);
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    a(b0Var, true);
                }
                z = z10;
            } else {
                z11 = false;
            }
            RecyclerView.this.f4576f.d(b0Var);
            if (z || z11 || !zG) {
                return;
            }
            b0Var.f4645r = null;
        }

        void v(View view) {
            ArrayList<b0> arrayList;
            b0 b0VarH = RecyclerView.H(view);
            if (!b0VarH.n(12) && b0VarH.v() && !RecyclerView.this.h(b0VarH)) {
                if (this.f4693b == null) {
                    this.f4693b = new ArrayList<>();
                }
                b0VarH.C(this, true);
                arrayList = this.f4693b;
            } else {
                if (b0VarH.q() && !b0VarH.s()) {
                    RecyclerView.this.getClass();
                    throw null;
                }
                b0VarH.C(this, false);
                arrayList = this.f4692a;
            }
            arrayList.add(b0VarH);
        }

        void w(t tVar) {
            t tVar2 = this.f4698g;
            if (tVar2 != null) {
                tVar2.b();
            }
            this.f4698g = tVar;
            if (tVar != null) {
                RecyclerView.this.getAdapter();
            }
        }

        void x(z zVar) {
        }

        public void y(int i10) {
            this.f4696e = i10;
            C();
        }
    }

    public interface v {
        void a(b0 b0Var);
    }

    private class w extends h {
        w() {
        }
    }

    public static class x extends y3.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f4701c;

        static class a implements Parcelable.ClassLoaderCreator<x> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public x[] newArray(int i10) {
                return new x[i10];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4701c = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }

        void b(x xVar) {
            this.f4701c = xVar.f4701c;
        }

        @Override // y3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f4701c, 0);
        }
    }

    public static class y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f4703b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4702a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4704c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4705d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4706e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4707f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f4708g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f4709h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f4710i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f4711j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f4712k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f4713l = false;

        public int a() {
            return this.f4709h ? this.f4704c - this.f4705d : this.f4707f;
        }

        public boolean b() {
            return this.f4709h;
        }

        void c(g gVar) {
            this.f4706e = 1;
            throw null;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4702a + ", mData=" + this.f4703b + ", mItemCount=" + this.f4707f + ", mIsMeasuring=" + this.f4711j + ", mPreviousLayoutItemCount=" + this.f4704c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4705d + ", mStructureChanged=" + this.f4708g + ", mInPreLayout=" + this.f4709h + ", mRunSimpleAnimations=" + this.f4712k + ", mRunPredictiveAnimations=" + this.f4713l + '}';
        }
    }

    public static abstract class z {
    }

    static {
        Class<?> cls = Integer.TYPE;
        T0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        U0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4566a = new w();
        this.f4568b = new u();
        this.f4576f = new androidx.recyclerview.widget.m();
        this.f4580h = new a();
        this.f4582i = new Rect();
        this.f4584j = new Rect();
        this.f4586k = new RectF();
        this.f4592n = new ArrayList<>();
        this.f4594o = new ArrayList<>();
        this.f4606u = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = new j();
        this.f4571c0 = new androidx.recyclerview.widget.c();
        this.f4573d0 = 0;
        this.f4575e0 = -1;
        this.f4593n0 = Float.MIN_VALUE;
        this.f4595o0 = Float.MIN_VALUE;
        boolean z10 = true;
        this.f4597p0 = true;
        this.f4599q0 = new a0();
        this.f4603s0 = Q0 ? new e.b() : null;
        this.f4605t0 = new y();
        this.f4611w0 = false;
        this.f4613x0 = false;
        this.f4615y0 = new l();
        this.f4617z0 = false;
        this.C0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new ArrayList();
        this.J0 = new b();
        this.K0 = new d();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, M0, i10, 0);
            this.f4578g = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f4578g = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4587k0 = viewConfiguration.getScaledTouchSlop();
        this.f4593n0 = androidx.core.view.i.f(viewConfiguration, context);
        this.f4595o0 = androidx.core.view.i.j(viewConfiguration, context);
        this.f4589l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4591m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4571c0.q(this.f4615y0);
        N();
        P();
        O();
        if (androidx.core.view.h.r(this) == 0) {
            androidx.core.view.h.f0(this, 1);
        }
        this.A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.i(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, w4.b.f22464h, i10, 0);
            String string = typedArrayObtainStyledAttributes2.getString(w4.b.f22472p);
            if (typedArrayObtainStyledAttributes2.getInt(w4.b.f22466j, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(w4.b.f22467k, false);
            this.f4602s = z11;
            if (z11) {
                Q((StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(w4.b.f22470n), typedArrayObtainStyledAttributes2.getDrawable(w4.b.f22471o), (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(w4.b.f22468l), typedArrayObtainStyledAttributes2.getDrawable(w4.b.f22469m));
            }
            typedArrayObtainStyledAttributes2.recycle();
            m(context, string, attributeSet, i10, 0);
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, L0, i10, 0);
            z10 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z10);
    }

    private void E0() {
        this.f4599q0.i();
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.G0();
        }
    }

    static b0 H(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).f4682a;
    }

    static void I(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f4683b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin);
    }

    private String J(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + com.amazon.a.a.o.c.a.b.f7490a + str;
    }

    private boolean M() {
        int iD = this.f4574e.d();
        for (int i10 = 0; i10 < iD; i10++) {
            b0 b0VarH = H(this.f4574e.c(i10));
            if (b0VarH != null && !b0VarH.E() && b0VarH.v()) {
                return true;
            }
        }
        return false;
    }

    private void O() {
        if (androidx.core.view.h.s(this) == 0) {
            androidx.core.view.h.h0(this, 8);
        }
    }

    private void P() {
        this.f4574e = new androidx.recyclerview.widget.b(new e());
    }

    private boolean U(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || C(view2) == null) {
            return false;
        }
        if (view == null || C(view) == null) {
            return true;
        }
        this.f4582i.set(0, 0, view.getWidth(), view.getHeight());
        this.f4584j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4582i);
        offsetDescendantRectToMyCoords(view2, this.f4584j);
        byte b10 = -1;
        int i12 = this.f4588l.C() == 1 ? -1 : 1;
        Rect rect = this.f4582i;
        int i13 = rect.left;
        Rect rect2 = this.f4584j;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 <= 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 >= 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + B());
    }

    private void e0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4575e0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f4575e0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f4583i0 = x10;
            this.f4579g0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f4585j0 = y10;
            this.f4581h0 = y10;
        }
    }

    private boolean g0() {
        return this.f4571c0 != null && this.f4588l.H0();
    }

    private d0 getScrollingChildHelper() {
        if (this.D0 == null) {
            this.D0 = new d0(this);
        }
        return this.D0;
    }

    private void h0() {
        boolean z10;
        boolean z11;
        if (this.C) {
            this.f4572d.t();
            if (this.D) {
                this.f4588l.h0(this);
            }
        }
        if (g0()) {
            this.f4572d.r();
        } else {
            this.f4572d.j();
        }
        boolean z12 = false;
        boolean z13 = this.f4611w0 || this.f4613x0;
        y yVar = this.f4605t0;
        if (!this.f4604t || this.f4571c0 == null || (!(z11 = this.C) && !z13 && !this.f4588l.f4666g)) {
            z10 = false;
        } else {
            if (z11) {
                throw null;
            }
            z10 = true;
        }
        yVar.f4712k = z10;
        if (z10 && z13 && !this.C && g0()) {
            z12 = true;
        }
        yVar.f4713l = z12;
    }

    private void i() {
        s0();
        setScrollState(0);
    }

    static void j(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.f4629b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == b0Var.f4628a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                b0Var.f4629b = null;
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.y()
            android.widget.EdgeEffect r1 = r6.H
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
        L1c:
            androidx.core.widget.b.c(r1, r4, r9)
            r9 = r3
            goto L39
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L38
            r6.z()
            android.widget.EdgeEffect r1 = r6.f4567a0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L53
            r6.A()
            android.widget.EdgeEffect r9 = r6.I
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.b.c(r9, r1, r7)
            goto L6f
        L53:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L6e
            r6.x()
            android.widget.EdgeEffect r9 = r6.f4569b0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.b.c(r9, r1, r2)
            goto L6f
        L6e:
            r3 = r9
        L6f:
            if (r3 != 0) goto L79
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            androidx.core.view.h.Q(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.j0(float, float, float, float):void");
    }

    private void l0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.H.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4567a0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f4567a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4569b0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f4569b0.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.h.Q(this);
        }
    }

    private void m(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strJ = J(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(strJ).asSubclass(n.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(T0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strJ, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((n) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strJ, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strJ, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strJ, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strJ, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strJ, e16);
            }
        }
    }

    private void p() {
        int i10 = this.f4614y;
        this.f4614y = 0;
        if (i10 == 0 || !S()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        p3.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void r0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4582i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f4684c) {
                Rect rect = oVar.f4683b;
                Rect rect2 = this.f4582i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4582i);
            offsetRectIntoDescendantCoords(view, this.f4582i);
        }
        this.f4588l.C0(this, view, this.f4582i, !this.f4604t, view2 == null);
    }

    private void s0() {
        VelocityTracker velocityTracker = this.f4577f0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        C0(0);
        l0();
    }

    private boolean t(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        r rVar = this.f4596p;
        if (rVar != null) {
            if (action != 0) {
                rVar.a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f4596p = null;
                }
                return true;
            }
            this.f4596p = null;
        }
        if (action != 0) {
            int size = this.f4594o.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar2 = this.f4594o.get(i10);
                if (rVar2.b(this, motionEvent)) {
                    this.f4596p = rVar2;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean u(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f4596p = null;
        }
        int size = this.f4594o.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar = this.f4594o.get(i10);
            if (rVar.b(this, motionEvent) && action != 3) {
                this.f4596p = rVar;
                return true;
            }
        }
        return false;
    }

    private void u0(g gVar, boolean z10, boolean z11) {
        if (!z10 || z11) {
            m0();
        }
        this.f4572d.t();
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.U(null, null);
        }
        this.f4568b.p(null, null, z10);
        this.f4605t0.f4708g = true;
    }

    void A() {
        int measuredWidth;
        int measuredHeight;
        if (this.I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.G.a(this, 1);
        this.I = edgeEffectA;
        if (this.f4578g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public boolean A0(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    String B() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f4588l + ", context:" + getContext();
    }

    void B0(boolean z10) {
        if (this.f4606u < 1) {
            this.f4606u = 1;
        }
        if (!z10 && !this.f4610w) {
            this.f4608v = false;
        }
        int i10 = this.f4606u;
        if (i10 == 1) {
            if (z10 && this.f4608v && !this.f4610w) {
                n nVar = this.f4588l;
            }
            if (!this.f4610w) {
                this.f4608v = false;
            }
        }
        this.f4606u = i10 - 1;
    }

    public View C(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void C0(int i10) {
        getScrollingChildHelper().s(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.b0 D(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f4574e
            int r0 = r0.g()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f4574e
            android.view.View r3 = r3.f(r2)
            androidx.recyclerview.widget.RecyclerView$b0 r3 = H(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.s()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f4630c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.k()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f4574e
            android.view.View r4 = r3.f4628a
            boolean r1 = r1.i(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(int, boolean):androidx.recyclerview.widget.RecyclerView$b0");
    }

    public void D0() {
        setScrollState(0);
        E0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean E(int i10, int i11) {
        n nVar = this.f4588l;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f4610w) {
            return false;
        }
        boolean zB = nVar.b();
        boolean zC = this.f4588l.c();
        if (!zB || Math.abs(i10) < this.f4589l0) {
            i10 = 0;
        }
        if (!zC || Math.abs(i11) < this.f4589l0) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        float f10 = i10;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zB || zC;
            dispatchNestedFling(f10, f11, z10);
            int i12 = zB;
            if (z10) {
                if (zC) {
                    i12 = (zB ? 1 : 0) | 2;
                }
                A0(i12, 1);
                int i13 = this.f4591m0;
                int iMax = Math.max(-i13, Math.min(i10, i13));
                int i14 = this.f4591m0;
                this.f4599q0.e(iMax, Math.max(-i14, Math.min(i11, i14)));
                return true;
            }
        }
        return false;
    }

    int F(b0 b0Var) {
        if (b0Var.n(524) || !b0Var.p()) {
            return -1;
        }
        return this.f4572d.e(b0Var.f4630c);
    }

    void F0(int i10, int i11, Object obj) {
        int i12;
        int iG = this.f4574e.g();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iG; i14++) {
            View viewF = this.f4574e.f(i14);
            b0 b0VarH = H(viewF);
            if (b0VarH != null && !b0VarH.E() && (i12 = b0VarH.f4630c) >= i10 && i12 < i13) {
                b0VarH.b(2);
                b0VarH.a(obj);
                ((o) viewF.getLayoutParams()).f4684c = true;
            }
        }
        this.f4568b.E(i10, i11);
    }

    long G(b0 b0Var) {
        throw null;
    }

    public boolean K(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    public boolean L() {
        return !this.f4604t || this.C || this.f4572d.p();
    }

    void N() {
        this.f4572d = new androidx.recyclerview.widget.a(new f());
    }

    void Q(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(w4.a.f22454a), resources.getDimensionPixelSize(w4.a.f22456c), resources.getDimensionPixelOffset(w4.a.f22455b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + B());
        }
    }

    void R() {
        this.f4569b0 = null;
        this.I = null;
        this.f4567a0 = null;
        this.H = null;
    }

    boolean S() {
        AccessibilityManager accessibilityManager = this.A;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean T() {
        return this.E > 0;
    }

    void V() {
        int iG = this.f4574e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            ((o) this.f4574e.f(i10).getLayoutParams()).f4684c = true;
        }
        this.f4568b.k();
    }

    void W() {
        int iG = this.f4574e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            b0 b0VarH = H(this.f4574e.f(i10));
            if (b0VarH != null && !b0VarH.E()) {
                b0VarH.b(6);
            }
        }
        V();
        this.f4568b.l();
    }

    void X(int i10, int i11) {
        int iG = this.f4574e.g();
        for (int i12 = 0; i12 < iG; i12++) {
            b0 b0VarH = H(this.f4574e.f(i12));
            if (b0VarH != null && !b0VarH.E() && b0VarH.f4630c >= i10) {
                b0VarH.x(i11, false);
                this.f4605t0.f4708g = true;
            }
        }
        this.f4568b.m(i10, i11);
        requestLayout();
    }

    void Y(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iG = this.f4574e.g();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iG; i16++) {
            b0 b0VarH = H(this.f4574e.f(i16));
            if (b0VarH != null && (i15 = b0VarH.f4630c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    b0VarH.x(i11 - i10, false);
                } else {
                    b0VarH.x(i14, false);
                }
                this.f4605t0.f4708g = true;
            }
        }
        this.f4568b.n(i10, i11);
        requestLayout();
    }

    void Z(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iG = this.f4574e.g();
        for (int i13 = 0; i13 < iG; i13++) {
            b0 b0VarH = H(this.f4574e.f(i13));
            if (b0VarH != null && !b0VarH.E()) {
                int i14 = b0VarH.f4630c;
                if (i14 >= i12) {
                    b0VarH.x(-i11, z10);
                } else if (i14 >= i10) {
                    b0VarH.h(i10 - 1, -i11, z10);
                }
                this.f4605t0.f4708g = true;
            }
        }
        this.f4568b.o(i10, i11, z10);
        requestLayout();
    }

    public void a0(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        n nVar = this.f4588l;
        if (nVar == null || !nVar.V(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    void b0() {
        this.E++;
    }

    public void c(m mVar) {
        d(mVar, -1);
    }

    void c0() {
        d0(true);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.f4588l.d((o) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        n nVar = this.f4588l;
        if (nVar != null && nVar.b()) {
            return this.f4588l.f(this.f4605t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        n nVar = this.f4588l;
        if (nVar != null && nVar.b()) {
            return this.f4588l.g(this.f4605t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        n nVar = this.f4588l;
        if (nVar != null && nVar.b()) {
            return this.f4588l.h(this.f4605t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        n nVar = this.f4588l;
        if (nVar != null && nVar.c()) {
            return this.f4588l.i(this.f4605t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        n nVar = this.f4588l;
        if (nVar != null && nVar.c()) {
            return this.f4588l.j(this.f4605t0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        n nVar = this.f4588l;
        if (nVar != null && nVar.c()) {
            return this.f4588l.k(this.f4605t0);
        }
        return 0;
    }

    public void d(m mVar, int i10) {
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4592n.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f4592n.add(mVar);
        } else {
            this.f4592n.add(i10, mVar);
        }
        V();
        requestLayout();
    }

    void d0(boolean z10) {
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 < 1) {
            this.E = 0;
            if (z10) {
                p();
                w();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.f4592n.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f4592n.get(i10).g(canvas, this, this.f4605t0);
        }
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f4578g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f4578g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f4567a0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4578g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4567a0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f4569b0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4578g) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.f4569b0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f4571c0 == null || this.f4592n.size() <= 0 || !this.f4571c0.l()) ? z10 : true) {
            androidx.core.view.h.Q(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void e(r rVar) {
        this.f4594o.add(rVar);
    }

    public void f(s sVar) {
        if (this.f4609v0 == null) {
            this.f4609v0 = new ArrayList();
        }
        this.f4609v0.add(sVar);
    }

    public void f0(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewF0 = this.f4588l.f0(view, i10);
        if (viewF0 != null) {
            return viewF0;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (viewFindNextFocus == null || viewFindNextFocus.hasFocusable()) {
            return U(view, viewFindNextFocus, i10) ? viewFindNextFocus : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        r0(viewFindNextFocus, null);
        return view;
    }

    void g(String str) {
        if (T()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + B());
        }
        if (this.F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + B()));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.f4588l;
        if (nVar != null) {
            return nVar.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.f4588l;
        if (nVar != null) {
            return nVar.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f4588l;
        if (nVar != null) {
            return nVar.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    public g getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        n nVar = this.f4588l;
        return nVar != null ? nVar.q() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        i iVar = this.B0;
        return iVar == null ? super.getChildDrawingOrder(i10, i11) : iVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4578g;
    }

    public androidx.recyclerview.widget.i getCompatAccessibilityDelegate() {
        return this.A0;
    }

    public j getEdgeEffectFactory() {
        return this.G;
    }

    public k getItemAnimator() {
        return this.f4571c0;
    }

    public int getItemDecorationCount() {
        return this.f4592n.size();
    }

    public n getLayoutManager() {
        return this.f4588l;
    }

    public int getMaxFlingVelocity() {
        return this.f4591m0;
    }

    public int getMinFlingVelocity() {
        return this.f4589l0;
    }

    long getNanoTime() {
        if (Q0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4597p0;
    }

    public t getRecycledViewPool() {
        return this.f4568b.g();
    }

    public int getScrollState() {
        return this.f4573d0;
    }

    boolean h(b0 b0Var) {
        k kVar = this.f4571c0;
        return kVar == null || kVar.c(b0Var, b0Var.m());
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    void i0(boolean z10) {
        this.D = z10 | this.D;
        this.C = true;
        W();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4598q;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void k(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.H.onRelease();
            zIsFinished = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4567a0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f4567a0.onRelease();
            zIsFinished |= this.f4567a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.I.onRelease();
            zIsFinished |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4569b0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f4569b0.onRelease();
            zIsFinished |= this.f4569b0.isFinished();
        }
        if (zIsFinished) {
            androidx.core.view.h.Q(this);
        }
    }

    void k0(b0 b0Var, k.c cVar) {
        b0Var.A(0, 8192);
        if (this.f4605t0.f4710i && b0Var.v() && !b0Var.s() && !b0Var.E()) {
            this.f4576f.a(G(b0Var), b0Var);
        }
        this.f4576f.b(b0Var, cVar);
    }

    void l() {
        if (!this.f4604t || this.C) {
            k3.g.a("RV FullInvalidate");
            q();
            k3.g.b();
            return;
        }
        if (this.f4572d.p()) {
            if (this.f4572d.o(4) && !this.f4572d.o(11)) {
                k3.g.a("RV PartialInvalidate");
                z0();
                b0();
                this.f4572d.r();
                if (!this.f4608v) {
                    if (M()) {
                        q();
                    } else {
                        this.f4572d.i();
                    }
                }
                B0(true);
                c0();
            } else {
                if (!this.f4572d.p()) {
                    return;
                }
                k3.g.a("RV FullInvalidate");
                q();
            }
            k3.g.b();
        }
    }

    void m0() {
        k kVar = this.f4571c0;
        if (kVar != null) {
            kVar.g();
        }
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.w0(this.f4568b);
            this.f4588l.x0(this.f4568b);
        }
        this.f4568b.b();
    }

    void n(int i10, int i11) {
        setMeasuredDimension(n.e(i10, getPaddingLeft() + getPaddingRight(), androidx.core.view.h.v(this)), n.e(i11, getPaddingTop() + getPaddingBottom(), androidx.core.view.h.u(this)));
    }

    boolean n0(View view) {
        z0();
        boolean zL = this.f4574e.l(view);
        if (zL) {
            b0 b0VarH = H(view);
            this.f4568b.B(b0VarH);
            this.f4568b.u(b0VarH);
        }
        B0(!zL);
        return zL;
    }

    void o(View view) {
        H(view);
        a0(view);
        List<p> list = this.B;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.B.get(size).a(view);
            }
        }
    }

    public void o0(m mVar) {
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4592n.remove(mVar);
        if (this.f4592n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        V();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = 0;
        this.f4598q = true;
        this.f4604t = this.f4604t && !isLayoutRequested();
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.l(this);
        }
        this.f4617z0 = false;
        if (Q0) {
            ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f4854e;
            androidx.recyclerview.widget.e eVar = threadLocal.get();
            this.f4601r0 = eVar;
            if (eVar == null) {
                this.f4601r0 = new androidx.recyclerview.widget.e();
                Display displayP = androidx.core.view.h.p(this);
                float f10 = 60.0f;
                if (!isInEditMode() && displayP != null) {
                    float refreshRate = displayP.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.f4601r0;
                eVar2.f4858c = (long) (1.0E9f / f10);
                threadLocal.set(eVar2);
            }
            this.f4601r0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        k kVar = this.f4571c0;
        if (kVar != null) {
            kVar.g();
        }
        D0();
        this.f4598q = false;
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.m(this, this.f4568b);
        }
        this.I0.clear();
        removeCallbacks(this.J0);
        this.f4576f.c();
        if (!Q0 || (eVar = this.f4601r0) == null) {
            return;
        }
        eVar.j(this);
        this.f4601r0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4592n.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4592n.get(i10).e(canvas, this, this.f4605t0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f4588l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4610w
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f4588l
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f4588l
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f4588l
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f4588l
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f4593n0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4595o0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.t0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f4610w) {
            return false;
        }
        if (u(motionEvent)) {
            i();
            return true;
        }
        n nVar = this.f4588l;
        if (nVar == null) {
            return false;
        }
        boolean zB = nVar.b();
        boolean zC = this.f4588l.c();
        if (this.f4577f0 == null) {
            this.f4577f0 = VelocityTracker.obtain();
        }
        this.f4577f0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4612x) {
                this.f4612x = false;
            }
            this.f4575e0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f4583i0 = x10;
            this.f4579g0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f4585j0 = y10;
            this.f4581h0 = y10;
            if (this.f4573d0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.G0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zB;
            if (zC) {
                i10 = (zB ? 1 : 0) | 2;
            }
            A0(i10, 0);
        } else if (actionMasked == 1) {
            this.f4577f0.clear();
            C0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f4575e0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4575e0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f4573d0 != 1) {
                int i11 = x11 - this.f4579g0;
                int i12 = y11 - this.f4581h0;
                if (!zB || Math.abs(i11) <= this.f4587k0) {
                    z10 = false;
                } else {
                    this.f4583i0 = x11;
                    z10 = true;
                }
                if (zC && Math.abs(i12) > this.f4587k0) {
                    this.f4585j0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            i();
        } else if (actionMasked == 5) {
            this.f4575e0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4583i0 = x12;
            this.f4579g0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4585j0 = y12;
            this.f4581h0 = y12;
        } else if (actionMasked == 6) {
            e0(motionEvent);
        }
        return this.f4573d0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        k3.g.a("RV OnLayout");
        q();
        k3.g.b();
        this.f4604t = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        n nVar = this.f4588l;
        if (nVar == null) {
            n(i10, i11);
            return;
        }
        if (nVar.Q()) {
            View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getMode(i11);
            this.f4588l.m0(this.f4568b, this.f4605t0, i10, i11);
            return;
        }
        if (this.f4600r) {
            this.f4588l.m0(this.f4568b, this.f4605t0, i10, i11);
            return;
        }
        if (this.f4616z) {
            z0();
            b0();
            h0();
            c0();
            y yVar = this.f4605t0;
            if (yVar.f4713l) {
                yVar.f4709h = true;
            } else {
                this.f4572d.j();
                this.f4605t0.f4709h = false;
            }
            this.f4616z = false;
            B0(false);
        } else if (this.f4605t0.f4713l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        this.f4605t0.f4707f = 0;
        z0();
        this.f4588l.m0(this.f4568b, this.f4605t0, i10, i11);
        B0(false);
        this.f4605t0.f4709h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (T()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f4570c = xVar;
        super.onRestoreInstanceState(xVar.a());
        n nVar = this.f4588l;
        if (nVar == null || (parcelable2 = this.f4570c.f4701c) == null) {
            return;
        }
        nVar.p0(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f4570c;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            n nVar = this.f4588l;
            xVar.f4701c = nVar != null ? nVar.q0() : null;
        }
        return xVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p0(r rVar) {
        this.f4594o.remove(rVar);
        if (this.f4596p == rVar) {
            this.f4596p = null;
        }
    }

    void q() {
        Log.e("RecyclerView", "No adapter attached; skipping layout");
    }

    public void q0(s sVar) {
        List<s> list = this.f4609v0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public boolean r(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        b0 b0VarH = H(view);
        if (b0VarH != null) {
            if (b0VarH.u()) {
                b0VarH.e();
            } else if (!b0VarH.E()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + b0VarH + B());
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4588l.o0(this, this.f4605t0, view, view2) && view2 != null) {
            r0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f4588l.B0(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f4594o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4594o.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4606u != 0 || this.f4610w) {
            this.f4608v = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean s(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        n nVar = this.f4588l;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4610w) {
            return;
        }
        boolean zB = nVar.b();
        boolean zC = this.f4588l.c();
        if (zB || zC) {
            if (!zB) {
                i10 = 0;
            }
            if (!zC) {
                i11 = 0;
            }
            t0(i10, i11, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (w0(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.i iVar) {
        this.A0 = iVar;
        androidx.core.view.h.W(this, iVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        u0(gVar, false, true);
        i0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar == this.B0) {
            return;
        }
        this.B0 = iVar;
        setChildrenDrawingOrderEnabled(iVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f4578g) {
            R();
        }
        this.f4578g = z10;
        super.setClipToPadding(z10);
        if (this.f4604t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        n3.g.h(jVar);
        this.G = jVar;
        R();
    }

    public void setHasFixedSize(boolean z10) {
        this.f4600r = z10;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.f4571c0;
        if (kVar2 != null) {
            kVar2.g();
            this.f4571c0.q(null);
        }
        this.f4571c0 = kVar;
        if (kVar != null) {
            kVar.q(this.f4615y0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f4568b.y(i10);
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.f4610w) {
            g("Do not setLayoutFrozen in layout or scroll");
            if (!z10) {
                this.f4610w = false;
                if (this.f4608v) {
                    n nVar = this.f4588l;
                }
                this.f4608v = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4610w = true;
            this.f4612x = true;
            D0();
        }
    }

    public void setLayoutManager(n nVar) {
        if (nVar == this.f4588l) {
            return;
        }
        D0();
        if (this.f4588l != null) {
            k kVar = this.f4571c0;
            if (kVar != null) {
                kVar.g();
            }
            this.f4588l.w0(this.f4568b);
            this.f4588l.x0(this.f4568b);
            this.f4568b.b();
            if (this.f4598q) {
                this.f4588l.m(this, this.f4568b);
            }
            this.f4588l.F0(null);
            this.f4588l = null;
        } else {
            this.f4568b.b();
        }
        this.f4574e.j();
        this.f4588l = nVar;
        if (nVar != null) {
            if (nVar.f4661b != null) {
                throw new IllegalArgumentException("LayoutManager " + nVar + " is already attached to a RecyclerView:" + nVar.f4661b.B());
            }
            nVar.F0(this);
            if (this.f4598q) {
                this.f4588l.l(this);
            }
        }
        this.f4568b.C();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setOnFlingListener(q qVar) {
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f4607u0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f4597p0 = z10;
    }

    public void setRecycledViewPool(t tVar) {
        this.f4568b.w(tVar);
    }

    public void setRecyclerListener(v vVar) {
        this.f4590m = vVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.f4573d0) {
            return;
        }
        this.f4573d0 = i10;
        if (i10 != 2) {
            E0();
        }
        v(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i10 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f4587k0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(z zVar) {
        this.f4568b.x(zVar);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    boolean t0(int i10, int i11, MotionEvent motionEvent) {
        l();
        if (!this.f4592n.isEmpty()) {
            invalidate();
        }
        if (s(0, 0, 0, 0, this.E0, 0)) {
            int i12 = this.f4583i0;
            int[] iArr = this.E0;
            int i13 = iArr[0];
            this.f4583i0 = i12 - i13;
            int i14 = this.f4585j0;
            int i15 = iArr[1];
            this.f4585j0 = i14 - i15;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i13, i15);
            }
            int[] iArr2 = this.G0;
            int i16 = iArr2[0];
            int[] iArr3 = this.E0;
            iArr2[0] = i16 + iArr3[0];
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !c0.a(motionEvent, 8194)) {
                j0(motionEvent.getX(), 0, motionEvent.getY(), 0);
            }
            k(i10, i11);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return false;
    }

    void v(int i10) {
        n nVar = this.f4588l;
        if (nVar != null) {
            nVar.r0(i10);
        }
        f0(i10);
        s sVar = this.f4607u0;
        if (sVar != null) {
            sVar.a(this, i10);
        }
        List<s> list = this.f4609v0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4609v0.get(size).a(this, i10);
            }
        }
    }

    boolean v0(b0 b0Var, int i10) {
        if (!T()) {
            androidx.core.view.h.f0(b0Var.f4628a, i10);
            return true;
        }
        b0Var.f4644q = i10;
        this.I0.add(b0Var);
        return false;
    }

    void w() {
        int i10;
        for (int size = this.I0.size() - 1; size >= 0; size--) {
            b0 b0Var = this.I0.get(size);
            if (b0Var.f4628a.getParent() == this && !b0Var.E() && (i10 = b0Var.f4644q) != -1) {
                androidx.core.view.h.f0(b0Var.f4628a, i10);
                b0Var.f4644q = -1;
            }
        }
        this.I0.clear();
    }

    boolean w0(AccessibilityEvent accessibilityEvent) {
        if (!T()) {
            return false;
        }
        int iA = accessibilityEvent != null ? p3.b.a(accessibilityEvent) : 0;
        this.f4614y |= iA != 0 ? iA : 0;
        return true;
    }

    void x() {
        int measuredWidth;
        int measuredHeight;
        if (this.f4569b0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.G.a(this, 3);
        this.f4569b0 = edgeEffectA;
        if (this.f4578g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    public void x0(int i10, int i11) {
        y0(i10, i11, null);
    }

    void y() {
        int measuredHeight;
        int measuredWidth;
        if (this.H != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.G.a(this, 0);
        this.H = edgeEffectA;
        if (this.f4578g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    public void y0(int i10, int i11, Interpolator interpolator) {
        n nVar = this.f4588l;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4610w) {
            return;
        }
        if (!nVar.b()) {
            i10 = 0;
        }
        if (!this.f4588l.c()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f4599q0.h(i10, i11, interpolator);
    }

    void z() {
        int measuredHeight;
        int measuredWidth;
        if (this.f4567a0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.G.a(this, 2);
        this.f4567a0 = edgeEffectA;
        if (this.f4578g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void z0() {
        int i10 = this.f4606u + 1;
        this.f4606u = i10;
        if (i10 != 1 || this.f4610w) {
            return;
        }
        this.f4608v = false;
    }
}
