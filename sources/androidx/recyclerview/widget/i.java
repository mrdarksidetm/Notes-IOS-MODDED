package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class i extends androidx.core.view.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f4880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.core.view.a f4881e = new a(this);

    public static class a extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final i f4882d;

        public a(i iVar) {
            this.f4882d = iVar;
        }

        @Override // androidx.core.view.a
        public void h(View view, p3.g gVar) {
            super.h(view, gVar);
            if (this.f4882d.p() || this.f4882d.f4880d.getLayoutManager() == null) {
                return;
            }
            this.f4882d.f4880d.getLayoutManager().d0(view, gVar);
        }

        @Override // androidx.core.view.a
        public boolean k(View view, int i10, Bundle bundle) {
            if (super.k(view, i10, bundle)) {
                return true;
            }
            if (this.f4882d.p() || this.f4882d.f4880d.getLayoutManager() == null) {
                return false;
            }
            return this.f4882d.f4880d.getLayoutManager().u0(view, i10, bundle);
        }
    }

    public i(RecyclerView recyclerView) {
        this.f4880d = recyclerView;
    }

    @Override // androidx.core.view.a
    public void g(View view, AccessibilityEvent accessibilityEvent) {
        super.g(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || p()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().Z(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void h(View view, p3.g gVar) {
        super.h(view, gVar);
        gVar.e0(RecyclerView.class.getName());
        if (p() || this.f4880d.getLayoutManager() == null) {
            return;
        }
        this.f4880d.getLayoutManager().c0(gVar);
    }

    @Override // androidx.core.view.a
    public boolean k(View view, int i10, Bundle bundle) {
        if (super.k(view, i10, bundle)) {
            return true;
        }
        if (p() || this.f4880d.getLayoutManager() == null) {
            return false;
        }
        return this.f4880d.getLayoutManager().s0(i10, bundle);
    }

    boolean p() {
        return this.f4880d.L();
    }
}
