package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.a;
import androidx.lifecycle.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public class o extends androidx.activity.a implements a.f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.j mFragmentLifecycleRegistry;
    final r mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends t<o> implements e3.g, e3.h, d3.x, d3.y, o4.q, e.u, h.g, x4.f, k4.o, o3.k {
        public a() {
            super(o.this);
        }

        @Override // k4.o
        public void a(w wVar, n nVar) {
            o.this.onAttachFragment(nVar);
        }

        @Override // o3.k
        public void addMenuProvider(o3.b0 b0Var) {
            o.this.addMenuProvider(b0Var);
        }

        @Override // e3.g
        public void addOnConfigurationChangedListener(n3.a<Configuration> aVar) {
            o.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // d3.x
        public void addOnMultiWindowModeChangedListener(n3.a<d3.g> aVar) {
            o.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // d3.y
        public void addOnPictureInPictureModeChangedListener(n3.a<d3.z> aVar) {
            o.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // e3.h
        public void addOnTrimMemoryListener(n3.a<Integer> aVar) {
            o.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.t, k4.i
        public View c(int i10) {
            return o.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.t, k4.i
        public boolean d() {
            Window window = o.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // h.g
        public h.f getActivityResultRegistry() {
            return o.this.getActivityResultRegistry();
        }

        @Override // o4.e
        public androidx.lifecycle.g getLifecycle() {
            return o.this.mFragmentLifecycleRegistry;
        }

        @Override // e.u
        public e.r getOnBackPressedDispatcher() {
            return o.this.getOnBackPressedDispatcher();
        }

        @Override // x4.f
        public x4.d getSavedStateRegistry() {
            return o.this.getSavedStateRegistry();
        }

        @Override // o4.q
        public androidx.lifecycle.z getViewModelStore() {
            return o.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.t
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            o.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.t
        public LayoutInflater k() {
            return o.this.getLayoutInflater().cloneInContext(o.this);
        }

        @Override // androidx.fragment.app.t
        public boolean m(String str) {
            return androidx.core.app.a.j(o.this, str);
        }

        @Override // androidx.fragment.app.t
        public void p() {
            q();
        }

        public void q() {
            o.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.t
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public o j() {
            return o.this;
        }

        @Override // o3.k
        public void removeMenuProvider(o3.b0 b0Var) {
            o.this.removeMenuProvider(b0Var);
        }

        @Override // e3.g
        public void removeOnConfigurationChangedListener(n3.a<Configuration> aVar) {
            o.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // d3.x
        public void removeOnMultiWindowModeChangedListener(n3.a<d3.g> aVar) {
            o.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // d3.y
        public void removeOnPictureInPictureModeChangedListener(n3.a<d3.z> aVar) {
            o.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // e3.h
        public void removeOnTrimMemoryListener(n3.a<Integer> aVar) {
            o.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public o() {
        this.mFragments = r.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.j(this);
        this.mStopped = true;
        init();
    }

    public o(int i10) {
        super(i10);
        this.mFragments = r.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.j(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new d.c() { // from class: k4.e
            @Override // x4.d.c
            public final Bundle a() {
                return this.f14390a.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new n3.a() { // from class: k4.f
            @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                this.f14391a.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new n3.a() { // from class: k4.g
            @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                this.f14392a.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new g.b() { // from class: k4.h
            @Override // g.b
            public final void a(Context context) {
                this.f14393a.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.h(g.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.a(null);
    }

    private static boolean markState(w wVar, g.b bVar) {
        boolean zMarkState = false;
        for (n nVar : wVar.v0()) {
            if (nVar != null) {
                if (nVar.getHost() != null) {
                    zMarkState |= markState(nVar.getChildFragmentManager(), bVar);
                }
                h0 h0Var = nVar.mViewLifecycleOwner;
                if (h0Var != null && h0Var.getLifecycle().b().b(g.b.STARTED)) {
                    nVar.mViewLifecycleOwner.f(bVar);
                    zMarkState = true;
                }
                if (nVar.mLifecycleRegistry.b().b(g.b.STARTED)) {
                    nVar.mLifecycleRegistry.m(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().X(str, fileDescriptor, printWriter, strArr);
        }
    }

    public w getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), g.b.CREATED)) {
        }
    }

    @Override // androidx.activity.a, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(n nVar) {
    }

    @Override // androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(g.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.h(g.a.ON_DESTROY);
    }

    @Override // androidx.activity.a, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.h(g.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.a, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(g.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.h(g.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.h(g.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.m mVar) {
        androidx.core.app.a.h(this, mVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.m mVar) {
        androidx.core.app.a.i(this, mVar);
    }

    public void startActivityFromFragment(n nVar, Intent intent, int i10) {
        startActivityFromFragment(nVar, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(n nVar, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.a.k(this, intent, -1, bundle);
        } else {
            nVar.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(n nVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.a.l(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            nVar.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.a.c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.a.e(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.a.m(this);
    }

    @Override // androidx.core.app.a.f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
