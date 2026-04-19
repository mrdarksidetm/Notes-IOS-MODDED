package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<RecyclerView.b0> f4773h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<RecyclerView.b0> f4774i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<j> f4775j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<i> f4776k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.b0>> f4777l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList<ArrayList<j>> f4778m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList<ArrayList<i>> f4779n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f4780o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f4781p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f4782q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f4783r = new ArrayList<>();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4784a;

        a(ArrayList arrayList) {
            this.f4784a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f4784a) {
                c.this.J(jVar.f4818a, jVar.f4819b, jVar.f4820c, jVar.f4821d, jVar.f4822e);
            }
            this.f4784a.clear();
            c.this.f4778m.remove(this.f4784a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4786a;

        b(ArrayList arrayList) {
            this.f4786a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4786a.iterator();
            while (it.hasNext()) {
                c.this.I((i) it.next());
            }
            this.f4786a.clear();
            c.this.f4779n.remove(this.f4786a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0112c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4788a;

        RunnableC0112c(ArrayList arrayList) {
            this.f4788a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4788a.iterator();
            while (it.hasNext()) {
                c.this.H((RecyclerView.b0) it.next());
            }
            this.f4788a.clear();
            c.this.f4777l.remove(this.f4788a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f4790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f4792c;

        d(RecyclerView.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4790a = b0Var;
            this.f4791b = viewPropertyAnimator;
            this.f4792c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4791b.setListener(null);
            this.f4792c.setAlpha(1.0f);
            c.this.x(this.f4790a);
            c.this.f4782q.remove(this.f4790a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.y(this.f4790a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f4794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4796c;

        e(RecyclerView.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4794a = b0Var;
            this.f4795b = view;
            this.f4796c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4795b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4796c.setListener(null);
            c.this.r(this.f4794a);
            c.this.f4780o.remove(this.f4794a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.s(this.f4794a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f4798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f4800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4802e;

        f(RecyclerView.b0 b0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4798a = b0Var;
            this.f4799b = i10;
            this.f4800c = view;
            this.f4801d = i11;
            this.f4802e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4799b != 0) {
                this.f4800c.setTranslationX(0.0f);
            }
            if (this.f4801d != 0) {
                this.f4800c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4802e.setListener(null);
            c.this.v(this.f4798a);
            c.this.f4781p.remove(this.f4798a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.w(this.f4798a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f4804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f4806c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4804a = iVar;
            this.f4805b = viewPropertyAnimator;
            this.f4806c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4805b.setListener(null);
            this.f4806c.setAlpha(1.0f);
            this.f4806c.setTranslationX(0.0f);
            this.f4806c.setTranslationY(0.0f);
            c.this.t(this.f4804a.f4812a, true);
            c.this.f4783r.remove(this.f4804a.f4812a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.u(this.f4804a.f4812a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f4808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f4809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f4810c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4808a = iVar;
            this.f4809b = viewPropertyAnimator;
            this.f4810c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4809b.setListener(null);
            this.f4810c.setAlpha(1.0f);
            this.f4810c.setTranslationX(0.0f);
            this.f4810c.setTranslationY(0.0f);
            c.this.t(this.f4808a.f4813b, false);
            c.this.f4783r.remove(this.f4808a.f4813b);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.u(this.f4808a.f4813b, false);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.b0 f4812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.b0 f4813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4817f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4812a + ", newHolder=" + this.f4813b + ", fromX=" + this.f4814c + ", fromY=" + this.f4815d + ", toX=" + this.f4816e + ", toY=" + this.f4817f + '}';
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.b0 f4818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4822e;
    }

    private void K(RecyclerView.b0 b0Var) {
        View view = b0Var.f4628a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f4782q.add(b0Var);
        viewPropertyAnimatorAnimate.setDuration(k()).alpha(0.0f).setListener(new d(b0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void N(List<i> list, RecyclerView.b0 b0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (P(iVar, b0Var) && iVar.f4812a == null && iVar.f4813b == null) {
                list.remove(iVar);
            }
        }
    }

    private void O(i iVar) {
        RecyclerView.b0 b0Var = iVar.f4812a;
        if (b0Var != null) {
            P(iVar, b0Var);
        }
        RecyclerView.b0 b0Var2 = iVar.f4813b;
        if (b0Var2 != null) {
            P(iVar, b0Var2);
        }
    }

    private boolean P(i iVar, RecyclerView.b0 b0Var) {
        boolean z10 = false;
        if (iVar.f4813b == b0Var) {
            iVar.f4813b = null;
        } else {
            if (iVar.f4812a != b0Var) {
                return false;
            }
            iVar.f4812a = null;
            z10 = true;
        }
        b0Var.f4628a.setAlpha(1.0f);
        b0Var.f4628a.setTranslationX(0.0f);
        b0Var.f4628a.setTranslationY(0.0f);
        t(b0Var, z10);
        return true;
    }

    void H(RecyclerView.b0 b0Var) {
        View view = b0Var.f4628a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f4780o.add(b0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(h()).setListener(new e(b0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void I(i iVar) {
        RecyclerView.b0 b0Var = iVar.f4812a;
        View view = b0Var == null ? null : b0Var.f4628a;
        RecyclerView.b0 b0Var2 = iVar.f4813b;
        View view2 = b0Var2 != null ? b0Var2.f4628a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(i());
            this.f4783r.add(iVar.f4812a);
            duration.translationX(iVar.f4816e - iVar.f4814c);
            duration.translationY(iVar.f4817f - iVar.f4815d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f4783r.add(iVar.f4813b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(i()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void J(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
        View view = b0Var.f4628a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f4781p.add(b0Var);
        viewPropertyAnimatorAnimate.setDuration(j()).setListener(new f(b0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void L(List<RecyclerView.b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f4628a.animate().cancel();
        }
    }

    void M() {
        if (l()) {
            return;
        }
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public boolean c(RecyclerView.b0 b0Var, List<Object> list) {
        return !list.isEmpty() || super.c(b0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void f(RecyclerView.b0 b0Var) {
        View view = b0Var.f4628a;
        view.animate().cancel();
        int size = this.f4775j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f4775j.get(size).f4818a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(b0Var);
                this.f4775j.remove(size);
            }
        }
        N(this.f4776k, b0Var);
        if (this.f4773h.remove(b0Var)) {
            view.setAlpha(1.0f);
            x(b0Var);
        }
        if (this.f4774i.remove(b0Var)) {
            view.setAlpha(1.0f);
            r(b0Var);
        }
        for (int size2 = this.f4779n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f4779n.get(size2);
            N(arrayList, b0Var);
            if (arrayList.isEmpty()) {
                this.f4779n.remove(size2);
            }
        }
        for (int size3 = this.f4778m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f4778m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f4818a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4778m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4777l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.b0> arrayList3 = this.f4777l.get(size5);
            if (arrayList3.remove(b0Var)) {
                view.setAlpha(1.0f);
                r(b0Var);
                if (arrayList3.isEmpty()) {
                    this.f4777l.remove(size5);
                }
            }
        }
        this.f4782q.remove(b0Var);
        this.f4780o.remove(b0Var);
        this.f4783r.remove(b0Var);
        this.f4781p.remove(b0Var);
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void g() {
        int size = this.f4775j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4775j.get(size);
            View view = jVar.f4818a.f4628a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jVar.f4818a);
            this.f4775j.remove(size);
        }
        for (int size2 = this.f4773h.size() - 1; size2 >= 0; size2--) {
            x(this.f4773h.get(size2));
            this.f4773h.remove(size2);
        }
        int size3 = this.f4774i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = this.f4774i.get(size3);
            b0Var.f4628a.setAlpha(1.0f);
            r(b0Var);
            this.f4774i.remove(size3);
        }
        for (int size4 = this.f4776k.size() - 1; size4 >= 0; size4--) {
            O(this.f4776k.get(size4));
        }
        this.f4776k.clear();
        if (l()) {
            for (int size5 = this.f4778m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f4778m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f4818a.f4628a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    v(jVar2.f4818a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4778m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4777l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.b0> arrayList2 = this.f4777l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.b0 b0Var2 = arrayList2.get(size8);
                    b0Var2.f4628a.setAlpha(1.0f);
                    r(b0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4777l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4779n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f4779n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    O(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4779n.remove(arrayList3);
                    }
                }
            }
            L(this.f4782q);
            L(this.f4781p);
            L(this.f4780o);
            L(this.f4783r);
            e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public boolean l() {
        return (this.f4774i.isEmpty() && this.f4776k.isEmpty() && this.f4775j.isEmpty() && this.f4773h.isEmpty() && this.f4781p.isEmpty() && this.f4782q.isEmpty() && this.f4780o.isEmpty() && this.f4783r.isEmpty() && this.f4778m.isEmpty() && this.f4777l.isEmpty() && this.f4779n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void p() {
        boolean z10 = !this.f4773h.isEmpty();
        boolean z11 = !this.f4775j.isEmpty();
        boolean z12 = !this.f4776k.isEmpty();
        boolean z13 = !this.f4774i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.b0> it = this.f4773h.iterator();
            while (it.hasNext()) {
                K(it.next());
            }
            this.f4773h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4775j);
                this.f4778m.add(arrayList);
                this.f4775j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    androidx.core.view.h.S(arrayList.get(0).f4818a.f4628a, aVar, k());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4776k);
                this.f4779n.add(arrayList2);
                this.f4776k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    androidx.core.view.h.S(arrayList2.get(0).f4812a.f4628a, bVar, k());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.b0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4774i);
                this.f4777l.add(arrayList3);
                this.f4774i.clear();
                RunnableC0112c runnableC0112c = new RunnableC0112c(arrayList3);
                if (z10 || z11 || z12) {
                    androidx.core.view.h.S(arrayList3.get(0).f4628a, runnableC0112c, (z10 ? k() : 0L) + Math.max(z11 ? j() : 0L, z12 ? i() : 0L));
                } else {
                    runnableC0112c.run();
                }
            }
        }
    }
}
