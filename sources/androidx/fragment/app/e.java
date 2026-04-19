package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.e;
import androidx.fragment.app.l0;
import androidx.fragment.app.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l0 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends l0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f4020d;

        /* JADX INFO: renamed from: androidx.fragment.app.e$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0096a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l0.d f4021a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f4022b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f4023c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f4024d;

            AnimationAnimationListenerC0096a(l0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f4021a = dVar;
                this.f4022b = viewGroup;
                this.f4023c = view;
                this.f4024d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                ae.r.f(viewGroup, "$container");
                ae.r.f(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().f(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                ae.r.f(animation, "animation");
                final ViewGroup viewGroup = this.f4022b;
                final View view = this.f4023c;
                final a aVar = this.f4024d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.AnimationAnimationListenerC0096a.b(viewGroup, view, aVar);
                    }
                });
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f4021a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                ae.r.f(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                ae.r.f(animation, "animation");
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f4021a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            ae.r.f(bVar, "animationInfo");
            this.f4020d = bVar;
        }

        @Override // androidx.fragment.app.l0.b
        public void c(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            l0.d dVarA = this.f4020d.a();
            View view = dVarA.i().mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f4020d.a().f(this);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.l0.b
        public void d(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            if (this.f4020d.b()) {
                this.f4020d.a().f(this);
                return;
            }
            Context context = viewGroup.getContext();
            l0.d dVarA = this.f4020d.a();
            View view = dVarA.i().mView;
            b bVar = this.f4020d;
            ae.r.e(context, "context");
            p.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Animation animation = aVarC.f4215a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (dVarA.h() != l0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f4020d.a().f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            p.b bVar2 = new p.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0096a(dVarA, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has started.");
            }
        }

        public final b h() {
            return this.f4020d;
        }
    }

    private static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f4025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p.a f4027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.d dVar, boolean z10) {
            super(dVar);
            ae.r.f(dVar, "operation");
            this.f4025b = z10;
        }

        public final p.a c(Context context) {
            ae.r.f(context, "context");
            if (this.f4026c) {
                return this.f4027d;
            }
            p.a aVarB = p.b(context, a().i(), a().h() == l0.d.b.VISIBLE, this.f4025b);
            this.f4027d = aVarB;
            this.f4026c = true;
            return aVarB;
        }
    }

    private static final class c extends l0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f4028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AnimatorSet f4029e;

        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f4030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f4031b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f4032c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l0.d f4033d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f4034e;

            a(ViewGroup viewGroup, View view, boolean z10, l0.d dVar, c cVar) {
                this.f4030a = viewGroup;
                this.f4031b = view;
                this.f4032c = z10;
                this.f4033d = dVar;
                this.f4034e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ae.r.f(animator, "anim");
                this.f4030a.endViewTransition(this.f4031b);
                if (this.f4032c) {
                    l0.d.b bVarH = this.f4033d.h();
                    View view = this.f4031b;
                    ae.r.e(view, "viewToAnimate");
                    bVarH.b(view, this.f4030a);
                }
                this.f4034e.h().a().f(this.f4034e);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f4033d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            ae.r.f(bVar, "animatorInfo");
            this.f4028d = bVar;
        }

        @Override // androidx.fragment.app.l0.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.l0.b
        public void c(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            AnimatorSet animatorSet = this.f4029e;
            if (animatorSet == null) {
                this.f4028d.a().f(this);
                return;
            }
            l0.d dVarA = this.f4028d.a();
            if (!dVarA.n()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0097e.f4036a.a(animatorSet);
            }
            if (w.J0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(dVarA);
                sb2.append(" has been canceled");
                sb2.append(dVarA.n() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.l0.b
        public void d(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            l0.d dVarA = this.f4028d.a();
            AnimatorSet animatorSet = this.f4029e;
            if (animatorSet == null) {
                this.f4028d.a().f(this);
                return;
            }
            animatorSet.start();
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + dVarA + " has started.");
            }
        }

        @Override // androidx.fragment.app.l0.b
        public void e(e.b bVar, ViewGroup viewGroup) {
            ae.r.f(bVar, "backEvent");
            ae.r.f(viewGroup, "container");
            l0.d dVarA = this.f4028d.a();
            AnimatorSet animatorSet = this.f4029e;
            if (animatorSet == null) {
                this.f4028d.a().f(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVarA.i().mTransitioning) {
                return;
            }
            if (w.J0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + dVarA);
            }
            long jA = d.f4035a.a(animatorSet);
            long jA2 = (long) (bVar.a() * jA);
            if (jA2 == 0) {
                jA2 = 1;
            }
            if (jA2 == jA) {
                jA2 = jA - 1;
            }
            if (w.J0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + jA2 + " for Animator " + animatorSet + " on operation " + dVarA);
            }
            C0097e.f4036a.b(animatorSet, jA2);
        }

        @Override // androidx.fragment.app.l0.b
        public void f(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            if (this.f4028d.b()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.f4028d;
            ae.r.e(context, "context");
            p.a aVarC = bVar.c(context);
            this.f4029e = aVarC != null ? aVarC.f4216b : null;
            l0.d dVarA = this.f4028d.a();
            n nVarI = dVarA.i();
            boolean z10 = dVarA.h() == l0.d.b.GONE;
            View view = nVarI.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f4029e;
            if (animatorSet != null) {
                animatorSet.addListener(new a(viewGroup, view, z10, dVarA, this));
            }
            AnimatorSet animatorSet2 = this.f4029e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f4028d;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4035a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            ae.r.f(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    public static final class C0097e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0097e f4036a = new C0097e();

        private C0097e() {
        }

        public final void a(AnimatorSet animatorSet) {
            ae.r.f(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            ae.r.f(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l0.d f4037a;

        public f(l0.d dVar) {
            ae.r.f(dVar, "operation");
            this.f4037a = dVar;
        }

        public final l0.d a() {
            return this.f4037a;
        }

        public final boolean b() {
            l0.d.b bVar;
            View view = this.f4037a.i().mView;
            l0.d.b bVarA = view != null ? l0.d.b.f4142a.a(view) : null;
            l0.d.b bVarH = this.f4037a.h();
            return bVarA == bVarH || !(bVarA == (bVar = l0.d.b.VISIBLE) || bVarH == bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g extends l0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<h> f4038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final l0.d f4039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final l0.d f4040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final g0 f4041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f4042h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayList<View> f4043i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final ArrayList<View> f4044j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final z.a<String, String> f4045k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final ArrayList<String> f4046l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final ArrayList<String> f4047m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final z.a<String, View> f4048n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final z.a<String, View> f4049o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f4050p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final k3.d f4051q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Object f4052r;

        static final class a extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f4054b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f4055c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f4054b = viewGroup;
                this.f4055c = obj;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                g.this.v().e(this.f4054b, this.f4055c);
            }
        }

        static final class b extends ae.s implements zd.a<md.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f4057b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f4058c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ae.h0<zd.a<md.i0>> f4059d;

            static final class a extends ae.s implements zd.a<md.i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f4060a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ViewGroup f4061b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.f4060a = gVar;
                    this.f4061b = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void b(g gVar, ViewGroup viewGroup) {
                    ae.r.f(gVar, "this$0");
                    ae.r.f(viewGroup, "$container");
                    Iterator<T> it = gVar.w().iterator();
                    while (it.hasNext()) {
                        l0.d dVarA = ((h) it.next()).a();
                        View view = dVarA.i().getView();
                        if (view != null) {
                            dVarA.h().b(view, viewGroup);
                        }
                    }
                }

                @Override // zd.a
                public /* bridge */ /* synthetic */ md.i0 invoke() {
                    invoke2();
                    return md.i0.f15558a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    g0 g0VarV = this.f4060a.v();
                    Object objS = this.f4060a.s();
                    ae.r.c(objS);
                    final g gVar = this.f4060a;
                    final ViewGroup viewGroup = this.f4061b;
                    g0VarV.d(objS, new Runnable() { // from class: androidx.fragment.app.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.b.a.b(gVar, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, ae.h0<zd.a<md.i0>> h0Var) {
                super(0);
                this.f4057b = viewGroup;
                this.f4058c = obj;
                this.f4059d = h0Var;
            }

            @Override // zd.a
            public /* bridge */ /* synthetic */ md.i0 invoke() {
                invoke2();
                return md.i0.f15558a;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [T, androidx.fragment.app.e$g$b$a] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f4057b, this.f4058c));
                boolean z10 = g.this.s() != null;
                Object obj = this.f4058c;
                ViewGroup viewGroup = this.f4057b;
                if (!z10) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + com.amazon.a.a.o.c.a.b.f7490a).toString());
                }
                this.f4059d.f712a = new a(g.this, viewGroup);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                }
            }
        }

        public g(List<h> list, l0.d dVar, l0.d dVar2, g0 g0Var, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, z.a<String, String> aVar, ArrayList<String> arrayList3, ArrayList<String> arrayList4, z.a<String, View> aVar2, z.a<String, View> aVar3, boolean z10) {
            ae.r.f(list, "transitionInfos");
            ae.r.f(g0Var, "transitionImpl");
            ae.r.f(arrayList, "sharedElementFirstOutViews");
            ae.r.f(arrayList2, "sharedElementLastInViews");
            ae.r.f(aVar, "sharedElementNameMapping");
            ae.r.f(arrayList3, "enteringNames");
            ae.r.f(arrayList4, "exitingNames");
            ae.r.f(aVar2, "firstOutViews");
            ae.r.f(aVar3, "lastInViews");
            this.f4038d = list;
            this.f4039e = dVar;
            this.f4040f = dVar2;
            this.f4041g = g0Var;
            this.f4042h = obj;
            this.f4043i = arrayList;
            this.f4044j = arrayList2;
            this.f4045k = aVar;
            this.f4046l = arrayList3;
            this.f4047m = arrayList4;
            this.f4048n = aVar2;
            this.f4049o = aVar3;
            this.f4050p = z10;
            this.f4051q = new k3.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(l0.d dVar, g gVar) {
            ae.r.f(dVar, "$operation");
            ae.r.f(gVar, "this$0");
            if (w.J0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        private final void B(ArrayList<View> arrayList, ViewGroup viewGroup, zd.a<md.i0> aVar) {
            e0.e(arrayList, 4);
            ArrayList<String> arrayListQ = this.f4041g.q(this.f4044j);
            if (w.J0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (View view : this.f4043i) {
                    ae.r.e(view, "sharedElementFirstOutViews");
                    View view2 = view;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + androidx.core.view.h.A(view2));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (View view3 : this.f4044j) {
                    ae.r.e(view3, "sharedElementLastInViews");
                    View view4 = view3;
                    Log.v("FragmentManager", "View: " + view4 + " Name: " + androidx.core.view.h.A(view4));
                }
            }
            aVar.invoke();
            this.f4041g.y(viewGroup, this.f4043i, this.f4044j, arrayListQ, this.f4045k);
            e0.e(arrayList, 0);
            this.f4041g.A(this.f4042h, this.f4043i, this.f4044j);
        }

        private final void n(ArrayList<View> arrayList, View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!androidx.core.view.j.a(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            ae.r.e(childAt, "child");
                            n(arrayList, childAt);
                        }
                    }
                    return;
                }
                if (arrayList.contains(view)) {
                    return;
                }
            } else if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }

        private final md.s<ArrayList<View>, Object> o(ViewGroup viewGroup, l0.d dVar, final l0.d dVar2) {
            final l0.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator<h> it = this.f4038d.iterator();
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().g() && dVar2 != null && dVar3 != null && (!this.f4045k.isEmpty()) && this.f4042h != null) {
                    e0.a(dVar.i(), dVar2.i(), this.f4050p, this.f4048n, true);
                    o3.k0.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.p(dVar3, dVar2, this);
                        }
                    });
                    this.f4043i.addAll(this.f4048n.values());
                    if (!this.f4047m.isEmpty()) {
                        String str = this.f4047m.get(0);
                        ae.r.e(str, "exitingNames[0]");
                        view2 = this.f4048n.get(str);
                        this.f4041g.v(this.f4042h, view2);
                    }
                    this.f4044j.addAll(this.f4049o.values());
                    if (!this.f4046l.isEmpty()) {
                        String str2 = this.f4046l.get(0);
                        ae.r.e(str2, "enteringNames[0]");
                        final View view3 = this.f4049o.get(str2);
                        if (view3 != null) {
                            final g0 g0Var = this.f4041g;
                            o3.k0.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.g.q(g0Var, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.f4041g.z(this.f4042h, view, this.f4043i);
                    g0 g0Var2 = this.f4041g;
                    Object obj = this.f4042h;
                    g0Var2.s(obj, null, null, null, null, obj, this.f4044j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.f4038d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                l0.d dVarA = next.a();
                Iterator<h> it3 = it2;
                Object objH = this.f4041g.h(next.f());
                if (objH != null) {
                    final ArrayList<View> arrayList2 = new ArrayList<>();
                    Object obj2 = objP2;
                    View view4 = dVarA.i().mView;
                    Object obj3 = objP;
                    ae.r.e(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f4042h != null && (dVarA == dVar2 || dVarA == dVar3)) {
                        arrayList2.removeAll(nd.c0.H0(dVarA == dVar2 ? this.f4043i : this.f4044j));
                    }
                    if (arrayList2.isEmpty()) {
                        this.f4041g.a(objH, view);
                    } else {
                        this.f4041g.b(objH, arrayList2);
                        this.f4041g.s(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.h() == l0.d.b.GONE) {
                            dVarA.r(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(dVarA.i().mView);
                            this.f4041g.r(objH, dVarA.i().mView, arrayList3);
                            o3.k0.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.h() == l0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z10) {
                            this.f4041g.u(objH, rect);
                        }
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (View view5 : arrayList2) {
                                ae.r.e(view5, "transitioningViews");
                                Log.v("FragmentManager", "View: " + view5);
                            }
                        }
                    } else {
                        this.f4041g.v(objH, view2);
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (View view6 : arrayList2) {
                                ae.r.e(view6, "transitioningViews");
                                Log.v("FragmentManager", "View: " + view6);
                            }
                        }
                    }
                    if (next.h()) {
                        objP = this.f4041g.p(obj3, objH, null);
                        dVar3 = dVar;
                        it2 = it3;
                        objP2 = obj2;
                    } else {
                        objP2 = this.f4041g.p(obj2, objH, null);
                        dVar3 = dVar;
                        objP = obj3;
                        it2 = it3;
                    }
                } else {
                    dVar3 = dVar;
                    it2 = it3;
                    objP = objP;
                }
            }
            Object objO = this.f4041g.o(objP, objP2, this.f4042h);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO);
            }
            return new md.s<>(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(l0.d dVar, l0.d dVar2, g gVar) {
            ae.r.f(gVar, "this$0");
            e0.a(dVar.i(), dVar2.i(), gVar.f4050p, gVar.f4049o, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(g0 g0Var, View view, Rect rect) {
            ae.r.f(g0Var, "$impl");
            ae.r.f(rect, "$lastInEpicenterRect");
            g0Var.k(view, rect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList arrayList) {
            ae.r.f(arrayList, "$transitioningViews");
            e0.e(arrayList, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(l0.d dVar, g gVar) {
            ae.r.f(dVar, "$operation");
            ae.r.f(gVar, "this$0");
            if (w.J0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(ae.h0 h0Var) {
            ae.r.f(h0Var, "$seekCancelLambda");
            zd.a aVar = (zd.a) h0Var.f712a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void C(Object obj) {
            this.f4052r = obj;
        }

        @Override // androidx.fragment.app.l0.b
        public boolean b() {
            boolean z10;
            if (!this.f4041g.m()) {
                return false;
            }
            List<h> list = this.f4038d;
            if ((list instanceof Collection) && list.isEmpty()) {
                z10 = true;
            } else {
                for (h hVar : list) {
                    if (!(Build.VERSION.SDK_INT >= 34 && hVar.f() != null && this.f4041g.n(hVar.f()))) {
                        z10 = false;
                        break;
                    }
                }
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            Object obj = this.f4042h;
            return obj == null || this.f4041g.n(obj);
        }

        @Override // androidx.fragment.app.l0.b
        public void c(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            this.f4051q.a();
        }

        @Override // androidx.fragment.app.l0.b
        public void d(ViewGroup viewGroup) {
            StringBuilder sb2;
            String str;
            ae.r.f(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.f4038d) {
                    l0.d dVarA = hVar.a();
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + dVarA);
                    }
                    hVar.a().f(this);
                }
                return;
            }
            Object obj = this.f4052r;
            if (obj != null) {
                g0 g0Var = this.f4041g;
                ae.r.c(obj);
                g0Var.c(obj);
                if (!w.J0(2)) {
                    return;
                }
                sb2 = new StringBuilder();
                str = "Ending execution of operations from ";
            } else {
                md.s<ArrayList<View>, Object> sVarO = o(viewGroup, this.f4040f, this.f4039e);
                ArrayList<View> arrayListA = sVarO.a();
                Object objB = sVarO.b();
                List<h> list = this.f4038d;
                ArrayList<l0.d> arrayList = new ArrayList(nd.v.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h) it.next()).a());
                }
                for (final l0.d dVar : arrayList) {
                    this.f4041g.w(dVar.i(), objB, this.f4051q, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.y(dVar, this);
                        }
                    });
                }
                B(arrayListA, viewGroup, new a(viewGroup, objB));
                if (!w.J0(2)) {
                    return;
                }
                sb2 = new StringBuilder();
                str = "Completed executing operations from ";
            }
            sb2.append(str);
            sb2.append(this.f4039e);
            sb2.append(" to ");
            sb2.append(this.f4040f);
            Log.v("FragmentManager", sb2.toString());
        }

        @Override // androidx.fragment.app.l0.b
        public void e(e.b bVar, ViewGroup viewGroup) {
            ae.r.f(bVar, "backEvent");
            ae.r.f(viewGroup, "container");
            Object obj = this.f4052r;
            if (obj != null) {
                this.f4041g.t(obj, bVar.a());
            }
        }

        @Override // androidx.fragment.app.l0.b
        public void f(ViewGroup viewGroup) {
            ae.r.f(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                Iterator<T> it = this.f4038d.iterator();
                while (it.hasNext()) {
                    l0.d dVarA = ((h) it.next()).a();
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + dVarA);
                    }
                }
                return;
            }
            if (x() && this.f4042h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f4042h + " between " + this.f4039e + " and " + this.f4040f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final ae.h0 h0Var = new ae.h0();
                md.s<ArrayList<View>, Object> sVarO = o(viewGroup, this.f4040f, this.f4039e);
                ArrayList<View> arrayListA = sVarO.a();
                Object objB = sVarO.b();
                List<h> list = this.f4038d;
                ArrayList<l0.d> arrayList = new ArrayList(nd.v.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((h) it2.next()).a());
                }
                for (final l0.d dVar : arrayList) {
                    this.f4041g.x(dVar.i(), objB, this.f4051q, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.z(h0Var);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.A(dVar, this);
                        }
                    });
                }
                B(arrayListA, viewGroup, new b(viewGroup, objB, h0Var));
            }
        }

        public final Object s() {
            return this.f4052r;
        }

        public final l0.d t() {
            return this.f4039e;
        }

        public final l0.d u() {
            return this.f4040f;
        }

        public final g0 v() {
            return this.f4041g;
        }

        public final List<h> w() {
            return this.f4038d;
        }

        public final boolean x() {
            List<h> list = this.f4038d;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().i().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    private static final class h extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f4062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f4063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f4064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l0.d dVar, boolean z10, boolean z11) {
            Object returnTransition;
            boolean allowReturnTransitionOverlap;
            Object sharedElementReturnTransition;
            super(dVar);
            ae.r.f(dVar, "operation");
            l0.d.b bVarH = dVar.h();
            l0.d.b bVar = l0.d.b.VISIBLE;
            if (bVarH == bVar) {
                n nVarI = dVar.i();
                returnTransition = z10 ? nVarI.getReenterTransition() : nVarI.getEnterTransition();
            } else {
                n nVarI2 = dVar.i();
                returnTransition = z10 ? nVarI2.getReturnTransition() : nVarI2.getExitTransition();
            }
            this.f4062b = returnTransition;
            if (dVar.h() == bVar) {
                n nVarI3 = dVar.i();
                allowReturnTransitionOverlap = z10 ? nVarI3.getAllowReturnTransitionOverlap() : nVarI3.getAllowEnterTransitionOverlap();
            } else {
                allowReturnTransitionOverlap = true;
            }
            this.f4063c = allowReturnTransitionOverlap;
            if (z11) {
                n nVarI4 = dVar.i();
                sharedElementReturnTransition = z10 ? nVarI4.getSharedElementReturnTransition() : nVarI4.getSharedElementEnterTransition();
            } else {
                sharedElementReturnTransition = null;
            }
            this.f4064d = sharedElementReturnTransition;
        }

        private final g0 d(Object obj) {
            if (obj == null) {
                return null;
            }
            g0 g0Var = e0.f4067b;
            if (g0Var != null && g0Var.g(obj)) {
                return g0Var;
            }
            g0 g0Var2 = e0.f4068c;
            if (g0Var2 != null && g0Var2.g(obj)) {
                return g0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final g0 c() {
            g0 g0VarD = d(this.f4062b);
            g0 g0VarD2 = d(this.f4064d);
            if (g0VarD == null || g0VarD2 == null || g0VarD == g0VarD2) {
                return g0VarD == null ? g0VarD2 : g0VarD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.f4062b + " which uses a different Transition  type than its shared element transition " + this.f4064d).toString());
        }

        public final Object e() {
            return this.f4064d;
        }

        public final Object f() {
            return this.f4062b;
        }

        public final boolean g() {
            return this.f4064d != null;
        }

        public final boolean h() {
            return this.f4063c;
        }
    }

    static final class i extends ae.s implements zd.l<Map.Entry<String, View>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection<String> f4065a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection) {
            super(1);
            this.f4065a = collection;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Map.Entry<String, View> entry) {
            ae.r.f(entry, "entry");
            return Boolean.valueOf(nd.c0.S(this.f4065a, androidx.core.view.h.A(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewGroup viewGroup) {
        super(viewGroup);
        ae.r.f(viewGroup, "container");
    }

    private final void D(List<b> list) {
        StringBuilder sb2;
        String str;
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            nd.z.C(arrayList2, ((b) it.next()).a().g());
        }
        boolean z10 = !arrayList2.isEmpty();
        boolean z11 = false;
        for (b bVar : list) {
            Context context = t().getContext();
            l0.d dVarA = bVar.a();
            ae.r.e(context, "context");
            p.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f4216b == null) {
                    arrayList.add(bVar);
                } else {
                    n nVarI = dVarA.i();
                    if (!(!dVarA.g().isEmpty())) {
                        if (dVarA.h() == l0.d.b.GONE) {
                            dVarA.r(false);
                        }
                        dVarA.b(new c(bVar));
                        z11 = true;
                    } else if (w.J0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + nVarI + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            l0.d dVarA2 = bVar2.a();
            n nVarI2 = dVarA2.i();
            if (z10) {
                if (w.J0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(nVarI2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
            } else if (!z11) {
                dVarA2.b(new a(bVar2));
            } else if (w.J0(2)) {
                sb2 = new StringBuilder();
                sb2.append("Ignoring Animation set on ");
                sb2.append(nVarI2);
                str = " as Animations cannot run alongside Animators.";
                sb2.append(str);
                Log.v("FragmentManager", sb2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(e eVar, l0.d dVar) {
        ae.r.f(eVar, "this$0");
        ae.r.f(dVar, "$operation");
        eVar.c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03b4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F(java.util.List<androidx.fragment.app.e.h> r27, boolean r28, androidx.fragment.app.l0.d r29, androidx.fragment.app.l0.d r30) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.F(java.util.List, boolean, androidx.fragment.app.l0$d, androidx.fragment.app.l0$d):void");
    }

    private final void G(Map<String, View> map, View view) {
        String strA = androidx.core.view.h.A(view);
        if (strA != null) {
            map.put(strA, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    ae.r.e(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    private final void H(z.a<String, View> aVar, Collection<String> collection) {
        Set<Map.Entry<String, View>> setEntrySet = aVar.entrySet();
        ae.r.e(setEntrySet, "entries");
        nd.z.O(setEntrySet, new i(collection));
    }

    private final void I(List<? extends l0.d> list) {
        n nVarI = ((l0.d) nd.c0.j0(list)).i();
        for (l0.d dVar : list) {
            dVar.i().mAnimationInfo.f4193c = nVarI.mAnimationInfo.f4193c;
            dVar.i().mAnimationInfo.f4194d = nVarI.mAnimationInfo.f4194d;
            dVar.i().mAnimationInfo.f4195e = nVarI.mAnimationInfo.f4195e;
            dVar.i().mAnimationInfo.f4196f = nVarI.mAnimationInfo.f4196f;
        }
    }

    @Override // androidx.fragment.app.l0
    public void d(List<? extends l0.d> list, boolean z10) {
        l0.d dVar;
        Object next;
        ae.r.f(list, "operations");
        Iterator<T> it = list.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            l0.d dVar2 = (l0.d) next;
            l0.d.b.a aVar = l0.d.b.f4142a;
            View view = dVar2.i().mView;
            ae.r.e(view, "operation.fragment.mView");
            l0.d.b bVarA = aVar.a(view);
            l0.d.b bVar = l0.d.b.VISIBLE;
            if (bVarA == bVar && dVar2.h() != bVar) {
                break;
            }
        }
        l0.d dVar3 = (l0.d) next;
        ListIterator<? extends l0.d> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            l0.d dVarPrevious = listIterator.previous();
            l0.d dVar4 = dVarPrevious;
            l0.d.b.a aVar2 = l0.d.b.f4142a;
            View view2 = dVar4.i().mView;
            ae.r.e(view2, "operation.fragment.mView");
            l0.d.b bVarA2 = aVar2.a(view2);
            l0.d.b bVar2 = l0.d.b.VISIBLE;
            if (bVarA2 != bVar2 && dVar4.h() == bVar2) {
                dVar = dVarPrevious;
                break;
            }
        }
        l0.d dVar5 = dVar;
        if (w.J0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar3 + " to " + dVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        I(list);
        Iterator<? extends l0.d> it2 = list.iterator();
        while (it2.hasNext()) {
            final l0.d next2 = it2.next();
            arrayList.add(new b(next2, z10));
            arrayList2.add(new h(next2, z10, !z10 ? next2 != dVar5 : next2 != dVar3));
            next2.a(new Runnable() { // from class: k4.a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.e.E(this.f14387a, next2);
                }
            });
        }
        F(arrayList2, z10, dVar3, dVar5);
        D(arrayList);
    }
}
