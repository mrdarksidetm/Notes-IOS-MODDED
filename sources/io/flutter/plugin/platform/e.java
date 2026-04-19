package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import dc.u;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import rc.m;
import wc.j;
import wc.k;
import wc.l;
import wc.w;

/* JADX INFO: loaded from: classes2.dex */
public class e implements l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Class[] f13055w = {SurfaceView.class};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f13056x = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static boolean f13057y = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dc.a f13059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f13060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.flutter.embedding.android.b f13061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextureRegistry f13062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.flutter.plugin.editing.d f13063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m f13064g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f13072o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f13073p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f13074q = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f13078u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final m.g f13079v = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f13058a = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final HashMap<Integer, h> f13066i = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f13065h = new io.flutter.plugin.platform.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final HashMap<Context, View> f13067j = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SparseArray<b> f13070m = new SparseArray<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final HashSet<Integer> f13075r = new HashSet<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashSet<Integer> f13076s = new HashSet<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SparseArray<k> f13071n = new SparseArray<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseArray<wc.g> f13068k = new SparseArray<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SparseArray<ic.a> f13069l = new SparseArray<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final u f13077t = u.a();

    class a implements m.g {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(h hVar, float f10, m.b bVar) {
            e.this.A0(hVar);
            if (e.this.f13060c != null) {
                f10 = e.this.V();
            }
            bVar.a(new m.c(e.this.w0(hVar.f(), f10), e.this.w0(hVar.e(), f10)));
        }

        @Override // rc.m.g
        public void a(boolean z10) {
            e.this.f13074q = z10;
        }

        @Override // rc.m.g
        public void b(int i10, int i11) {
            View view;
            StringBuilder sb2;
            String str;
            if (!e.B0(i11)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i11 + "(view id: " + i10 + ")");
            }
            if (e.this.c(i10)) {
                view = e.this.f13066i.get(Integer.valueOf(i10)).g();
            } else {
                wc.g gVar = (wc.g) e.this.f13068k.get(i10);
                if (gVar == null) {
                    sb2 = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                    sb2.append(str);
                    sb2.append(i10);
                    cc.b.b("PlatformViewsController", sb2.toString());
                }
                view = gVar.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i11);
                return;
            }
            sb2 = new StringBuilder();
            str = "Setting direction to a null view with id: ";
            sb2.append(str);
            sb2.append(i10);
            cc.b.b("PlatformViewsController", sb2.toString());
        }

        @Override // rc.m.g
        public void c(int i10, double d10, double d11) {
            if (e.this.c(i10)) {
                return;
            }
            k kVar = (k) e.this.f13071n.get(i10);
            if (kVar == null) {
                cc.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i10);
                return;
            }
            int iY0 = e.this.y0(d10);
            int iY02 = e.this.y0(d11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
            layoutParams.topMargin = iY0;
            layoutParams.leftMargin = iY02;
            kVar.setLayoutParams(layoutParams);
        }

        @Override // rc.m.g
        public long d(m.d dVar) {
            e.this.T(dVar);
            int i10 = dVar.f19343a;
            if (e.this.f13071n.get(i10) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i10);
            }
            if (e.this.f13062e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i10);
            }
            if (e.this.f13061d == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i10);
            }
            wc.g gVarM = e.this.M(dVar, true);
            View view = gVarM.getView();
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (!(gd.h.f(view, e.f13055w) ? false : true)) {
                if (dVar.f19350h == m.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                    e.this.H(gVarM, dVar);
                    return -2L;
                }
                if (!e.this.f13078u) {
                    return e.this.J(gVarM, dVar);
                }
            }
            return e.this.I(gVarM, dVar);
        }

        @Override // rc.m.g
        public void e(m.e eVar, final m.b bVar) {
            int iY0 = e.this.y0(eVar.f19357b);
            int iY02 = e.this.y0(eVar.f19358c);
            int i10 = eVar.f19356a;
            if (e.this.c(i10)) {
                final float fV = e.this.V();
                final h hVar = e.this.f13066i.get(Integer.valueOf(i10));
                e.this.d0(hVar);
                hVar.k(iY0, iY02, new Runnable() { // from class: io.flutter.plugin.platform.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13051a.k(hVar, fV, bVar);
                    }
                });
                return;
            }
            wc.g gVar = (wc.g) e.this.f13068k.get(i10);
            k kVar = (k) e.this.f13071n.get(i10);
            if (gVar == null || kVar == null) {
                cc.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i10);
                return;
            }
            if (iY0 > kVar.getRenderTargetWidth() || iY02 > kVar.getRenderTargetHeight()) {
                kVar.b(iY0, iY02);
            }
            ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
            layoutParams.width = iY0;
            layoutParams.height = iY02;
            kVar.setLayoutParams(layoutParams);
            View view = gVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = iY0;
                layoutParams2.height = iY02;
                view.setLayoutParams(layoutParams2);
            }
            bVar.a(new m.c(e.this.v0(kVar.getRenderTargetWidth()), e.this.v0(kVar.getRenderTargetHeight())));
        }

        @Override // rc.m.g
        public void f(int i10) {
            View view;
            StringBuilder sb2;
            String str;
            if (e.this.c(i10)) {
                view = e.this.f13066i.get(Integer.valueOf(i10)).g();
            } else {
                wc.g gVar = (wc.g) e.this.f13068k.get(i10);
                if (gVar == null) {
                    sb2 = new StringBuilder();
                    str = "Clearing focus on an unknown view with id: ";
                    sb2.append(str);
                    sb2.append(i10);
                    cc.b.b("PlatformViewsController", sb2.toString());
                }
                view = gVar.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            sb2 = new StringBuilder();
            str = "Clearing focus on a null view with id: ";
            sb2.append(str);
            sb2.append(i10);
            cc.b.b("PlatformViewsController", sb2.toString());
        }

        @Override // rc.m.g
        public void g(m.d dVar) {
            e.this.S(19);
            e.this.T(dVar);
            e.this.H(e.this.M(dVar, false), dVar);
        }

        @Override // rc.m.g
        public void h(m.f fVar) {
            int i10 = fVar.f19359a;
            float f10 = e.this.f13060c.getResources().getDisplayMetrics().density;
            if (e.this.c(i10)) {
                e.this.f13066i.get(Integer.valueOf(i10)).c(e.this.x0(f10, fVar, true));
                return;
            }
            wc.g gVar = (wc.g) e.this.f13068k.get(i10);
            if (gVar == null) {
                cc.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i10);
                return;
            }
            View view = gVar.getView();
            if (view != null) {
                view.dispatchTouchEvent(e.this.x0(f10, fVar, false));
                return;
            }
            cc.b.b("PlatformViewsController", "Sending touch to a null view with id: " + i10);
        }

        @Override // rc.m.g
        public void i(int i10) {
            wc.g gVar = (wc.g) e.this.f13068k.get(i10);
            if (gVar == null) {
                cc.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i10);
                return;
            }
            if (gVar.getView() != null) {
                View view = gVar.getView();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            e.this.f13068k.remove(i10);
            try {
                gVar.dispose();
            } catch (RuntimeException e10) {
                cc.b.c("PlatformViewsController", "Disposing platform view threw an exception", e10);
            }
            if (e.this.c(i10)) {
                h hVar = e.this.f13066i.get(Integer.valueOf(i10));
                View viewG = hVar.g();
                if (viewG != null) {
                    e.this.f13067j.remove(viewG.getContext());
                }
                hVar.d();
                e.this.f13066i.remove(Integer.valueOf(i10));
                return;
            }
            k kVar = (k) e.this.f13071n.get(i10);
            if (kVar != null) {
                kVar.removeAllViews();
                kVar.a();
                kVar.c();
                ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(kVar);
                }
                e.this.f13071n.remove(i10);
                return;
            }
            ic.a aVar = (ic.a) e.this.f13069l.get(i10);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup3 = (ViewGroup) aVar.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(aVar);
                }
                e.this.f13069l.remove(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(h hVar) {
        io.flutter.plugin.editing.d dVar = this.f13063f;
        if (dVar == null) {
            return;
        }
        dVar.F();
        hVar.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean B0(int i10) {
        return i10 == 0 || i10 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(wc.g gVar, m.d dVar) {
        S(19);
        cc.b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f19343a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long J(wc.g gVar, final m.d dVar) {
        S(20);
        cc.b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f19343a);
        j jVarE0 = e0(this.f13062e);
        h hVarB = h.b(this.f13060c, this.f13065h, gVar, jVarE0, y0(dVar.f19345c), y0(dVar.f19346d), dVar.f19343a, null, new View.OnFocusChangeListener() { // from class: wc.p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                this.f22883a.a0(dVar, view, z10);
            }
        });
        if (hVarB != null) {
            this.f13066i.put(Integer.valueOf(dVar.f19343a), hVarB);
            View view = gVar.getView();
            this.f13067j.put(view.getContext(), view);
            return jVarE0.getId();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f19344b + " with id: " + dVar.f19343a);
    }

    private void R() {
        while (this.f13068k.size() > 0) {
            this.f13079v.i(this.f13068k.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= i10) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i11 + ", required API level is: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(m.d dVar) {
        if (B0(dVar.f19349g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f19349g + "(view id: " + dVar.f19343a + ")");
    }

    private void U(boolean z10) {
        for (int i10 = 0; i10 < this.f13070m.size(); i10++) {
            int iKeyAt = this.f13070m.keyAt(i10);
            b bVarValueAt = this.f13070m.valueAt(i10);
            if (this.f13075r.contains(Integer.valueOf(iKeyAt))) {
                this.f13061d.m(bVarValueAt);
                z10 &= bVarValueAt.e();
            } else {
                if (!this.f13073p) {
                    bVarValueAt.d();
                }
                bVarValueAt.setVisibility(8);
                this.f13061d.removeView(bVarValueAt);
            }
        }
        for (int i11 = 0; i11 < this.f13069l.size(); i11++) {
            int iKeyAt2 = this.f13069l.keyAt(i11);
            ic.a aVar = this.f13069l.get(iKeyAt2);
            if (!this.f13076s.contains(Integer.valueOf(iKeyAt2)) || (!z10 && this.f13074q)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float V() {
        return this.f13060c.getResources().getDisplayMetrics().density;
    }

    private void Y() {
        if (!this.f13074q || this.f13073p) {
            return;
        }
        this.f13061d.p();
        this.f13073p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(m.d dVar, View view, boolean z10) {
        if (z10) {
            this.f13064g.d(dVar.f19343a);
            return;
        }
        io.flutter.plugin.editing.d dVar2 = this.f13063f;
        if (dVar2 != null) {
            dVar2.k(dVar.f19343a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(m.d dVar, View view, boolean z10) {
        if (z10) {
            this.f13064g.d(dVar.f19343a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(int i10, View view, boolean z10) {
        if (z10) {
            this.f13064g.d(i10);
            return;
        }
        io.flutter.plugin.editing.d dVar = this.f13063f;
        if (dVar != null) {
            dVar.k(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0() {
        U(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(h hVar) {
        io.flutter.plugin.editing.d dVar = this.f13063f;
        if (dVar == null) {
            return;
        }
        dVar.t();
        hVar.h();
    }

    private static j e0(TextureRegistry textureRegistry) {
        if (f13057y && Build.VERSION.SDK_INT >= 29) {
            TextureRegistry.SurfaceProducer surfaceProducerB = textureRegistry.b();
            cc.b.e("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
            return new wc.u(surfaceProducerB);
        }
        if (!f13056x || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryC = textureRegistry.c();
            cc.b.e("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
            return new w(surfaceTextureEntryC);
        }
        TextureRegistry.ImageTextureEntry imageTextureEntryA = textureRegistry.a();
        cc.b.e("PlatformViewsController", "PlatformView is using ImageReader backend");
        return new wc.a(imageTextureEntryA);
    }

    private void f0(wc.g gVar) {
        io.flutter.embedding.android.b bVar = this.f13061d;
        if (bVar == null) {
            cc.b.e("PlatformViewsController", "null flutterView");
        } else {
            gVar.onFlutterViewAttached(bVar);
        }
    }

    private static MotionEvent.PointerCoords p0(Object obj, float f10) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d10 = f10;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d10);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d10);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d10);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d10);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d10);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d10);
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> q0(Object obj, float f10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(p0(it.next(), f10));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties r0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> s0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(r0(it.next()));
        }
        return arrayList;
    }

    private void t0() {
        if (this.f13061d == null) {
            cc.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i10 = 0; i10 < this.f13070m.size(); i10++) {
            this.f13061d.removeView(this.f13070m.valueAt(i10));
        }
        this.f13070m.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int v0(double d10) {
        return w0(d10, V());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int w0(double d10, float f10) {
        return (int) Math.round(d10 / ((double) f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y0(double d10) {
        return (int) Math.round(d10 * ((double) V()));
    }

    private static void z0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public void C(Context context, TextureRegistry textureRegistry, fc.a aVar) {
        if (this.f13060c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f13060c = context;
        this.f13062e = textureRegistry;
        m mVar = new m(aVar);
        this.f13064g = mVar;
        mVar.e(this.f13079v);
    }

    public void D(io.flutter.plugin.editing.d dVar) {
        this.f13063f = dVar;
    }

    public void E(FlutterRenderer flutterRenderer) {
        this.f13059b = new dc.a(flutterRenderer, true);
    }

    public void F(io.flutter.embedding.android.b bVar) {
        this.f13061d = bVar;
        for (int i10 = 0; i10 < this.f13071n.size(); i10++) {
            this.f13061d.addView(this.f13071n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f13069l.size(); i11++) {
            this.f13061d.addView(this.f13069l.valueAt(i11));
        }
        for (int i12 = 0; i12 < this.f13068k.size(); i12++) {
            this.f13068k.valueAt(i12).onFlutterViewAttached(this.f13061d);
        }
    }

    public boolean G(View view) {
        if (view == null || !this.f13067j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f13067j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(23)
    public long I(wc.g gVar, final m.d dVar) {
        k kVar;
        long j10;
        S(23);
        cc.b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f19343a);
        int iY0 = y0(dVar.f19345c);
        int iY02 = y0(dVar.f19346d);
        if (this.f13078u) {
            kVar = new k(this.f13060c);
            j10 = -1;
        } else {
            j jVarE0 = e0(this.f13062e);
            k kVar2 = new k(this.f13060c, jVarE0);
            long id2 = jVarE0.getId();
            kVar = kVar2;
            j10 = id2;
        }
        kVar.setTouchProcessor(this.f13059b);
        kVar.b(iY0, iY02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iY0, iY02);
        int iY03 = y0(dVar.f19347e);
        int iY04 = y0(dVar.f19348f);
        layoutParams.topMargin = iY03;
        layoutParams.leftMargin = iY04;
        kVar.setLayoutParams(layoutParams);
        View view = gVar.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(iY0, iY02));
        view.setImportantForAccessibility(4);
        kVar.addView(view);
        kVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: wc.o
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                this.f22881a.Z(dVar, view2, z10);
            }
        });
        this.f13061d.addView(kVar);
        this.f13071n.append(dVar.f19343a, kVar);
        f0(gVar);
        return j10;
    }

    public FlutterOverlaySurface K() {
        return L(new b(this.f13061d.getContext(), this.f13061d.getWidth(), this.f13061d.getHeight(), this.f13065h));
    }

    public FlutterOverlaySurface L(b bVar) {
        int i10 = this.f13072o;
        this.f13072o = i10 + 1;
        this.f13070m.put(i10, bVar);
        return new FlutterOverlaySurface(i10, bVar.getSurface());
    }

    public wc.g M(m.d dVar, boolean z10) {
        wc.h hVarB = this.f13058a.b(dVar.f19344b);
        if (hVarB == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f19344b);
        }
        wc.g gVarCreate = hVarB.create(z10 ? new MutableContextWrapper(this.f13060c) : this.f13060c, dVar.f19343a, dVar.f19351i != null ? hVarB.getCreateArgsCodec().b(dVar.f19351i) : null);
        View view = gVarCreate.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(dVar.f19349g);
        this.f13068k.put(dVar.f19343a, gVarCreate);
        f0(gVarCreate);
        return gVarCreate;
    }

    public void N() {
        for (int i10 = 0; i10 < this.f13070m.size(); i10++) {
            b bVarValueAt = this.f13070m.valueAt(i10);
            bVarValueAt.d();
            bVarValueAt.g();
        }
    }

    public void O() {
        m mVar = this.f13064g;
        if (mVar != null) {
            mVar.e(null);
        }
        N();
        this.f13064g = null;
        this.f13060c = null;
        this.f13062e = null;
    }

    public void P() {
        for (int i10 = 0; i10 < this.f13071n.size(); i10++) {
            this.f13061d.removeView(this.f13071n.valueAt(i10));
        }
        for (int i11 = 0; i11 < this.f13069l.size(); i11++) {
            this.f13061d.removeView(this.f13069l.valueAt(i11));
        }
        N();
        t0();
        this.f13061d = null;
        this.f13073p = false;
        for (int i12 = 0; i12 < this.f13068k.size(); i12++) {
            this.f13068k.valueAt(i12).onFlutterViewDetached();
        }
    }

    public void Q() {
        this.f13063f = null;
    }

    public wc.i W() {
        return this.f13058a;
    }

    void X(final int i10) {
        wc.g gVar = this.f13068k.get(i10);
        if (gVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
        if (this.f13069l.get(i10) != null) {
            return;
        }
        View view = gVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.f13060c;
        ic.a aVar = new ic.a(context, context.getResources().getDisplayMetrics().density, this.f13059b);
        aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: wc.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                this.f22878a.b0(i10, view2, z10);
            }
        });
        this.f13069l.put(i10, aVar);
        view.setImportantForAccessibility(4);
        aVar.addView(view);
        this.f13061d.addView(aVar);
    }

    @Override // wc.l
    public void a(io.flutter.view.c cVar) {
        this.f13065h.c(cVar);
    }

    @Override // wc.l
    public View b(int i10) {
        if (c(i10)) {
            return this.f13066i.get(Integer.valueOf(i10)).g();
        }
        wc.g gVar = this.f13068k.get(i10);
        if (gVar == null) {
            return null;
        }
        return gVar.getView();
    }

    @Override // wc.l
    public boolean c(int i10) {
        return this.f13066i.containsKey(Integer.valueOf(i10));
    }

    @Override // wc.l
    public void d() {
        this.f13065h.c(null);
    }

    public void g0() {
    }

    public void h0() {
        this.f13075r.clear();
        this.f13076s.clear();
    }

    public void i0() {
        R();
    }

    public void j0(int i10, int i11, int i12, int i13, int i14) {
        if (this.f13070m.get(i10) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i10 + ") doesn't exist");
        }
        Y();
        b bVar = this.f13070m.get(i10);
        if (bVar.getParent() == null) {
            this.f13061d.addView(bVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i14);
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = i12;
        bVar.setLayoutParams(layoutParams);
        bVar.setVisibility(0);
        bVar.bringToFront();
        this.f13075r.add(Integer.valueOf(i10));
    }

    public void k0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, FlutterMutatorsStack flutterMutatorsStack) {
        Y();
        X(i10);
        ic.a aVar = this.f13069l.get(i10);
        aVar.a(flutterMutatorsStack, i11, i12, i13, i14);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i15, i16);
        View view = this.f13068k.get(i10).getView();
        if (view != null) {
            view.setLayoutParams(layoutParams);
            view.bringToFront();
        }
        this.f13076s.add(Integer.valueOf(i10));
    }

    public void l0() {
        boolean z10 = false;
        if (this.f13073p && this.f13076s.isEmpty()) {
            this.f13073p = false;
            this.f13061d.A(new Runnable() { // from class: wc.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22880a.c0();
                }
            });
        } else {
            if (this.f13073p && this.f13061d.k()) {
                z10 = true;
            }
            U(z10);
        }
    }

    public void m0() {
        R();
    }

    public void n0() {
        Iterator<h> it = this.f13066i.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public void o0(int i10) {
        if (i10 < 40) {
            return;
        }
        Iterator<h> it = this.f13066i.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void u0(boolean z10) {
        this.f13078u = z10;
    }

    public MotionEvent x0(float f10, m.f fVar, boolean z10) {
        MotionEvent motionEventB = this.f13077t.b(u.a.c(fVar.f19374p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) q0(fVar.f19365g, f10).toArray(new MotionEvent.PointerCoords[fVar.f19363e]);
        if (z10 || motionEventB == null) {
            return MotionEvent.obtain(fVar.f19360b.longValue(), fVar.f19361c.longValue(), fVar.f19362d, fVar.f19363e, (MotionEvent.PointerProperties[]) s0(fVar.f19364f).toArray(new MotionEvent.PointerProperties[fVar.f19363e]), pointerCoordsArr, fVar.f19366h, fVar.f19367i, fVar.f19368j, fVar.f19369k, fVar.f19370l, fVar.f19371m, fVar.f19372n, fVar.f19373o);
        }
        z0(motionEventB, pointerCoordsArr);
        return motionEventB;
    }
}
