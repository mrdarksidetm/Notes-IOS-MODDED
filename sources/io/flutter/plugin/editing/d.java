package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import io.flutter.embedding.android.f;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.platform.e;
import java.util.HashMap;
import rc.s;

/* JADX INFO: loaded from: classes2.dex */
public class d implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f13012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputMethodManager f13013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f13014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f13015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f13016e = new c(c.a.NO_TARGET, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s.b f13017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SparseArray<s.b> f13018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.flutter.plugin.editing.c f13019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InputConnection f13021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f13022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Rect f13023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ImeSyncDeferringInsetsCallback f13024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private s.e f13025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f13026o;

    class a implements s.f {
        a() {
        }

        @Override // rc.s.f
        public void a(String str, Bundle bundle) {
            d.this.A(str, bundle);
        }

        @Override // rc.s.f
        public void b() {
            d dVar = d.this;
            dVar.E(dVar.f13012a);
        }

        @Override // rc.s.f
        public void c(int i10, boolean z10) {
            d.this.B(i10, z10);
        }

        @Override // rc.s.f
        public void d(double d10, double d11, double[] dArr) {
            d.this.z(d10, d11, dArr);
        }

        @Override // rc.s.f
        public void e() {
            d.this.w();
        }

        @Override // rc.s.f
        public void f(boolean z10) {
            if (Build.VERSION.SDK_INT < 26 || d.this.f13014c == null) {
                return;
            }
            if (z10) {
                d.this.f13014c.commit();
            } else {
                d.this.f13014c.cancel();
            }
        }

        @Override // rc.s.f
        public void g() {
            d.this.l();
        }

        @Override // rc.s.f
        public void h(int i10, s.b bVar) {
            d.this.C(i10, bVar);
        }

        @Override // rc.s.f
        public void i(s.e eVar) {
            d dVar = d.this;
            dVar.D(dVar.f13012a, eVar);
        }

        @Override // rc.s.f
        public void j() {
            if (d.this.f13016e.f13032a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                d.this.x();
            } else {
                d dVar = d.this;
                dVar.r(dVar.f13012a);
            }
        }
    }

    class b implements InterfaceC0311d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double[] f13029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double[] f13030c;

        b(boolean z10, double[] dArr, double[] dArr2) {
            this.f13028a = z10;
            this.f13029b = dArr;
            this.f13030c = dArr2;
        }

        @Override // io.flutter.plugin.editing.d.InterfaceC0311d
        public void a(double d10, double d11) {
            double d12 = 1.0d;
            if (!this.f13028a) {
                double[] dArr = this.f13029b;
                d12 = 1.0d / (((dArr[3] * d10) + (dArr[7] * d11)) + dArr[15]);
            }
            double[] dArr2 = this.f13029b;
            double d13 = ((dArr2[0] * d10) + (dArr2[4] * d11) + dArr2[12]) * d12;
            double d14 = ((dArr2[1] * d10) + (dArr2[5] * d11) + dArr2[13]) * d12;
            double[] dArr3 = this.f13030c;
            if (d13 < dArr3[0]) {
                dArr3[0] = d13;
            } else if (d13 > dArr3[1]) {
                dArr3[1] = d13;
            }
            if (d14 < dArr3[2]) {
                dArr3[2] = d14;
            } else if (d14 > dArr3[3]) {
                dArr3[3] = d14;
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f13032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13033b;

        enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i10) {
            this.f13032a = aVar;
            this.f13033b = i10;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugin.editing.d$d, reason: collision with other inner class name */
    private interface InterfaceC0311d {
        void a(double d10, double d11);
    }

    @SuppressLint({"NewApi"})
    public d(View view, s sVar, e eVar) {
        this.f13012a = view;
        this.f13019h = new io.flutter.plugin.editing.c(null, view);
        this.f13013b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i10 = Build.VERSION.SDK_INT;
        this.f13014c = i10 >= 26 ? (AutofillManager) view.getContext().getSystemService(AutofillManager.class) : null;
        if (i10 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f13024m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f13015d = sVar;
        sVar.n(new a());
        sVar.k();
        this.f13022k = eVar;
        eVar.D(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i10, boolean z10) {
        if (!z10) {
            this.f13016e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i10);
            this.f13021j = null;
        } else {
            this.f13012a.requestFocus();
            this.f13016e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i10);
            this.f13013b.restartInput(this.f13012a);
            this.f13020i = false;
        }
    }

    private void G(s.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f19425j == null) {
            this.f13018g = null;
            return;
        }
        s.b[] bVarArr = bVar.f19427l;
        SparseArray<s.b> sparseArray = new SparseArray<>();
        this.f13018g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f19425j.f19428a.hashCode(), bVar);
            return;
        }
        for (s.b bVar2 : bVarArr) {
            s.b.a aVar = bVar2.f19425j;
            if (aVar != null) {
                this.f13018g.put(aVar.f19428a.hashCode(), bVar2);
                this.f13014c.notifyValueChanged(this.f13012a, aVar.f19428a.hashCode(), AutofillValue.forText(aVar.f19430c.f19441a));
            }
        }
    }

    private static boolean m(s.e eVar, s.e eVar2) {
        int i10 = eVar.f19445e - eVar.f19444d;
        if (i10 != eVar2.f19445e - eVar2.f19444d) {
            return true;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (eVar.f19441a.charAt(eVar.f19444d + i11) != eVar2.f19441a.charAt(eVar2.f19444d + i11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(View view) {
        x();
        this.f13013b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int s(s.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, s.d dVar) {
        s.g gVar = cVar.f19432a;
        if (gVar == s.g.DATETIME) {
            return 4;
        }
        if (gVar == s.g.NUMBER) {
            int i10 = cVar.f19433b ? 4098 : 2;
            return cVar.f19434c ? i10 | 8192 : i10;
        }
        if (gVar == s.g.PHONE) {
            return 3;
        }
        if (gVar == s.g.NONE) {
            return 0;
        }
        int i11 = 1;
        if (gVar == s.g.MULTILINE) {
            i11 = 131073;
        } else if (gVar == s.g.EMAIL_ADDRESS) {
            i11 = 33;
        } else if (gVar == s.g.URL) {
            i11 = 17;
        } else if (gVar == s.g.VISIBLE_PASSWORD) {
            i11 = 145;
        } else if (gVar == s.g.NAME) {
            i11 = 97;
        } else if (gVar == s.g.POSTAL_ADDRESS) {
            i11 = R.styleable.AppCompatTheme_toolbarStyle;
        }
        if (z10) {
            i11 = i11 | 524288 | 128;
        } else {
            if (z11) {
                i11 |= 32768;
            }
            if (!z12) {
                i11 = i11 | 524288 | 144;
            }
        }
        return dVar == s.d.CHARACTERS ? i11 | 4096 : dVar == s.d.WORDS ? i11 | 8192 : dVar == s.d.SENTENCES ? i11 | 16384 : i11;
    }

    private boolean u() {
        return this.f13018g != null;
    }

    private void v(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.f13014c == null || !u()) {
            return;
        }
        this.f13014c.notifyValueChanged(this.f13012a, this.f13017f.f19425j.f19428a.hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (Build.VERSION.SDK_INT < 26 || this.f13014c == null || !u()) {
            return;
        }
        String str = this.f13017f.f19425j.f19428a;
        int[] iArr = new int[2];
        this.f13012a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f13023l);
        rect.offset(iArr[0], iArr[1]);
        this.f13014c.notifyViewEntered(this.f13012a, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        s.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f13014c == null || (bVar = this.f13017f) == null || bVar.f19425j == null || !u()) {
            return;
        }
        this.f13014c.notifyViewExited(this.f13012a, this.f13017f.f19425j.f19428a.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(double d10, double d11, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z10 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d12 = dArr[12];
        double d13 = dArr[15];
        double d14 = d12 / d13;
        dArr2[1] = d14;
        dArr2[0] = d14;
        double d15 = dArr[13] / d13;
        dArr2[3] = d15;
        dArr2[2] = d15;
        b bVar = new b(z10, dArr, dArr2);
        bVar.a(d10, 0.0d);
        bVar.a(d10, d11);
        bVar.a(0.0d, d11);
        Float fValueOf = Float.valueOf(this.f13012a.getContext().getResources().getDisplayMetrics().density);
        this.f13023l = new Rect((int) (dArr2[0] * ((double) fValueOf.floatValue())), (int) (dArr2[2] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[1] * ((double) fValueOf.floatValue())), (int) Math.ceil(dArr2[3] * ((double) fValueOf.floatValue())));
    }

    public void A(String str, Bundle bundle) {
        this.f13013b.sendAppPrivateCommand(this.f13012a, str, bundle);
    }

    void C(int i10, s.b bVar) {
        x();
        this.f13017f = bVar;
        this.f13016e = new c(c.a.FRAMEWORK_CLIENT, i10);
        this.f13019h.l(this);
        s.b.a aVar = bVar.f19425j;
        this.f13019h = new io.flutter.plugin.editing.c(aVar != null ? aVar.f19430c : null, this.f13012a);
        G(bVar);
        this.f13020i = true;
        F();
        this.f13023l = null;
        this.f13019h.a(this);
    }

    void D(View view, s.e eVar) {
        s.e eVar2;
        if (!this.f13020i && (eVar2 = this.f13025n) != null && eVar2.b()) {
            boolean zM = m(this.f13025n, eVar);
            this.f13020i = zM;
            if (zM) {
                cc.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f13025n = eVar;
        this.f13019h.n(eVar);
        if (this.f13020i) {
            this.f13013b.restartInput(view);
            this.f13020i = false;
        }
    }

    void E(View view) {
        s.c cVar;
        s.b bVar = this.f13017f;
        if (bVar != null && (cVar = bVar.f19422g) != null && cVar.f19432a == s.g.NONE) {
            r(view);
        } else {
            view.requestFocus();
            this.f13013b.showSoftInput(view, 0);
        }
    }

    public void F() {
        if (this.f13016e.f13032a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f13026o = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // io.flutter.plugin.editing.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.c r9 = r8.f13019h
            java.lang.String r9 = r9.toString()
            r8.v(r9)
        Lb:
            io.flutter.plugin.editing.c r9 = r8.f13019h
            int r9 = r9.i()
            io.flutter.plugin.editing.c r10 = r8.f13019h
            int r10 = r10.h()
            io.flutter.plugin.editing.c r11 = r8.f13019h
            int r11 = r11.g()
            io.flutter.plugin.editing.c r0 = r8.f13019h
            int r7 = r0.f()
            io.flutter.plugin.editing.c r0 = r8.f13019h
            java.util.ArrayList r0 = r0.e()
            rc.s$e r1 = r8.f13025n
            if (r1 == 0) goto L52
            io.flutter.plugin.editing.c r1 = r8.f13019h
            java.lang.String r1 = r1.toString()
            rc.s$e r2 = r8.f13025n
            java.lang.String r2 = r2.f19441a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            rc.s$e r1 = r8.f13025n
            int r2 = r1.f19442b
            if (r9 != r2) goto L50
            int r2 = r1.f19443c
            if (r10 != r2) goto L50
            int r2 = r1.f19444d
            if (r11 != r2) goto L50
            int r1 = r1.f19445e
            if (r7 != r1) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            if (r1 != 0) goto Lac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.c r2 = r8.f13019h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            cc.b.f(r2, r1)
            rc.s$b r1 = r8.f13017f
            boolean r1 = r1.f19420e
            if (r1 == 0) goto L86
            rc.s r1 = r8.f13015d
            io.flutter.plugin.editing.d$c r2 = r8.f13016e
            int r2 = r2.f13033b
            r1.q(r2, r0)
            io.flutter.plugin.editing.c r0 = r8.f13019h
            r0.c()
            goto L99
        L86:
            rc.s r0 = r8.f13015d
            io.flutter.plugin.editing.d$c r1 = r8.f13016e
            int r1 = r1.f13033b
            io.flutter.plugin.editing.c r2 = r8.f13019h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L99:
            rc.s$e r6 = new rc.s$e
            io.flutter.plugin.editing.c r0 = r8.f13019h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f13025n = r6
            goto Lb1
        Lac:
            io.flutter.plugin.editing.c r9 = r8.f13019h
            r9.c()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.d.b(boolean, boolean, boolean):void");
    }

    public void j(SparseArray<AutofillValue> sparseArray) {
        s.b bVar;
        s.b.a aVar;
        s.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f13017f) == null || this.f13018g == null || (aVar = bVar.f19425j) == null) {
            return;
        }
        HashMap<String, s.e> map = new HashMap<>();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            s.b bVar2 = this.f13018g.get(sparseArray.keyAt(i10));
            if (bVar2 != null && (aVar2 = bVar2.f19425j) != null) {
                String string = sparseArray.valueAt(i10).getTextValue().toString();
                s.e eVar = new s.e(string, string.length(), string.length(), -1, -1);
                if (aVar2.f19428a.equals(aVar.f19428a)) {
                    this.f13019h.n(eVar);
                } else {
                    map.put(aVar2.f19428a, eVar);
                }
            }
        }
        this.f13015d.r(this.f13016e.f13033b, map);
    }

    public void k(int i10) {
        c cVar = this.f13016e;
        c.a aVar = cVar.f13032a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f13033b == i10) {
            this.f13016e = new c(c.a.NO_TARGET, 0);
            x();
            this.f13013b.hideSoftInputFromWindow(this.f13012a.getApplicationWindowToken(), 0);
            this.f13013b.restartInput(this.f13012a);
            this.f13020i = false;
        }
    }

    void l() {
        if (this.f13016e.f13032a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f13019h.l(this);
        x();
        this.f13017f = null;
        G(null);
        this.f13016e = new c(c.a.NO_TARGET, 0);
        F();
        this.f13023l = null;
        this.f13013b.restartInput(this.f13012a);
    }

    public InputConnection n(View view, f fVar, EditorInfo editorInfo) {
        c cVar = this.f13016e;
        c.a aVar = cVar.f13032a;
        if (aVar == c.a.NO_TARGET) {
            this.f13021j = null;
            return null;
        }
        if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f13026o) {
                return this.f13021j;
            }
            InputConnection inputConnectionOnCreateInputConnection = this.f13022k.b(cVar.f13033b).onCreateInputConnection(editorInfo);
            this.f13021j = inputConnectionOnCreateInputConnection;
            return inputConnectionOnCreateInputConnection;
        }
        s.b bVar = this.f13017f;
        int iS = s(bVar.f19422g, bVar.f19416a, bVar.f19417b, bVar.f19418c, bVar.f19419d, bVar.f19421f);
        editorInfo.inputType = iS;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f13017f.f19419d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f13017f.f19423h;
        int iIntValue = num == null ? (iS & 131072) != 0 ? 1 : 6 : num.intValue();
        s.b bVar2 = this.f13017f;
        String str = bVar2.f19424i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = bVar2.f19426k;
        if (strArr != null) {
            s3.b.d(editorInfo, strArr);
        }
        io.flutter.plugin.editing.b bVar3 = new io.flutter.plugin.editing.b(view, this.f13016e.f13033b, this.f13015d, fVar, this.f13019h, editorInfo);
        editorInfo.initialSelStart = this.f13019h.i();
        editorInfo.initialSelEnd = this.f13019h.h();
        this.f13021j = bVar3;
        return bVar3;
    }

    @SuppressLint({"NewApi"})
    public void o() {
        this.f13022k.Q();
        this.f13015d.n(null);
        x();
        this.f13019h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f13024m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager p() {
        return this.f13013b;
    }

    public boolean q(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!p().isAcceptingText() || (inputConnection = this.f13021j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.b ? ((io.flutter.plugin.editing.b) inputConnection).g(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void t() {
        if (this.f13016e.f13032a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f13026o = true;
        }
    }

    public void y(ViewStructure viewStructure, int i10) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !u()) {
            return;
        }
        String str = this.f13017f.f19425j.f19428a;
        AutofillId autofillId = viewStructure.getAutofillId();
        for (int i11 = 0; i11 < this.f13018g.size(); i11++) {
            int iKeyAt = this.f13018g.keyAt(i11);
            s.b.a aVar = this.f13018g.valueAt(i11).f19425j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
                viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                String[] strArr = aVar.f19429b;
                if (strArr.length > 0) {
                    viewStructureNewChild.setAutofillHints(strArr);
                }
                viewStructureNewChild.setAutofillType(1);
                viewStructureNewChild.setVisibility(0);
                String str2 = aVar.f19431d;
                if (str2 != null) {
                    viewStructureNewChild.setHint(str2);
                }
                if (str.hashCode() != iKeyAt || (rect = this.f13023l) == null) {
                    viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(aVar.f19430c.f19441a));
                } else {
                    viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f13023l.height());
                    viewStructureNewChild.setAutofillValue(AutofillValue.forText(this.f13019h));
                }
            }
        }
    }
}
