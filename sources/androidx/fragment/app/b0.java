package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.l0;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f3975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f3976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f3977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3978d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3979e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f3980a;

        a(View view) {
            this.f3980a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3980a.removeOnAttachStateChangeListener(this);
            androidx.core.view.h.T(this.f3980a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3982a;

        static {
            int[] iArr = new int[g.b.values().length];
            f3982a = iArr;
            try {
                iArr[g.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3982a[g.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3982a[g.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3982a[g.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    b0(v vVar, c0 c0Var, n nVar) {
        this.f3975a = vVar;
        this.f3976b = c0Var;
        this.f3977c = nVar;
    }

    b0(v vVar, c0 c0Var, n nVar, Bundle bundle) {
        this.f3975a = vVar;
        this.f3976b = c0Var;
        this.f3977c = nVar;
        nVar.mSavedViewState = null;
        nVar.mSavedViewRegistryState = null;
        nVar.mBackStackNesting = 0;
        nVar.mInLayout = false;
        nVar.mAdded = false;
        n nVar2 = nVar.mTarget;
        nVar.mTargetWho = nVar2 != null ? nVar2.mWho : null;
        nVar.mTarget = null;
        nVar.mSavedFragmentState = bundle;
        nVar.mArguments = bundle.getBundle("arguments");
    }

    b0(v vVar, c0 c0Var, ClassLoader classLoader, s sVar, Bundle bundle) {
        this.f3975a = vVar;
        this.f3976b = c0Var;
        n nVarA = ((a0) bundle.getParcelable("state")).a(sVar, classLoader);
        this.f3977c = nVarA;
        nVarA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        nVarA.setArguments(bundle2);
        if (w.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + nVarA);
        }
    }

    private boolean l(View view) {
        if (view == this.f3977c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3977c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3977c);
        }
        Bundle bundle = this.f3977c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f3977c.performActivityCreated(bundle2);
        this.f3975a.a(this.f3977c, bundle2, false);
    }

    void b() {
        n nVarM0 = w.m0(this.f3977c.mContainer);
        n parentFragment = this.f3977c.getParentFragment();
        if (nVarM0 != null && !nVarM0.equals(parentFragment)) {
            n nVar = this.f3977c;
            l4.d.q(nVar, nVarM0, nVar.mContainerId);
        }
        int iJ = this.f3976b.j(this.f3977c);
        n nVar2 = this.f3977c;
        nVar2.mContainer.addView(nVar2.mView, iJ);
    }

    void c() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3977c);
        }
        n nVar = this.f3977c;
        n nVar2 = nVar.mTarget;
        b0 b0VarN = null;
        if (nVar2 != null) {
            b0 b0VarN2 = this.f3976b.n(nVar2.mWho);
            if (b0VarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f3977c + " declared target fragment " + this.f3977c.mTarget + " that does not belong to this FragmentManager!");
            }
            n nVar3 = this.f3977c;
            nVar3.mTargetWho = nVar3.mTarget.mWho;
            nVar3.mTarget = null;
            b0VarN = b0VarN2;
        } else {
            String str = nVar.mTargetWho;
            if (str != null && (b0VarN = this.f3976b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3977c + " declared target fragment " + this.f3977c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (b0VarN != null) {
            b0VarN.m();
        }
        n nVar4 = this.f3977c;
        nVar4.mHost = nVar4.mFragmentManager.w0();
        n nVar5 = this.f3977c;
        nVar5.mParentFragment = nVar5.mFragmentManager.z0();
        this.f3975a.g(this.f3977c, false);
        this.f3977c.performAttach();
        this.f3975a.b(this.f3977c, false);
    }

    int d() {
        n nVar = this.f3977c;
        if (nVar.mFragmentManager == null) {
            return nVar.mState;
        }
        int iMin = this.f3979e;
        int i10 = b.f3982a[nVar.mMaxState.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        n nVar2 = this.f3977c;
        if (nVar2.mFromLayout) {
            if (nVar2.mInLayout) {
                iMin = Math.max(this.f3979e, 2);
                View view = this.f3977c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f3979e < 4 ? Math.min(iMin, nVar2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f3977c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        n nVar3 = this.f3977c;
        ViewGroup viewGroup = nVar3.mContainer;
        l0.d.a aVarS = viewGroup != null ? l0.u(viewGroup, nVar3.getParentFragmentManager()).s(this) : null;
        if (aVarS == l0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == l0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            n nVar4 = this.f3977c;
            if (nVar4.mRemoving) {
                iMin = nVar4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        n nVar5 = this.f3977c;
        if (nVar5.mDeferStart && nVar5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        n nVar6 = this.f3977c;
        if (nVar6.mTransitioning && nVar6.mContainer != null) {
            iMin = Math.max(iMin, 3);
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f3977c);
        }
        return iMin;
    }

    void e() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3977c);
        }
        Bundle bundle = this.f3977c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        n nVar = this.f3977c;
        if (nVar.mIsCreated) {
            nVar.mState = 1;
            nVar.restoreChildFragmentState();
        } else {
            this.f3975a.h(nVar, bundle2, false);
            this.f3977c.performCreate(bundle2);
            this.f3975a.c(this.f3977c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f3977c.mFromLayout) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3977c);
        }
        Bundle bundle = this.f3977c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f3977c.performGetLayoutInflater(bundle2);
        n nVar = this.f3977c;
        ViewGroup viewGroup2 = nVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = nVar.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3977c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) nVar.mFragmentManager.s0().c(this.f3977c.mContainerId);
                if (viewGroup == null) {
                    n nVar2 = this.f3977c;
                    if (!nVar2.mRestored) {
                        try {
                            resourceName = nVar2.getResources().getResourceName(this.f3977c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3977c.mContainerId) + " (" + resourceName + ") for fragment " + this.f3977c);
                    }
                } else if (!(viewGroup instanceof q)) {
                    l4.d.p(this.f3977c, viewGroup);
                }
            }
        }
        n nVar3 = this.f3977c;
        nVar3.mContainer = viewGroup;
        nVar3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f3977c.mView != null) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f3977c);
            }
            this.f3977c.mView.setSaveFromParentEnabled(false);
            n nVar4 = this.f3977c;
            nVar4.mView.setTag(j4.b.f13909a, nVar4);
            if (viewGroup != null) {
                b();
            }
            n nVar5 = this.f3977c;
            if (nVar5.mHidden) {
                nVar5.mView.setVisibility(8);
            }
            if (this.f3977c.mView.isAttachedToWindow()) {
                androidx.core.view.h.T(this.f3977c.mView);
            } else {
                View view = this.f3977c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f3977c.performViewCreated();
            v vVar = this.f3975a;
            n nVar6 = this.f3977c;
            vVar.m(nVar6, nVar6.mView, bundle2, false);
            int visibility = this.f3977c.mView.getVisibility();
            this.f3977c.setPostOnViewCreatedAlpha(this.f3977c.mView.getAlpha());
            n nVar7 = this.f3977c;
            if (nVar7.mContainer != null && visibility == 0) {
                View viewFindFocus = nVar7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f3977c.setFocusedView(viewFindFocus);
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f3977c);
                    }
                }
                this.f3977c.mView.setAlpha(0.0f);
            }
        }
        this.f3977c.mState = 2;
    }

    void g() {
        n nVarF;
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3977c);
        }
        n nVar = this.f3977c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = nVar.mRemoving && !nVar.isInBackStack();
        if (z10) {
            n nVar2 = this.f3977c;
            if (!nVar2.mBeingSaved) {
                this.f3976b.B(nVar2.mWho, null);
            }
        }
        if (!(z10 || this.f3976b.p().m(this.f3977c))) {
            String str = this.f3977c.mTargetWho;
            if (str != null && (nVarF = this.f3976b.f(str)) != null && nVarF.mRetainInstance) {
                this.f3977c.mTarget = nVarF;
            }
            this.f3977c.mState = 0;
            return;
        }
        t<?> tVar = this.f3977c.mHost;
        if (tVar instanceof o4.q) {
            zIsChangingConfigurations = this.f3976b.p().j();
        } else if (tVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) tVar.f()).isChangingConfigurations();
        }
        if ((z10 && !this.f3977c.mBeingSaved) || zIsChangingConfigurations) {
            this.f3976b.p().b(this.f3977c, false);
        }
        this.f3977c.performDestroy();
        this.f3975a.d(this.f3977c, false);
        for (b0 b0Var : this.f3976b.k()) {
            if (b0Var != null) {
                n nVarK = b0Var.k();
                if (this.f3977c.mWho.equals(nVarK.mTargetWho)) {
                    nVarK.mTarget = this.f3977c;
                    nVarK.mTargetWho = null;
                }
            }
        }
        n nVar3 = this.f3977c;
        String str2 = nVar3.mTargetWho;
        if (str2 != null) {
            nVar3.mTarget = this.f3976b.f(str2);
        }
        this.f3976b.s(this);
    }

    void h() {
        View view;
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3977c);
        }
        n nVar = this.f3977c;
        ViewGroup viewGroup = nVar.mContainer;
        if (viewGroup != null && (view = nVar.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3977c.performDestroyView();
        this.f3975a.n(this.f3977c, false);
        n nVar2 = this.f3977c;
        nVar2.mContainer = null;
        nVar2.mView = null;
        nVar2.mViewLifecycleOwner = null;
        nVar2.mViewLifecycleOwnerLiveData.n(null);
        this.f3977c.mInLayout = false;
    }

    void i() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3977c);
        }
        this.f3977c.performDetach();
        boolean z10 = false;
        this.f3975a.e(this.f3977c, false);
        n nVar = this.f3977c;
        nVar.mState = -1;
        nVar.mHost = null;
        nVar.mParentFragment = null;
        nVar.mFragmentManager = null;
        if (nVar.mRemoving && !nVar.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f3976b.p().m(this.f3977c)) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3977c);
            }
            this.f3977c.initState();
        }
    }

    void j() {
        n nVar = this.f3977c;
        if (nVar.mFromLayout && nVar.mInLayout && !nVar.mPerformedCreateView) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3977c);
            }
            Bundle bundle = this.f3977c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            n nVar2 = this.f3977c;
            nVar2.performCreateView(nVar2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f3977c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                n nVar3 = this.f3977c;
                nVar3.mView.setTag(j4.b.f13909a, nVar3);
                n nVar4 = this.f3977c;
                if (nVar4.mHidden) {
                    nVar4.mView.setVisibility(8);
                }
                this.f3977c.performViewCreated();
                v vVar = this.f3975a;
                n nVar5 = this.f3977c;
                vVar.m(nVar5, nVar5.mView, bundle2, false);
                this.f3977c.mState = 2;
            }
        }
    }

    n k() {
        return this.f3977c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3978d) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f3978d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                n nVar = this.f3977c;
                int i10 = nVar.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && nVar.mRemoving && !nVar.isInBackStack() && !this.f3977c.mBeingSaved) {
                        if (w.J0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3977c);
                        }
                        this.f3976b.p().b(this.f3977c, true);
                        this.f3976b.s(this);
                        if (w.J0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f3977c);
                        }
                        this.f3977c.initState();
                    }
                    n nVar2 = this.f3977c;
                    if (nVar2.mHiddenChanged) {
                        if (nVar2.mView != null && (viewGroup = nVar2.mContainer) != null) {
                            l0 l0VarU = l0.u(viewGroup, nVar2.getParentFragmentManager());
                            if (this.f3977c.mHidden) {
                                l0VarU.k(this);
                            } else {
                                l0VarU.m(this);
                            }
                        }
                        n nVar3 = this.f3977c;
                        w wVar = nVar3.mFragmentManager;
                        if (wVar != null) {
                            wVar.H0(nVar3);
                        }
                        n nVar4 = this.f3977c;
                        nVar4.mHiddenChanged = false;
                        nVar4.onHiddenChanged(nVar4.mHidden);
                        this.f3977c.mChildFragmentManager.J();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (nVar.mBeingSaved && this.f3976b.q(nVar.mWho) == null) {
                                this.f3976b.B(this.f3977c.mWho, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f3977c.mState = 1;
                            break;
                        case 2:
                            nVar.mInLayout = false;
                            nVar.mState = 2;
                            break;
                        case 3:
                            if (w.J0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3977c);
                            }
                            n nVar5 = this.f3977c;
                            if (nVar5.mBeingSaved) {
                                this.f3976b.B(nVar5.mWho, q());
                            } else if (nVar5.mView != null && nVar5.mSavedViewState == null) {
                                r();
                            }
                            n nVar6 = this.f3977c;
                            if (nVar6.mView != null && (viewGroup2 = nVar6.mContainer) != null) {
                                l0.u(viewGroup2, nVar6.getParentFragmentManager()).l(this);
                            }
                            this.f3977c.mState = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            nVar.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (nVar.mView != null && (viewGroup3 = nVar.mContainer) != null) {
                                l0.u(viewGroup3, nVar.getParentFragmentManager()).j(l0.d.b.c(this.f3977c.mView.getVisibility()), this);
                            }
                            this.f3977c.mState = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            nVar.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f3978d = false;
        }
    }

    void n() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3977c);
        }
        this.f3977c.performPause();
        this.f3975a.f(this.f3977c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f3977c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f3977c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f3977c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            n nVar = this.f3977c;
            nVar.mSavedViewState = nVar.mSavedFragmentState.getSparseParcelableArray("viewState");
            n nVar2 = this.f3977c;
            nVar2.mSavedViewRegistryState = nVar2.mSavedFragmentState.getBundle("viewRegistryState");
            a0 a0Var = (a0) this.f3977c.mSavedFragmentState.getParcelable("state");
            if (a0Var != null) {
                n nVar3 = this.f3977c;
                nVar3.mTargetWho = a0Var.f3958l;
                nVar3.mTargetRequestCode = a0Var.f3959m;
                Boolean bool = nVar3.mSavedUserVisibleHint;
                if (bool != null) {
                    nVar3.mUserVisibleHint = bool.booleanValue();
                    this.f3977c.mSavedUserVisibleHint = null;
                } else {
                    nVar3.mUserVisibleHint = a0Var.f3960n;
                }
            }
            n nVar4 = this.f3977c;
            if (nVar4.mUserVisibleHint) {
                return;
            }
            nVar4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    void p() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3977c);
        }
        View focusedView = this.f3977c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (w.J0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f3977c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f3977c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f3977c.setFocusedView(null);
        this.f3977c.performResume();
        this.f3975a.i(this.f3977c, false);
        this.f3976b.B(this.f3977c.mWho, null);
        n nVar = this.f3977c;
        nVar.mSavedFragmentState = null;
        nVar.mSavedViewState = null;
        nVar.mSavedViewRegistryState = null;
    }

    Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        n nVar = this.f3977c;
        if (nVar.mState == -1 && (bundle = nVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new a0(this.f3977c));
        if (this.f3977c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f3977c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f3975a.j(this.f3977c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f3977c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleR0 = this.f3977c.mChildFragmentManager.R0();
            if (!bundleR0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleR0);
            }
            if (this.f3977c.mView != null) {
                r();
            }
            SparseArray<Parcelable> sparseArray = this.f3977c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f3977c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f3977c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void r() {
        if (this.f3977c.mView == null) {
            return;
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f3977c + " with view " + this.f3977c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3977c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3977c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3977c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3977c.mSavedViewRegistryState = bundle;
    }

    void s(int i10) {
        this.f3979e = i10;
    }

    void t() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3977c);
        }
        this.f3977c.performStart();
        this.f3975a.k(this.f3977c, false);
    }

    void u() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3977c);
        }
        this.f3977c.performStop();
        this.f3975a.l(this.f3977c, false);
    }
}
