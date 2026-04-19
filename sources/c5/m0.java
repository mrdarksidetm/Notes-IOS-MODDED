package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import c5.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends l {
    private static final String[] X = {"android:visibility:visibility", "android:visibility:parent"};
    private int I = 3;

    class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6505c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f6503a = viewGroup;
            this.f6504b = view;
            this.f6505c = view2;
        }

        @Override // c5.m, c5.l.f
        public void a(l lVar) {
            if (this.f6504b.getParent() == null) {
                x.a(this.f6503a).c(this.f6504b);
            } else {
                m0.this.cancel();
            }
        }

        @Override // c5.m, c5.l.f
        public void c(l lVar) {
            x.a(this.f6503a).d(this.f6504b);
        }

        @Override // c5.l.f
        public void d(l lVar) {
            this.f6505c.setTag(i.f6461a, null);
            x.a(this.f6503a).d(this.f6504b);
            lVar.T(this);
        }
    }

    private static class b extends AnimatorListenerAdapter implements l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f6507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f6509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f6510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f6511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f6512f = false;

        b(View view, int i10, boolean z10) {
            this.f6507a = view;
            this.f6508b = i10;
            this.f6509c = (ViewGroup) view.getParent();
            this.f6510d = z10;
            g(true);
        }

        private void f() {
            if (!this.f6512f) {
                a0.h(this.f6507a, this.f6508b);
                ViewGroup viewGroup = this.f6509c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f6510d || this.f6511e == z10 || (viewGroup = this.f6509c) == null) {
                return;
            }
            this.f6511e = z10;
            x.c(viewGroup, z10);
        }

        @Override // c5.l.f
        public void a(l lVar) {
            g(true);
        }

        @Override // c5.l.f
        public void b(l lVar) {
        }

        @Override // c5.l.f
        public void c(l lVar) {
            g(false);
        }

        @Override // c5.l.f
        public void d(l lVar) {
            f();
            lVar.T(this);
        }

        @Override // c5.l.f
        public void e(l lVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6512f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f6512f) {
                return;
            }
            a0.h(this.f6507a, this.f6508b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f6512f) {
                return;
            }
            a0.h(this.f6507a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f6513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f6514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f6517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f6518f;

        c() {
        }
    }

    private void g0(s sVar) {
        sVar.f6534a.put("android:visibility:visibility", Integer.valueOf(sVar.f6535b.getVisibility()));
        sVar.f6534a.put("android:visibility:parent", sVar.f6535b.getParent());
        int[] iArr = new int[2];
        sVar.f6535b.getLocationOnScreen(iArr);
        sVar.f6534a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r9 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r0.f6517e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0.f6515c == 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private c5.m0.c h0(c5.s r8, c5.s r9) {
        /*
            r7 = this;
            c5.m0$c r0 = new c5.m0$c
            r0.<init>()
            r1 = 0
            r0.f6513a = r1
            r0.f6514b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6534a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6534a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f6515c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f6534a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f6517e = r6
            goto L37
        L33:
            r0.f6515c = r4
            r0.f6517e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f6534a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6534a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f6516d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f6534a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f6518f = r2
            goto L5e
        L5a:
            r0.f6516d = r4
            r0.f6518f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f6515c
            int r9 = r0.f6516d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f6517e
            android.view.ViewGroup r4 = r0.f6518f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f6518f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f6517e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f6516d
            if (r8 != 0) goto L8d
        L88:
            r0.f6514b = r2
        L8a:
            r0.f6513a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f6515c
            if (r8 != 0) goto L96
        L93:
            r0.f6514b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.m0.h0(c5.s, c5.s):c5.m0$c");
    }

    @Override // c5.l
    public String[] H() {
        return X;
    }

    @Override // c5.l
    public boolean J(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f6534a.containsKey("android:visibility:visibility") != sVar.f6534a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarH0 = h0(sVar, sVar2);
        if (cVarH0.f6513a) {
            return cVarH0.f6515c == 0 || cVarH0.f6516d == 0;
        }
        return false;
    }

    @Override // c5.l
    public void g(s sVar) {
        g0(sVar);
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    @Override // c5.l
    public void j(s sVar) {
        g0(sVar);
    }

    public Animator j0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.I & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f6535b.getParent();
            if (h0(v(view, false), I(view, false)).f6513a) {
                return null;
            }
        }
        return i0(viewGroup, sVar2.f6535b, sVar, sVar2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[PHI: r8
  0x008f: PHI (r8v3 android.view.View) = 
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v6 android.view.View)
 binds: [B:26:0x0048, B:31:0x0057, B:36:0x007c, B:38:0x007f, B:40:0x0085, B:42:0x0089, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator l0(android.view.ViewGroup r18, c5.s r19, int r20, c5.s r21, int r22) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.m0.l0(android.view.ViewGroup, c5.s, int, c5.s, int):android.animation.Animator");
    }

    public void m0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.I = i10;
    }

    @Override // c5.l
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarH0 = h0(sVar, sVar2);
        if (!cVarH0.f6513a) {
            return null;
        }
        if (cVarH0.f6517e == null && cVarH0.f6518f == null) {
            return null;
        }
        return cVarH0.f6514b ? j0(viewGroup, sVar, cVarH0.f6515c, sVar2, cVarH0.f6516d) : l0(viewGroup, sVar, cVarH0.f6515c, sVar2, cVarH0.f6516d);
    }
}
