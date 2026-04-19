package dc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import fc.a;
import io.flutter.embedding.engine.c;
import java.util.Arrays;
import java.util.List;
import wc.e;

/* JADX INFO: loaded from: classes2.dex */
class c implements dc.b<Activity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f9942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.a f9943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    io.flutter.embedding.android.b f9944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private wc.e f9945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f9946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f9951j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.flutter.embedding.engine.c f9952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final qc.a f9953l;

    class a implements qc.a {
        a() {
        }

        @Override // qc.a
        public void b() {
            c.this.f9942a.b();
            c.this.f9948g = false;
        }

        @Override // qc.a
        public void e() {
            c.this.f9942a.e();
            c.this.f9948g = true;
            c.this.f9949h = true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.flutter.embedding.android.b f9955a;

        b(io.flutter.embedding.android.b bVar) {
            this.f9955a = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (c.this.f9948g && c.this.f9946e != null) {
                this.f9955a.getViewTreeObserver().removeOnPreDrawListener(this);
                c.this.f9946e = null;
            }
            return c.this.f9948g;
        }
    }

    /* JADX INFO: renamed from: dc.c$c, reason: collision with other inner class name */
    public interface InterfaceC0230c {
        c o(d dVar);
    }

    interface d extends f, e, e.d {
        ec.d A();

        v B();

        void C(m mVar);

        void D(l lVar);

        w E();

        void b();

        void c();

        @Override // dc.f
        io.flutter.embedding.engine.a d(Context context);

        void e();

        @Override // dc.e
        void g(io.flutter.embedding.engine.a aVar);

        Activity getActivity();

        Context getContext();

        androidx.lifecycle.g getLifecycle();

        @Override // dc.e
        void h(io.flutter.embedding.engine.a aVar);

        List<String> i();

        String k();

        boolean l();

        String m();

        wc.e n(Activity activity, io.flutter.embedding.engine.a aVar);

        boolean p();

        boolean q();

        String t();

        String u();

        boolean v();

        boolean w();

        boolean x();

        String y();

        String z();
    }

    c(d dVar) {
        this(dVar, null);
    }

    c(d dVar, io.flutter.embedding.engine.c cVar) {
        this.f9953l = new a();
        this.f9942a = dVar;
        this.f9949h = false;
        this.f9952k = cVar;
    }

    private c.b g(c.b bVar) {
        String strZ = this.f9942a.z();
        if (strZ == null || strZ.isEmpty()) {
            strZ = cc.a.e().c().g();
        }
        a.b bVar2 = new a.b(strZ, this.f9942a.m());
        String strU = this.f9942a.u();
        if (strU == null && (strU = o(this.f9942a.getActivity().getIntent())) == null) {
            strU = "/";
        }
        return bVar.i(bVar2).k(strU).j(this.f9942a.i());
    }

    private void h(io.flutter.embedding.android.b bVar) {
        if (this.f9942a.B() != v.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f9946e != null) {
            bVar.getViewTreeObserver().removeOnPreDrawListener(this.f9946e);
        }
        this.f9946e = new b(bVar);
        bVar.getViewTreeObserver().addOnPreDrawListener(this.f9946e);
    }

    private void i() {
        String str;
        if (this.f9942a.k() == null && !this.f9943b.j().k()) {
            String strU = this.f9942a.u();
            if (strU == null && (strU = o(this.f9942a.getActivity().getIntent())) == null) {
                strU = "/";
            }
            String strY = this.f9942a.y();
            if (("Executing Dart entrypoint: " + this.f9942a.m() + ", library uri: " + strY) == null) {
                str = "\"\"";
            } else {
                str = strY + ", and sending initial route: " + strU;
            }
            cc.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f9943b.n().c(strU);
            String strZ = this.f9942a.z();
            if (strZ == null || strZ.isEmpty()) {
                strZ = cc.a.e().c().g();
            }
            this.f9943b.j().j(strY == null ? new a.b(strZ, this.f9942a.m()) : new a.b(strZ, strY, this.f9942a.m()), this.f9942a.i());
        }
    }

    private void j() {
        if (this.f9942a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String o(Intent intent) {
        Uri data;
        if (!this.f9942a.p() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    void A() {
        io.flutter.embedding.engine.a aVar;
        cc.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        j();
        if (!this.f9942a.x() || (aVar = this.f9943b) == null) {
            return;
        }
        aVar.k().e();
    }

    void B(Bundle bundle) {
        cc.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        j();
        if (this.f9942a.l()) {
            bundle.putByteArray("framework", this.f9943b.t().h());
        }
        if (this.f9942a.v()) {
            Bundle bundle2 = new Bundle();
            this.f9943b.i().b(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    void C() {
        cc.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        j();
        i();
        Integer num = this.f9951j;
        if (num != null) {
            this.f9944c.setVisibility(num.intValue());
        }
    }

    void D() {
        io.flutter.embedding.engine.a aVar;
        cc.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        j();
        if (this.f9942a.x() && (aVar = this.f9943b) != null) {
            aVar.k().d();
        }
        this.f9951j = Integer.valueOf(this.f9944c.getVisibility());
        this.f9944c.setVisibility(8);
        io.flutter.embedding.engine.a aVar2 = this.f9943b;
        if (aVar2 != null) {
            aVar2.s().p(40);
        }
    }

    void E(int i10) {
        j();
        io.flutter.embedding.engine.a aVar = this.f9943b;
        if (aVar != null) {
            if (this.f9949h && i10 >= 10) {
                aVar.j().l();
                this.f9943b.w().a();
            }
            this.f9943b.s().p(i10);
            this.f9943b.p().o0(i10);
        }
    }

    void F() {
        j();
        if (this.f9943b == null) {
            cc.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            cc.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f9943b.i().c();
        }
    }

    void G(boolean z10) {
        io.flutter.embedding.engine.a aVar;
        j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Received onWindowFocusChanged: ");
        sb2.append(z10 ? com.amazon.a.a.o.b.f7427af : com.amazon.a.a.o.b.ag);
        cc.b.f("FlutterActivityAndFragmentDelegate", sb2.toString());
        if (!this.f9942a.x() || (aVar = this.f9943b) == null) {
            return;
        }
        if (z10) {
            aVar.k().a();
        } else {
            aVar.k().f();
        }
    }

    void H() {
        this.f9942a = null;
        this.f9943b = null;
        this.f9944c = null;
        this.f9945d = null;
    }

    void I() {
        io.flutter.embedding.engine.c cVar;
        c.b bVarL;
        cc.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String strK = this.f9942a.k();
        if (strK != null) {
            io.flutter.embedding.engine.a aVarA = ec.a.b().a(strK);
            this.f9943b = aVarA;
            this.f9947f = true;
            if (aVarA != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + strK + "'");
        }
        d dVar = this.f9942a;
        io.flutter.embedding.engine.a aVarD = dVar.d(dVar.getContext());
        this.f9943b = aVarD;
        if (aVarD != null) {
            this.f9947f = true;
            return;
        }
        String strT = this.f9942a.t();
        if (strT != null) {
            cVar = ec.b.b().a(strT);
            if (cVar == null) {
                throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + strT + "'");
            }
            bVarL = new c.b(this.f9942a.getContext());
        } else {
            cc.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            cVar = this.f9952k;
            if (cVar == null) {
                cVar = new io.flutter.embedding.engine.c(this.f9942a.getContext(), this.f9942a.A().b());
            }
            bVarL = new c.b(this.f9942a.getContext()).h(false).l(this.f9942a.l());
        }
        this.f9943b = cVar.a(g(bVarL));
        this.f9947f = false;
    }

    void J() {
        wc.e eVar = this.f9945d;
        if (eVar != null) {
            eVar.E();
        }
    }

    @Override // dc.b
    public void c() {
        if (!this.f9942a.w()) {
            this.f9942a.c();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f9942a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // dc.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Activity d() {
        Activity activity = this.f9942a.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    io.flutter.embedding.engine.a l() {
        return this.f9943b;
    }

    boolean m() {
        return this.f9950i;
    }

    boolean n() {
        return this.f9947f;
    }

    void p(int i10, int i11, Intent intent) {
        j();
        if (this.f9943b == null) {
            cc.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        cc.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i10 + "\nresultCode: " + i11 + "\ndata: " + intent);
        this.f9943b.i().onActivityResult(i10, i11, intent);
    }

    void q(Context context) {
        j();
        if (this.f9943b == null) {
            I();
        }
        if (this.f9942a.v()) {
            cc.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f9943b.i().g(this, this.f9942a.getLifecycle());
        }
        d dVar = this.f9942a;
        this.f9945d = dVar.n(dVar.getActivity(), this.f9943b);
        this.f9942a.g(this.f9943b);
        this.f9950i = true;
    }

    void r() {
        j();
        if (this.f9943b == null) {
            cc.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            cc.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f9943b.n().a();
        }
    }

    View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i10, boolean z10) {
        io.flutter.embedding.android.b bVar;
        cc.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        j();
        if (this.f9942a.B() == v.surface) {
            l lVar = new l(this.f9942a.getContext(), this.f9942a.E() == w.transparent);
            this.f9942a.D(lVar);
            bVar = new io.flutter.embedding.android.b(this.f9942a.getContext(), lVar);
        } else {
            m mVar = new m(this.f9942a.getContext());
            mVar.setOpaque(this.f9942a.E() == w.opaque);
            this.f9942a.C(mVar);
            bVar = new io.flutter.embedding.android.b(this.f9942a.getContext(), mVar);
        }
        this.f9944c = bVar;
        this.f9944c.l(this.f9953l);
        if (this.f9942a.q()) {
            cc.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f9944c.n(this.f9943b);
        }
        this.f9944c.setId(i10);
        if (z10) {
            h(this.f9944c);
        }
        return this.f9944c;
    }

    void t() {
        cc.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        j();
        if (this.f9946e != null) {
            this.f9944c.getViewTreeObserver().removeOnPreDrawListener(this.f9946e);
            this.f9946e = null;
        }
        io.flutter.embedding.android.b bVar = this.f9944c;
        if (bVar != null) {
            bVar.s();
            this.f9944c.y(this.f9953l);
        }
    }

    void u() {
        io.flutter.embedding.engine.a aVar;
        if (this.f9950i) {
            cc.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            j();
            this.f9942a.h(this.f9943b);
            if (this.f9942a.v()) {
                cc.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f9942a.getActivity().isChangingConfigurations()) {
                    this.f9943b.i().h();
                } else {
                    this.f9943b.i().f();
                }
            }
            wc.e eVar = this.f9945d;
            if (eVar != null) {
                eVar.q();
                this.f9945d = null;
            }
            if (this.f9942a.x() && (aVar = this.f9943b) != null) {
                aVar.k().b();
            }
            if (this.f9942a.w()) {
                this.f9943b.g();
                if (this.f9942a.k() != null) {
                    ec.a.b().d(this.f9942a.k());
                }
                this.f9943b = null;
            }
            this.f9950i = false;
        }
    }

    void v(Intent intent) {
        j();
        if (this.f9943b == null) {
            cc.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        cc.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f9943b.i().e(intent);
        String strO = o(intent);
        if (strO == null || strO.isEmpty()) {
            return;
        }
        this.f9943b.n().b(strO);
    }

    void w() {
        io.flutter.embedding.engine.a aVar;
        cc.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        j();
        if (!this.f9942a.x() || (aVar = this.f9943b) == null) {
            return;
        }
        aVar.k().c();
    }

    void x() {
        cc.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        j();
        if (this.f9943b == null) {
            cc.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            J();
            this.f9943b.p().n0();
        }
    }

    void y(int i10, String[] strArr, int[] iArr) {
        j();
        if (this.f9943b == null) {
            cc.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        cc.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i10 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f9943b.i().d(i10, strArr, iArr);
    }

    void z(Bundle bundle) {
        Bundle bundle2;
        cc.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        j();
        byte[] byteArray = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f9942a.l()) {
            this.f9943b.t().j(byteArray);
        }
        if (this.f9942a.v()) {
            this.f9943b.i().a(bundle2);
        }
    }
}
