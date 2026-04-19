package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import rc.s;

/* JADX INFO: loaded from: classes2.dex */
class c extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12998a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12999b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<b> f13000c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<b> f13001d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<tc.b> f13002e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f13003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f13004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f13006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f13007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BaseInputConnection f13009l;

    class a extends BaseInputConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Editable f13010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z10, Editable editable) {
            super(view, z10);
            this.f13010a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f13010a;
        }
    }

    interface b {
        void b(boolean z10, boolean z11, boolean z12);
    }

    public c(s.e eVar, View view) {
        this.f13009l = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z10, boolean z11, boolean z12) {
        this.f12999b++;
        bVar.b(z10, z11, z12);
        this.f12999b--;
    }

    private void k(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            Iterator<b> it = this.f13000c.iterator();
            while (it.hasNext()) {
                j(it.next(), z10, z11, z12);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f12999b > 0) {
            cc.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f12998a > 0) {
            cc.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f13001d;
        } else {
            arrayList = this.f13000c;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f12998a++;
        if (this.f12999b > 0) {
            cc.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f12998a != 1 || this.f13000c.isEmpty()) {
            return;
        }
        this.f13004g = toString();
        this.f13005h = i();
        this.f13006i = h();
        this.f13007j = g();
        this.f13008k = f();
    }

    public void c() {
        this.f13002e.clear();
    }

    public void d() {
        int i10 = this.f12998a;
        if (i10 == 0) {
            cc.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i10 == 1) {
            Iterator<b> it = this.f13001d.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f13000c.isEmpty()) {
                cc.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f13000c.size()) + " listener(s)");
                k(!toString().equals(this.f13004g), (this.f13005h == i() && this.f13006i == h()) ? false : true, (this.f13007j == g() && this.f13008k == f()) ? false : true);
            }
        }
        this.f13000c.addAll(this.f13001d);
        this.f13001d.clear();
        this.f12998a--;
    }

    public ArrayList<tc.b> e() {
        ArrayList<tc.b> arrayList = new ArrayList<>(this.f13002e);
        this.f13002e.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f12999b > 0) {
            cc.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f13000c.remove(bVar);
        if (this.f12998a > 0) {
            this.f13001d.remove(bVar);
        }
    }

    public void m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f13009l.setComposingRegion(i10, i11);
        }
    }

    public void n(s.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f19441a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f19442b, eVar.f19443c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f19444d, eVar.f19445e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (this.f12999b > 0) {
            cc.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String string = toString();
        int i14 = i11 - i10;
        boolean z12 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z12; i15++) {
            z12 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        if (z12) {
            this.f13003f = null;
        }
        int i16 = i();
        int iH = h();
        int iG = g();
        int iF = f();
        SpannableStringBuilder spannableStringBuilderReplace = super.replace(i10, i11, charSequence, i12, i13);
        boolean z13 = z12;
        this.f13002e.add(new tc.b(string, i10, i11, charSequence, i(), h(), g(), f()));
        if (this.f12998a > 0) {
            return spannableStringBuilderReplace;
        }
        boolean z14 = (i() == i16 && h() == iH) ? false : true;
        if (g() == iG && f() == iF) {
            z10 = z13;
            z11 = false;
        } else {
            z10 = z13;
            z11 = true;
        }
        k(z10, z14, z11);
        return spannableStringBuilderReplace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        this.f13002e.add(new tc.b(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f13003f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f13003f = string;
        return string;
    }
}
