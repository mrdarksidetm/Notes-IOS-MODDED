package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p3.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f3332c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f3333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f3334b;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0081a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f3335a;

        C0081a(a aVar) {
            this.f3335a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3335a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            p3.k kVarB = this.f3335a.b(view);
            if (kVarB != null) {
                return (AccessibilityNodeProvider) kVarB.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3335a.g(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            p3.g gVarO0 = p3.g.O0(accessibilityNodeInfo);
            gVarO0.B0(h.J(view));
            gVarO0.p0(h.F(view));
            gVarO0.v0(h.l(view));
            gVarO0.F0(h.z(view));
            this.f3335a.h(view, gVarO0);
            gVarO0.f(accessibilityNodeInfo.getText(), view);
            List<g.a> listC = a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                gVarO0.b(listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3335a.i(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3335a.j(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f3335a.k(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f3335a.m(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3335a.n(view, accessibilityEvent);
        }
    }

    public a() {
        this(f3332c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3333a = accessibilityDelegate;
        this.f3334b = new C0081a(this);
    }

    static List<g.a> c(View view) {
        List<g.a> list = (List) view.getTag(c3.d.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = p3.g.p(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrP != null && i10 < clickableSpanArrP.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrP[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean l(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(c3.d.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3333a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public p3.k b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3333a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new p3.k(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f3334b;
    }

    public void g(View view, AccessibilityEvent accessibilityEvent) {
        this.f3333a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void h(View view, p3.g gVar) {
        this.f3333a.onInitializeAccessibilityNodeInfo(view, gVar.N0());
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3333a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean j(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3333a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean k(View view, int i10, Bundle bundle) {
        List<g.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            g.a aVar = listC.get(i11);
            if (aVar.a() == i10) {
                zPerformAccessibilityAction = aVar.c(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f3333a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != c3.d.f6319a || bundle == null) ? zPerformAccessibilityAction : l(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void m(View view, int i10) {
        this.f3333a.sendAccessibilityEvent(view, i10);
    }

    public void n(View view, AccessibilityEvent accessibilityEvent) {
        this.f3333a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
