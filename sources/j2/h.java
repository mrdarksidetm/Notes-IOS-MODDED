package j2;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Layout f13836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Integer> f13837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Bidi> f13838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f13839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private char[] f13840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13841f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f13844c;

        public a(int i10, int i11, boolean z10) {
            this.f13842a = i10;
            this.f13843b = i11;
            this.f13844c = z10;
        }

        public final int a() {
            return this.f13843b;
        }

        public final int b() {
            return this.f13842a;
        }

        public final boolean c() {
            return this.f13844c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13842a == aVar.f13842a && this.f13843b == aVar.f13843b && this.f13844c == aVar.f13844c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f13842a) * 31) + Integer.hashCode(this.f13843b)) * 31) + Boolean.hashCode(this.f13844c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f13842a + ", end=" + this.f13843b + ", isRtl=" + this.f13844c + ')';
        }
    }

    public h(Layout layout) {
        this.f13836a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iX = je.w.X(this.f13836a.getText(), '\n', length, false, 4, null);
            length = iX < 0 ? this.f13836a.getText().length() : iX + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f13836a.getText().length());
        this.f13837b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f13838c = arrayList2;
        this.f13839d = new boolean[this.f13837b.size()];
        this.f13841f = this.f13837b.size();
    }

    private final float b(int i10, boolean z10) {
        int iH = ge.o.h(i10, this.f13836a.getLineEnd(this.f13836a.getLineForOffset(i10)));
        return z10 ? this.f13836a.getPrimaryHorizontal(iH) : this.f13836a.getSecondaryHorizontal(iH);
    }

    private final int i(int i10, int i11) {
        while (i10 > i11 && g(this.f13836a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f13839d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.f13838c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.f13837b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.f13837b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f13840e
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.f13836a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.h(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.f13838c
            r3.set(r12, r0)
            boolean[] r3 = r11.f13839d
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.f13840e
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.f13840e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.h.a(int):java.text.Bidi");
    }

    public final float c(int i10, boolean z10, boolean z11) {
        int i11 = i10;
        if (!z11) {
            return b(i10, z10);
        }
        int iA = g.a(this.f13836a, i11, z11);
        int lineStart = this.f13836a.getLineStart(iA);
        int lineEnd = this.f13836a.getLineEnd(iA);
        if (i11 != lineStart && i11 != lineEnd) {
            return b(i10, z10);
        }
        if (i11 == 0 || i11 == this.f13836a.getText().length()) {
            return b(i10, z10);
        }
        int iE = e(i11, z11);
        boolean zH = h(iE);
        int i12 = i(lineEnd, lineStart);
        int iF = f(iE);
        int i13 = lineStart - iF;
        int i14 = i12 - iF;
        Bidi bidiA = a(iE);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i13, i14) : null;
        boolean z12 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f13836a.isRtlCharAt(lineStart);
            if (z10 || zH == zIsRtlCharAt) {
                zH = !zH;
            }
            if (i11 == lineStart) {
                z12 = zH;
            } else if (!zH) {
                z12 = true;
            }
            Layout layout = this.f13836a;
            return z12 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            aVarArr[i15] = new a(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i17 = -1;
        if (i11 == lineStart) {
            int i18 = 0;
            while (true) {
                if (i18 >= runCount) {
                    break;
                }
                if (aVarArr[i18].b() == i11) {
                    i17 = i18;
                    break;
                }
                i18++;
            }
            a aVar = aVarArr[i17];
            if (z10 || zH == aVar.c()) {
                zH = !zH;
            }
            if (i17 == 0 && zH) {
                return this.f13836a.getLineLeft(iA);
            }
            if (i17 == nd.p.Q(aVarArr) && !zH) {
                return this.f13836a.getLineRight(iA);
            }
            Layout layout2 = this.f13836a;
            return zH ? layout2.getPrimaryHorizontal(aVarArr[i17 - 1].b()) : layout2.getPrimaryHorizontal(aVarArr[i17 + 1].b());
        }
        if (i11 > i12) {
            i11 = i(i11, lineStart);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= runCount) {
                break;
            }
            if (aVarArr[i19].a() == i11) {
                i17 = i19;
                break;
            }
            i19++;
        }
        a aVar2 = aVarArr[i17];
        if (!z10 && zH != aVar2.c()) {
            zH = !zH;
        }
        if (i17 == 0 && zH) {
            return this.f13836a.getLineLeft(iA);
        }
        if (i17 == nd.p.Q(aVarArr) && !zH) {
            return this.f13836a.getLineRight(iA);
        }
        Layout layout3 = this.f13836a;
        return zH ? layout3.getPrimaryHorizontal(aVarArr[i17 - 1].a()) : layout3.getPrimaryHorizontal(aVarArr[i17 + 1].a());
    }

    public final int d(int i10) {
        return i(this.f13836a.getLineEnd(i10), this.f13836a.getLineStart(i10));
    }

    public final int e(int i10, boolean z10) {
        int iL = nd.u.l(this.f13837b, Integer.valueOf(i10), 0, 0, 6, null);
        int i11 = iL < 0 ? -(iL + 1) : iL + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == this.f13837b.get(i12).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.f13837b.get(i10 - 1).intValue();
    }

    public final boolean g(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == 5760 || (ae.r.g(c10, 8192) >= 0 && ae.r.g(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean h(int i10) {
        return this.f13836a.getParagraphDirection(this.f13836a.getLineForOffset(f(i10))) == -1;
    }
}
