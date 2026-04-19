package c5;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f6519a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<z.a<ViewGroup, ArrayList<l>>>> f6520b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f6521c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f6522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f6523b;

        /* JADX INFO: renamed from: c5.n$a$a, reason: collision with other inner class name */
        class C0154a extends m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z.a f6524a;

            C0154a(z.a aVar) {
                this.f6524a = aVar;
            }

            @Override // c5.l.f
            public void d(l lVar) {
                ((ArrayList) this.f6524a.get(a.this.f6523b)).remove(lVar);
                lVar.T(this);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.f6522a = lVar;
            this.f6523b = viewGroup;
        }

        private void a() {
            this.f6523b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6523b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!n.f6521c.remove(this.f6523b)) {
                return true;
            }
            z.a<ViewGroup, ArrayList<l>> aVarB = n.b();
            ArrayList<l> arrayList = aVarB.get(this.f6523b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarB.put(this.f6523b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6522a);
            this.f6522a.b(new C0154a(aVarB));
            this.f6522a.k(this.f6523b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).V(this.f6523b);
                }
            }
            this.f6522a.S(this.f6523b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            n.f6521c.remove(this.f6523b);
            ArrayList<l> arrayList = n.b().get(this.f6523b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().V(this.f6523b);
                }
            }
            this.f6522a.m(true);
        }
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (f6521c.contains(viewGroup) || !androidx.core.view.h.H(viewGroup)) {
            return;
        }
        f6521c.add(viewGroup);
        if (lVar == null) {
            lVar = f6519a;
        }
        l lVarClone = lVar.clone();
        d(viewGroup, lVarClone);
        k.c(viewGroup, null);
        c(viewGroup, lVarClone);
    }

    static z.a<ViewGroup, ArrayList<l>> b() {
        z.a<ViewGroup, ArrayList<l>> aVar;
        WeakReference<z.a<ViewGroup, ArrayList<l>>> weakReference = f6520b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        z.a<ViewGroup, ArrayList<l>> aVar2 = new z.a<>();
        f6520b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        if (lVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(lVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, l lVar) {
        ArrayList<l> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<l> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().R(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.k(viewGroup, true);
        }
        k kVarB = k.b(viewGroup);
        if (kVarB != null) {
            kVarB.a();
        }
    }
}
