package p5;

import ae.r;
import ae.s;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import i5.h;
import i5.j;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.c;
import m5.d;
import m5.k;
import nd.u;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0383a f18225b = new C0383a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f18226c = a.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f18227a;

    /* JADX INFO: renamed from: p5.a$a, reason: collision with other inner class name */
    public static final class C0383a {
        private C0383a() {
        }

        public /* synthetic */ C0383a(ae.j jVar) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            r.f(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    r.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) objInvoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            r.f(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        public final List<SidecarDisplayFeature> c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            r.f(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? u.m() : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return u.m();
                }
                return u.m();
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                r.d(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) objInvoke;
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i10) {
            r.f(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
            }
        }
    }

    static final class b extends s implements l<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f18228a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            r.f(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class c extends s implements l<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18229a = new c();

        c() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            r.f(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    static final class d extends s implements l<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f18230a = new d();

        d() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            r.f(sidecarDisplayFeature, "$this$require");
            boolean z10 = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class e extends s implements l<SidecarDisplayFeature, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f18231a = new e();

        e() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
            r.f(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public a(j jVar) {
        r.f(jVar, "verificationMode");
        this.f18227a = jVar;
    }

    public /* synthetic */ a(j jVar, int i10, ae.j jVar2) {
        this((i10 & 1) != 0 ? j.QUIET : jVar);
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (r.b(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return r.b(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (r.b(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0383a c0383a = f18225b;
        return c0383a.b(sidecarDeviceState) == c0383a.b(sidecarDeviceState2);
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (r.b(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0383a c0383a = f18225b;
        return c(c0383a.c(sidecarWindowLayoutInfo), c0383a.c(sidecarWindowLayoutInfo2));
    }

    public final List<m5.a> e(List<SidecarDisplayFeature> list, SidecarDeviceState sidecarDeviceState) {
        r.f(list, "sidecarDisplayFeatures");
        r.f(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m5.a aVarG = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (aVarG != null) {
                arrayList.add(aVarG);
            }
        }
        return arrayList;
    }

    public final k f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        r.f(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new k(u.m());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0383a c0383a = f18225b;
        c0383a.d(sidecarDeviceState2, c0383a.b(sidecarDeviceState));
        return new k(e(c0383a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final m5.a g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        d.b bVarA;
        c.C0352c c0352c;
        r.f(sidecarDisplayFeature, "feature");
        r.f(sidecarDeviceState, "deviceState");
        h.a aVar = h.f12541a;
        String str = f18226c;
        r.e(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) h.a.b(aVar, sidecarDisplayFeature, str, this.f18227a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f18228a).c("Feature bounds must not be 0", c.f18229a).c("TYPE_FOLD must have 0 area", d.f18230a).c("Feature be pinned to either left or top", e.f18231a).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            bVarA = d.b.f15431b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f15431b.b();
        }
        int iB = f18225b.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            c0352c = c.C0352c.f15425d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            c0352c = c.C0352c.f15424c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        r.e(rect, "feature.rect");
        return new m5.d(new i5.b(rect), bVarA, c0352c);
    }
}
