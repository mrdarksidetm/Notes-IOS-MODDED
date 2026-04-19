package androidx.lifecycle;

import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DefaultLifecycleObserver f4307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f4308b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4309a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4309a = iArr;
        }
    }

    public c(DefaultLifecycleObserver defaultLifecycleObserver, i iVar) {
        ae.r.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f4307a = defaultLifecycleObserver;
        this.f4308b = iVar;
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        ae.r.f(eVar, "source");
        ae.r.f(aVar, "event");
        switch (a.f4309a[aVar.ordinal()]) {
            case 1:
                this.f4307a.onCreate(eVar);
                break;
            case 2:
                this.f4307a.onStart(eVar);
                break;
            case 3:
                this.f4307a.onResume(eVar);
                break;
            case 4:
                this.f4307a.onPause(eVar);
                break;
            case 5:
                this.f4307a.onStop(eVar);
                break;
            case 6:
                this.f4307a.onDestroy(eVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.f4308b;
        if (iVar != null) {
            iVar.s(eVar, aVar);
        }
    }
}
