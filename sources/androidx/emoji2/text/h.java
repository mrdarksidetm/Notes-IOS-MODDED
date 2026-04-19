package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.l;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e.j f3832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f3833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e.InterfaceC0093e f3834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f3836e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    private static class b implements c<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f3837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e.j f3838b;

        b(n nVar, e.j jVar) {
            this.f3837a = nVar;
            this.f3838b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i10, int i11, m mVar) {
            if (mVar.k()) {
                return true;
            }
            if (this.f3837a == null) {
                this.f3837a = new n(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f3837a.setSpan(this.f3838b.a(mVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public n a() {
            return this.f3837a;
        }
    }

    private interface c<T> {
        T a();

        boolean b(CharSequence charSequence, int i10, int i11, m mVar);
    }

    private static class d implements c<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3839a;

        d(String str) {
            this.f3839a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i10, int i11, m mVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f3839a)) {
                return true;
            }
            mVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3840a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l.a f3841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l.a f3842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l.a f3843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f3846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f3847h;

        e(l.a aVar, boolean z10, int[] iArr) {
            this.f3841b = aVar;
            this.f3842c = aVar;
            this.f3846g = z10;
            this.f3847h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f3840a = 1;
            this.f3842c = this.f3841b;
            this.f3845f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f3842c.b().j() || d(this.f3844e)) {
                return true;
            }
            if (this.f3846g) {
                if (this.f3847h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3847h, this.f3842c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int a(int r6) {
            /*
                r5 = this;
                androidx.emoji2.text.l$a r0 = r5.f3842c
                androidx.emoji2.text.l$a r0 = r0.a(r6)
                int r1 = r5.f3840a
                r2 = 3
                r3 = 1
                r4 = 2
                if (r1 == r4) goto L1c
                if (r0 != 0) goto L14
            Lf:
                int r2 = r5.g()
                goto L4d
            L14:
                r5.f3840a = r4
                r5.f3842c = r0
                r5.f3845f = r3
            L1a:
                r2 = r4
                goto L4d
            L1c:
                if (r0 == 0) goto L26
                r5.f3842c = r0
                int r0 = r5.f3845f
                int r0 = r0 + r3
                r5.f3845f = r0
                goto L1a
            L26:
                boolean r0 = f(r6)
                if (r0 == 0) goto L2d
                goto Lf
            L2d:
                boolean r0 = d(r6)
                if (r0 == 0) goto L34
                goto L1a
            L34:
                androidx.emoji2.text.l$a r0 = r5.f3842c
                androidx.emoji2.text.m r0 = r0.b()
                if (r0 == 0) goto Lf
                int r0 = r5.f3845f
                if (r0 != r3) goto L46
                boolean r0 = r5.h()
                if (r0 == 0) goto Lf
            L46:
                androidx.emoji2.text.l$a r0 = r5.f3842c
                r5.f3843d = r0
                r5.g()
            L4d:
                r5.f3844e = r6
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.e.a(int):int");
        }

        m b() {
            return this.f3842c.b();
        }

        m c() {
            return this.f3843d.b();
        }

        boolean e() {
            return this.f3840a == 2 && this.f3842c.b() != null && (this.f3845f > 1 || h());
        }
    }

    h(l lVar, e.j jVar, e.InterfaceC0093e interfaceC0093e, boolean z10, int[] iArr, Set<int[]> set) {
        this.f3832a = jVar;
        this.f3833b = lVar;
        this.f3834c = interfaceC0093e;
        this.f3835d = z10;
        this.f3836e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        g4.a[] aVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (aVarArr = (g4.a[]) editable.getSpans(selectionStart, selectionEnd, g4.a.class)) != null && aVarArr.length > 0) {
            for (g4.a aVar : aVarArr) {
                int spanStart = editable.getSpanStart(aVar);
                int spanEnd = editable.getSpanEnd(aVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            g4.a[] aVarArr = (g4.a[]) editable.getSpans(iMax, iMin, g4.a.class);
            if (aVarArr != null && aVarArr.length > 0) {
                for (g4.a aVar : aVarArr) {
                    int spanStart = editable.getSpanStart(aVar);
                    int spanEnd = editable.getSpanEnd(aVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i10, int i11, m mVar) {
        if (mVar.d() == 0) {
            mVar.m(this.f3834c.a(charSequence, i10, i11, mVar.h()));
        }
        return mVar.d() == 2;
    }

    private static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private <T> T i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c<T> cVar) {
        int iCharCount;
        e eVar = new e(this.f3833b.f(), this.f3835d, this.f3836e);
        boolean zB = true;
        int i13 = 0;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zB) {
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA == 3) {
                    if (z10 || !d(charSequence, iCharCount, i10, eVar.c())) {
                        i13++;
                        zB = cVar.b(charSequence, iCharCount, i10, eVar.c());
                    }
                }
            }
            break loop0;
        }
        if (eVar.e() && i13 < i12 && zB && (z10 || !d(charSequence, iCharCount, i10, eVar.b()))) {
            cVar.b(charSequence, iCharCount, i10, eVar.b());
        }
        return cVar.a();
    }

    CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        g4.a[] aVarArr;
        boolean z11 = charSequence instanceof g4.b;
        if (z11) {
            ((g4.b) charSequence).a();
        }
        n nVar = null;
        if (z11) {
            nVar = new n((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    nVar = new n((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, g4.a.class) <= i11) {
                    nVar = new n(charSequence);
                }
            } finally {
                if (z11) {
                    ((g4.b) charSequence).d();
                }
            }
        }
        if (nVar != null && (aVarArr = (g4.a[]) nVar.getSpans(i10, i11, g4.a.class)) != null && aVarArr.length > 0) {
            for (g4.a aVar : aVarArr) {
                int spanStart = nVar.getSpanStart(aVar);
                int spanEnd = nVar.getSpanEnd(aVar);
                if (spanStart != i11) {
                    nVar.removeSpan(aVar);
                }
                i10 = Math.min(spanStart, i10);
                i11 = Math.max(spanEnd, i11);
            }
        }
        int i13 = i10;
        int i14 = i11;
        if (i13 != i14 && i13 < charSequence.length()) {
            if (i12 != Integer.MAX_VALUE && nVar != null) {
                i12 -= ((g4.a[]) nVar.getSpans(0, nVar.length(), g4.a.class)).length;
            }
            n nVar2 = (n) i(charSequence, i13, i14, i12, z10, new b(nVar, this.f3832a));
            if (nVar2 != null) {
                return nVar2.b();
            }
            if (z11) {
                ((g4.b) charSequence).d();
            }
            return charSequence;
        }
        if (z11) {
            ((g4.b) charSequence).d();
        }
        return charSequence;
    }
}
