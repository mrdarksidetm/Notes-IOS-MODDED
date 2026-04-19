package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.d0;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends d0 implements w.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final w f3943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f3944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f3945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f3946w;

    a(w wVar) {
        super(wVar.u0(), wVar.w0() != null ? wVar.w0().f().getClassLoader() : null);
        this.f3945v = -1;
        this.f3946w = false;
        this.f3943t = wVar;
    }

    @Override // androidx.fragment.app.w.n
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4000i) {
            return true;
        }
        this.f3943t.h(this);
        return true;
    }

    @Override // androidx.fragment.app.d0
    public int f() {
        return o(false);
    }

    @Override // androidx.fragment.app.d0
    public int g() {
        return o(true);
    }

    @Override // androidx.fragment.app.d0
    public void h() {
        j();
        this.f3943t.c0(this, false);
    }

    @Override // androidx.fragment.app.d0
    public void i() {
        j();
        this.f3943t.c0(this, true);
    }

    @Override // androidx.fragment.app.d0
    void k(int i10, n nVar, String str, int i11) {
        super.k(i10, nVar, str, i11);
        nVar.mFragmentManager = this.f3943t;
    }

    @Override // androidx.fragment.app.d0
    public d0 l(n nVar) {
        w wVar = nVar.mFragmentManager;
        if (wVar == null || wVar == this.f3943t) {
            return super.l(nVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + nVar.toString() + " is already attached to a FragmentManager.");
    }

    void n(int i10) {
        if (this.f4000i) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3994c.size();
            for (int i11 = 0; i11 < size; i11++) {
                d0.a aVar = this.f3994c.get(i11);
                n nVar = aVar.f4012b;
                if (nVar != null) {
                    nVar.mBackStackNesting += i10;
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4012b + " to " + aVar.f4012b.mBackStackNesting);
                    }
                }
            }
        }
    }

    int o(boolean z10) {
        if (this.f3944u) {
            throw new IllegalStateException("commit already called");
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new i0("FragmentManager"));
            p("  ", printWriter);
            printWriter.close();
        }
        this.f3944u = true;
        this.f3945v = this.f4000i ? this.f3943t.l() : -1;
        this.f3943t.Z(this, z10);
        return this.f3945v;
    }

    public void p(String str, PrintWriter printWriter) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4002k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3945v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3944u);
            if (this.f3999h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3999h));
            }
            if (this.f3995d != 0 || this.f3996e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3995d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3996e));
            }
            if (this.f3997f != 0 || this.f3998g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3997f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3998g));
            }
            if (this.f4003l != 0 || this.f4004m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4003l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4004m);
            }
            if (this.f4005n != 0 || this.f4006o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4005n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4006o);
            }
        }
        if (this.f3994c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3994c.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0.a aVar = this.f3994c.get(i10);
            switch (aVar.f4011a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4011a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4012b);
            if (z10) {
                if (aVar.f4014d != 0 || aVar.f4015e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4014d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4015e));
                }
                if (aVar.f4016f != 0 || aVar.f4017g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4016f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4017g));
                }
            }
        }
    }

    void r() {
        w wVar;
        int size = this.f3994c.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0.a aVar = this.f3994c.get(i10);
            n nVar = aVar.f4012b;
            if (nVar != null) {
                nVar.mBeingSaved = this.f3946w;
                nVar.setPopDirection(false);
                nVar.setNextTransition(this.f3999h);
                nVar.setSharedElementNames(this.f4007p, this.f4008q);
            }
            switch (aVar.f4011a) {
                case 1:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.s1(nVar, false);
                    this.f3943t.i(nVar);
                    continue;
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4011a);
                case 3:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.k1(nVar);
                    continue;
                    break;
                case 4:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.G0(nVar);
                    continue;
                    break;
                case 5:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.s1(nVar, false);
                    this.f3943t.w1(nVar);
                    continue;
                    break;
                case 6:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.x(nVar);
                    continue;
                    break;
                case 7:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.s1(nVar, false);
                    this.f3943t.n(nVar);
                    continue;
                    break;
                case 8:
                    wVar = this.f3943t;
                    break;
                case 9:
                    wVar = this.f3943t;
                    nVar = null;
                    break;
                case 10:
                    this.f3943t.t1(nVar, aVar.f4019i);
                    continue;
                    break;
            }
            wVar.u1(nVar);
        }
    }

    void s() {
        w wVar;
        for (int size = this.f3994c.size() - 1; size >= 0; size--) {
            d0.a aVar = this.f3994c.get(size);
            n nVar = aVar.f4012b;
            if (nVar != null) {
                nVar.mBeingSaved = this.f3946w;
                nVar.setPopDirection(true);
                nVar.setNextTransition(w.p1(this.f3999h));
                nVar.setSharedElementNames(this.f4008q, this.f4007p);
            }
            switch (aVar.f4011a) {
                case 1:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.s1(nVar, true);
                    this.f3943t.k1(nVar);
                    continue;
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4011a);
                case 3:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.i(nVar);
                    continue;
                    break;
                case 4:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.w1(nVar);
                    continue;
                    break;
                case 5:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.s1(nVar, true);
                    this.f3943t.G0(nVar);
                    continue;
                    break;
                case 6:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.n(nVar);
                    continue;
                    break;
                case 7:
                    nVar.setAnimations(aVar.f4014d, aVar.f4015e, aVar.f4016f, aVar.f4017g);
                    this.f3943t.s1(nVar, true);
                    this.f3943t.x(nVar);
                    continue;
                    break;
                case 8:
                    wVar = this.f3943t;
                    nVar = null;
                    break;
                case 9:
                    wVar = this.f3943t;
                    break;
                case 10:
                    this.f3943t.t1(nVar, aVar.f4018h);
                    continue;
                    break;
            }
            wVar.u1(nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.n t(java.util.ArrayList<androidx.fragment.app.n> r17, androidx.fragment.app.n r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.d0$a> r5 = r0.f3994c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList<androidx.fragment.app.d0$a> r5 = r0.f3994c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.d0$a r5 = (androidx.fragment.app.d0.a) r5
            int r6 = r5.f4011a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb6
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L5a
            if (r6 == r10) goto L43
            r9 = 6
            if (r6 == r9) goto L43
            r7 = 7
            if (r6 == r7) goto Lb6
            r7 = 8
            if (r6 == r7) goto L31
            goto Lbb
        L31:
            java.util.ArrayList<androidx.fragment.app.d0$a> r6 = r0.f3994c
            androidx.fragment.app.d0$a r7 = new androidx.fragment.app.d0$a
            r7.<init>(r11, r3, r8)
            r6.add(r4, r7)
            r5.f4013c = r8
            int r4 = r4 + 1
            androidx.fragment.app.n r3 = r5.f4012b
            goto Lbb
        L43:
            androidx.fragment.app.n r6 = r5.f4012b
            r1.remove(r6)
            androidx.fragment.app.n r5 = r5.f4012b
            if (r5 != r3) goto Lbb
            java.util.ArrayList<androidx.fragment.app.d0$a> r3 = r0.f3994c
            androidx.fragment.app.d0$a r6 = new androidx.fragment.app.d0$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lbb
        L5a:
            androidx.fragment.app.n r6 = r5.f4012b
            int r9 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.n r14 = (androidx.fragment.app.n) r14
            int r15 = r14.mContainerId
            if (r15 != r9) goto La1
            if (r14 != r6) goto L74
            r13 = r8
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList<androidx.fragment.app.d0$a> r3 = r0.f3994c
            androidx.fragment.app.d0$a r15 = new androidx.fragment.app.d0$a
            r15.<init>(r11, r14, r8)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L83:
            androidx.fragment.app.d0$a r15 = new androidx.fragment.app.d0$a
            r15.<init>(r10, r14, r8)
            int r2 = r5.f4014d
            r15.f4014d = r2
            int r2 = r5.f4016f
            r15.f4016f = r2
            int r2 = r5.f4015e
            r15.f4015e = r2
            int r2 = r5.f4017g
            r15.f4017g = r2
            java.util.ArrayList<androidx.fragment.app.d0$a> r2 = r0.f3994c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList<androidx.fragment.app.d0$a> r2 = r0.f3994c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f4011a = r8
            r5.f4013c = r8
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.n r2 = r5.f4012b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r8
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.t(java.util.ArrayList, androidx.fragment.app.n):androidx.fragment.app.n");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3945v >= 0) {
            sb2.append(" #");
            sb2.append(this.f3945v);
        }
        if (this.f4002k != null) {
            sb2.append(" ");
            sb2.append(this.f4002k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public String u() {
        return this.f4002k;
    }

    public void v() {
        if (this.f4010s != null) {
            for (int i10 = 0; i10 < this.f4010s.size(); i10++) {
                this.f4010s.get(i10).run();
            }
            this.f4010s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.n w(java.util.ArrayList<androidx.fragment.app.n> r6, androidx.fragment.app.n r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.d0$a> r0 = r5.f3994c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.d0$a> r2 = r5.f3994c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.d0$a r2 = (androidx.fragment.app.d0.a) r2
            int r3 = r2.f4011a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.g$b r3 = r2.f4018h
            r2.f4019i = r3
            goto L32
        L22:
            androidx.fragment.app.n r7 = r2.f4012b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.n r2 = r2.f4012b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.n r2 = r2.f4012b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.w(java.util.ArrayList, androidx.fragment.app.n):androidx.fragment.app.n");
    }
}
