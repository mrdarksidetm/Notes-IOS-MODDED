package dc;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import dc.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g extends androidx.fragment.app.n implements c.d, ComponentCallbacks2, c.InterfaceC0230c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9960e = View.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    dc.c f9962b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewTreeObserver.OnWindowFocusChangeListener f9961a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.InterfaceC0230c f9963c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e.q f9964d = new b(true);

    class a implements ViewTreeObserver.OnWindowFocusChangeListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z10) {
            if (g.this.O("onWindowFocusChanged")) {
                g.this.f9962b.G(z10);
            }
        }
    }

    class b extends e.q {
        b(boolean z10) {
            super(z10);
        }

        @Override // e.q
        public void d() {
            g.this.J();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends g> f9967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private v f9971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private w f9972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f9973g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f9974h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f9975i;

        public c(Class<? extends g> cls, String str) {
            this.f9969c = false;
            this.f9970d = false;
            this.f9971e = v.surface;
            this.f9972f = w.transparent;
            this.f9973g = true;
            this.f9974h = false;
            this.f9975i = false;
            this.f9967a = cls;
            this.f9968b = str;
        }

        private c(String str) {
            this((Class<? extends g>) g.class, str);
        }

        /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public <T extends g> T a() {
            try {
                T t10 = (T) this.f9967a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(b());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f9967a.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f9967a.getName() + ")", e10);
            }
        }

        protected Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("cached_engine_id", this.f9968b);
            bundle.putBoolean("destroy_engine_with_fragment", this.f9969c);
            bundle.putBoolean("handle_deeplinking", this.f9970d);
            v vVar = this.f9971e;
            if (vVar == null) {
                vVar = v.surface;
            }
            bundle.putString("flutterview_render_mode", vVar.name());
            w wVar = this.f9972f;
            if (wVar == null) {
                wVar = w.transparent;
            }
            bundle.putString("flutterview_transparency_mode", wVar.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.f9973g);
            bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f9974h);
            bundle.putBoolean("should_delay_first_android_view_draw", this.f9975i);
            return bundle;
        }

        public c c(boolean z10) {
            this.f9969c = z10;
            return this;
        }

        public c d(Boolean bool) {
            this.f9970d = bool.booleanValue();
            return this;
        }

        public c e(v vVar) {
            this.f9971e = vVar;
            return this;
        }

        public c f(boolean z10) {
            this.f9973g = z10;
            return this;
        }

        public c g(boolean z10) {
            this.f9974h = z10;
            return this;
        }

        public c h(boolean z10) {
            this.f9975i = z10;
            return this;
        }

        public c i(w wVar) {
            this.f9972f = wVar;
            return this;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f9979d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9977b = "main";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9978c = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f9980e = "/";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9981f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f9982g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ec.d f9983h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private v f9984i = v.surface;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private w f9985j = w.transparent;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f9986k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f9987l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f9988m = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends g> f9976a = g.class;

        public d a(String str) {
            this.f9982g = str;
            return this;
        }

        public <T extends g> T b() {
            try {
                T t10 = (T) this.f9976a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(c());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f9976a.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f9976a.getName() + ")", e10);
            }
        }

        protected Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putString("initial_route", this.f9980e);
            bundle.putBoolean("handle_deeplinking", this.f9981f);
            bundle.putString("app_bundle_path", this.f9982g);
            bundle.putString("dart_entrypoint", this.f9977b);
            bundle.putString("dart_entrypoint_uri", this.f9978c);
            bundle.putStringArrayList("dart_entrypoint_args", this.f9979d != null ? new ArrayList<>(this.f9979d) : null);
            ec.d dVar = this.f9983h;
            if (dVar != null) {
                bundle.putStringArray("initialization_args", dVar.b());
            }
            v vVar = this.f9984i;
            if (vVar == null) {
                vVar = v.surface;
            }
            bundle.putString("flutterview_render_mode", vVar.name());
            w wVar = this.f9985j;
            if (wVar == null) {
                wVar = w.transparent;
            }
            bundle.putString("flutterview_transparency_mode", wVar.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.f9986k);
            bundle.putBoolean("destroy_engine_with_fragment", true);
            bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f9987l);
            bundle.putBoolean("should_delay_first_android_view_draw", this.f9988m);
            return bundle;
        }

        public d d(String str) {
            this.f9977b = str;
            return this;
        }

        public d e(List<String> list) {
            this.f9979d = list;
            return this;
        }

        public d f(String str) {
            this.f9978c = str;
            return this;
        }

        public d g(ec.d dVar) {
            this.f9983h = dVar;
            return this;
        }

        public d h(Boolean bool) {
            this.f9981f = bool.booleanValue();
            return this;
        }

        public d i(String str) {
            this.f9980e = str;
            return this;
        }

        public d j(v vVar) {
            this.f9984i = vVar;
            return this;
        }

        public d k(boolean z10) {
            this.f9986k = z10;
            return this;
        }

        public d l(boolean z10) {
            this.f9987l = z10;
            return this;
        }

        public d m(boolean z10) {
            this.f9988m = z10;
            return this;
        }

        public d n(w wVar) {
            this.f9985j = wVar;
            return this;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends g> f9989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private v f9994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private w f9995g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f9996h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f9997i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f9998j;

        public e(Class<? extends g> cls, String str) {
            this.f9991c = "main";
            this.f9992d = "/";
            this.f9993e = false;
            this.f9994f = v.surface;
            this.f9995g = w.transparent;
            this.f9996h = true;
            this.f9997i = false;
            this.f9998j = false;
            this.f9989a = cls;
            this.f9990b = str;
        }

        public e(String str) {
            this(g.class, str);
        }

        public <T extends g> T a() {
            try {
                T t10 = (T) this.f9989a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (t10 != null) {
                    t10.setArguments(b());
                    return t10;
                }
                throw new RuntimeException("The FlutterFragment subclass sent in the constructor (" + this.f9989a.getCanonicalName() + ") does not match the expected return type.");
            } catch (Exception e10) {
                throw new RuntimeException("Could not instantiate FlutterFragment subclass (" + this.f9989a.getName() + ")", e10);
            }
        }

        protected Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("cached_engine_group_id", this.f9990b);
            bundle.putString("dart_entrypoint", this.f9991c);
            bundle.putString("initial_route", this.f9992d);
            bundle.putBoolean("handle_deeplinking", this.f9993e);
            v vVar = this.f9994f;
            if (vVar == null) {
                vVar = v.surface;
            }
            bundle.putString("flutterview_render_mode", vVar.name());
            w wVar = this.f9995g;
            if (wVar == null) {
                wVar = w.transparent;
            }
            bundle.putString("flutterview_transparency_mode", wVar.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.f9996h);
            bundle.putBoolean("destroy_engine_with_fragment", true);
            bundle.putBoolean("should_automatically_handle_on_back_pressed", this.f9997i);
            bundle.putBoolean("should_delay_first_android_view_draw", this.f9998j);
            return bundle;
        }

        public e c(String str) {
            this.f9991c = str;
            return this;
        }

        public e d(boolean z10) {
            this.f9993e = z10;
            return this;
        }

        public e e(String str) {
            this.f9992d = str;
            return this;
        }

        public e f(v vVar) {
            this.f9994f = vVar;
            return this;
        }

        public e g(boolean z10) {
            this.f9996h = z10;
            return this;
        }

        public e h(boolean z10) {
            this.f9997i = z10;
            return this;
        }

        public e i(boolean z10) {
            this.f9998j = z10;
            return this;
        }

        public e j(w wVar) {
            this.f9995g = wVar;
            return this;
        }
    }

    public g() {
        setArguments(new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O(String str) {
        StringBuilder sb2;
        String str2;
        dc.c cVar = this.f9962b;
        if (cVar == null) {
            sb2 = new StringBuilder();
            sb2.append("FlutterFragment ");
            sb2.append(hashCode());
            sb2.append(" ");
            sb2.append(str);
            str2 = " called after release.";
        } else {
            if (cVar.m()) {
                return true;
            }
            sb2 = new StringBuilder();
            sb2.append("FlutterFragment ");
            sb2.append(hashCode());
            sb2.append(" ");
            sb2.append(str);
            str2 = " called after detach.";
        }
        sb2.append(str2);
        cc.b.g("FlutterFragment", sb2.toString());
        return false;
    }

    public static c P(String str) {
        return new c(str, (a) null);
    }

    public static d Q() {
        return new d();
    }

    public static e R(String str) {
        return new e(str);
    }

    @Override // dc.c.d
    public ec.d A() {
        String[] stringArray = getArguments().getStringArray("initialization_args");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        return new ec.d(stringArray);
    }

    @Override // dc.c.d
    public v B() {
        return v.valueOf(getArguments().getString("flutterview_render_mode", v.surface.name()));
    }

    @Override // dc.c.d
    public void C(m mVar) {
    }

    @Override // dc.c.d
    public void D(l lVar) {
    }

    @Override // dc.c.d
    public w E() {
        return w.valueOf(getArguments().getString("flutterview_transparency_mode", w.transparent.name()));
    }

    public io.flutter.embedding.engine.a H() {
        return this.f9962b.l();
    }

    boolean I() {
        return this.f9962b.n();
    }

    public void J() {
        if (O("onBackPressed")) {
            this.f9962b.r();
        }
    }

    public void K(Intent intent) {
        if (O("onNewIntent")) {
            this.f9962b.v(intent);
        }
    }

    public void L() {
        if (O("onPostResume")) {
            this.f9962b.x();
        }
    }

    public void M() {
        if (O("onUserLeaveHint")) {
            this.f9962b.F();
        }
    }

    boolean N() {
        return getArguments().getBoolean("should_delay_first_android_view_draw");
    }

    @Override // wc.e.d
    public boolean a() {
        androidx.fragment.app.o activity;
        if (!getArguments().getBoolean("should_automatically_handle_on_back_pressed", false) || (activity = getActivity()) == null) {
            return false;
        }
        boolean zG = this.f9964d.g();
        if (zG) {
            this.f9964d.j(false);
        }
        activity.getOnBackPressedDispatcher().l();
        if (zG) {
            this.f9964d.j(true);
        }
        return true;
    }

    @Override // dc.c.d
    public void b() {
        x4.f activity = getActivity();
        if (activity instanceof qc.a) {
            ((qc.a) activity).b();
        }
    }

    @Override // dc.c.d
    public void c() {
        cc.b.g("FlutterFragment", "FlutterFragment " + this + " connection to the engine " + H() + " evicted by another attaching activity");
        dc.c cVar = this.f9962b;
        if (cVar != null) {
            cVar.t();
            this.f9962b.u();
        }
    }

    @Override // dc.c.d, dc.f
    public io.flutter.embedding.engine.a d(Context context) {
        x4.f activity = getActivity();
        if (!(activity instanceof f)) {
            return null;
        }
        cc.b.f("FlutterFragment", "Deferring to attached Activity to provide a FlutterEngine.");
        return ((f) activity).d(getContext());
    }

    @Override // dc.c.d
    public void e() {
        x4.f activity = getActivity();
        if (activity instanceof qc.a) {
            ((qc.a) activity).e();
        }
    }

    @Override // wc.e.d
    public void f(boolean z10) {
        if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false)) {
            this.f9964d.j(z10);
        }
    }

    @Override // dc.c.d, dc.e
    public void g(io.flutter.embedding.engine.a aVar) {
        x4.f activity = getActivity();
        if (activity instanceof dc.e) {
            ((dc.e) activity).g(aVar);
        }
    }

    @Override // dc.c.d
    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    @Override // dc.c.d, dc.e
    public void h(io.flutter.embedding.engine.a aVar) {
        x4.f activity = getActivity();
        if (activity instanceof dc.e) {
            ((dc.e) activity).h(aVar);
        }
    }

    @Override // dc.c.d
    public List<String> i() {
        return getArguments().getStringArrayList("dart_entrypoint_args");
    }

    @Override // dc.c.d
    public String k() {
        return getArguments().getString("cached_engine_id", null);
    }

    @Override // dc.c.d
    public boolean l() {
        return getArguments().containsKey("enable_state_restoration") ? getArguments().getBoolean("enable_state_restoration") : k() == null;
    }

    @Override // dc.c.d
    public String m() {
        return getArguments().getString("dart_entrypoint", "main");
    }

    @Override // dc.c.d
    public wc.e n(Activity activity, io.flutter.embedding.engine.a aVar) {
        if (activity != null) {
            return new wc.e(getActivity(), aVar.o(), this);
        }
        return null;
    }

    @Override // dc.c.InterfaceC0230c
    public dc.c o(c.d dVar) {
        return new dc.c(dVar);
    }

    @Override // androidx.fragment.app.n
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (O("onActivityResult")) {
            this.f9962b.p(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.n
    public void onAttach(Context context) {
        super.onAttach(context);
        dc.c cVarO = this.f9963c.o(this);
        this.f9962b = cVarO;
        cVarO.q(context);
        if (getArguments().getBoolean("should_automatically_handle_on_back_pressed", false)) {
            requireActivity().getOnBackPressedDispatcher().i(this, this.f9964d);
            this.f9964d.j(false);
        }
        context.registerComponentCallbacks(this);
    }

    @Override // androidx.fragment.app.n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9962b.z(bundle);
    }

    @Override // androidx.fragment.app.n
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f9962b.s(layoutInflater, viewGroup, bundle, f9960e, N());
    }

    @Override // androidx.fragment.app.n
    public void onDestroyView() {
        super.onDestroyView();
        requireView().getViewTreeObserver().removeOnWindowFocusChangeListener(this.f9961a);
        if (O("onDestroyView")) {
            this.f9962b.t();
        }
    }

    @Override // androidx.fragment.app.n
    public void onDetach() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetach();
        dc.c cVar = this.f9962b;
        if (cVar != null) {
            cVar.u();
            this.f9962b.H();
            this.f9962b = null;
        } else {
            cc.b.f("FlutterFragment", "FlutterFragment " + this + " onDetach called after release.");
        }
    }

    @Override // androidx.fragment.app.n
    public void onPause() {
        super.onPause();
        if (O("onPause")) {
            this.f9962b.w();
        }
    }

    @Override // androidx.fragment.app.n
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (O("onRequestPermissionsResult")) {
            this.f9962b.y(i10, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.n
    public void onResume() {
        super.onResume();
        if (O("onResume")) {
            this.f9962b.A();
        }
    }

    @Override // androidx.fragment.app.n
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (O("onSaveInstanceState")) {
            this.f9962b.B(bundle);
        }
    }

    @Override // androidx.fragment.app.n
    public void onStart() {
        super.onStart();
        if (O("onStart")) {
            this.f9962b.C();
        }
    }

    @Override // androidx.fragment.app.n
    public void onStop() {
        super.onStop();
        if (O("onStop")) {
            this.f9962b.D();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (O("onTrimMemory")) {
            this.f9962b.E(i10);
        }
    }

    @Override // androidx.fragment.app.n
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f9961a);
    }

    @Override // dc.c.d
    public boolean p() {
        return getArguments().getBoolean("handle_deeplinking");
    }

    @Override // dc.c.d
    public boolean q() {
        return true;
    }

    @Override // dc.c.d
    public String t() {
        return getArguments().getString("cached_engine_group_id", null);
    }

    @Override // dc.c.d
    public String u() {
        return getArguments().getString("initial_route");
    }

    @Override // dc.c.d
    public boolean v() {
        return getArguments().getBoolean("should_attach_engine_to_activity");
    }

    @Override // dc.c.d
    public boolean w() {
        boolean z10 = getArguments().getBoolean("destroy_engine_with_fragment", false);
        return (k() != null || this.f9962b.n()) ? z10 : getArguments().getBoolean("destroy_engine_with_fragment", true);
    }

    @Override // dc.c.d
    public boolean x() {
        return true;
    }

    @Override // dc.c.d
    public String y() {
        return getArguments().getString("dart_entrypoint_uri");
    }

    @Override // dc.c.d
    public String z() {
        return getArguments().getString("app_bundle_path");
    }
}
