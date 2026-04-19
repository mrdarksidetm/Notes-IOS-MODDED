package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class a implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n3.e<b> f4756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f4757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<b> f4758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0110a f4759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f4760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f4761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final g f4762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4763h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0110a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.b0 e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f4766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4767d;

        b(int i10, int i11, int i12, Object obj) {
            this.f4764a = i10;
            this.f4765b = i11;
            this.f4767d = i12;
            this.f4766c = obj;
        }

        String a() {
            int i10 = this.f4764a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f4764a;
            if (i10 != bVar.f4764a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4767d - this.f4765b) == 1 && this.f4767d == bVar.f4765b && this.f4765b == bVar.f4767d) {
                return true;
            }
            if (this.f4767d != bVar.f4767d || this.f4765b != bVar.f4765b) {
                return false;
            }
            Object obj2 = this.f4766c;
            Object obj3 = bVar.f4766c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4764a * 31) + this.f4765b) * 31) + this.f4767d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f4765b + "c:" + this.f4767d + ",p:" + this.f4766c + "]";
        }
    }

    a(InterfaceC0110a interfaceC0110a) {
        this(interfaceC0110a, false);
    }

    a(InterfaceC0110a interfaceC0110a, boolean z10) {
        this.f4756a = new n3.f(30);
        this.f4757b = new ArrayList<>();
        this.f4758c = new ArrayList<>();
        this.f4763h = 0;
        this.f4759d = interfaceC0110a;
        this.f4761f = z10;
        this.f4762g = new g(this);
    }

    private void c(b bVar) {
        q(bVar);
    }

    private void d(b bVar) {
        q(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f4765b;
        int i11 = bVar.f4767d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f4759d.e(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    q(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f4767d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            q(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f4765b;
        int i11 = bVar.f4767d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f4759d.e(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(b(4, i13, i12, bVar.f4766c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    q(b(4, i13, i12, bVar.f4766c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f4767d) {
            Object obj = bVar.f4766c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            q(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f4758c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4758c.get(i11);
            int i12 = bVar.f4764a;
            if (i12 == 8) {
                if (n(bVar.f4767d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4765b;
                int i14 = bVar.f4767d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f4764a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iU = u(bVar.f4765b, i11);
        int i12 = bVar.f4765b;
        int i13 = bVar.f4764a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f4767d; i15++) {
            int iU2 = u(bVar.f4765b + (i10 * i15), bVar.f4764a);
            int i16 = bVar.f4764a;
            if (i16 == 2 ? iU2 == iU : i16 == 4 && iU2 == iU + 1) {
                i14++;
            } else {
                b bVarB = b(i16, iU, i14, bVar.f4766c);
                l(bVarB, i12);
                a(bVarB);
                if (bVar.f4764a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iU = iU2;
            }
        }
        Object obj = bVar.f4766c;
        a(bVar);
        if (i14 > 0) {
            b bVarB2 = b(bVar.f4764a, iU, i14, obj);
            l(bVarB2, i12);
            a(bVarB2);
        }
    }

    private void q(b bVar) {
        this.f4758c.add(bVar);
        int i10 = bVar.f4764a;
        if (i10 == 1) {
            this.f4759d.g(bVar.f4765b, bVar.f4767d);
            return;
        }
        if (i10 == 2) {
            this.f4759d.f(bVar.f4765b, bVar.f4767d);
            return;
        }
        if (i10 == 4) {
            this.f4759d.c(bVar.f4765b, bVar.f4767d, bVar.f4766c);
        } else {
            if (i10 == 8) {
                this.f4759d.a(bVar.f4765b, bVar.f4767d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int u(int r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f4758c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L7d
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r8.f4758c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r4 = r3.f4764a
            r5 = 2
            if (r4 != r2) goto L5e
            int r2 = r3.f4765b
            int r4 = r3.f4767d
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L48
            if (r9 > r7) goto L48
            if (r6 != r2) goto L39
            if (r10 != r1) goto L31
            int r4 = r4 + 1
        L2e:
            r3.f4767d = r4
            goto L36
        L31:
            if (r10 != r5) goto L36
            int r4 = r4 + (-1)
            goto L2e
        L36:
            int r9 = r9 + 1
            goto L7a
        L39:
            if (r10 != r1) goto L40
            int r2 = r2 + 1
        L3d:
            r3.f4765b = r2
            goto L45
        L40:
            if (r10 != r5) goto L45
            int r2 = r2 + (-1)
            goto L3d
        L45:
            int r9 = r9 + (-1)
            goto L7a
        L48:
            if (r9 >= r2) goto L7a
            if (r10 != r1) goto L55
            int r2 = r2 + 1
            r3.f4765b = r2
            int r4 = r4 + 1
        L52:
            r3.f4767d = r4
            goto L7a
        L55:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            r3.f4765b = r2
            int r4 = r4 + (-1)
            goto L52
        L5e:
            int r2 = r3.f4765b
            if (r2 > r9) goto L6e
            if (r4 != r1) goto L68
            int r2 = r3.f4767d
            int r9 = r9 - r2
            goto L7a
        L68:
            if (r4 != r5) goto L7a
            int r2 = r3.f4767d
            int r9 = r9 + r2
            goto L7a
        L6e:
            if (r10 != r1) goto L75
            int r2 = r2 + 1
        L72:
            r3.f4765b = r2
            goto L7a
        L75:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            goto L72
        L7a:
            int r0 = r0 + (-1)
            goto L8
        L7d:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r10 = r8.f4758c
            int r10 = r10.size()
            int r10 = r10 - r1
        L84:
            if (r10 < 0) goto Laa
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r8.f4758c
            java.lang.Object r0 = r0.get(r10)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.a.b) r0
            int r1 = r0.f4764a
            if (r1 != r2) goto L9b
            int r1 = r0.f4767d
            int r3 = r0.f4765b
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto La7
            goto L9f
        L9b:
            int r1 = r0.f4767d
            if (r1 > 0) goto La7
        L9f:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r8.f4758c
            r1.remove(r10)
            r8.a(r0)
        La7:
            int r10 = r10 + (-1)
            goto L84
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.u(int, int):int");
    }

    @Override // androidx.recyclerview.widget.g.a
    public void a(b bVar) {
        if (this.f4761f) {
            return;
        }
        bVar.f4766c = null;
        this.f4756a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.g.a
    public b b(int i10, int i11, int i12, Object obj) {
        b bVarB = this.f4756a.b();
        if (bVarB == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarB.f4764a = i10;
        bVarB.f4765b = i11;
        bVarB.f4767d = i12;
        bVarB.f4766c = obj;
        return bVarB;
    }

    public int e(int i10) {
        int size = this.f4757b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4757b.get(i11);
            int i12 = bVar.f4764a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f4765b;
                    if (i13 <= i10) {
                        int i14 = bVar.f4767d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f4765b;
                    if (i15 == i10) {
                        i10 = bVar.f4767d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f4767d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f4765b <= i10) {
                i10 += bVar.f4767d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f4758c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4759d.d(this.f4758c.get(i10));
        }
        s(this.f4758c);
        this.f4763h = 0;
    }

    void j() {
        i();
        int size = this.f4757b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4757b.get(i10);
            int i11 = bVar.f4764a;
            if (i11 == 1) {
                this.f4759d.d(bVar);
                this.f4759d.g(bVar.f4765b, bVar.f4767d);
            } else if (i11 == 2) {
                this.f4759d.d(bVar);
                this.f4759d.h(bVar.f4765b, bVar.f4767d);
            } else if (i11 == 4) {
                this.f4759d.d(bVar);
                this.f4759d.c(bVar.f4765b, bVar.f4767d, bVar.f4766c);
            } else if (i11 == 8) {
                this.f4759d.d(bVar);
                this.f4759d.a(bVar.f4765b, bVar.f4767d);
            }
            Runnable runnable = this.f4760e;
            if (runnable != null) {
                runnable.run();
            }
        }
        s(this.f4757b);
        this.f4763h = 0;
    }

    void l(b bVar, int i10) {
        this.f4759d.b(bVar);
        int i11 = bVar.f4764a;
        if (i11 == 2) {
            this.f4759d.h(i10, bVar.f4767d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f4759d.c(i10, bVar.f4767d, bVar.f4766c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f4758c.size();
        while (i11 < size) {
            b bVar = this.f4758c.get(i11);
            int i12 = bVar.f4764a;
            if (i12 == 8) {
                int i13 = bVar.f4765b;
                if (i13 == i10) {
                    i10 = bVar.f4767d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f4767d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f4765b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f4767d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f4767d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f4763h) != 0;
    }

    boolean p() {
        return this.f4757b.size() > 0;
    }

    void r() {
        this.f4762g.b(this.f4757b);
        int size = this.f4757b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4757b.get(i10);
            int i11 = bVar.f4764a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f4760e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4757b.clear();
    }

    void s(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    void t() {
        s(this.f4757b);
        s(this.f4758c);
        this.f4763h = 0;
    }
}
