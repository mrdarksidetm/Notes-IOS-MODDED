package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface DefaultLifecycleObserver extends o4.d {
    default void onCreate(o4.e eVar) {
        ae.r.f(eVar, "owner");
    }

    default void onDestroy(o4.e eVar) {
        ae.r.f(eVar, "owner");
    }

    default void onPause(o4.e eVar) {
        ae.r.f(eVar, "owner");
    }

    default void onResume(o4.e eVar) {
        ae.r.f(eVar, "owner");
    }

    default void onStart(o4.e eVar) {
        ae.r.f(eVar, "owner");
    }

    default void onStop(o4.e eVar) {
        ae.r.f(eVar, "owner");
    }
}
